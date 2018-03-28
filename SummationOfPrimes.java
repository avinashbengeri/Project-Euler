/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.
 */
package projecteuler;
/**
 *
 * @author AVINASH
 */
public class SummationOfPrimes {
    public static boolean isPrime(long n){
        if(n<2) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for(long i=3;i*i<=n;i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        long n=2000000l;
        long sum=2;
        long i=3;
        while(i<n){
            if(isPrime(i)){
                sum+=i;
            }
            i+=2;
        }
        System.out.println("Sum: "+sum); // Answer: 142913828922
    }
}