
List<Integer> getLevelSum (Node head){

	int sum =0;
	Queue<Node> queue = new LinkedList<>();
	queue.add(head);
	int count = 0;
	int max = head.data;
	while(!queue.isEmpty()){
		count = queue.size();
		while(count > 0 ){
			Node n = queue.poll();
			sum += n.data;
			if(n.left != null){
				queue.add(n.left);
			}
			if(n.right != null){
				queue.add(n.right);
			}
			count--;
		}
		max = Max(max,sum);
		sum = 0;
	}
	return max;
}