class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        // false : -, true : +
        
        int answer = 0;
        
        for(int i=0;i<absolutes.length;i++){
            answer += signs[i]? absolutes[i] : (absolutes[i]*-1);
        }
        
        return answer;
    }
}