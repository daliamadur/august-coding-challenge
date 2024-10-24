void binarySearch(vector<int> vec, int key) {
    int first = 0;
    int mid;
    int last = vec.size() - 1;
    bool found = false;

    while (first <= last) {

        mid = first + (last - first) / 2; //prevent overflow

        //if number == mid return
        if (vec[mid] == key) {
            cout << key << " found at position " << mid << endl;
            found = true;
            break;
        }
        //if number > mid, mid == first
        else if (vec[mid] < key) {
            first = mid + 1;
        }
        //if number < mid, mid == last
        else {
            last = mid - 1;
        }
        
    }

    if (!found) {
        cout << key << " wasn't found in the vector";
    }
    
}
