/*
There are 2 methods for function chaining
f1.andThen(f2)
f1.compose(f2)
 */

import java.util.function.Function;

public class FunctionChainingForFunctionPredicate {

    public static void main(String args[])
    {
        //Print first 10 characters of a string in upper character
        Function<String,String> f1= stringObj -> stringObj.substring(0,10);
        Function<String,String> f2 = stringObj2 -> stringObj2.toUpperCase();
        String obj = "This is a program to display function chaining";
        System.out.println(f1.andThen(f2).apply(obj));
        System.out.println(f1.compose(f2).apply(obj));
    }
}
