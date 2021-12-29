package com.pratikkroy.design_patterns.behavioural.chain_of_responsibility_pattern.helper_classes.server.handlers;

import com.pratikkroy.design_patterns.behavioural.chain_of_responsibility_pattern.handler.Handler;
import com.pratikkroy.design_patterns.behavioural.chain_of_responsibility_pattern.helper_classes.Request;
import com.pratikkroy.design_patterns.behavioural.chain_of_responsibility_pattern.helper_classes.Response;
import com.pratikkroy.design_patterns.behavioural.chain_of_responsibility_pattern.helper_classes.server.apis.UserApi;

public class LoginHandler extends UserApi implements Handler  {
    @Override
    public void setNext(final Handler nextHandler) {
        // this will not set any next handler because it is the last handler in the chain.
    }

    @Override
    public Response handleRequest(final Request request) {
        System.out.println("Running LoginHandler handleRequest");

        String message;
        if(this.login(request.getEmail())){
            message = "User is logged in";
        }
        else {
            message = "User is not logged in";
        }
        // this handler will also not call super.handler as this is the last handler in the chain.
        return new Response(message, null);

    }
}
