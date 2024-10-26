int longestSubstring(String original) {
        int left = 0;
        int length = 0;
        LinkedHashSet<Character> chars = new LinkedHashSet<>();

        for (int right = 0; right < original.length(); right++) {
            while(chars.contains(original.charAt(right))) {
                chars.remove(original.charAt(left));
                left++;
            }

            chars.add(original.charAt(right));
            length = Math.max(length, right - left + 1);
        }

        return length;
    }
