public class Quiz_0326_02 {
    public static void main(String[] args) {

        for(int i=1; i<=7; i=i+2) {
            for(int j=1; j<=7; j++) {
                if (j <= (7 - i) / 2) {
                    System.out.print(" ");
                }
            }
            for(int k=1;k<=7;k++) {
                if (k<=i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}


