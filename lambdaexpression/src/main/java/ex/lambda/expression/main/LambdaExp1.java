package ex.lambda.expression.main;


import ex.lambda.expression.service.EmployeeI;

public class LambdaExp1 {
    // Simple Interface call
    // Implement the abstract method
    //
    public static void main(String[] args) {
        String name = "Ashu";
        EmployeeI d = new EmployeeI() {
            // Added implementation
            public void printFullName() {
                System.out.println("Hello  " + name);
            }
        };
        // Method
        d.printFullName();
    }
}
