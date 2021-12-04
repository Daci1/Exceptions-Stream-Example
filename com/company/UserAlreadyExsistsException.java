package com.company;

public class UserAlreadyExsistsException extends Exception{
    public UserAlreadyExsistsException(String userName) {
        super(String.format("User %s already exsists.", userName));// ii dam mesaju de eroare
    }

}
