public class LambdaExpression {


    public static void main(String args[])
    {
        InterfacePrinting ip = (num1,num2) -> System.out.println(num1+num2);
        ip.printSum(1010,20);
    }
}
interface InterfacePrinting
{
    public void printSum(int num1,int num2);
}