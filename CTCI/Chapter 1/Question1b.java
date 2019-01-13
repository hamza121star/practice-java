import java.io.*;
import java.math.*;
import java.util.*;

public class Question1b {
	

	public static boolean permutation(String w1, String w2){
		HashMap<Character,Integer> hash1 = new HashMap<>();
		HashMap<Character,Integer> hash2 = new HashMap<>();
		for (int i = 0; i < w1.length(); i++){
			char c = w1.charAt(i);
			if(hash1.containsKey(c))
				hash1.put(c, hash1.get(c)+1);
			else
				hash1.put(c,1);
		}
		for (int i = 0; i < w2.length(); i++){
			char c = w2.charAt(i);
			if(hash2.containsKey(c))
				hash2.put(c, hash2.get(c)+1);
			else
				hash2.put(c,1);
		}
		if(hash1.equals(hash2))
			return true;
		return false;

	}
	public static void main(String[] args) {
		String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean anagram = permutation(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + anagram);
			//System.out.println(anagram(word1, word2));
		}
	}
}