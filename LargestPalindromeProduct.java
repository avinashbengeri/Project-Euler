/*
A palindromic number reads the same both ways. 
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
 */
package projecteuler;
import java.util.Stack;
/**
 *
 * @author AVINASH
 */
public class LargestPalindromeProduct {
    public static boolean isPalindrome(String s){
        char[] charArray = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        int i;
        for(i=0;i<charArray.length/2;i++){
            stack.push(charArray[i]);
        }
        if(charArray.length%2!=0){
            i=i+1;
        }
        for(int j=i;j<charArray.length;j++){
            if(charArray[j]!=stack.pop()){
                return false;
            }
        }
        return stack.empty();
    }
    public static void main(String[] args) {
        int a=99,b=99;
        int maxA=0,maxB=0;
        int max=0;
        for(int i=a;i<=999;i++){
            for(int j=b;j<=999;j++){
                if(isPalindrome(String.valueOf(i*j)) && i*j>max){
                    max=i*j;
                    maxA=i;
                    maxB=j;
                }
            }
        }
        System.out.println("Max Prod: "+max); // Answer: 906609
    }
}
