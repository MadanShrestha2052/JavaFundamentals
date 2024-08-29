package Flowcharts;

public class primeNumbers {

    public static void main(String[] args) {
        int a = 1;
        boolean isPrime = true;
        if (a == 2) {
            System.out.println("It is prime number 2");
        } else {
           
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    isPrime = false;
              break; // Exit the loop immediately if a divisor is found
                }
            }
        }

            if (isPrime) {
                System.out.println("It's Prime");
            } else {
                System.out.println("Not a Prime Number");
            }
       
    }
}
