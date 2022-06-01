import java.util.function.Function;

public class RemoveStringUsingFunction {

    public static void main(String args[])
    {
        String stringObj = "This is a string function";
        Function<String,String> f = objString -> objString.replaceAll(" ","" );
        Function<String, Integer> f1 = string1 ->  string1.length() -
                string1.replaceAll(" ","").length();
        System.out.println(f.apply(stringObj));
        System.out.println(f1.apply(stringObj));

    }
}
