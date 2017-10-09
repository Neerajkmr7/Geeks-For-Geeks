public boolean identicalTrees(Node root1,Node root2){

	if(root1 == null && root2 == null){
		return true;
	}else {
		if(root1 != null && root2 != null){
			return (root1.data == root2.data
                    && identicalTrees(root1.left, root2.left)
                    && identicalTrees(root2.right, root1.right));
		}
		
		
	}
	
	return false;

}


//
boolean identicalTrees(Node a, Node b) 
    {
        /*1. both empty */
        if (a == null && b == null)
            return true;
             
        /* 2. both non-empty -> compare them */
        if (a != null && b != null) 
            return (a.data == b.data
                    && identicalTrees(a.left, b.left)
                    && identicalTrees(a.right, b.right));
  
        /* 3. one empty, one not -> false */
        return false;
    }
  