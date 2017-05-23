package ejercicio2;

/**
 * Created by iv on 23/05/17.
 */
public class Job implements Runnable {

    private PrintQueue printQueue;


    public Job(PrintQueue printQueue) {
        super();
        this.printQueue = printQueue;
    }

    /* (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        System.out.printf("%s: Going to print a document\n", Thread.currentThread().getName());
        this.printQueue.printJob(new Object());
        System.out.printf("%s: The document has been printed\n", Thread.currentThread().getName());
    }

}
