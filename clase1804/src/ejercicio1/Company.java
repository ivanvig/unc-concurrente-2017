package ejercicio1;

/**
 * Created by iv on 18/04/17.
 */
public class Company implements Runnable {

    private static final int I_END = 100;
    private static final double DOUBLE_AMOUNT_TO_ADD = 1_000D;

    private Account account;

    public Company(Account account) {
        this.account = account;
    }

    /* (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        for (int i = TCNumberUtils.INT_ZERO; i < I_END; i++) {
            this.account.addAmount(DOUBLE_AMOUNT_TO_ADD);
        }

    }

}