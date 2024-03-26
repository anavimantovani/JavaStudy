//Author: Ana Victoria Gomes Mantovani
//Date: 12/15/2022
//Purpose: Store data about different candles

public class DemoCandles {

	public static void main(String[] args) {
		
		//Create one candle without a scent
		Candle firstCandle = new Candle("Blue", 2);
		
		//Create a second candle with a scent
		ScentedCandle secondCandle = new ScentedCandle("Red", 3, "Lime");
		
		//Display the information of the two candles
		System.out.println(firstCandle);
		System.out.println();
		System.out.println(secondCandle);

	}

}
