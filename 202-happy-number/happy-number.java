class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
        int ans=0,rem=0;
        while(n>0)
        {
            while(n>0)
            {
                rem=n%10;
                ans+=rem*rem;
                n/=10;
            }

            
            if(ans==1)
            {
                return true;
            }
            if(set.contains(ans))
            {
                return false;
            }

            set.add(ans);
         n=ans;
         ans=0;
        }
       return true;
    }
}