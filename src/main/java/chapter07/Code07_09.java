package chapter07;
class Rabbitt {
    String shape;
    int xPos;
    int yPos;
    void setPosition(int x, int y) {
        this.xPos = x;
        this.yPos = y;

        System.out.println("xPos : " + this.xPos + " / yPos : " + this.yPos);
    }
}
public class Code07_09 {
    public static void main(String[] args) {
        Rabbitt rabbit1 = new Rabbitt();
        Rabbitt rabbit2 = new Rabbitt();
        Rabbitt rabbit3 = new Rabbitt();

        rabbit1.shape = "원";
        rabbit2.shape = "삼각형";
        rabbit3.shape = "토끼";

        System.out.println("rabbit1.shape : " + rabbit1.shape);
        System.out.println("rabbit2.shape : " + rabbit2.shape);
        System.out.println("rabbit3.shape : " + rabbit3.shape);

        rabbit1.setPosition(100,100);
        rabbit2.setPosition(-100,100);
        rabbit3.setPosition(0,-100);
    }
}
