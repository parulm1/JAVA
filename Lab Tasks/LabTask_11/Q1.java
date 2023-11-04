//1.Create MyString class and perform different string manipulation methods.

package LabTask_11;

public class Q1 
{
    public static void main(String[] args) 
    {
        String str = "Java is a widely-used programming language for coding web applications.";
        String str1 = "Java is a widely-used programming language for coding web applications.";
        String str2 = "Java is a widely-used programming language for coding web applications.";
        
        char ch = str.charAt(20);
        System.out.println(ch);
        
        int s = str.indexOf("w",11);
        System.out.println(s);
        
        int s1 = str.lastIndexOf("d");
        System.out.println(s1);
        
        int s2 = str.lastIndexOf("web");
        System.out.println(s2);
        
    }
}

//public class Sortstring {
//    public static void main(String[] args) {
//        String str="Cdac soft polynomial institute.only cdac centre in nagpur.the best cdac institute for pgdac";
//        String str1="Cdac Soft polynomial institute.only cdac Centre in nagpur.the best Cdac institute for Pgdac";
//        String str3="Cdac Soft polynomial institute has a branches in pune.the best Cdac institute for Pgdac is in pune";
//         //System.out.println(x);//to search
//         
//         int y=str.indexOf("p", 11);
//         System.out.println(y);
//         
//         int z=str.indexOf("best");
//        // System.out.println(z);
//         
//       char a=str.charAt(10);
//          //System.out.println(a);
//      boolean j=str.contains("nagpur");
//      //System.out.println(j);
//      
//      int k=str.lastIndexOf("p");
//     // System.out.println(k);
//      
//      int l=str.length();
//     // System.out.println(l);
//     
//     boolean e=str.isBlank();
//   //  System.out.println(e);//check whether it is blank or not
//     
//     int m=str.compareTo(str1);
//     //System.out.println(m);
//     
//     int n=str.compareToIgnoreCase(str1);
//    // System.out.println(n); //iy will ignore capslock
//     
//     
//     String s=str.trim();
//    // System.out.println(s);
//     
//     StringBuffer sb=new StringBuffer(str1);
//     sb.reverse();
//       System.out.println(sb);       
//}
//}

