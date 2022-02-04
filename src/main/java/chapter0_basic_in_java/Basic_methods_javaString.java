package chapter0_basic_in_java;

import java.util.Locale;

public class Basic_methods_javaString {
    public static void main(String[] args) {
        String str1 = "JaVA";
        String str2 = "Python";
        String str3 = "Java is compiled language";
        String str4 = "java";
        String str5 = "    Javascript    ";

        System.out.println(str3.contains("is compiled"));
        System.out.println(str2.substring(1, 4));
        System.out.println(str1.length());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());

        System.out.println("----------------------------");
        System.out.println(str1.equals(str2));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.equalsIgnoreCase(str4));

        String[] arr = str3.split(" ");
        for (String element : arr){
            System.out.println(element);
        }

        System.out.println("----------------------------");

        System.out.println(str3.startsWith("The"));
        System.out.println(str3.endsWith("ge"));
        System.out.println(str2.isEmpty());

        System.out.println(str5);
        System.out.println(str5.trim());
        System.out.println(String.valueOf(str5));




    }
}
