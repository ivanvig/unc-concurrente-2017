package ejercicio2;

import java.util.concurrent.TimeUnit;

/**
 * Created by iv on 28/03/17.
 */
public class Main {

    public static void main(String[] args){

        FileSearch buscador = new FileSearch("/home", "log.txt");
        Thread hilo = new Thread(buscador);

        hilo.start();

        try{
            TimeUnit.SECONDS.sleep(10);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        hilo.interrupt();
    }
}
