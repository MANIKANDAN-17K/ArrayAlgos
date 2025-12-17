class Solution {
    private void merge(int[] A,int start,int mid,int end){
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i = 0;i<n1;i++){
            L[i] = A[start + i];
        }
        for(int j = 0;j<n2;j++){
            R[j] = A[mid + 1 + j];
        }
        int i = 0,j=0;
        int k = start;

        while(i<n1 && j<n2){
            if(L[i] <= R[j]){
                A[k++] = L[i++];
            }else{
                A[k++] = R[j++];
            }
        }
        while(i<n1){
            A[k++] = L[i++];
        }
        while(j < n2){
            A[k++] = R[j++];
        }
    }

    private int mergeAndCount(int[] A,int start,int end){
        if(start >= end) return 0;
        int mid = start + (end - start)/2;
        int count = mergeAndCount(A,start,mid) + mergeAndCount(A,mid+1,end);
        int j = mid + 1;
        for(int i = start;i<= mid;i++){
            while(j <= end && (long)A[i] > 2L*A[j]){
                j++;
            }
            count += j - (mid + 1);
        }
        merge(A,start,mid,end);
        return count;
    }


    public int reversePairs(int[] nums) {
        return mergeAndCount(nums,0,nums.length - 1);
    }
}
