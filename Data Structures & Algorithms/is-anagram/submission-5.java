class Solution {
    public boolean isAnagram(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        if(slen != tlen) return false;
        int[] count = new int[26];
        for(int i=0;i<slen;i++)
        {
            count[s.charAt(i) - 'a'] ++;
            count[t.charAt(i) - 'a'] --;
        }
        for(int num : count)
        {
            if(num != 0) return false;
        }
        return true;
    }
}
