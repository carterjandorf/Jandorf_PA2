package p2;

import java.util.Scanner;

public class BMICalculator {
	private String unit = "";
	private float height = 0;
	private float weight = 0;
	private float bmi = 0;
	private String cat = "";
	
	Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		BMICalculator app = new BMICalculator();
		app.readUserData();
		app.calculateBmi();
		app.displayBmi();
		
	}
	
	public void readUserData() {
		readUnitType();
		readMeasurementData();
	}
	
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
	
	private void readMeasurementData() {
		if(unit.compareTo("Imperial")==0) {
			readImperialData();
		} else if(unit.compareTo("Metric") == 0) {
			readMetricData();
		}
	}
	
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
	
	public void calculateBmi() {
		
		if(unit.compareTo("Imperial") == 0) {
			bmi = (703 * weight) / (height * height);
		} 
		
		else if (unit.compareTo("Metric") == 0) {
			bmi = (weight) / (height * height);
		}
		
		calculateBmiCategory(bmi);
		
	}
	
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
	
	public void displayBmi() {
		System.out.println("BMI: " + getBmi());
		System.out.println("BMI Category: " + getBmiCategory());
	}
	
	public float getWeight() {
		return weight;
	}
	
	private void setWeight(float weight) {
		this.weight = weight;
	}
	
	public float getHeight() {
		return height;
	}
	
	private void setHeight(float height) {
		this.height = height;
	}
	
	public float getBmi() {
		return bmi;
	}
	
	public String getBmiCategory() {
		return cat;
	} 

}

