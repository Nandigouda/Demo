public class LastThreeCharactersToUpperCase {
    public static void main(String[] args) {
        String str = "Hello World";
        String lastThree = str.substring(str.length() - 5).toUpperCase();
        System.out.println(lastThree);
    }
}