//hackerrank
//java hashset problem
//solution
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

  int cnt=0;
       boolean found;

       if(t>=1 && t<=100000){
           for(int i=0;i<pair_left.length && i<pair_right.length;i++){
               found=false;
               for(int j=0;j<i;j++){
                  if(pair_left[i].equals(pair_left[j])){
                    if(pair_right[i].equals(pair_right[j])){
                      found=true; 
                      break;
                    } 
                 } //end-if
               }//end-for-1
 
            if(!found){
                cnt=cnt+1;
            }
            System.out.println(cnt); 
         } //end-for-2
     }//end-if

    }
}