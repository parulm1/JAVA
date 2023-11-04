package Wrapper_Class;

public class ConstantPool {
    public static void main(String[] args) {
        //for integer family -128 to 127
        Byte b1=Byte.valueOf("127");
       Byte b2=Byte.valueOf("127");
       // System.out.print(b1==b2);
       
       Short b3= Short.valueOf("156");
       Short b4= Short.valueOf("156");
       // System.out.println(b3==b4);
       
       Boolean b5=Boolean.valueOf(false);
       Boolean b6=Boolean.valueOf(false);
       // System.out.println(b5==b6);
       
       
       //range for character for constant pool'\u0000'to'\u007f'
       System.out.println("\u0102 \u026B \u0282 \u0126 \u0102 \u0178");
        System.out.println("\u048E \u0466 \u042F \u0426 \u0286");
        
       //Character b7=Character.valueOf('A');
       //Character b8=Character.valueOf('A');
        //System.out.println(b7==b8);    
    }
}
