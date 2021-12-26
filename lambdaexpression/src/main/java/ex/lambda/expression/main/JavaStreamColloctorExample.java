package ex.lambda.expression.main;

import ex.lambda.expression.service.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaStreamColloctorExample {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
        // Count of Product
        Long totalCount = productsList.stream()
                .collect(Collectors.counting());
        System.out.println("count: "+totalCount);
        // Average of Product
        double totalAverage = productsList.stream()
                .collect(Collectors.averagingDouble(value -> value.price));
        System.out.println("Average: "+totalAverage);
        // Distinct Count of Product
        Long distinct = productsList.stream()
                .map(product -> product.price)
                .distinct().count();
        System.out.println("Distinct: "+distinct);
        // Using Collectors's method to sum the prices.
        double totalPrice3 = productsList.stream()
                .collect(Collectors.summingDouble(product->product.price));
        System.out.println("Sum: "+totalPrice3);

        // Min product
        Product minProduct=productsList.stream()
                .min((o1, o2) -> o1.price>o2.price ?1:-1)
                .get();
        System.out.println(minProduct);
        //Max Product
        Product maxProduct=productsList.stream()
                .max((o1, o2) -> o1.price>o2.price ?1:-1)
                .get();
        System.out.println(maxProduct);

        // Get Product with Name
        Map<Object,Object> productMap=productsList.stream()
                .collect(Collectors.toMap(product->product.name,product->product.price));
        System.out.println(productMap);

        //Price List
        List<Float> productPriceList =
                productsList.stream()
                        .filter(p -> p.price > 28000) // filtering data
                        .map(Product::getPrice)         // fetching price by referring getPrice method
                        .collect(Collectors.toList());  // collecting as list
        System.out.println(productPriceList);
    }
}
