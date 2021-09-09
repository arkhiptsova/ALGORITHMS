class Solution {
    public boolean isPalindrome(int x) {
       
 int reminder,sum=0,temp;    
 
  
  temp=x;    
  while(x>0){    
   reminder=x%10;  //getting remainder  
   sum=(sum*10)+reminder;    
   x=x/10;    
  }    
       if (temp==sum)
       {
           System.out.println("Your number " +temp+ " is a palindrome");
           return true;
       } 
      System.out.println("Your number " +temp+ " is not a palindrome") ; 
        return false;
    }
        }
