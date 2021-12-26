package ex.lambda.expression.main;

import ex.lambda.expression.service.ListIndex;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class List2Map {
    public static void main(String[] args) {
        List<String> employeeList=new ArrayList<>();
        employeeList.add("Ashutosh");
        employeeList.add("Ravi");
        employeeList.add("Mohit");
        employeeList.add("Akash");

        BiFunction<List,String,Integer> listIndex=ListIndex::index;
        System.out.println(listIndex.apply(employeeList,"Mohit"));

        Map<Integer,String> aaa=employeeList.stream()
                .filter(s -> !s.equalsIgnoreCase("Ashutosh"))
                .collect(Collectors.toMap(iteam->listIndex.apply(employeeList,iteam.toString()),iteam->iteam.toString()));
        System.out.println(aaa);
    }

}
