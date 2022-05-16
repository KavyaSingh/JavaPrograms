public class MultithreadingWithLambda {

    public static void main(String args[])
    {
        Thread thObj = new Thread(()->
        {
            for(int i=0;i<10;i++){
                System.out.println("Child thread-> "+Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thObj.start();
        for(int i=0;i<10;i++){
            System.out.println("Main thread-> "+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


}
