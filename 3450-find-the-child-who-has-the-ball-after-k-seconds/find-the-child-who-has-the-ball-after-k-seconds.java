class Solution {
    public int numberOfChild(int n, int k) {
        n--;
        int turns=k/(n);
        int rem=k%(n);

        if(turns%2 ==0) return rem;
        else return n-rem;
    }
}