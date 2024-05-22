package list1.prac13;
public class StringManipulation {
    public static void main(String[] args) {
        String inputString = "I like Java!!!";
        char lastChar = inputString.charAt(inputString.length() - 1);
        System.out.println("Последний символ строки: " + lastChar);
        boolean endsWithExclamation = inputString.endsWith("!!!");
        System.out.println("Строка заканчивается на '!!!': " + endsWithExclamation);
        boolean startsWithILike = inputString.startsWith("I like");
        System.out.println("Строка начинается с 'I like': " + startsWithILike);
        boolean containsJava = inputString.contains("Java");
        System.out.println("Строка содержит 'Java': " + containsJava);
        int javaPosition = inputString.indexOf("Java");
        System.out.println("Позиция 'Java' в строке: " + javaPosition);
        String replacedString = inputString.replace('a', 'o');
        System.out.println("Замененная строка: " + replacedString);
    }
}