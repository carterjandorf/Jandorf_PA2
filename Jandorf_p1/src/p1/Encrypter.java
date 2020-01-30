package p1;

public class Encrypter {

	public String encrypt(String numbers[]) {
		String encrypted = "";
		
		// Parse out each integer
		int num1 = Integer.parseInt(numbers[0]);
		int num2 = Integer.parseInt(numbers[1]);
		int num3 = Integer.parseInt(numbers[2]);
		int num4 = Integer.parseInt(numbers[3]);
		
		int result1 = (num1 + 7) % 10;
		int result2 = (num2 + 7) % 10;
		int result3 = (num3 + 7) % 10;
		int result4 = (num4 + 7) % 10;
		
		// Swap 1 -> 3 and 2 -> 4
		int temp1 = result1;
		result1 = result3;
		result3 = temp1;
		
		int temp2 = result2;
		result2 = result4;
		result4 = temp2;
		
		// Add the values to the string encrypted
		encrypted = "" + result1 + result2 + result3 + result4 + "";
		
		return encrypted;
	}
}
