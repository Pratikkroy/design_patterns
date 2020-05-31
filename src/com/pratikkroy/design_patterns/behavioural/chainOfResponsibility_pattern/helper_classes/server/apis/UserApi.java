package com.pratikkroy.design_patterns.behavioural.chainOfResponsibility_pattern.helper_classes.server.apis;

import com.pratikkroy.design_patterns.behavioural.chainOfResponsibility_pattern.helper_classes.user.LoggedInUserDatabase;
import com.pratikkroy.design_patterns.behavioural.chainOfResponsibility_pattern.helper_classes.user.User;
import com.pratikkroy.design_patterns.behavioural.chainOfResponsibility_pattern.helper_classes.user.UsersDatabase;

import java.util.List;

public class UserApi {

    private UsersDatabase usersDatabase = new UsersDatabase();
    private LoggedInUserDatabase loggedInUserDatabase = new LoggedInUserDatabase();

    public boolean login(String email){
        /**
         * the login check(check email and password) has been pushed to handler
         */
//        return this.hasEmail(email) && this.isValidPassword(email, password);
        System.out.println("User " + email + " logged in");
        return loggedInUserDatabase.add(email);
    }

    public boolean hasEmail(String email) {
        return usersDatabase.contains(email);
    }

    public boolean isValidPassword(String email, String password) {
        return usersDatabase.getUser(email).getPassword().equals(password);
    }

    public boolean register(String email, String password) {
        if(usersDatabase.contains(email)) {
            return false;
        }
        return usersDatabase.add(new User(email, password, isAdmin(email)));
    }

    public boolean isUserLoggedIn(String email) {
        return loggedInUserDatabase.contains(email);
    }

    public User getUser(String email) { return usersDatabase.getUser(email); }

    public List getAllUser(String email) { return usersDatabase.getAllUser(); }

    @Override
    public String toString() {
        return "UserApi{ usersDatabase and loggedInUserDatabase }";
    }

    private boolean isAdmin(String email) {
        return email.equalsIgnoreCase("admin@example.com");
    }
}
