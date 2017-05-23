package ejercicio2;

/**
 * Created by iv on 23/05/17.
 */
public class Main {

    private static final int NR_THREADS = 10;
    private static final long LONG_SLEEP = 100L;
    
    public static void main(String[] args) {
        PrintQueue printQueue = new PrintQueue();

        Thread thread[] = new Thread[NR_THREADS];
        for (int i = 1; i < NR_THREADS; i++) {
            thread[i] = new Thread(new Job(printQueue), "Thread " + i);
        }

        for (int i = 1; i < NR_THREADS; i++) {
            thread[i].start();

            try {
                Thread.sleep(LONG_SLEEP);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}