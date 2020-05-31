package com.pratikkroy.design_patterns.behavioural.chainOfResponsibility_pattern.helper_classes.user;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LoggedInUserDatabase {

    // email being the PK here
    private static Set<String> loggedInUsers;

    static {
        loggedInUsers = new HashSet<>();
    }

    public boolean add(String email){
        loggedInUsers.add(email);
        return true;
    }

    public boolean remove(String email){
        loggedInUsers.remove(email);
        return true;
    }

    public boolean contains(String email){
        return loggedInUsers.contains(email);
    }

}
