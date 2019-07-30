package com.amlzq.android.architecture.event;

/**
 * Created by Administrator on 2016/11/22 0022.
 */

public interface Function<Result, Param> {
    Result function(Param... params);
}