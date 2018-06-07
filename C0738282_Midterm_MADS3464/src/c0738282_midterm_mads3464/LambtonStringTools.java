/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c0738282_midterm_mads3464;
/**
 *
 * @author macstudent
 */
public class LambtonStringTools {
    
    static int a;
    static int bin;
    static int binary[];
    static int index;
    
    
    static String reverse(String s){
        char ch[] = new char[s.length()];
        for(a = 0;a < s.length();a++){
            ch[a] = s.charAt(a);
               }
          for(a=s.length()-1; a>=0;a++)  {   
              System.out.print(ch[a]);
             }   
          return s;
        }
    
    
    
      public int binaryToDecimal(String binary){
   numbers = binary.toCharArray();
   
    }
}
