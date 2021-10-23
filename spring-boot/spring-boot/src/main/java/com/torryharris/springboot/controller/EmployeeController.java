package com.torryharris.springboot.controller;

import com.torryharris.springboot.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmployeeController {
    static ArrayList <Employee>empList;
    static {
        empList=new ArrayList<>();
        Employee e1=new Employee(1001,"RAM","Manager",60000);
        Employee e2=new Employee(1002,"SHAM","Clerk",20000);
        Employee e3=new Employee(1003,"RAMYA","Lead",80000);
        Employee e4=new Employee(1004,"SITA","CEO",100000);
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);

    }
    @GetMapping("/employees")
    public ArrayList <Employee> getEmployee()
    {


        return empList;
    }
    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody Employee employee)
    {
        empList.add(employee);
        return "Employee "+employee.getName()+" added successfully";
    }
    @DeleteMapping("/delete/{empId}")
    public String deleteEmployee(@PathVariable Integer empId)
    {
        Employee temp=null;
        boolean found=false;
        for(Employee e:empList)
        {
            if(empId==e.getEmpId())
            {
                temp=e;
                found=true;
                break;
            }
        }
        empList.remove(temp);
        if(found)
            return "Employee "+temp.getName()+" is deleted";
        else
            return "Employee with Id "+temp.getEmpId()+" is not found";
    }
    @PutMapping("/update/{empId}")
    public String updateEmployee(@RequestBody Employee employee,@PathVariable Integer empId){
        deleteEmployee(empId);
        empList.add(employee);
        return "Success!!";
    }
}
