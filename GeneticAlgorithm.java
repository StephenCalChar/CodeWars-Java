import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;



public class GeneticAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(generate(10));
		ArrayList<String> pop = new ArrayList<String>();
		String string1 ="1010101010";
		String string2 ="1010101011";
		String string3 ="1011101011";
		pop.add(string1);
		pop.add(string2);
		pop.add(string3);
		ArrayList<Double> fitness = new ArrayList<Double>() {{
		    add(0.1);
		    add(0.5);
		    add(0.3);
		}};
		
		String[] ans = select(pop, fitness);
		
		Double mutation =0.01;
		mutate(string1, mutation);
		
		
	}
	
	private static String generate(int length) {
		Random random = new Random();
		StringBuilder stringBuilder = new StringBuilder();
		for(int loop=0; loop< length; loop++) {
			int num = random.nextInt(2);
			stringBuilder.append(Integer.toString(num));
		}
		return stringBuilder.toString();
	  
	  }
	  
	  private static String[] select(List<String> population, List<Double> fitnesses) {
		String[] selectedChroms = new String[2];
		ArrayList<Double> copiedFitnesses = new ArrayList<Double>(fitnesses);
		//Copy Arraylist so one can be sorted but the other still matches the order of population
		Collections.copy(copiedFitnesses, fitnesses);
		Collections.sort(copiedFitnesses);
		
		//hashmap to store roulette wheel selection
		HashMap<Integer, Integer> chromeSelector= new HashMap<Integer, Integer>();
		
		//we will reverse the loop so it counts down from list size so the first elements have more entries in the hashmap
		//to be chosen from
		int externalCounter =0;
		int totalPolulation = population.size();
		for(int loop=0; loop<totalPolulation; loop++) {
			int internalCounter=0;
			while(loop+1> internalCounter) {
				//as we want more of the lowest values, we take loop away from the maximum number to invert the spread.
				chromeSelector.put(externalCounter,totalPolulation- loop-1);
				internalCounter++;
				externalCounter++;
			}
		}
		//chromeSelector.entrySet().forEach(System.out::println);

		Random random = new Random();
		for(int loop =0; loop< selectedChroms.length; loop++) {
			//external countyer will store out highest key
			int chosenChromePos = random.nextInt(externalCounter);
			//gets position of the chosen fitness from copiedFitness which is ordered. It then looks for this double in the unordred list
			//which matches the order of population list.
			
			//chosenFitness stores the randomly selected chromosome's fitness score.		
			Double chosenFitness = copiedFitnesses.get(chromeSelector.get(chosenChromePos));
			//its index is looked up in the non sorted array as the index will match the population array.
			int indexOfChosenFitness =fitnesses.indexOf(chosenFitness);
			//adds each selected chromosome to the arraylist to be returned. Duplicates will occur but this is apparently ok.
			selectedChroms[loop]=population.get(indexOfChosenFitness);
			//System.out.println(selectedChroms[loop]);
			
		}
		return selectedChroms;
		
		
		  
		  
	  }
	  
	  private static String mutate(String chromosome, double p) {
	    //split into binary chars
		String[] chromosomeArray = chromosome.split("");
		Random random = new Random();
		StringBuilder stringBuilder = new StringBuilder();
		for(int loop=0; loop< chromosomeArray.length; loop++) {
			double randomNum = random.nextDouble();
			if (randomNum>p) {
				stringBuilder.append(chromosomeArray[loop]);
			}
			else {
				int currentNum= Integer.parseInt(chromosomeArray[loop]);
				//switch binary values from 0 to 1 or 1 to 0
				currentNum = (currentNum-1)*-1;
				stringBuilder.append(Integer.toString(currentNum));
			}
		}
		//System.out.println(stringBuilder.toString());
		return stringBuilder.toString();
		  
	  }
	  /*
	  
	  /*
	  private static String[] crossover(String chromosome1, String chromosome2) {
	    // TODO: Implement the crossover method
	  }
	  
	  public static String run(ToDoubleFunction<String> fitness, int length, double p_c, double p_m) {
	    // TODO: Implement the run method
	  }
	  
	  public static String run(ToDoubleFunction<String> fitness, int length, double p_c, double p_m, int iterations) {
	    
	  }
	  */
	
		
	

}
