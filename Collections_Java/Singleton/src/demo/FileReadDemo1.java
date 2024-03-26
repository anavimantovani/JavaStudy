package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReadDemo1 {

	public static void main(String[] args) {

		File dataFile = new File("cardata.txt");
		
		ArrayList<Car> carList = new ArrayList<>();
		
		try {
			Scanner inputFile = new Scanner(dataFile);
			inputFile.useDelimiter("\t|\n");
			
			int count = 0;

			String vin, make, model, color;
			int year;
			
			while (inputFile.hasNext() && count < 3) {
				//read one row (aka record)
				
				vin = inputFile.next();
				make = inputFile.next();
				model = inputFile.next();
				year = inputFile.nextInt();
				color = inputFile.next();
				
				Car car1 = new Car(vin, make, model, color, year);
				
				carList.add(car1);
				count++;
			}
			
			inputFile.close();
			
			for(Car oneCar : carList) {
				System.out.println(oneCar);
			}
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("There was a problem finding the file.");
		}
			

	}

}
