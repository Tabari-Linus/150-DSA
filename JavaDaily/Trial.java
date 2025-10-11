import java.util.HashMap;
import java.util.Map;

public class Trial{
    
    public static void main(String[] args) {
        int[] result = sumOfNumbers(new int[]{2,7,11,15}, 22);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] sumOfNumbers(int[] numbers, int target) {
        Map<Integer, Integer> numberIndexMap = new HashMap<>();
        int[] indexOfNumbers = new int[2];
        int firstNumber;
        int remainder;
        numberIndexMap.put(numbers[0], 0);
        for (int i = 1; i < numbers.length; i++) {
           firstNumber = numbers[i];
           remainder = target - firstNumber;
           if(numberIndexMap.containsKey(remainder)){
                indexOfNumbers[0] = numberIndexMap.get(remainder);
               indexOfNumbers[1] = i;
               return indexOfNumbers;
           }

           numberIndexMap.put(numbers[i], i);

        }

        return indexOfNumbers;
        
    }
}