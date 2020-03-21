public class ReverseHello implements Runnable
{
    //instance variable as the sequence of threads
    private static int counter = 1;

    @Override
    public void run()
    {
        if (counter <= 50)
        {
            Thread r = new Thread(new ReverseHello(), "Thread" + (counter++));
            r.start();
            try{
                r.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Hello from " + Thread.currentThread().getName());
    }

    public static void main(String[] args)
    {
        new Thread(new ReverseHello(), "Thread" + counter++).start();
    }
}
