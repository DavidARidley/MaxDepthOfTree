public class Solution {
	public static void main(String[] args) {
		//Create a sample tree
    TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(8);
		root.right.right = new TreeNode(10);
		System.out.println(findDepth(root));
	}
	public static int findDepth(TreeNode root) {
		//Base Case(s)
		if(root == null) {
			return 0;
		}
		//Find Count of Each Branch
		int leftCount = 1 + findDepth(root.left);
		int rightCount = 1 +  findDepth(root.right);
		//Return max
		if(leftCount > rightCount) {
			return leftCount;
		}
		else return rightCount;  
    }
}
