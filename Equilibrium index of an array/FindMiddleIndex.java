public class FindMiddleIndex {
 
    public static int findMiddleIndex(int[] numbers) throws Exception {
 
        int endIndex = numbers.length - 1;
        int startIndex = 0;
        int sumLeft = 0;
        int sumRight = 0;
        while (true) {
            if (sumLeft > sumRight) {
                sumRight += numbers[endIndex--];
            } else {
                sumLeft += numbers[startIndex++];
            }
            if (startIndex > endIndex) {
                if (sumLeft == sumRight) {
                    break;
                } else {
                    throw new Exception(
                            "Please pass proper array to match the requirement");
                }
            }
        }
        return endIndex;
    }
	
    public static void main(String a[]) {
        int[] num = { 2, 4, 4, 8,2 };
        try {
            System.out.println("Starting from index 0, adding numbers till index "
                            + findMiddleIndex(num) + " and");
            System.out.println("adding rest of the numbers can be equal");
             } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    /*public static int findMiddleIndex(int[] numbers){
    	int midIndex = -1;
    	int leftSum = 0;
    	int rightsum = 0;
    	for(int i=0;i<numbers.length; i++){
    		leftSum = leftSum + numbers[i];
    		rightsum = 0;
    		for(int j=i+1;j<numbers.length; j++){
    			rightsum = rightsum + numbers[j];
    		}
    		if(leftSum == rightsum){
    			System.out.println("leftSum:"+leftSum);
    			System.out.println("rightsum:"+rightsum);
    			midIndex = i;
    			break;
    		}
    	}
    	
    	return midIndex;
    }*/

}