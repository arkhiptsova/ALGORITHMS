class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String result="";
        int size = strs.length;
        // The longest common prefix of an empty array is "".
        if (size == 0){
          System.out.println("Longest common prefix: "); 
        }
        // The longest common prefix of an array containing 
        // only one element is that element itself.
        else if (size == 1){
          System.out.println("Longest common prefix: " + strs[0]);
        }
        else{
          // Sort the array
           Arrays.sort(strs);
           int length = strs[0].length();
           StringBuilder res = new StringBuilder();
           // Comapre the first and the last strings character
           // by character.
           for(int i = 0; i < length; i++){
             // If the characters match, append the character to the result.
             if(strs[0].charAt(i) == strs[size - 1].charAt(i)){
               res.append(strs[0].charAt(i));
             }
             // Else, stop the comparison.
             else{
               break;
             }
           }
        result = res.toString();
           System.out.println("Longest common prefix: " + result);
        } 
      return  result; 
    }
}
