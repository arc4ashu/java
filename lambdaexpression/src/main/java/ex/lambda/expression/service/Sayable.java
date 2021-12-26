package ex.lambda.expression.service;

@FunctionalInterface
public interface Sayable {
    void say(String msg);
    // It can contain any number of Object class methods.
    int hashCode();
    String toString();
    boolean equals(Object obj);

    default void doIt(){
        System.out.println("Do it now");
    }
}
