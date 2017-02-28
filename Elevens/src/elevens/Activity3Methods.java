package elevens;

public class Activity3Methods {

	public static void main(String[] args) {
		
		int[] firstArray = {1,2,5,0,3};
		int[] secondArray = {2,3,5,1,0};
		System.out.println(arePermutations(firstArray,secondArray));
		/*System.out.println(flip());
		System.out.println(flip());
		System.out.println(flip());
		System.out.println(flip());*/
	}
	
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
			if(arrayContains(numbInOne,two)){
				
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
