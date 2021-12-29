package com.pratikkroy.design_patterns.behavioural.chain_of_responsibility_pattern.helper_classes;

public class Response {

    private String message;
    private Object data;
    private boolean isLastHandler;

    public Response(){

    }

    public Response(final String message, final Object data) {
        this.message = message;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }

    public Response setIsLastHandler(){
        this.isLastHandler = true;
        return this;
    }

    public boolean isLastHandler(){
        return isLastHandler;
    }

    @Override
    public String toString() {
        return "Response{" + "message='" + message + '\'' + ", data=" + data + '}';
    }
}
