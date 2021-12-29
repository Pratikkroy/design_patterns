package com.pratikkroy.design_patterns.behavioural.chain_of_responsibility_pattern.helper_classes.server;

import com.pratikkroy.design_patterns.behavioural.chain_of_responsibility_pattern.handler.Handler;
import com.pratikkroy.design_patterns.behavioural.chain_of_responsibility_pattern.handler.impl.AuthenticationHandler;
import com.pratikkroy.design_patterns.behavioural.chain_of_responsibility_pattern.handler.impl.AuthorisationHandler;
import com.pratikkroy.design_patterns.behavioural.chain_of_responsibility_pattern.handler.impl.ThrottlingHandler;
import com.pratikkroy.design_patterns.behavioural.chain_of_responsibility_pattern.helper_classes.Request;
import com.pratikkroy.design_patterns.behavioural.chain_of_responsibility_pattern.helper_classes.Response;
import com.pratikkroy.design_patterns.behavioural.chain_of_responsibility_pattern.helper_classes.server.apis.UserApi;
import com.pratikkroy.design_patterns.behavioural.chain_of_responsibility_pattern.helper_classes.server.handlers.LoginHandler;

/**
 * Server is the main director here.
 * It will create different chain of handlers to act upon different types of request;
 * It will receive all the request redirect it to the particular handler
 */
public class Server {

    /**
     * Right now it is having a single chain of handler.
     * It could have multiple chain of handlers
     */
    Handler throttlingHandler;
    Handler authenticationHandler;
    Handler authorisationHandler;

    public Server(){
        /**
         * chain of handlers throttling -> authentication -> authorisation
         */
        UserApi userApi = new UserApi();
        final int THROTTLING_LIMIT_PER_SECOND = 10;

        throttlingHandler = new ThrottlingHandler(THROTTLING_LIMIT_PER_SECOND);
        authenticationHandler = new AuthenticationHandler(userApi);
        authorisationHandler = new AuthorisationHandler();

        throttlingHandler.setNext(authenticationHandler);
        authenticationHandler.setNext(authorisationHandler);

    }

    public Response register(Request request) {
        /**
         * We don't require ant handlers for registeration
         */
        System.out.println("Registering user with email : "+request.getEmail());
        String message;
        UserApi userApi = new UserApi();
        if(userApi.register(request.getEmail(), request.getPassword())) {
            message = "Successful registeration";
        }
        else {
            message = "Unsuccessful registeration";
        }

        return new Response(message, null);
    }

    public Response logIn(Request request) {

        int approach = 2;
        /**
         * Two approaches
         */
        /**
         * First approach
         * create a login handler. Login handler would be different from other handlers as it would set the next
         * handler of it as null and also the handle method would not call super.handleRequest() from it.
         * This approach is somewhat not optimised because for every type of request/api we have to create a handler.
         * For ex. LoginHandler and GetUserHandler and etc. Bombardment of Handler classes in the server package.
         */

        if(approach == 1){
            /**
             * chain of handlers authentication -> authorisation -> login
             */
            Handler loginHandler = new LoginHandler();
            authorisationHandler.setNext(loginHandler);

            return authenticationHandler.handleRequest(request);
        }


        /**
         * Second approach
         * From the handler chain return a boolean in response which would indicate if it is the last handler in
         * the chain. Check here if the handler returned response that needs to be further processed by code or not.
         */

        /**
         * We can start anywhere in the chain
         * Response response = this.authenticationHandler.handleRequest(request);
         */

        Response response = this.throttlingHandler.handleRequest(request);
        if(!response.isLastHandler()) {
            return response;
        }

        UserApi userApi = new UserApi();
        String message;
        if (userApi.login(request.getEmail())) {
            message = "User is logged in";
        } else {
            message = "User is not logged in";
        }
        return new Response(message, null);

    }

    public Response getUser(Request request){

        /**
         * Here we can also use two approaches as mentioned in the login method.
         * Using the second approach here
         */

        Response response = throttlingHandler.handleRequest(request);
        if(!response.isLastHandler()) {
            return response;
        }

        UserApi userApi = new UserApi();
        return new Response("success", userApi.getUser(request.getEmail()));
    }

    public Response getAllUsers(Request request){

        /**
         * Here we can also use two approaches as mentioned in the login method.
         * Using the second approach here
         */

        Response response = throttlingHandler.handleRequest(request);
        if(!response.isLastHandler()) {
            return response;
        }

        if(request.getRole().equalsIgnoreCase("admin")){
            UserApi userApi = new UserApi();
            return new Response("success", userApi.getAllUser(request.getEmail()));
        }
        else {
            return new Response("Only admin has access to getAllUsers", null);
        }
    }

    public Response getUserApiInfo(Request request){
        // We can start anywhere in the chain
        Response response = authenticationHandler.handleRequest(request);
        if(!response.isLastHandler()) {
            return response;
        }

        UserApi userApi = new UserApi();
        return new Response("success", userApi.toString());
    }
}
