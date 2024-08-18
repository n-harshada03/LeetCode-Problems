class Solution {
    public int romanToInt(String s) {
        
        HashMap<Character,Integer> hm=new HashMap<>();
        int n=s.length();
        hm.put('I',1);
        hm.put('V', 5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C', 100);
        hm.put('D',500);
        hm.put('M',1000);
        int number=0;
        for(int i=n-1;i>=0;i--){

            char ch=s.charAt(i);
            // char prev=s.charAt(i+1);

            if(i<n-1 && hm.get(ch)<hm.get(s.charAt(i+1))){
                number=number-(hm.get(ch));
            }
            else{
                number=number+(hm.get(ch));
            }
            
        }

        return number;
    }
}