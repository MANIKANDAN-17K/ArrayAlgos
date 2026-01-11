class Solution {
    public String[] findWords(String[] words) {
        List<String> ans = new ArrayList<>();
        String frow = "qwertyuiop";
        String srow = "asdfghjkl";
        String trow = "zxcvbnm";
        for(String i : words){
            if(isRow(i,frow) || isRow(i,srow) || isRow(i,trow)){
                ans.add(i);
            }
        }
        return ans.toArray(new String[0]);
    }
    private boolean isRow(String s, String row){
        for(char c : s.toCharArray()){
            if(row.indexOf(Character.toLowerCase(c)) == -1){
                return false;
            }
        }
        return true;
    }
}
