package Assignment;

public class palindrome {

	public static void main(String[] args) {

			String s = "dood";	
			String r = "";

			for (int i = 0; i < s.length(); i++) {
				r = s.charAt(i) + r;
			}
			System.out.println(r);
			if (r.equals(s))
				System.out.println("Is Palindrome");
			else
				System.out.println("Is Not Palindrome");
		}

	}


