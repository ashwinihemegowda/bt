package com.torryharris.driver;

import com.torryharris.exception.InsufficientFundsException;
import com.torryharris.exception.WithdrawLimitExceededException;
import com.torryharris.model.Person;

public class CustomExceptionDemo {
    public static void main(String[] args){
        Person ram=new Person("RAM",12345,60000);
        try {
            ram.withDrawAmount(10000);
            ram.withDrawAmount(20000);
            ram.withDrawAmount(20000);
        }
        catch(WithdrawLimitExceededException | InsufficientFundsException ex)
        {
            System.err.println(ex);
        }
        finally {
            System.out.println("in final block");
        }
    }
}
