class Solution {

    
     public String customSortString(String order, String s) {
        // Step 1: Create a map to store the count of characters in s
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        
        // Step 2: Build the result string using characters from order
        StringBuilder result = new StringBuilder();
        for (char c : order.toCharArray()) {
            if (countMap.containsKey(c)) {
                int count = countMap.get(c);
                while (count > 0) {
                    result.append(c);
                    count--;
                }
                countMap.remove(c);
            }
        }
        
        // Step 3: Append remaining characters from s
        for (char c : countMap.keySet()) {
            int count = countMap.get(c);
            while (count > 0) {
                result.append(c);
                count--;
            }
        }
        
        return result.toString();
    }
}