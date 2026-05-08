class Solution{
    public int maxArea(int[] height){
        int l=0;
        int r=height.length-1;
        int mw=0;
        while(l<r){
            int w=r-l;
            int a=Math.min(height[l],height[r]) * w;

            mw=Math.max(mw,a);

            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return mw;
    }
}