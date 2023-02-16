package primeNumbers;

import java.util.Scanner;
import java.lang.Math;

public class prime {
    
    public static void main (String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number to check prime or not: ");
        int num = sc.nextInt();

        primeNum(num);
        
    }

    
    private static void primeNum(int num) {

        int count = 0;
        
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                count++;
            }
        }

        if(count==0){
            System.out.println("The number is prime");
        }

        else{
            System.out.println("The number is not prime");
        }
    }


    
}
