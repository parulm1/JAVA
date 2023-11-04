//3.Write a code for java that reads multiple lines from a text file with the help of Buffer
//Reader, and print the content line by line.

package LabTask_15;

import java.io.*;
public class Q3 {
    void readPara() throws IOException{
        String str[]=new String[100];
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("For ending the reading process enter = 'stop'");
        System.out.println("Provide sentences to read its paragraph: ");
        for(int i=0;i<str.length;i++){
            str[i]=br.readLine();
            if(str[i].equals("stop"))
                break;
        }
       System.out.println("\n\n\nProvided Paragraph is: ");
        for(int i=0;i<str.length;i++){
            if(str[i].equals("stop"))
                break;
            System.out.println(str[i]);
    }
    }
    
    public static void main(String[] args) throws IOException {
        Q3 q3 = new Q3();
        q3.readPara();
    }
}

