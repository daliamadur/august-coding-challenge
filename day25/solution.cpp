void printRLE(string input) {
    for (int i = 0; i < input.length(); i++) {
        int count = 1;

        while (i < input.length() - 1 && input[i] == input[i + 1]) {
            count++;
            i++;
        }

        cout << input[i] << count;
    }
}
