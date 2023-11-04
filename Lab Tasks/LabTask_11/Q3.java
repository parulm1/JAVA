//3.Write a program to find the common characters between two strings
package LabTask_11;

public class Q3 
{
    public static void main(String[] args) 
    {
        String str1 = "Parul";
        String str2 = "Mankar";
        String commonCharacters = findCommonCharacters(str1, str2);
        System.out.println("Common characters between \"" + str1 + "\" and \"" + str2 + "\": " + commonCharacters);
    }
    public static String findCommonCharacters(String str1, String str2) 
    {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str1.length(); i++)
        {
            char char1 = str1.charAt(i);
            for (int j = 0; j < str2.length(); j++) 
            {
                char char2 = str2.charAt(j);
                if (char1 == char2 && result.indexOf(String.valueOf(char1)) == -1) 
                {
                    result.append(char1);
                    break;
                }
            }
        }

        return result.toString();
    } 
}
//package LabTask_11;
//import java.io.*;
//public class Q3{
//   static void common_chars(String str, String str1){
//      int[] array_1 = new int[26];
//      int[] array_2 = new int[26];
//      int str_len_1 = str.length();
//      int str_len_2 = str1.length();
//      for (int i = 0 ; i < str_len_1 ; i++)
//      array_1[str.charAt(i) - 'a'] += 1;
//      for (int i = 0 ; i < str_len_2 ; i++)
//      array_2[str1.charAt(i) - 'a'] += 1;
//      for (int i = 0 ; i < 26 ; i++){
//         if (array_1[i] != 0 && array_2[i] != 0){
//            for (int j = 0 ; j < Math.min(array_1[i], array_2[i]) ; j++)
//            System.out.print(((char)(i + 'a')));
//         }
//      }
//   }
//   public static void main(String[] args) throws IOException{
//      String my_str_1 = "itsasample";
//      String my_str_2 = "thisisasample";
//      System.out.println("The common characters between the two strings in alphabetical order is :");
//      common_chars(my_str_1, my_str_2);
//   }
//}