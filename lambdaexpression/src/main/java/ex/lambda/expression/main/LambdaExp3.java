package ex.lambda.expression.main;


import ex.lambda.expression.service.EmployeeFullName;
import ex.lambda.expression.service.EmployeeI;

public class LambdaExp3 {
    public static void main(String[] args) {

        // Lambda expression with single parameter.
        EmployeeFullName emp1 = (fname, lname) -> {
            return "Full Name: " + fname + " " + lname;
        };
        System.out.println(emp1.fullName("Ashutosh", "Jha"));

        // You can omit function parentheses
        EmployeeFullName emp2 = (fname, lname) -> {
            return "Full Name: " + fname + " " + lname;
        };
        System.out.println(emp2.fullName("Ashutosh", "Jha"));

        EmployeeFullName emp3 = (fname, lname) -> "Full Name: " + fname + " " + lname;
        System.out.println(emp3.fullName("Ashutosh", "Jha"));
    }
}
