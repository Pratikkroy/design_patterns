package com.pratikkroy.design_patterns.behavioural.chain_of_responsibility_pattern.handler.impl;

import com.pratikkroy.design_patterns.behavioural.chain_of_responsibility_pattern.handler.Handler;
import com.pratikkroy.design_patterns.behavioural.chain_of_responsibility_pattern.helper_classes.Request;
import com.pratikkroy.design_patterns.behavioural.chain_of_responsibility_pattern.helper_classes.Response;

public class BaseHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNext(final Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public Response handleRequest(final Request request) {
        if(this.nextHandler == null)
            return new Response().setIsLastHandler();
        return nextHandler.handleRequest(request);
    }
}
