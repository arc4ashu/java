import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        StringJoiner joinNames = new StringJoiner(",");
        joinNames.add("Rahul");
        joinNames.add("Raju");
        joinNames.add("Peter");
        joinNames.add("Raheem");

        System.out.println(joinNames);

        joinNames = new StringJoiner(",", "[", "]");   // passing comma(,) and square-brackets as delimiter

        // Adding values to StringJoiner
        joinNames.add("Rahul");
        joinNames.add("Raju");
        joinNames.add("Peter");
        joinNames.add("Raheem");

        System.out.println(joinNames);

        StringJoiner joinNames1 = new StringJoiner(",", "[", "]");   // passing comma(,) and square-brackets as delimiter

        // Adding values to StringJoiner
        joinNames1.add("Rahul");
        joinNames1.add("Raju");

        // Creating StringJoiner with :(colon) delimiter
        StringJoiner joinNames2 = new StringJoiner(":", "[", "]");  // passing colon(:) and square-brackets as delimiter

        // Adding values to StringJoiner
        joinNames2.add("Peter");
        joinNames2.add("Raheem");

        // Merging two StringJoiner
        StringJoiner merge = joinNames1.merge(joinNames2);
        System.out.println(merge);
    }
}
