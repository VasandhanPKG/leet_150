class Solution {
    public int majorityElement(int[] nums) {
        int cand = 0;
        int cnt = 0;
        for(int i:nums)
        {
            if (cnt == 0)
            {
                cand = i ;
                cnt =1;
            }
            else if( i == cand)
                cnt+=1;
            else
                cnt-=1;
       }
        return cand;
    }
}