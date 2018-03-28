/*
The sum of the squares of the first ten natural numbers is,
1 square + 2 square + ... + 10 square = 385
The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10) square = 55 square = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
package projecteuler;
/**
 *
 * @author AVINASH
 */
public class SumSquareDifference {
    public static void main(String[] args){
        int n=100;
        int sumOfSquares=(n * (n + 1) * (2 * n + 1)) / 6;
        int squareOfSum=(int) Math.pow((n*(n+1))/2, 2);
        System.out.println("Diff: "+ (squareOfSum-sumOfSquares)); // Answer: 25164150
    }
}