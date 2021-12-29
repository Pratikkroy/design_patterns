package com.pratikkroy.design_patterns.behavioural.chain_of_responsibility_pattern.client;

import com.pratikkroy.design_patterns.behavioural.chain_of_responsibility_pattern.helper_classes.Request;
import com.pratikkroy.design_patterns.behavioural.chain_of_responsibility_pattern.helper_classes.Response;
import com.pratikkroy.design_patterns.behavioural.chain_of_responsibility_pattern.helper_classes.server.Server;
import com.pratikkroy.design_patterns.behavioural.chain_of_responsibility_pattern.helper_classes.database.user.User;

public class UserApiDemo {

    public static void demo(){
        Server server = new Server();

        Request request;
        Response response;

        User admin = new User("admin@example.com", "admin_pass", true);
        User user = new User("user@example.com", "user_pass", false);

        // register admin
        System.out.println();
        request = new Request(admin.getEmail(), admin.getPassword());
        response = server.register(request);
        System.out.println(response);

        // register user
        System.out.println();
        request = new Request(user.getEmail(), user.getPassword());
        server.register(request);
        System.out.println(response);

        // login admin
        System.out.println();
        request = new Request(admin.getEmail(), admin.getPassword());
        response = server.logIn(request);
        System.out.println(response);

        // login user
        System.out.println();
        request = new Request(user.getEmail(), user.getPassword());
        response = server.logIn(request);
        System.out.println(response);

        // user not registered
        System.out.println();
        request = new Request("random_email@example.com", "admin_pass");
        response = server.getUser(request);
        System.out.println(response);

        // wrong password
        System.out.println();
        request = new Request(user.getEmail(), "any random password");
        response = server.getUser(request);
        System.out.println(response);

        // get user
        System.out.println();
        request = new Request(user.getEmail(), user.getPassword());
        response = server.getUser(request);
        System.out.println(response);

        // get all user
        System.out.println();
        request = new Request(admin.getEmail(), admin.getEmail());
        response = server.getAllUsers(request);
        System.out.println(response);

        // this should return null because only admin has access to getAllUsers
        System.out.println();
        request = new Request(user.getEmail(), user.getPassword());
        response = server.getAllUsers(request);
        System.out.println(response);

        // example to show handler can start anywhere in the chain
        System.out.println();
        request = new Request(admin.getEmail(), admin.getPassword());
        response = server.getUserApiInfo(request);
        System.out.println(response);

        // this will not throttle the server as getUserApiInfo does not use throttling handler
        int i = 0;
        int count = 10;
        for(;i<count; i++){
            System.out.println();
            System.out.println(i);
            response = server.getUserApiInfo(request);
            System.out.println(response);
        }
        System.out.println();
        System.out.println("Completed " + i + "/" + count + " calls to server.");

        // this should throttle the server
        i = 0;
        for(;i<count; i++){
            System.out.println();
            System.out.println(i);
            response = server.getUser(request);
            System.out.println(response);
            if(response.getMessage().contains("Request limit exceeded")){
                break;
            }
        }
        System.out.println("Completed " + i + "/" + count + " calls to server.");

    }
}
