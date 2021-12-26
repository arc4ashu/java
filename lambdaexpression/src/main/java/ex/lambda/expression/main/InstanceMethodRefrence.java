package ex.lambda.expression.main;

import ex.lambda.expression.service.EmployeeFullName;

public class InstanceMethodRefrence {
    public String fullName(String fname,String  lname){
        return fname+" "+lname;
    }

    public static void main(String[] args) {
        EmployeeFullName employeeFullName=new InstanceMethodRefrence()::fullName;
        System.out.println(employeeFullName.fullName("Ashutosh","Jha"));
    }
}
