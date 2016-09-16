// Varun Batra 110256128
public class Binary2Hex {
	public static String binaryToHex(String binaryValue){
		int hex=0;
		String s = " ";
	for(int i =0; i< binaryValue.length(); i++){
		for(int j= binaryValue.length(); j>0; j--){
			
			double conversion= Math.pow(2,i);
			 hex = (int) conversion* (int) binaryValue.charAt(j)-48;
			
		}
		
	}
			
	
	s= Integer.toUnsignedString(hex);
	return s;	
		
		
	}
		
		
		
		
	
	public static void main(String[] args) {
		String p = "1010";
		System.out.println(binaryToHex(p));

	}

}
