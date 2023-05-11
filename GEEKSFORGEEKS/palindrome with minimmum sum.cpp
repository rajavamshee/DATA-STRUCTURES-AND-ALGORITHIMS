class Solution {
  public:
    int minimumSum(string s) {
        int n = s.size();
        int left = 0;
        int right = n-1;
        while(left<=right){
            if(s[left]=='?' && s[right]=='?'){
                if(left!=0)
                    s[left] = s[left-1];
                if(right!=n-1)
                    s[right] = s[right+1];
            }
            else if(s[left]=='?'){
                s[left] = s[right];
            }
            else if(s[right]=='?'){
                s[right] = s[left];
            }
            else if(s[left] != s[right]){
                return -1;
            }
            left++;
            right--;
        }
        int count =0;
        for(int i=1;i<n;i++){
            if(s[i]!='?' && s[i-1]!='?')
            count+=abs(s[i]-s[i-1]);
        }
        return count;
    }
};
