class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=names.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        String[] ans =new String[n];
        for(int i=0;i<n;i++){
            hm.put(heights[i],i);
        }

        Arrays.sort(heights);

        for(int i=0;i<n;i++){
            ans[i]=names[hm.get(heights[i])];
        }
        
        String[] reversed=new String[n];
        for(int i=0;i<names.length;i++){
            reversed[i]=ans[n-1-i];
        }

        return reversed;
    }
}