package Part3Optional;

public class Part3Optional {
    public static void main(String[] args) {
        printString("Hello");

        String str = reverseString("Hello");
        System.out.println(str);
    }
    public static void printString(String s) {
        int count = 0;
        count++;
        if (count > s.length()) {
            return;
        }
        System.out.println(s.charAt(0));
        printString(s.substring(1));
        System.out.println(s.charAt(0));
    }
    public static String reverseString(String s) {
        int count = 0;
        count++;
        if (count > s.length()) {
            return "";
        }
        return reverseString(s.substring(1)) + s.charAt(0);
    }
}
