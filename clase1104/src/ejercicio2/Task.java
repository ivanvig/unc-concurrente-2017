package ejercicio2;

import java.util.concurrent.TimeUnit;

/**
 * Created by iv on 11/04/17.
 */
public class Task implements Runnable{

    @Override
    public void run(){
        try{
            TimeUnit.SECONDS.sleep(1);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
