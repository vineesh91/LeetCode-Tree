
public class MaximumDepthBinaryTree {
	public int maxDepth(TreeNode root) {
        if(root == null) {
        	return 0;
        }
        else {
        	return 1 + Math.max(childDepth(root.left), childDepth(root.right));
        }
    }
	
	public int childDepth(TreeNode child) {
		if(child == null) {
			return 0;
		}
		else {
			return 1 + Math.max(childDepth(child.left), childDepth(child.right));
		}
	}
}
