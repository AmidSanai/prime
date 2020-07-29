import java.util.Scanner;

public class prime {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number to tell is a PRIME number or not.");
        boolean prime = isPrime(scan.nextInt());
        if (prime) {
            System.out.println("Your number is prime.");
        } else {
            System.out.println("Your number is not prime.");
        }
    }

    public static boolean isPrime(int num) {
        int prime;
        for (int a = num-1; a > 1; a--) {
            prime = num % a;
            if (prime == 0) {
                return false;
            }
        }
        return true;
    }

}
