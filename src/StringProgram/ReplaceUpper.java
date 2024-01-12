package StringProgram;
public class ReplaceUpper {
	   
    public static void main(String[] args) {
        String input = "Replace UPPER Case Letters with lower CASE letters";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
                char lowerCaseChar = Character.toLowerCase(c);
                result.append(lowerCaseChar);
            } else {
                result.append(c);
            }
        }

        String modifiedString = result.toString();
        System.out.println(modifiedString);
    }
}

