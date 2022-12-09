package com.stringmethods;

//Aster21A
public class Answer {

	// length() method
	private static void m1() { // length() method returns {@code int} value
		String s = "Hello";
		int i = s.length(); // or System.out.println(s.length());
		System.out.println(i);
	}

	// toCharArray() method
	private static void m2() { // toCharArray() method
		String s = "Hallucination";
		char[] c = s.toCharArray();
		System.out.println(c[4]);// or System.out.println(s.toCharArray());
	}

	// charAt(int i) method
	private static void m3() {
		String s = "Halloween";
		char c = s.charAt(4);
		System.out.println(c);
	}

	// indexOf(char ch) method
	private static void m4() {// counts space as index also
		String s = "Hawaldaar malaal";
		int i = s.indexOf('m');
		int j = s.indexOf('w');
		int k = s.indexOf('a');
		System.out.println(i + " " + j + " " + k);
	}

	// lastIndexOf(char ch) method
	private static void m5() {
		String s = "Hawaldaar malaal";
		int i = s.lastIndexOf('a');
		System.out.println(i);
	}

	// isEmpty() method
	private static void m6() {
		String s = "";
		System.out.println(s.isEmpty());
	}

	// concat(String str) method
	private static void m7() {
		String s = "Hi";
		System.out.println(s.concat(" Sir"));
	}

	// endsWith() method
	private static void m8() {
		String s = "Hello beautiful Mars";
		System.out.println(s.endsWith("Mars"));
		System.out.println(s.endsWith("Hello"));
		System.out.println(s.endsWith("beautiful"));
	}

	// equals() method
	private static void m9() {
		String s = "Hello";
		System.out.println(s.equals("hello"));
		System.out.println(s.equals("Hello"));
	}

	// equalsIgnoreCase() method
	private static void m10a() {
		String s = "Hello";
		String another = "hello";
		System.out.println(s.equalsIgnoreCase(another));
	}

	// equalsIgnoreCase() method
	private static void m10b() {
		String s = "Hello beautiful Mars";
		String t = "  hello Beautiful mars  ";
		String r = t.trim();
		boolean i = s.equalsIgnoreCase(r);
		System.out.println(i);
	}

	// concat() method
	private static void m11() {
		String s = "Hi ";
		System.out.println(s.concat("Pandit"));
	}

	// trim() method and
	// see m10a also
	private static void m12a() {
		String s = "  Hello  ";
		System.out.println("Before trim : " + s);
		s = s.trim();
		System.out.println("After trim  : " + s);

	}

	// trim() method
	private static void m12b() {
		String s = "  Hello World  ";
		System.out.println("Before trim : " + s);
		s = s.trim();
		System.out.println("After trim  : " + s);
	}

	// split() method
	private static void m13a() {
		String s = "Hello World";
		String[] parts = s.split("o");
		System.out.println("Number of parts : " + parts.length);
		System.out.println(parts[0]);
		System.out.println(parts[1]);
		System.out.println(parts[2]);
	}

	// split() method
	private static void m13b() {
		String s = "Hello World";
		String[] parts = s.split("o");
		System.out.println("Number of parts : " + parts.length);
		for (int i = 0; i < parts.length; i++) {
			System.out.println("Part at " + i + "th index : " + parts[i]);
		}
	}

	// split() method
	private static void m13c() {
		String s = "Hello World";
		String[] parts = s.split(" ");
		System.out.println("Number of parts : " + parts.length);
		for (int i = 0; i < parts.length; i++) {
			System.out.println("Part at " + i + "th index : " + parts[i]);
		}
	}

	// split() method
	private static void m13d() {
		String s = "Hello World, we are Spartans from history which you see in films only";
		String[] parts = s.split(" ");
		System.out.println("Number of parts : " + parts.length);
		for (int i = 0; i < parts.length; i++) {
			System.out.println("Part at " + i + "th index : " + parts[i]);
		}
	}

	// split() method
	private static void m13e() {
		String s = "Hello World";
		String[] parts = s.split("O");// capital O
		System.out.println("Number of parts : " + parts.length);
		for (int i = 0; i < parts.length; i++) {
			System.out.println("Part at " + i + "th index : " + parts[i]);
		}
	}

	// split() method to count number of words of the given passage
	private static void m13f() {
		String s = "Opera refers to a dramatic art form, originating in Europe, in which the emotional content is conveyed to the audience as much through music, both vocal and instrumental, as it is through the lyrics.";
		String[] parts = s.split(" ");
		System.out.println("Number of words : " + parts.length);

	}

	// startsWith() method
	private static void m14() {
		String s = "Hello World";
		System.out.println(s.startsWith("H"));
		System.out.println(s.startsWith("h"));
	}

	// substring(int beginIndex) method
	private static void m15a() {
		String s = "Hello World";
		String t = s.substring(2);
		System.out.println(t);
	}

	// substring(int beginIndex, int endIndex) method
	private static void m15b() {
		String s = "Hello World, welcome to babylon";
		String t = s.substring(2, 27);
		System.out.println(t);
	}

	// matches method
	public static void m16() {
		String s = "Hello beautiful Mars";
		System.out.println(s.matches("Hello beautiful Mars"));
	}

	// replace(char oldChar, char newChar) method
	public static void m17a() {
		String s = "Hello beautiful Mars";
		System.out.println(s.replace('M', 'm'));
	}

	//replace method - interview*** : here we replace string or removing two letters
	public static void m17e() {
		String s = "Programming";
		System.out.println(s.replace("m", ""));
	}

	// replace(CharSequence target, CharSequence replacement) method
	public static void m17b() {
		String s = "Hello beautiful Mars, Hello Venus";
		System.out.println(s.replace("ello", "ELLO"));
	}

	public static void m17c() {// replaceAll(String regex, String replacement) method
		String s = "Hello beautiful Mars, Hello Venus, Hello Moon.";
		System.out.println(s.replaceAll("(.*)Venus(.*)", "Excuse me"));
	}

	// replaceFirst(String regex, String replacement) method
	public static void m17d() {
		String s = "Hello beautiful Mars, Hello Venus, Hello Moon.";
		System.out.println(s.replaceFirst("Hello", "Hii"));
	}

	// toLowerCase() method
	private static void m18() {
		String s = "Hello beautiful Mars, Hello Venus, Hello Moon.";
		System.out.println(s.toLowerCase());
	}

	// toUpperCase() method
	private static void m19() {
		String s = "Hello beautiful Mars, Hello Venus, Hello Moon.";
		System.out.println(s.toUpperCase());
	}

	public static void main(String[] args) {

		m15a();

	}
}
