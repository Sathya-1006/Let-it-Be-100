class Solution {
    public int mostWordsFound(String[] sentences) {
        //initiate max
        int max=0;
        int cnt=0;
        //count each space in a sentence + 1
        for(int i=0;i<sentences.length;i++){
            //sen[0]=>1st sentence
            for(int j=0;j<sentences[i].length();j++){
                if(sentences[i].charAt(j) == ' '){
                    cnt++;
                }
            }
            if(max<cnt){
                max=cnt;
            }cnt=0;
        }
        return max+ 1;

        
    }
}
