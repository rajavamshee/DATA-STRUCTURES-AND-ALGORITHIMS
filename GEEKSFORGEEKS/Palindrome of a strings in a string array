#include <algorithm>
#include <initializer_list>
#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int testcases;
	std::cin >> testcases;
	while(testcases--)
	{
	    
	}
	return 0;
}


class Solution{
public:
    bool makePalindrome(int n,vector<string> &arr){
        // Code here
        if(n==1){
            return false;
        }
        unordered_map<string,int>mp;
        for(int i=0; i<n; i++)
        {
            string temp=arr[i];
            mp[arr[i]]++;
            reverse(temp.begin(),temp.end());
            mp[temp]++;
        }
        if(mp.size()==n){
            return true;
        }
        return false;
    }
};
