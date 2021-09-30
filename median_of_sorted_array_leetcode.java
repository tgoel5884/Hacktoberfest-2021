class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int [] ans = new int [nums1.length+nums2.length];
        double result=0;
        for(int i=0;i<nums1.length;i++){
            ans[i]=nums1[i];
        }
        int t=nums1.length;
        for(int i=0;i<nums2.length;i++){
            ans[t]=nums2[i];
            t++;
        }
        Arrays.sort(ans);
        
        if(ans.length%2==0){
            int s=ans.length/2;
        
            result=((ans[s]+ans[s-1])/2.0);
            
        }else{
           int k =ans.length/2;
            result=ans[k];
        }
        return result;
    }
}
