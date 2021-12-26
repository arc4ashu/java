package ex.lambda.expression.main;

import ex.lambda.expression.service.EmployeeI;

public class MethodReference {
    /**
     * Reference to static
     * Reference to Constructor
     * Reference to instance method
     * */
    // Example of static
    public static void aboutEmployee(){
        System.out.println("I am Ashutosh...");
    }
    public static void main(String[] args) {
        EmployeeI employeeI=MethodReference::aboutEmployee;
        employeeI.printFullName();

        Thread thread=new Thread(MethodReference::aboutEmployee);
        thread.start();


    }
}
