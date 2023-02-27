// 1. Напишите программу, чтобы найти вхождение в строке 
// (содержащей все символы другой строки).

public class Program {
    public static void main(String[] args)
    {
        String test = "GeekBrains";
 
        CharSequence seq = "e";
        boolean bool = test.contains(seq);
        System.out.println("Найден 'e'?: " + bool);

        // return false
        boolean sqFound = test.contains("x");
        System.out.println("Найден 'x'?: " + sqFound);
    }
}