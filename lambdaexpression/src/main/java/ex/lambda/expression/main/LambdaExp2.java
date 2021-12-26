package ex.lambda.expression.main;

import ex.lambda.expression.service.EmployeeI;

public class LambdaExp2 {
    public static void main(String[] args) {
        String name = "Ashutosh Kumar Jha";
        EmployeeI emp = () -> {
            System.out.println("Full Name: " + name);
        };
        emp.printFullName();

        EmployeeI emp2 = () -> System.out.println("Full Name: " + name);
        emp2.printFullName();
    }
}
