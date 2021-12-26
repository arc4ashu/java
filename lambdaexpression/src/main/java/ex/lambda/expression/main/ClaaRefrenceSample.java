package ex.lambda.expression.main;

import ex.lambda.expression.service.Airthmetic;

import java.util.Comparator;
import java.util.function.BiFunction;

public class ClaaRefrenceSample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> adder  = Airthmetic::add;
        Integer result=adder.apply(20,50);
        System.out.println(result);
    }
}
