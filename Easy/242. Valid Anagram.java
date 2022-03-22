class Solution {
    public boolean isAnagram(String s, String t) {
        char[] alphab = new char[26];

        for(int i=0; i<s.length(); i++) alphab[s.charAt(i)-'a']++;
        for(int i=0; i<t.length(); i++) alphab[t.charAt(i)-'a']--;

        for(char ch : alphab) if(ch!=0) return false;
        return true;
    }
}
