/*
There are 2 methods for function chaining
f1.andThen(f2)
f1.compose(f2)
 */

import java.util.function.Function;

public class FunctionChaining1ForFunctionPredicate {

    public static void main(String args[])
    {
        //Print first 10 characters of a string in upper character
        Function<Integer,Integer> f1= num -> num*num;
        Function<Integer,Integer> f2 = num -> num+num;
        int num = 10;
        System.out.println(f1.andThen(f2).apply(num)); //(10*10) =100 -> 100+100 = 200
        System.out.println(f1.compose(f2).apply(num)); //10+10 = 20 -> 20*20 = 400
    }
}
