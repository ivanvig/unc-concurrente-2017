package ejercicio3;

import java.util.concurrent.TimeUnit;

/**
 * Created by iv on 28/03/17.
 */
public class Main {

    public static void main(String[] args){

        FileClock clock = new FileClock();
        Thread thread = new Thread(clock);

        thread.start();

        try{
            TimeUnit.SECONDS.sleep(5);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        thread.interrupt();
    }
}
