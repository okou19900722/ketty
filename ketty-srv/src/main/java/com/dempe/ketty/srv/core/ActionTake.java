package com.dempe.ketty.srv.core;

import com.dempe.ketty.srv.exception.JServerException;
import com.dempe.ketty.srv.exception.ModelConvertJsonException;

import java.lang.reflect.InvocationTargetException;

/**
 * Created with IntelliJ IDEA.
 * User: zhengdaxia
 * Date: 15/10/17
 * Time: 上午10:21
 * To change this template use File | Settings | File Templates.
 */
public interface ActionTake<T, R> {

    T act(R request) throws JServerException, ModelConvertJsonException, InvocationTargetException, IllegalAccessException;


}
