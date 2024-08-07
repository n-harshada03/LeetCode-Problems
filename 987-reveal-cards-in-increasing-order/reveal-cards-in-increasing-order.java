class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n=deck.length;
        Arrays.sort(deck);
        

        Queue<Integer> q =new LinkedList<>();
        for (int i=0;i<n;i++){
            q.add(i);
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[q.poll()] = deck[i];
            if(!q.isEmpty()){
                q.add(q.poll());
            }
        }
        
        return result;
    }
}