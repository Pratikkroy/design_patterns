package com.pratikkroy.design_patterns.behavioural.chainOfResponsibility_pattern.handler.impl;

import com.pratikkroy.design_patterns.behavioural.chainOfResponsibility_pattern.helper_classes.Request;
import com.pratikkroy.design_patterns.behavioural.chainOfResponsibility_pattern.helper_classes.Response;

public class AuthorisationHandler extends BaseHandler {
    @Override
    public Response handleRequest(final Request request) {
        System.out.println("Running AuthorisationHandler handleRequest");

        if (request.getEmail().equals("admin@example.com")) {
            System.out.println("Hello, admin!");
            request.setRole("admin");
        }
        else {
            System.out.println("Hello, user!");
            request.setRole("user");
        }

        return super.handleRequest(request);
    }
}
