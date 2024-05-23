package chapter07;
abstract class Rabbit20 {
    int xPos;
    int yPos;

    void move(int x,int y) {
        this.xPos = x;
        this.yPos = y;
    }

    abstract void sleep();
}

class HouseRabbit20 extends Rabbit20 {
    @Override
    void sleep() {
//        super.move(x, y);
        System.out.println("집토끼가 우리에서 잠을 자고 있습니다.");
    }
}
class MountainRabbit20 extends Rabbit20 {
    @Override
    void sleep() {
//        super.move(x, y);
        System.out.println("산토끼가 굴속에서 잠자고 있습니다.");
    }
}

public class Code08_08 {
    public static void main(String[] args) {
        HouseRabbit20 hRabbit = new HouseRabbit20();
        MountainRabbit20 mRabbit = new MountainRabbit20();

        hRabbit.sleep();
        mRabbit.sleep();
    }
}
