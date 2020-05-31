package com.pratikkroy.design_patterns.behavioural.chainOfResponsibility_pattern.helper_classes.database.user;

import java.util.*;

/**
 * This class will server as a DB of users.
 */
public class UsersDatabase {

    // email being the PK here
    private static Map<String, User> userMap;

    static {
        userMap = new HashMap<>();
    }

    public boolean add(User user){
        if(!userMap.containsKey(user.getEmail())){
            userMap.put(user.getEmail(), user);
            return true;
        }
        return false;
    }


    public boolean remove(String email){
        userMap.remove(email);
        return true;
    }

    public boolean contains(String email){
        return userMap.containsKey(email);
    }

    public User getUser(String email) {
        return userMap.get(email);
    }

    public List<User> getAllUser() {
        return new ArrayList<>(userMap.values());
    }
}
