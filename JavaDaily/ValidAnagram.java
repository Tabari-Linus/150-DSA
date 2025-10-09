public class ValidAnagram{

	public static boolean isValidAnagram(String s, String t){
		if(s.length() != t.length()){
			return false;
		}

		int[] charFrequencies = new int[26];
		for(int i=0; i<s.length(); i++){
			charFrequencies[s.charAt(i) - 'a']++;
			charFrequencies[t.charAt(i) - 'a']--;
		}				

		for(int j=0; j<26; j++){
			if(charFrequencies[j] !=0){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args){
		System.out.println(isValidAnagram("cat","ate"));
	}
}
