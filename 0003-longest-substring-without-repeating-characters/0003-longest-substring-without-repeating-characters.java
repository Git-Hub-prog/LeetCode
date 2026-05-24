class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int n = s.length();
        int left = 0, right = 0;
        int maxLen = 0;
        while(right  < n){
            char c = s.charAt(right);
            if(!set.contains(c)){
                set.add(c);
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            }else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLen;
    }
}