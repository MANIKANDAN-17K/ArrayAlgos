class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1 = 0;
        int c2 = 0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(c1 == 0){
                ele1 = nums[i];
                c1 = 1;
            }else if(c2 == 0 && nums[i] != ele1){
                ele2 = nums[i];
                c2 = 1;
            }else if(nums[i] == ele1){
                c1++;
            }else if(nums[i] == ele2){
                c2++;
            }else{
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;
        for(int i = 0;i<n;i++){
            if(nums[i] == ele1) c1++;
            if(nums[i] == ele2) c2++;
        }
        int mini = n / 3 + 1;
        List<Integer> ans = new ArrayList<>();
        if(mini <= c1) ans.add(ele1);
        if(mini <= c2 && ele1 != ele2) ans.add(ele2);
        return ans;
    }
}
