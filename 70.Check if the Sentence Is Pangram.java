class Solution {
    public boolean checkIfPangram(String sentence) {
      //check -> length of sentence
       if(sentence.length()<26) return false;
      //loop goes from a -> z
       for(char ch='a';ch<='z';ch++){
        if(sentence.indexOf(ch)<0) return false; //if a char index not found -> not a pangram
       }

        return true;
    }
}
