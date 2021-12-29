package com.pratikkroy.design_patterns.behavioural.chain_of_responsibility_pattern.helper_classes.database.user;

public class User {

    // email being the PK here
    private String email;
    private String password;
    private boolean isAdmin;

    public User(final String email, final String password, boolean isAdmin) {
        this.email = email;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    @Override
    public boolean equals(final Object entity) {
        if(this == entity)
            return true;
        if(entity == null || entity.getClass() != this.getClass()){
            return false;
        }

        User user = (User) entity;
        if(this.email.equalsIgnoreCase(user.email)){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "User{" + "email='" + email + '\'' + ", isAdmin=" + isAdmin + '}';
    }
}
