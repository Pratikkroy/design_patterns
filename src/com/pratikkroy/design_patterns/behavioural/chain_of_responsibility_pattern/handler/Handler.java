package com.pratikkroy.design_patterns.behavioural.chain_of_responsibility_pattern.handler;

import com.pratikkroy.design_patterns.behavioural.chain_of_responsibility_pattern.helper_classes.Request;
import com.pratikkroy.design_patterns.behavioural.chain_of_responsibility_pattern.helper_classes.Response;

public interface Handler {

    public void setNext(Handler nextHandler);

    public Response handleRequest(Request request);
}
