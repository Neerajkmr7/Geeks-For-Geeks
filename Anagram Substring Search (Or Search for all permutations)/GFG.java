import java.util.Arrays;

class GFG {
	public static void main (String[] args) {
		//code
		String txt = "BACDGABCDA";
        String pat = "ABCD";
        search(pat, txt);
	}
	
	static boolean compare(char arr1[], char arr2[])
    {
        for (int i = 0; i < arr1.length; i++)
            if (arr1[i] != arr2[i])
                return false;
        return true;
    }
	static void search(String pat, String txt)
    {
        char[] patChar = pat.toCharArray();
        Arrays.sort(patChar);
        String patS = Arrays.toString(patChar);
        //System.out.println(pat);
        int t= patChar.length;
        int n = (txt.length() - t);
        String test = "";
        char[] charS = new char[t];
        
        for(int i=0;i<=n;i++){
        	test = txt.substring(i,i+t);
        	charS = test.toCharArray();
        	Arrays.sort(charS);
        	//test = charS.toString();
        	test = Arrays.toString(charS);
        	/*if(compare(charS,patChar)){
        		System.out.println(i+" ");
        	}*/
        	 ;
        	 if(test.equalsIgnoreCase(patS)){
         		System.out.println(i+" ");
         	}
        }
    }
}