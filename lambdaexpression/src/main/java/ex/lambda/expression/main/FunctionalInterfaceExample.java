package ex.lambda.expression.main;

import ex.lambda.expression.service.Sayable;

public class FunctionalInterfaceExample implements Sayable{
    public void say(String msg){
        System.out.println(msg);
    }
    public static void main(String[] args) {
        FunctionalInterfaceExample fie = new FunctionalInterfaceExample();
        fie.say("Hello there");
        fie.doIt();

        Sayable sayable = new FunctionalInterfaceExample();
        sayable.say("Hello there");
        sayable.doIt();
    }
}
