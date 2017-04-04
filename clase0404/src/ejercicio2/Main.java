package ejercicio2;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by iv on 04/04/17.
 */
public class Main {

    public static void main(String[] args){

        Deque<Event> deque = new ArrayDeque<Event>();

        WriterTask writer = new WriterTask(deque);
        for (int i = 0; i < 3; i++){
            Thread thread = new Thread(writer);
            thread.start();
        }

        CleanerTask cleaner = new CleanerTask(deque);
        cleaner.start();

    }
}
