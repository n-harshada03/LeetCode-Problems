class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<Integer>();
        int a=0;
        int b=0;
        for(String str:tokens){
            if(str.equals("+")){
                a=s.pop();
                b=s.pop();
                s.push(a+b);
            }
            else if(str.equals("-")){
                a=s.pop();
                b=s.pop();
                s.push(b-a);
            }
            else if(str.equals("*")){
                a=s.pop();
                b=s.pop();
                s.push(a*b);
            }
            else if(str.equals("/")){
                a=s.pop();
                b=s.pop();
                
                // if(a==0){
                //     ValueThrowsError("e");
                // }
                s.push(b/a);
            }
            else{
                s.push(Integer.parseInt(str));
            }
            
        }
        return s.pop();

        
    }
}