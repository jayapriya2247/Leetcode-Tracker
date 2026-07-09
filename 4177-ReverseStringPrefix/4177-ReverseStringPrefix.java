// Last updated: 7/9/2026, 3:06:05 PM
class Solution {
    public String reversePrefix(String s, int k) {
        if(k>=s.length()){
            return new StringBuilder(s).reverse().toString();
        }
        String prefix = s.substring(0,k);
        String suffix = s.substring(k);
        String reversedPrefix = new StringBuilder(prefix).reverse().toString();
        return reversedPrefix + suffix;
        
    }
}