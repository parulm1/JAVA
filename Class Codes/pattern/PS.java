package pattern;

public class PS {
    public static void main(String[] args) {
        // Display the letter "P"
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 6; j++) {
                if (j == 1 || j == 7 || (i == 1 && j < 6) || (i == 4 && j < 7) || (i < 4 && j == 6)) {
                    System.out.print("P");
                } else {
                    System.out.print(" ");
        }
            }
        
        // Display the letter "S"
            System.out.print("      ");
            for (int j = 1; j <= 7; j++) {
                if ((i == 1 || i == 4 || i == 7) && j < 7) {
                    System.out.print("S");
                } else if ((i < 4 && j == 1) || (i > 4 && j == 7)) {
                    System.out.print("S");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

   
