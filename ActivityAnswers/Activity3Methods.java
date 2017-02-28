
public class Activity3Methods {

	
	public static String flip(){
		int random = (int) (Math.random()*(2));
		
		if(random == 1 || random == 2){
			return "heads";
		}
		else{
			return "tails";
		}
		
	}
	
	
	public static boolean arePermutations(int[] one, int[]two){
		int i = 0;
		boolean returnThis = true;
		while(i < one.length){
			
			int numbInOne = one[i];
			if(IntStream.of(two).anyMatch(x -> x == numbInOne)){
				
			}
			else{
				returnThis = false;
				break;
			}
			i++;
		}
		
		return returnThis;
	}
	
	public static boolean arrayContains(int number, int[] intArray){
		int matches = 0;
		for (int k = 0; k < intArray.length; k++){
			if(number == intArray[k]){
				matches++;
			}
		}
		
		if(matches > 0){
			return true;
		}
		else{
			return false;
		}
	}
}
