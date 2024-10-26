//time complexity - O(n)
//space complexity - O(n)

    int set(int[] array) {
        Set<Integer> set = new LinkedHashSet<Integer>(); //linked hashset maintains added order
        for (int i : array) {
            set.add(i);
        }

        int index = 0;

        Iterator<Integer> i = set.iterator();
        while (i.hasNext()) {
            if (i.next() != array[index]) {
                return array[index];
            }

            index++;
        }

        return 0;
    }
