class Solution{

Node root;
public static int max_level = 0;


public static void leftViewUtil(Node node,int level){
	//Base case
	if(node == null){
		return ;
	}
	
	if(level > max_level){
		System.out.print(node.data+" ");
		max_level = level;
	}
	leftViewUtil(node.left,level+1);
	leftViewUtil(node.right,level+1);
}

public static void leftView(){
	
	leftViewUtil(root,1);
}
public static void main(String args[]){
        /* creating a binary tree and entering the nodes */
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(12);
        tree.root.left = new Node(10);
        tree.root.right = new Node(30);
        tree.root.right.left = new Node(25);
        tree.root.right.right = new Node(40);
 
        tree.leftView();
    }

}