class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int l = 0;
        int m = 0;
        int h = n - 1;
        for(int i = 0;i<n;i++){
            if(nums[m] == 0){
                swap(nums,l,m);
                l++;
                m++;
            }else if(nums[m] == 1){
                m++;
            }else{
                swap(nums,h,m);
                h--;
            }
        }
    }
    private void swap(int[] nums,int x,int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
