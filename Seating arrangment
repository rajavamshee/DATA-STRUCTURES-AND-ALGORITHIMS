//User function Template for C++

class Solution{
    public:
    bool is_possible_to_get_seats(int n, int m, vector<int>& seats)
    {
        int count = 0;
        int lastOne = -1;
        for(int i = 0; i < m; i++)
        {
            if(seats[i] == 1)
            {
                int emptySeats = i-lastOne-1;
                if(lastOne == -1) count += emptySeats/2;
                else count += (emptySeats-1)/2;
                lastOne = i;
            }
        }
        if(seats[m-1] != 1)
        {
            int emptySeats = m-lastOne-1;
            if(lastOne == -1) count += (emptySeats+1)/2;
            else count += emptySeats/2;
        }
        return count>=n;
    }
};
