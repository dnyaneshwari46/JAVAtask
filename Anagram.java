package day1;


public class Anagram {
	public static void main(String[] args) {
		String a = "cat";
		String b = "bat";

		int count = 0;

		for (int i = 0; i < a.length(); i++) {
			if (b.contains("" + a.charAt(i))) {
				count++;
			}
		}

		if (count == a.length())
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
	}


}

