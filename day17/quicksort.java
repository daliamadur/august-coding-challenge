void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }

int partition(int[] array, int low, int high){
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i , j); //swap elements less than pivot to front
            }
        }
        swap(array, i+1, high); //restore pivot
        return i+1; //return index of pivot
    }

void quickSort(int[] array, int low, int high) {
        //divide -> partition array
        if (low < high) {
            int pivot = partition(array, low, high);
        
        //conquer/recur -> apply quicksort to sections around pivot
        quickSort(array, low, pivot - 1);
        quickSort(array, pivot + 1, high);
        }
    }
