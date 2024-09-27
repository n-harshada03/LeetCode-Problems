class Solution {
    // List<String> result;

    boolean isValid(String curr){
        int count=0;

        for(int i=0;i<curr.length();i++){
            char ch=curr.charAt(i);
            if(ch=='('){
                count++;
            }
            else{
                count--;
            }
            if(count<0){
                return false;
            }
        }
        return count==0;
    }

    void solve(List<String> result,String curr,int n){
        if(curr.length()==2*n){
            if(isValid(curr)){
                result.add(curr);
            }
            return ;
        }

        
        solve(result,curr +'(' ,n);
        
        solve(result,curr +')',n);
        

    } 
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        String curr="";

        solve(result,curr,n);

        return result;
        
    }
}