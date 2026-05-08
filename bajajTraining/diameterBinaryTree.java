class Solution {
    int m=0;
    public int height(TreeNode root){
        if(root==null) return 0;
        int a=height(root.left);
        int b=height(root.right);
        m= Math.max(m,a+b);
        return 1+Math.max(a,b);
    }

    public int diameterOfBinaryTree(TreeNode root){
        if(root==null) return 0;
        height(root);
        return m;
    }
}