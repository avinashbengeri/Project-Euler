/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
package projecteuler;
/**
 *
 * @author AVINASH
 */
public class SmallestMultiple {
    public static void main(String[] args){
        int num=21;
        boolean flag=true;
        while(flag){
            for(int i=1;i<=20;i++){
                if(num%i!=0){
                    flag=false;
                    break;
                }
            }
            if(flag==false){
                flag=true;
                num=num+1;
            }else{
                break;
            }
        }
        System.out.println(num); // Answer: 232792560
    }
}
