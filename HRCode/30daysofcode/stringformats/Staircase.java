package stringformats;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int i =0 ; i<n ;i++){
            
            int noofspaces = (n-1) - (i);
            int noofsymbol =  i+1; 
            
            for(int j =0 ; j<noofspaces; j++){
              System.out.print(" "); 
            }
            
            for(int k =0 ; k<noofsymbol; k++){
              System.out.print("#");   
            }
            
            System.out.println();
         }
        
        
    }
    
    
}
