class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char s1=s.charAt(i);
            char t1=t.charAt(i);

            if(hm.containsKey(s1)){
                if(! hm.get(s1).equals(t1)){
                    return false;
                }

            }
            else if(!hm.containsKey(s1)){
                if(hm.containsValue(t1)){
                    return false;
                }
            }

            hm.put(s.charAt(i),t.charAt(i));

        }
        return true;
        
    }
}