public class Printer {

    public static  synchronized void print() throws InterruptedException {
        System.out.println("Starting app");
        Thread.sleep(500);
        System.out.println(Thread.currentThread().getName() );
        Thread.sleep(500);
        System.out.println("End of working");
    }
}
