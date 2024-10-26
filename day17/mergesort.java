int[] merge(int[] arr1, int [] arr2) {
        int length = arr1.length + arr2.length, a = 0, b = 0;
        int[] merged = new int[length];

        for (int i = 0; i < length; i++) {

            //arr1 finishes before arr2
            if (a >= arr1.length && b < arr2.length) {
                merged[i] = arr2[b];
                b++;
            } 
            //arr2 finishes before arr1            
            else if (b >= arr2.length && a < arr1.length) {
                merged[i] = arr1[a];
                a++;
            } else {
                if (arr1[a] < arr2[b]) {
                    merged[i] = arr1[a];
                    a++;
                } else {
                    merged[i] = arr2[b];
                    b++;
                }
            }
        }
        return merged;
    }

int[] mergeSort(int[] array) {
        
        //conquer -> if only one value, return
        if (array.length <= 1) {
            return array;
        }

        int size = array.length;
        int size1 = size/2;
        int size2 = size - size1;

        int[] half1 = new int[size1];
        int[] half2 = new int[size2];

        //divide -> split into two
        for (int i = 0; i < size; i++) {
            if (i < size1) {
                half1[i] = array[i];
            } else {
                half2[i - size1] = array[i];
            }
        }
        //recur -> call merge sort on each half, merge halves together
        half1 = mergeSort(half1);
        half2 = mergeSort(half2);

        return merge(half1, half2);
        
    }
