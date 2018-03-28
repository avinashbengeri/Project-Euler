/*
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
 */
package projecteuler;
/**
 *
 * @author AVINASH
 */
public class LargestPrimeFactor {
    public static void main(String[] args){
        long num=600851475143L;
        System.out.println("Largest Prime Factor of "+num+ " is: "+largestPrimeFactor(num)); // Answer: 6857
    }
    public static int largestPrimeFactor(long number) { 
        int i; 
        long copyOfInput = number; 
        for (i = 2; i <= copyOfInput; i++) { 
            if (copyOfInput % i == 0) { 
                copyOfInput /= i; 
                i--; 
            }
        }
        return i;
    }
}