class Solution {

    List<String> result = new ArrayList<>();

    void solve(String curr,int open,int close, int n){
        if(curr.length()==2*n){
            result.add(curr);
            return ;
        }

        if(open<n){
            solve(curr +'(' ,open+1,close,n);
        }
        if(close<open){
            solve(curr +')',open,close+1,n);
        }
        

    } 
    public List<String> generateParenthesis(int n) {
        int open=0;
        int close=0;

        String curr="";

        solve(curr,open,close, n);

        return result;
        
    }
}


/*    BRUTE FORCE
class Solution {

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

*/
