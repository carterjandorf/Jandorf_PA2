package p1;

import java.util.Scanner;

public class Application {



	public static void main(String[] args) {

		String arrvalue[] = new String[4];

		Scanner input = new Scanner(System.in);

		// Let the user pick encrypt or decrypt
		System.out.print("Type enc for Encryption or dec for Decryption: ");
		String encOrdec = input.nextLine(); 

		// We need to store the value temporarily as a string as to not lose 0
		System.out.print("Enter a four digit number: ");
		String value = input.nextLine();

		// Create Substrings to be able to parse out each value individually
		String num1 = value.substring(0,1);
		String num2 = value.substring(1,2);
		String num3 = value.substring(2,3);
		String num4 = value.substring(3,4);

		// Assign each substring to an element in the array
		arrvalue[0] = num1;
		arrvalue[1] = num2;
		arrvalue[2] = num3;
		arrvalue[3] = num4;

		// Checks whether user has chose to encrypt
		if(encOrdec.compareTo("enc") == 0) {
			// Create an instance of Encrypter class and create String to store value to
			Encrypter enc = new Encrypter();
			String encriptout = enc.encrypt(arrvalue);

			// Print the output to standard output
			System.out.print("Encrypted Value: ");
			System.out.print(encriptout + "\n");
		}

		// Check whether user has chose to decrypt
		else if(encOrdec.compareTo("dec") == 0) {
			// Create an instance of Decrypter class and create String to store value to
			Decrypter dec = new Decrypter();
			String decriptout = dec.decrypt(arrvalue);

			System.out.print("Decrypted Value: ");
			System.out.print(decriptout);
		} 
		
		else {
			System.out.println("You did not enter a 0 or 1!");
		}
	}

}
