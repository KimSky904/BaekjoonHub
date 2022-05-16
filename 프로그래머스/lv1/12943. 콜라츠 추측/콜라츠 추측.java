class Solution {
    public int solution(int num) {
        int answer = 0;
        
        // 1이 될 때까지 반복
        long n = num;
        while(n!=1){
            if(n%2==0) n/=2;
            else {
                n *= 3;
                n += 1;
            }
            answer++;
        }
        if(answer>500) answer = -1;
        
        return answer;
    }
}