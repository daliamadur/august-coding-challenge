//complexity - dependent on choice of sorting algorithm, best case O(n log n)

int sorted(int[] array) {
        array = mergeSort(array);
        
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i+1]) {
                return array[i];
            }
        }

        return 0;

    }
