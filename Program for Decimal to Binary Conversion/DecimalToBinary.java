
public class DecimalToBinary {

	
	public static void main(String a[]){
        DecimalToBinary dtb = new DecimalToBinary();
        dtb.printBinaryFormat(25);
        dtb.printBinaryFormat(16);
    }

	private void printBinaryFormat(int n) {
		// TODO Auto-generated method stub
		String binary = "";
		while(n>0){
			binary = n % 2+binary;
			n = n/2;
		}
		System.out.println("binary:"+binary);
		
	}
}
