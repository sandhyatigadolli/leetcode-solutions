class Solution {
    public String reverseVowels(String s) {
       char[] c = s.toCharArray();
       int i=0,j= c.length-1;
       String vowels = "aeiouAEIOU";
       while(i<j) {
        if(!vowels.contains(c[i] + "")) {
            i++;
        }
        else if(!vowels.contains(c[j] + "")) {
            j--;
        } else {
            char temp = c[i];
            c[i]=c[j];
            c[j]=temp;
            i++;
            j--;
        }
       } 
       return new String(c);
    }
}