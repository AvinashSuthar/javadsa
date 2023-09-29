public class SearchInStrings {
    public static void main(String[] args) {

        String name = "Avinash";
        char target = 'i';

        for (int i = 0; i < name.length() ; i++) {
            if (target == name.charAt(i)){
                System.out.println("Find at"+ i);
            }
        }

        for (char tar: name.toCharArray()
             ) {
            if(target == tar){
                System.out.println("find" + tar);
            }
        }

    }
}
