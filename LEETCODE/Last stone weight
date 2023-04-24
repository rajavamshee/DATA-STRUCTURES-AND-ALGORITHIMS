#include <algorithm>
#include <initializer_list>
#include <iostream>
using namespace std;
class Solution {
public:
    // Simply simulate the process
    int lastStoneWeight(std::vector<int>& stones) {
        // Create the priority queue
        std::priority_queue<int> q(stones.begin(), stones.end());
        int a, b;
        while (!q.empty()) {
            // If theres ever one stone left, return it
            if (q.size() == 1) return q.top();
            a = q.top();
            q.pop();
            b = q.top();
            q.pop();

            // Do as instructed
            if (a != b) q.push(std::max(a, b) - std::min(a, b));
        }
        // If we ever run out of stones, then return 0
        return 0;
    }
};
