class Solution {
public:
    int n,dp[101][501];
    vector<int>suff; // suffix sum array
    int dfs(int curr,int m,vector<int>&nums){
        if(curr==n) return 0;
        if(curr+2*m>=n)  // take all the remaining elements if it's possible
            return suff[curr];
        if(dp[curr][m]!=-1)  // if already calculated
            return dp[curr][m];
        int mx=0,sum=0;
        for(int i=1;i<=2*m && curr+i<n;i++){
            sum+=nums[curr+i-1]; // sum keeps track of what curr player will take
            
            // once the current player is done, the next player will take the maximum he can out of remaining elements, so what the current player will get is : sum + (whatever is remaining)
            mx=max(mx,sum+suff[curr+i]-dfs(curr+i,max(m,i),nums)); 
        }
        return dp[curr][m]=mx;
    }
    int stoneGameII(vector<int>& nums) {
        n=nums.size();
        suff=nums;
        for(int i=n-2;i>=0;i--)
            suff[i]+=suff[i+1];
        suff.push_back(0);
        memset(dp,-1,sizeof(dp));
        return dfs(0,1,nums);
    }
};
