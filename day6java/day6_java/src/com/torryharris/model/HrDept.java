package com.torryharris.model;

import com.torryharris.exception.CLLimitExceededException;
import com.torryharris.exception.InvalidCLRequestException;

public class HrDept {
    public void requestCL(Employee emp, int noOfDays) throws InvalidCLRequestException, CLLimitExceededException {
        if(noOfDays>3)
        {
            throw new InvalidCLRequestException(emp.getName()+"-you cannot take casual day leave for more than 3 days");
        }

        else if(emp.getBalanceCL()<1)
        {
            throw new CLLimitExceededException(emp.getName()+" : The limit for casual leave is exceeded : Request is Denied");
        }
        else
        {
            System.out.println("Approved");

            emp.balanceCL=emp.balanceCL-noOfDays;
            System.out.println(emp.getName()+" your CL limit is "+emp.balanceCL+" days");
            System.out.println();
        }
    }
}
