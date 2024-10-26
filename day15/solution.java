public HashMap<String, Integer> countWords(String path) {
        //hashmap for wordcount
        HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
        String line;
        String[] words;

        //read in file
        try {
            //get file with text
            FileReader text = new FileReader(path);
            //put file into reader
            BufferedReader reader = new BufferedReader(text);

            while ((line = reader.readLine()) != null) {
                //split line into words
                words = line.toLowerCase().replaceAll("[^\\\\dA-Za-z ' -]", "").split(" ");
                
                //put each word in HashMap
                for (String word : words) {
                    //add word if not in, inc count if in
                    if (!word.isEmpty()) {
                        if (wordCount.containsKey(word)) {
                            wordCount.put(word, wordCount.get(word) + 1);
                        } else {
                            wordCount.put(word, 1);
                        }
                    }
                }
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return wordCount;
    }
