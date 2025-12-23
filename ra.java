class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] count = new int[26]; // for letters a–z

        // Count letters in magazine
        for (int i = 0; i < magazine.length(); i++) {
            count[magazine.charAt(i) - 'a']++;
        }

        // Use letters for ransomNote
        for (int i = 0; i < ransomNote.length(); i++) {
            count[ransomNote.charAt(i) - 'a']--;

            // If letter not available
            if (count[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}



