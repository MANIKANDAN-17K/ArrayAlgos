class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;
        for(int i = n - 1;i >= 1;i--){
            if( nums [i] > nums[i - 1]){
                idx = i - 1;
                break;
            }
        }
        if(idx == -1){
            reverse(0,n-1,nums);
            return;
        }    
        for(int i = n - 1;i>=0;i--){
            if(nums[i]  > nums[idx]){
                swap(idx,i,nums);
                break;
            }
        }
        reverse(idx+1,n-1,nums);
    }
    private void reverse(int start,int end,int[] nums){
        while(start < end){
            swap(start++,end--,nums);
        }
    }
    private void swap(int a,int b,int[] nums){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    
}
