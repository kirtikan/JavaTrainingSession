package Questions.Basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		findDuplicateWords("Hey Java is best is best Java is language");
	}

	public static void findDuplicateWords(String inputString) {

		// split:
		String words[] = inputString.split(" ");

		// create one haspmap:
		Map<String, Integer> wordCount = new HashMap<String, Integer>();

		// to check each word in given array:
		for (String word : words) {

			// if word is present in hashmap
			if (wordCount.containsKey(word)) {
				wordCount.put(word.toLowerCase(), wordCount.get(word) + 1);
			} else {
				wordCount.put(word, 1);
			}
		}

		// extracting all the keys of wordCount
		Set<String> wordsInString = wordCount.keySet();

		// loop through all the words in wordsInString
		for (String word : wordsInString) {
			if (wordCount.get(word) > 1) {
				System.out.println(word + " : " + wordCount.get(word));
			}
		}
	}

}
