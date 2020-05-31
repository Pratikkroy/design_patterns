package com.pratikkroy.design_patterns.behavioural.chainOfResponsibility_pattern.handler.impl;

import com.pratikkroy.design_patterns.behavioural.chainOfResponsibility_pattern.helper_classes.Request;
import com.pratikkroy.design_patterns.behavioural.chainOfResponsibility_pattern.helper_classes.Response;

public class ThrottlingHandler extends BaseHandler {

    private int  requestPerMinute;
    private int  requestsCount;
    private long currentTime;

    public ThrottlingHandler(int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
        this.currentTime = System.currentTimeMillis();
    }

    @Override
    public Response handleRequest(final Request request) {
        System.out.println("Running ThrottlingHandler handleRequest");

        if (System.currentTimeMillis() > currentTime + 60_000) {
            requestsCount = 0;
            currentTime = System.currentTimeMillis();
        }

        requestsCount++;

        if (requestsCount > requestPerMinute) {
            String message = "Request limit exceeded!";
            System.out.println(message);
//            Thread.currentThread().stop();
            return new Response(message, null);
        }

        return super.handleRequest(request);
    }
}
