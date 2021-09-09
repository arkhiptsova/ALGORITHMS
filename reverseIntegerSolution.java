/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author milaa
 */
public class reverseIntegerSolution {
   
    public int reverse(int x) {
        
       int rev_num = 0;
        while(x > 0)
        {
            rev_num = rev_num * 10 + x % 10;
            x = x / 10;
        }
          System.out.println("Reverse of no. is "+
                           + rev_num);
        return rev_num; 
      
    }
    
}
