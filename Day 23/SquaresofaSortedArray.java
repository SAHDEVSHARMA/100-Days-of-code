class Solution {
    public int[] sortedSquares(int[] nums) {
    int[] result=new int[nums.length];
        int i=0;
        int j=nums.length-1;
        int k=nums.length-1;

        while(i<=j){
        int isquare=nums[i]*nums[i];
        int jsquare=nums[j]*nums[j];

             if(isquare<jsquare){
                result[k]=jsquare;
                j--;
             }
             else{
                result[k]=isquare;
                i++;
             }
             k--;
        }
        return result;
    }
}