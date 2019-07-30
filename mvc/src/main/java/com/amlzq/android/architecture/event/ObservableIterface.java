package com.amlzq.android.architecture.event;

/**
 * Created by zkk on 2016/11/22 0022.
 */

public interface ObservableIterface<T, P, R> {
    /**
     * 根据名称注册观察者
     *
     * @param name
     * @param observer
     */
    void registerObserver(String name, T observer);

    /**
     * 根据名称反注册观察者
     *
     * @param name
     */
    void removeObserver(String name);

    /**
     * 清除观察者
     */
    void clear();

    /**
     * 通知观察者
     *
     * @param name
     * @param p
     * @return
     */
    R notify(String name, P... p);
}
