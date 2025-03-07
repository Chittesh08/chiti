public class program {
    public static void main(String[] args) {
        String input = "example"; 
        char middleChar = getMiddleCharacter(input);
        System.out.println("Middle character: " + middleChar);
    }

    public static char getMiddleCharacter(String str) {
        int length = str.length();
        int middleIndex = length / 2;

        if (length % 2 == 0) {
            
            return str.charAt(middleIndex - 1);
        } else {
            
            return str.charAt(middleIndex);
        }
    }
}
