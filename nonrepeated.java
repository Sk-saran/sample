package Assignment;

public class nonrepeated {

	public static void main(String[] args) {
		
				String string = "saran";
				int index = -1;
				char fnc = ' ';
				for (char i : string.toCharArray()) {
					if (string.indexOf(i) == string.lastIndexOf(i)) {
						fnc = i;
						break;
					}
					else {
						index += 1;
					}
				}
				if (index == 1) {
					System.out.println("Either all characters are repeating or "
									+ "string is empty");
				}
				else {
					System.out.println("First non-repeating character is " + fnc);
				}
			}
		

	}


