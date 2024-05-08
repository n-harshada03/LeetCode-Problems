class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        

        // define maxheap
        PriorityQueue<Integer> pq= new PriorityQueue<Integer>(Collections.reverseOrder());

        for(int i=0;i<n;i++){
            pq.add(score[i]);
        }
        
        // ArrayList<Integer> a = new ArrayList<>(pq); 
        // pq.clear();
        ArrayList<Integer> a= new ArrayList<>();
        while(!pq.isEmpty()){
            a.add(pq.poll());
        }

        HashMap<Integer, String > hm=new HashMap<>();
        String[] s=new String[n];
        s[0]="Gold Medal";
        // s[1]="Silver Medal";
        // s[2]="Bronze Medal";
        if (n > 1) {
            s[1] = "Silver Medal";
        }
        if (n > 2) {
            s[2] = "Bronze Medal";
        }


        for (int i=3;i<n;i++){
            s[i]=String.valueOf(i+1);
        }
        for(int i=0;i<n;i++){
            hm.put(a.get(i),s[i]);
        }

        String[] answer=new String [n]; 
        for(int i=0;i<n;i++){

            answer[i]=hm.get(score[i]);
        }

        return answer;
    }

}