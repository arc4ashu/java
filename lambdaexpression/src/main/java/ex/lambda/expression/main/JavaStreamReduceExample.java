package ex.lambda.expression.main;

import ex.lambda.expression.service.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class JavaStreamReduceExample {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
        // This is more compact approach for filtering data
        Float totalPrice0=productsList.stream()
                .map(product -> product.price)
                .reduce((aFloat, aFloat2) -> aFloat+aFloat2).get();
        System.out.println(totalPrice0);

        Float totalPrice1=productsList.stream()
                .map(product -> product.price)
                .reduce(0.0f,(aFloat, aFloat2) -> aFloat+aFloat2);
        System.out.println(totalPrice1);

        // More precise code
        Float totalPrice2=productsList.stream()
                .map(product -> product.price)
                .reduce(0.0f,Float::sum);
        System.out.println(totalPrice2);




    }
}
