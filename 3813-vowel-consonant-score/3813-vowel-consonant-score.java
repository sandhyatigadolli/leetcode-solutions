class Solution {
    public int vowelConsonantScore(String s) {
    int vowelCount = 0 ,conCount = 0;
    int result = 0;
    for(char c:s.toCharArray()) {
        if(c>='a' && c<='z') {
        if(c == 'a' || c =='e' || c == 'i' || c == 'o' || c =='u') {
            vowelCount++;
        } else {
            conCount++;
        }  
    }
    }
    
      if(conCount==0) {
            return 0;
        } 
    result = (vowelCount / conCount);
    return result;
    }
}