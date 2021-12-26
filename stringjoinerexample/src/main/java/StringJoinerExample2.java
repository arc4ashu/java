import java.util.StringJoiner;

public class StringJoinerExample2 {
    public static void main(String[] args) {
        StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter

        // Prints nothing because it is empty
        System.out.println("Nothing : "+joinNames);

        joinNames.setEmptyValue("It is empty");
        System.out.println(joinNames);

        // Adding values to StringJoiner
        joinNames.add("Rahul");
        joinNames.add("Raju");
        System.out.println(joinNames);

        // Returns length of StringJoiner
        int length = joinNames.length();
        System.out.println("Length: "+length);
    }
}
