class Solution {
  public:
    long long countBits(long long n) 
    {
        // code here
       if(n<=1) return n;
        long long x=log2(n);
        long long lp=pow(2,x);
        long long bachahua=n-pow(2,x);
        return ((lp*x)/2)+(n-lp+1)+countBits(bachahua);
    }
};
