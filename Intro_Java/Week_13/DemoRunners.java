//Author: Ana Victoria Gomes Mantovani
//Date: 11/17/2022
//Purpose: Demonstrate interface usage

public class DemoRunners{

	public static void main (String[] args){

		Machine machine = new Machine();
		machine.run();
		
		Athlete athlete = new Athlete();
		athlete.run();
		
		PoliticalCandidate pCandidate = new PoliticalCandidate();
		pCandidate.run();

	}

}
