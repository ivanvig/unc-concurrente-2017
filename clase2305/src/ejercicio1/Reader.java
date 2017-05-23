package ejercicio1;

/**
 * Created by iv on 23/05/17.
 */

public class Reader implements Runnable {

    private static final int ITERATIONS = 10;

    private PricesInfo pricesInfo;

    public Reader(PricesInfo pricesInfo) {
        this.pricesInfo = pricesInfo;
    }

    /* (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        for (int i = 0; i < ITERATIONS; i++) {
            System.out.printf("%s: Price 1: %f\n", Thread.currentThread().getName(), this.pricesInfo.getPrice1());
            System.out.printf("%s: Price 2: %f\n", Thread.currentThread().getName(), this.pricesInfo.getPrice2());
        }
    }

}