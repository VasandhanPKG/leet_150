class Solution {
    public int trailingZeroes(int n) {
        
        int trl_zeros=0;
        
        while(n>0)
        {
            n/=5;
           trl_zeros+=n;
          
        }
        return trl_zeros;
    }
}