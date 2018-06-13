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
    static int deci = 0;
    static int pwr = 0;
    static int charCount;
    static int maxChar=0;
    static char maxCharCount = 0;
static char maxCharCh = '.';
    
    
    public String reverse(String s){
        char ch[] = new char[s.length()];
        for(a = 0;a < s.length();a++){
            ch[a] = s.charAt(a);
               }
          for(a=s.length()-1; a>=0;a++)  {   
              System.out.print(ch[a]);
             }   
          return s;
        }
    
    
    
      public int binaryToDecimal(String s){
          bin = Integer.parseInt(s);
          while(true){
             if(bin == 0)
             {
                 break;
             }
             else
             {
                             int demi = bin%10;
                             deci += demi*Math.pow(2,pwr);
                             bin = bin/10;
                                     pwr++;
                             }
                     
         
      }
    return deci;     
             }
      
      
      
            public String initials(String v){
    if(v.length() == 0)
        return v;
    System.out.print(Character.toUpperCase(v.charAt(0)));
    for(int a = 1;a < v.length()-1;a++)
        if(v.charAt(a) == ' ')
            System.out.print(" "+ Character.toUpperCase(v.charAt(a+1)));

return v;
            }

public char mostFrequent(String v){
    char[] cArray = v.toCharArray();
    for(int a = 0;a < cArray.length;a++){
        int charASCII = (int)cArray[a];
        charCount = 0;
        for(int x = 0; x<cArray.length;x++){
            if(charASCII == (int)cArray[x]){
                charCount ++;
                if(charCount > maxChar){
                    maxChar = charCount;
                    maxCharCh = cArray[a];
                }
            }
        }
    }
    return maxCharCh;

}
}

