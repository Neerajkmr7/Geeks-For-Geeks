public Node secondLargestNode(Node root){

if(root == null){
	return null;
}
if(root.left == null && root.right == null){
	return null;
}

if(root.right == null && root.left != null){
	return root.left;
}

Node prev = root;
Node curr = root;

while(curr.right != null){
	prev = curr;
	curr = curr.right;
}
	return prev;

}