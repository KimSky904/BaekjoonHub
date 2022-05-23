class Solution {
    public int[] solution(int[] arr) {
        
        if(arr.length == 1) return new int[]{-1};
        
        int[] answer = new int[arr.length-1];
        // 최솟값 판별
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[index]>arr[i]) index = i; 
        }
        //값 삽입
        int v = 0;
        for(int i=0;i<arr.length;i++){
            if(i==index) continue;
            answer[v++] = arr[i];
        }
        
        return answer;
    }
}