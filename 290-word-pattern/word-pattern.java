class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");

        HashMap<Character,String> hm=new HashMap<>();
        if(pattern.length()!=words.length){
            return false;
        }

        for(int i=0;i<pattern.length();i++){
            if(!hm.containsKey(pattern.charAt(i))){
                if(hm.containsValue(words[i])){
                    return false;
                }

            }
            else if(!hm.get(pattern.charAt(i)).equals(words[i])){
                return false;
            }

            
            hm.put(pattern.charAt(i),words[i]);

        }
        return true;
        
        
    }
}