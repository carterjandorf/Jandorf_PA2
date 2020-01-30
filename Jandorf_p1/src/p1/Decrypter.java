package p1;

public class Decrypter {
	
	public String decrypt(String numbers[]) {
		String decrypted = "";
		
		// Parse out each integer
		int num1 = Integer.parseInt(numbers[0]);
		int num2 = Integer.parseInt(numbers[1]);
		int num3 = Integer.parseInt(numbers[2]);
		int num4 = Integer.parseInt(numbers[3]);
		
		// Reverse the Encryption to its original values
		int dec1 = (num1 + 3) % 10;
		int dec2 = (num2 + 3) % 10;
		int dec3 = (num3 + 3) % 10;
		int dec4 = (num4 + 3) % 10;
		
		// Revert back to original position
		int temp1 = dec1;
		dec1 = dec3;
		dec3 = temp1;
		
		int temp2 = dec2;
		dec2 = dec4;
		dec4 = temp2;
		
		decrypted = "" + dec1 + dec2 + dec3 + dec4 + "";
		
		return decrypted;
	}

}
