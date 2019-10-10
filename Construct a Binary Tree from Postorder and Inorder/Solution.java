/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int istartInd = 0;
        int iendInd = inorder.length-1;
        int pstartInd = 0;
        int pendInd = postorder.length-1;

       TreeNode node=  BuildTreeUtil(inorder,postorder,istartInd,iendInd,pstartInd,pendInd);
       return node;
    }
    
    public TreeNode BuildTreeUtil(int [] in,int [] post,int istartInd,int iendInd,int pstartInd,int pendInd ){

if(istartInd > iendInd || pstartInd > pendInd ){
	return null;
}
TreeNode root = new TreeNode(post[pendInd]);
//Node root.data = post[pendInd];

if(istartInd == iendInd){
	return root;
}
int index = 0;
	for (int i = 0; i < in.length; i++) {
		if (in[i] == root.val) {
			index = i;
			break;
		}
	}
//int index = Arrays.asList(in).indexOf(root.data);
root.left = BuildTreeUtil(in,post,istartInd,index-1,pstartInd,pstartInd + index - (istartInd + 1));
	    //poStart - length of inorder - last index if po
root.right = BuildTreeUtil(in,post,index+1,iendInd,pstartInd + index- istartInd,pendInd-1);
return root;

}
}



http://algorithms.tutorialhorizon.com/construct-a-binary-tree-from-given-inorder-and-postorder-traversal/
http://www.programcreek.com/2013/01/construct-binary-tree-from-inorder-and-postorder-traversal/
https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/#/description
http://www.geeksforgeeks.org/construct-a-binary-tree-from-postorder-and-inorder/
http://www.geeksforgeeks.org/construct-tree-from-given-inorder-and-preorder-traversal/
