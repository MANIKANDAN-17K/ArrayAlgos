class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 1;i<=numRows;i++){
            res.add(pascalTriangle(i));
        }
        return res;
    }
    private List<Integer> pascalTriangle(int c){
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        long a = 1;
        for(int i = 1;i<c;i++){
            a *= c - i;
            a /= i;
            ans.add((int)a);
        }
        return ans;
    }

}
