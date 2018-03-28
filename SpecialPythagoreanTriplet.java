/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a square + b square = c square
For example, 3 square + 4 square = 9 + 16 = 25 = 5 square.
There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */
package projecteuler;
/**
 *
 * @author AVINASH
 */
public class SpecialPythagoreanTriplet {
    public static void main(String[] args){
        int c=0;
        int sum=1000,prod=1;
        for(int a=0;a<=sum/3;a++){
            for(int b=a+1;b<=sum-a;b++){
                c=sum-a-b;
                if(Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)){
                    prod=a*b*c;
                }
            }
        }
        System.out.println("Prod: "+prod); // Answer: 31875000
    }
}