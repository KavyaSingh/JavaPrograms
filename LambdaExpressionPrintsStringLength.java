public class LambdaExpressionPrintsStringLength {

    public static void main(String args[])
    {
        InterfPrintLength ip = s -> System.out.println(" Length of s : "+s.length());
        ip.printStringLength("LEARNINGJAVA8LAMBDA");
    }
}

interface InterfPrintLength
{
    public void printStringLength(String s);
}
