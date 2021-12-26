package ex.lambda.expression.main;

import ex.lambda.expression.service.Hello;
import ex.lambda.expression.service.HelloWorld;


public class RefrenceConstructor {
    public static void main(String[] args) {
        HelloWorld hello= Hello::new;
        hello.getMessage("Ashutosh");
    }
}
