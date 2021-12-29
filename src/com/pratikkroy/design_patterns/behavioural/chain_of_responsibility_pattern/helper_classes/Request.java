package com.pratikkroy.design_patterns.behavioural.chain_of_responsibility_pattern.helper_classes;

public class Request {

    private String email;
    private String password;
    private String role;

    public Request(final String email, final String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(final String role) {
        this.role = role;
    }
}
