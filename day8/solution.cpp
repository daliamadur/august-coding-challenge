#include <iostream>
#include <map>
#include <vector>
#include <algorithm>

using namespace std;

//create hashmap of all sums -> in array, out hashmap
    // int sum value, pair numbers value
map<int, pair<int, int>> sum_map(vector<int> vec) {

    map<int, pair<int, int>> sums;
    pair<int, int> numbers;
    int start;

    for (int i = 0; i < vec.size(); i++) {
        start = i + 1;
        
        for (int j = start; j < vec.size(); j++) {
            numbers.first = i;
            numbers.second = j;
            sums.insert({vec[i] + vec[j], numbers});
        }
    }

    return sums;
}
