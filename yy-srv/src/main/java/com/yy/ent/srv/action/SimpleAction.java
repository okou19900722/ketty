package com.yy.ent.srv.action;

import com.yy.ent.ioc.Action;
import com.yy.ent.ioc.Path;

/**
 * Created with IntelliJ IDEA.
 * User: Dempe
 * Date: 2015/10/20
 * Time: 19:54
 * To change this template use File | Settings | File Templates.
 */
@Action
public class SimpleAction {

    @Path(value = "test")
    public void test() {
        System.out.println("----------------");

    }
}

