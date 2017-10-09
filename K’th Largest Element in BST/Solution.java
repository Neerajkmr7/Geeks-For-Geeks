kthLargest(Node root,int k){
	int count = 0;
	kthLargestUtil(root,k,count);
}

kthLargestUtil(Node root,int k,int count){
	if(count >=k || root == null){
		return;
	}

	kthLargestUtil(root.right,k,count);
	count++;
	if(c==k){
		System.out.println("Kth Largest Node:"+root.data);
		return;
	}
	
	kthLargestUtil(root.left,k,count);
}
