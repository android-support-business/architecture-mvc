package com.amlzq.android.architecture.event;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by zkk on 2016/11/22 0022.
 */

public class ObservableManager<Param, Result>
        implements ObservableIterface<Function, Param, Result> {

    private HashMap<String, Set<Function>> _mapping;
    private final Object _lockObj = new Object();
    private static ObservableManager _instance;

    private ObservableManager() {
        this._mapping = new HashMap<>();
    }

    public static synchronized ObservableManager newInstance() {
        if (_instance == null) {
            _instance = new ObservableManager();
        }
        return _instance;
    }

    @Override
    public void registerObserver(String name, Function observer) {
        synchronized (_lockObj) {
            Set<Function> observers;
            if (!_mapping.containsKey(name)) {
                observers = new HashSet<>();
                _mapping.put(name, observers);
            } else {
                observers = _mapping.get(name);
            }
            observers.add(observer);
        }

    }

    @Override
    public void removeObserver(String name) {
        synchronized (_lockObj) {
            _mapping.remove(name);
        }
    }

    @Override
    public void clear() {
        synchronized (_lockObj) {
            _mapping.clear();
            _mapping = null;
            _instance = null;
        }
    }

    @Override
    public Result notify(String name, Param... p) {
        synchronized (_lockObj) {
            if (_mapping.containsKey(name)) {
                Set<Function> observers = _mapping.get(name);
                for (Function o : observers) {
                    return (Result) o.function(p);
                }
            }
        }
        return null;
    }
}
