package ejercicio1;

/**
 * Created by iv on 28/03/17.
 */
public class PrimeGenerator extends Thread{

    @Override
    public void run(){
        long number = 1L;
        while(true){

            if(isPrime(number)){
                System.out.println("Number " + number + " is Prime");
            }

            if(isInterrupted()){
                System.out.println("The prime generator has been interrupted");
                return;
            }
            number++;
        }
    }

    private boolean isPrime(long number){
        if(number <= 2)return true;

        for(long i = 2; i < number; i++){
            if ((number % i) == 0){
                return false;
            }
        }
        return true;
    }
}
