

public int getMaxWidthBT(Node head){

	if(head == null){
		return 0;
	}

	Queue<Node> q = new LinkedList<>();
	
	q.push(head);
	int maxWidth = 0;
	while(! q.isEmpty()){
	 int count = q.size();
	 maxWidth = Math.max(maxWidth,count);
	 
		while(count > 0){
			 
			 Node n = q.pop();
			 if(n.left ! = null){
				q.push(n.left);
			 }
			 if(n.right ! = null){
				q.push(n.right);
			 }
			 count--;
		}
	
	}

 return maxWidth;

}