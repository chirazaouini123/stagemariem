package com.example.projectstage.exception;

public class ResourcesNotfoundException extends RuntimeException{
    public ResourcesNotfoundException(String message){
        super(message);
    }
}