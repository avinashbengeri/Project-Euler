/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10001st prime number?
 */
package projecteuler;
/**
 *
 * @author AVINASH
 */
public class TenThousandFirstPrime {
    public static boolean isPrime(int n){
        if(n<2) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for(int i=3;i*i<=n;i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int count=0,i=1;
        while(count<10001){
            if(isPrime(i)){
                count+=1;
            }
            i+=1;
        }
        System.out.println(i-1); // Answer: 104743
    }
}