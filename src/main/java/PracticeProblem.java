public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void q1() {
		//Write question 1 code here
	}

	public static void q2() {
		//Write question 2 code here
	}

	public static void q3() {
		//Write question 3 code here
	}

	public static void q4() {
		//Write question 4 code here
	}

	public static void q5() {
		//Write question 5 code here
	}
public static String getFirstName(String name1) {
		String name = name1.trim();
		int space1 = name.indexOf(" ");
		if (space1 == -1){ 
			return name;
		}
		String name2 = name.substring(0, space1);
		return name2;

	}

public static String getLastName(String name1) {
	String name = name1.trim();

	int space2 = name.lastIndexOf(" ");
	if (space2 == -1){
		return name;
	}
	String name2 = name.substring(space2+1);
	return name2;
}

public static boolean isValidName(String name) {

	if (name.isEmpty()) {
		return false;
	}
	
	  String cleanedName = name.trim();

    int firstSpace = cleanedName.indexOf(" ");
    int lastSpace = cleanedName.lastIndexOf(" ");

    if (firstSpace == -1 || firstSpace != lastSpace) {
        return false;
    }

    String nameFirst = cleanedName.substring(0, firstSpace);
    String nameLast = cleanedName.substring(firstSpace + 1);
    return nameFirst.length() >= 2 && nameLast.length() >= 2;
}

}

	