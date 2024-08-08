class Solution {
    
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        int open=0,close=0;
        helper(list, n, open, close, "");
        return list;
    }

    public static void helper(List<String> list,int n,int open,int close,String currStr){
        if(currStr.length()==n*2){
            list.add(currStr);
        }
        if(open<n){
            helper(list,n,open+1,close,currStr+"(");
        }
        if(close<open){
            helper(list,n,open,close+1,currStr+")");
        }
    }
}