class Solution {
    public int findSpecialInteger(int[] arr) {
        int count=arr.length;
        int a= count/4;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr[i+a]){
                return arr[i];
            }
        }
        return -1;
    }
}