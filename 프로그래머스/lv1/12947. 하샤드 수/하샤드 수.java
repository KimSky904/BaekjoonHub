class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        
        //자릿수의 합
        int sumOfNumber = 0;
        int number = x;
        while(number>0){
            sumOfNumber += number%10;
            number/=10;
        }
        
        //나누어 떨어지는지 판단
        answer = x%sumOfNumber==0? true : false;
        
        return answer;
    }
}