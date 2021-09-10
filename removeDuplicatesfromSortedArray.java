class Solution {
    public int removeDuplicates(int[] nums) {
        
        int n =nums.length;
        int[] temp= new int[n];
        if (n==0 || n==1){
            return n;
        }
            int j = 0;
            for(int i=0; i<=n; i++){
               if (nums[i] != nums[i+1])
                temp[j++] = nums[i];
         
        // Store the last element as whether
        // it is unique or repeated, it hasn't
        // stored previously
        temp[j++] = nums[n-1];  
         
        // Modify original array
        for ( i=0; i<j; i++)
            nums[i] = temp[i];
      
        return j;
            }
       
    return j}

}
