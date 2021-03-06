package ejercicio2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by iv on 23/05/17.
 */
public class PrintQueue {

    private static final boolean BOOLEAN_FAIR_LOCK = true;

    private final Lock queueLock = new ReentrantLock(BOOLEAN_FAIR_LOCK);

    public void printJob(Object document) {
        this.queueLock.lock();

        try {
            Long duration = (long)(Math.random() * 10_000);
            System.out.println(Thread.currentThread().getName() + ": PrintQueue: Printing a job during " + (duration/1_000) + " seconds");
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            this.queueLock.unlock();
        }

        // -----
        this.queueLock.lock();

        try {
            Long duration = (long)(Math.random() * 10_000);
            System.out.println(Thread.currentThread().getName() + ": PrintQueue: Printing a job during " + (duration/1_000) + " seconds");
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            this.queueLock.unlock();
        }
    }

}