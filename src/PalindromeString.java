public class PalindromeString {
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder();
        string.append("abcb") ;
        for (int i = 0; i < string.length()/2; i++) {
           if (string.charAt(i) != string.charAt(string.length() - i-1) ){
               System.out.println("not palindrome");
               break;
           }
           else {
               System.out.println("palindrome");
           }
        }
    }
}
