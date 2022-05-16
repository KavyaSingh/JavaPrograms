public class LambdaExpressionWithRunnable {
    public static void main(String args[])
    {
        Runnable r = () -> {
           for(int i=0;i<10;i++)
           {
               System.out.println("Child thread -> "+i);
           }
        };
    Thread th = new Thread(r);
    th.start();
        for(int i=0;i<10;i++)
        {
            System.out.println("Main thread -> "+i);
        }
    }
}
