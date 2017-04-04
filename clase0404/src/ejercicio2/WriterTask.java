package ejercicio2;

import java.util.Date;
import java.util.Deque;
import java.util.concurrent.TimeUnit;

/**
 * Created by iv on 04/04/17.
 */
public class WriterTask implements Runnable{
    Deque<Event> deque;

    public WriterTask (Deque<Event> deque){
        this.deque = deque;
    }

    @Override
    public void run(){

        for (int i = 1; i < 100; i++){

            Event event = new Event();
            event.setDate(new Date());
            event.setEvent(String.format("The thread %s has generated an event", Thread.currentThread().getId()));

            deque.addFirst(event);

            try{
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
