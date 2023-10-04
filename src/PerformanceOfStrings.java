public class PerformanceOfStrings {
    public static void main(String[] args) {
        char a = 'a';
        String series = "";
        for (int i = 0; i < 26; i++) {
            System.out.println((char)('a' + i));
            series = series + (char)('a' + i)  ;
        }
        System.out.println(series);
    }
}
