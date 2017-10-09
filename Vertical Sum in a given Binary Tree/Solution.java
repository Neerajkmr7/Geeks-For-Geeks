

public void getVerticalSum(Node head){
	
	if(head == null){
		return;
	}
	
	HashMap<Integer, Integer>  map = new HashMap<>();
	
	verticalSumUtil(map,head,0);
	
	if(map != null){
		System.out.println(map.entrySet());
	}
	

}

verticalSumUtil(HashMap<Integer, Integer>  map, Node head,int rootDistance){

	if(head == null){
		return;		
	}else if(){
	
		
		if(head.left != null){
			verticalSumUtil(map,head.left,rootDistance-1);
		}
		
		int prevSum = (map.get(rootDistance) == null) ? 0 : map.get(rootDistance);
        hM.put(rootDistance, prevSum + head.data);
		
		if(head.right != null){
			verticalSumUtil(map,head.right,rootDistance+1);
		}
	
	}

}