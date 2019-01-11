import java.io.*;
import java.math.*;
import java.util.*;

public class Question1a {
	public static boolean isUniqueChars(String s){
		boolean isUnique = true;
		for(int i = 0; i < s.length()-1; i++){
			for(int j = i+1; j < s.length(); j++){
				if(s.charAt(i) == s.charAt(j))
					isUnique = false;
			}
		}
		return isUnique;
	}

	public static boolean isUniqueChars2(String s){
		Hashtable<Character,Integer> ht = new Hashtable<Character, Integer>();
		for (int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			if(ht.containsKey(c))
				ht.put(c,ht.get(c)+1);
			else
				ht.put(c,1);
		}
		for (char key : ht.keySet()){
			if(ht.get(key) > 1){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
			System.out.println(word + ": " + isUniqueChars(word) + " " + isUniqueChars2(word));
			//System.out.println(word + ": " + isUniqueChars(word));
		}
	}
}