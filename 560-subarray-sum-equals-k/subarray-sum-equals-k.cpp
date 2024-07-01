class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int sum = 0;
        int left = 0;
        int right = 0;

        int count = 0;
        unordered_map<int,int>m;

        while(right<nums.size()){
            sum+=nums[right++];

            if(sum == k){
                count ++;
            }

            if(m.find(sum-k)!=m.end()){
                count+= m[sum-k];
            }

            m[sum]++;

        }
        return count;
    }
};