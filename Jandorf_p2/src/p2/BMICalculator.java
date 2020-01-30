package p2;
// Import Scanner that will be used to read in data
import java.util.Scanner;

public class BMICalculator {
	// Create private variales to be manipulated by method calls
	private String unit = "";
	private float height = 0;
	private float weight = 0;
	private float bmi = 0;
	private String cat = "";
	
	// Create an instance of the Scanner class
	Scanner input = new Scanner(System.in);
	
	// Main method from which 3 methods will be called 
	public static void main(String[] args) {
		BMICalculator app = new BMICalculator();
		app.readUserData();
		app.calculateBmi();
		app.displayBmi();
		
	}
	
	// Reads in the Unit Type and Measurement data
	public void readUserData() {
		readUnitType();
		readMeasurementData();
	}
	
	// Asks the user what unit they want to enter in
	private void readUnitType() {
		int x = 1;
		do {
		System.out.print("Enter Imperial or Metric: ");
		unit = input.nextLine();
		if((unit.compareTo("Imperial") == 0) || (unit.compareTo("Metric") == 0)) {
			x = 0;
		}
		
		} while(x == 1);
	}
	
	// Decides which method to use based on readUnitType
	private void readMeasurementData() {
		if(unit.compareTo("Imperial")==0) {
			readImperialData();
		} else if(unit.compareTo("Metric") == 0) {
			readMetricData();
		}
	}
	
	// Reads in Metric data from user
	private void readMetricData() {
		float h;
		float w;
		
		System.out.print("Enter your height in meters: ");
		h = input.nextFloat();
		System.out.print("Enter your weight in kilograms: ");
		w = input.nextFloat();
		
		if(h < 0 || w < 0) {
			System.out.println("You Can't have a Negative Height or Weight");
			System.exit(0);
		}
		
		setWeight(w);
		setHeight(h);
	}
	
	// Reads in Imperial Data from User
	private void readImperialData() {
		float h;
		float w;
		
		System.out.print("Enter your height in inches: ");
		h = input.nextFloat();
		System.out.print("Enter your weight in pounds: ");
		w = input.nextFloat();
		
		if(h < 0 || w < 0) {
			System.out.println("You Can't have a Negative Height or Weight");
			System.exit(0);
		}
		
		setWeight(w);
		setHeight(h);
		
	}
	
	// Calculates the bmi from input and passes the result to find out category
	public void calculateBmi() {
		
		if(unit.compareTo("Imperial") == 0) {
			bmi = (703 * weight) / (height * height);
		} 
		
		else if (unit.compareTo("Metric") == 0) {
			bmi = (weight) / (height * height);
		}
		
		calculateBmiCategory(bmi);
		
	}
	
	// Calculates the bmi category
	private void calculateBmiCategory(float value) {
		if(value <= 18.5) {
			cat = "Underweight";
		} else if((value > 18.5 && value <= 24.9)) {
			cat = "Normal weight";
		} else if((value >= 25 && value <= 29.9)) {
			cat = "Overweight";
		} else {
			cat = "Obesity";
		}
		
	}
	
	// Displays the bmi and bmi category
	public void displayBmi() {
		System.out.println("BMI: " + getBmi());
		System.out.println("BMI Category: " + getBmiCategory());
	}
	
	// Gets Weight
	public float getWeight() {
		return weight;
	}
	
	// Sets Weight
	private void setWeight(float weight) {
		this.weight = weight;
	}
	
	// Gets height
	public float getHeight() {
		return height;
	}
	
	// Sets height
	private void setHeight(float height) {
		this.height = height;
	}
	
	// Returns BMI
	public float getBmi() {
		return bmi;
	}
	
	// Returns BMI Category
	public String getBmiCategory() {
		return cat;
	} 

}

