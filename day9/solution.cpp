#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> merge(vector<int> arr1, vector<int> arr2) {
    int length = arr1.size() + arr2.size();
    vector<int> vec;

    for (int i = 0; i < length; i++) {

        //arr1 finishes before arr2
        if (arr1.empty() && !arr2.empty()) {
            vec.insert(vec.end(), arr2.begin(), arr2.end());
            break;
        }

        //arr2 finishes before arr1
        if (!arr1.empty() && arr2.empty()) {
            vec.insert(vec.end(), arr1.begin(), arr1.end());
            break;
        }

        if (arr1.front() < arr2.front()) {
            vec.push_back(arr1.front());
            arr1.erase(arr1.begin());
        }
        else {
            vec.push_back(arr2.front());
            arr2.erase(arr2.begin());
        }
    }

    return vec;

}
