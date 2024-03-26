public class Quiz_0326 {
    public static void main(String[] args) {
        for (int i = 1; i <5; i++) {
            for (int j=4; j>i; j--) {
                System.out.print(" ");
            }
            for (int t = 1; t<=2*i-1; t++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
