class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int cookiesNums = s.length;
        if(cookiesNums == 0) return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int MaxPos = 0;

        int idxCookies = cookiesNums - 1;
        int idxChild = g.length - 1;
        while(idxCookies >= 0 && idxChild >= 0){
            if(s[idxCookies] >= g[idxChild]){
                MaxPos++;
                idxCookies--;
                idxChild--;
            }else{
                idxChild--;
            }
        }
        return MaxPos;
    }
}
