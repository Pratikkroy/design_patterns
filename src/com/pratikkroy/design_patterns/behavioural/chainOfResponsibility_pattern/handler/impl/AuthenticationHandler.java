package com.pratikkroy.design_patterns.behavioural.chainOfResponsibility_pattern.handler.impl;

import com.pratikkroy.design_patterns.behavioural.chainOfResponsibility_pattern.helper_classes.Request;
import com.pratikkroy.design_patterns.behavioural.chainOfResponsibility_pattern.helper_classes.Response;
import com.pratikkroy.design_patterns.behavioural.chainOfResponsibility_pattern.helper_classes.server.apis.UserApi;

public class AuthenticationHandler extends BaseHandler {

    private UserApi userApi;

    public AuthenticationHandler(UserApi userApi) {
        this.userApi = userApi;
    }

    @Override
    public Response handleRequest(final Request request) {
        System.out.println("Running AuthenticationHandler handleRequest");

        if(!userApi.hasEmail(request.getEmail())){
            String message = "This email is not registered!";
            System.out.println(message);
            return new Response(message, null);
        }

        if(!userApi.isValidPassword(request.getEmail(), request.getPassword())){
            String message = "Wrong password!";
            System.out.println(message);
            return new Response(message, null);
        }

        return super.handleRequest(request);
    }
}
