package com.torryharris.driver;

import com.torryharris.exception.CLLimitExceededException;
import com.torryharris.exception.InvalidCLRequestException;
import com.torryharris.model.Employee;
import com.torryharris.model.HrDept;

public class CompanyDemo {
    public static void main(String[] args) {
        Employee emp=new Employee(123,"ram","Software Engineer",25000);
        HrDept hr=new HrDept();
        try {
            hr.requestCL(emp, 3);
            hr.requestCL(emp,3);
            hr.requestCL(emp,3);
        }catch(InvalidCLRequestException | CLLimitExceededException ex)
        {
            System.out.println(ex);
        }
    }
}
