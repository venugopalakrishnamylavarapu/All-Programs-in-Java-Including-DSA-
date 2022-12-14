public class MyRunnable implements Runnable {
    //runnable class which contains new threads(we can also declare other threads and vice versa)
    @Override
    public void run() {
        for (int i = 10; i>0 ; i--) {
            System.out.println("Thread 2 value is :"+i);
            try {
                Thread.sleep(1000);        //here loop will get delay for a second(1000ms) and then loops again
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread 2 is completed! YAY!!!");
    }
}
