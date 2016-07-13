package algorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Primality {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int T = reader.nextInt();
        int[] array = new int[T];
        for(int i =0 ; i<T ; i++){ 
            array[i] = reader.nextInt();
        }
        for (int i = 0; i<T; i++){
           if(isPrime(array[i])){
               System.out.println("Prime");
           }else{
               System.out.println("Not prime");
           }
        }
    }
    
    public static boolean isPrime(int num){
        
        if( num == 1 || ((num & 1)==0)){
            return false;
        }else if(num ==2){
            return true;
        }else{
            int i=3;
            int sqrt = (int) Math.sqrt(num);
            while(i<=sqrt){
                if(num%i == 0){
                   return false;
                }
                i = i+2;
            }
            return true;
        }
        
    }
}
