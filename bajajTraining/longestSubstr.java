class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int ml=0;

        Set<Character> st=new HashSet<>();

        for(int i=0;i<s.length();i++){

            while(st.contains(s.charAt(i))){
                st.remove(s.charAt(l));
                l++;
            }

            st.add(s.charAt(i));

            ml=Math.max(ml,i-l+1);
        }

        return ml;
    }
}