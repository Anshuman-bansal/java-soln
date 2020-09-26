//hackerrank
//Java Exception Handling (Try-catch) problem
//sollution
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
   try{
      Scanner sn = new Scanner(System.in);
   
      int x=sn.nextInt();
      int y = sn.nextInt();
     
        int k=x/y;
       
        System.out.println(k);
     
      }catch(InputMismatchException e){
        System.out.println(e.getClass().getName());
      }catch(ArithmeticException e){
     System.out.println(e);
                        }   
     
     
    }
}
