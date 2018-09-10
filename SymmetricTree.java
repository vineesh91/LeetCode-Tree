
public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		return checkRoots(root.left,root.right);
    }
	public boolean checkRoots(TreeNode left, TreeNode right) {
		if(left == null && right == null) {
			return true;
		}
		else if(left == null || right == null) {
			return false;
		}
		else if(left.val == right.val) {
			if(checkRoots(left.left, right.right) && checkRoots(left.right, right.left)) {
				return true;
			}
		}
		return false;
	}
}
