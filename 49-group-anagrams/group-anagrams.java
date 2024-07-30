class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list=new ArrayList<>();
        HashMap<String,List<String>> hm=new HashMap<>();
        for(String s:strs){
            char[] array=s.toCharArray();
            Arrays.sort(array);
            String sorted=new String(array);
            if(!hm.containsKey(sorted)){
                hm.put(sorted,new ArrayList<>());

            }
            hm.get(sorted).add(s);
                        
        }
        list.addAll(hm.values());
        
        return list;
        
    }
}