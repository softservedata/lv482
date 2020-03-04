package stringRegex;

/*
 * Enter in the console sentence of five words. 
 * display the longest word in the sentence
 * determine the number of its letters
 * bring the second word in reverse order
 * 
 * 
 */

public class Howo {

	public static void main(String[] args) {

		String s = "There is sentence of six words.";
		String[] arr = s.split(" ");
		for (String cur : arr) {
			System.out.println(cur);
		}

		String longestWord = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (longestWord.length() < arr[i].length()) {
				longestWord = arr[i];
			}
		}
		System.out.println("longestWord = " + longestWord);

		StringBuilder x = new StringBuilder(longestWord);
		System.out.println(s.indexOf(longestWord)+ " " + longestWord);
		for (int i = 0; i <( longestWord.length()-1); i++) {
			String l =new String( x.deleteCharAt(0));
			System.out.println(s.indexOf(l)+ " " + l);
		}
		StringBuilder y = new StringBuilder(arr[1]);
		System.out.println("second word (" + arr[1] + ") in reverse order = " + y.reverse());
	}

}
