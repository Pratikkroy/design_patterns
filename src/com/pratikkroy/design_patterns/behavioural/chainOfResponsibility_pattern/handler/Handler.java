package com.pratikkroy.design_patterns.behavioural.chainOfResponsibility_pattern.handler;

import com.pratikkroy.design_patterns.behavioural.chainOfResponsibility_pattern.helper_classes.Request;
import com.pratikkroy.design_patterns.behavioural.chainOfResponsibility_pattern.helper_classes.Response;

public interface Handler {

    public void setNext(Handler nextHandler);

    public Response handleRequest(Request request);
}
