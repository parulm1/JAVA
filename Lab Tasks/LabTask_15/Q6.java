//6.Write a program in java that copies contents of one file to another using a traditional
//IO stream.

package LabTask_15;

import java.io.*;
public class Q6 
{
    void copyFile(){
        int i;
        try(FileInputStream fin = new FileInputStream("C:\\Users\\user\\Downloads\\Atishay\\laveena.jpeg");
                            FileOutputStream fout = new FileOutputStream("C:\\Users\\user\\Downloads\\Atishay\\laveena\\lavina.png")){
            do{
                i=fin.read();
                fout.write(i);
            }while(i!=-1);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        Q6 q6 = new Q6();
        q6.copyFile();
    }
} 
