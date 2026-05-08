class Solution{
    public static TreeNode min(TreeNode root){
        TreeNode c=root;
        while(c.left!=null){
            c=c.left;
        }
        return c;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }
        if(key<root.val){
            root.left=deleteNode(root.left,key);
        }
        else if(key>root.val){
            root.right = deleteNode(root.right,key);
        }
        else{
            if(root.left==null && root.right==null){
                return null;
            }
            else if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            TreeNode t=min(root.right);
            root.val=t.val;
            root.right=deleteNode(root.right,t.val);
        }
        return root;
    }
}