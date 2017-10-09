/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
 //buildtree with inOrder and preOrder list.
public class Solution {
    public Node buildTree(int in[], int pre[]){
		 int inStrt = 0;
		 int inEnd = in.length;
		 int preStrt = 0;
		 int preEnd = pre.length;
		 
		 return buildTreeUtil(in,inStrt,inEnd,pre,preStrt,preEnd);
	}
	
	 public Node buildTreeUtil(int in[],inStrt,inEnd, int pre[],preStrt,preEnd){
		
		if(inStrt > inEnd || preStrt > preEnd){
			return null;
		}
		
		Node root = new Node();
		root.data = pre[preStrt];
		if(inStrt == inEnd){
			return root;
		}
		
		int index = 0;
		for (int i = 0; i < in.length; i++) {
			if (in[i] == root.data) {
				index = i;
				break;
			}
		}
		
		root.left = buildTreeUtil(in,inStrt,index-1,pre,preStrt+1,preStart+(index-inStart));
		root.right = buildTreeUtil(in,index+1,inEnd,pre, preStart+(index-inStart)+1,preEnd);
		
		return root;
		
		
	 }
	
}