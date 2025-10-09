import java.util.HashSet;

public class ContainsDuplicates{
	public static void main(String[] args){
		int[] nums = {1,2,3,4,5};
		System.out.println(hasDuplicate(nums));
	}

	public static boolean hasDuplicate(int[] numbers){
		HashSet<Integer> numberSeen = new HashSet<>();
		for(int number: numbers){
			if( numberSeen.contains(number)){
				return true;
			}
			else{
				numberSeen.add(number);
			}
		}
		return false;
	}
}
