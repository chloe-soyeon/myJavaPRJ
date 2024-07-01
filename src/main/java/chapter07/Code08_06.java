package chapter07;
class Rabbit11 {
    String shape;
    int xPos;
    int yPos;

    void move(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }
}
class HouseRabbit1 extends Rabbit11 {
    String owner;

    @Override //@붙은 것은 annotation 함수 변수에 대한 설명 (써주는게 좋음. 가독성 good)
    void move(int x, int y) { //부모함수에 써있는 거 똑같이 써줘야함!!!
//        super.move(x, y); super는 Rabbit11이다(부모 클래스)
        System.out.println("나는 덮어쓰기한 move 함수 입니다.");
    }

    void eatFeed() {
        System.out.println("집토끼가 사료를 먹습니다.");

    }
}
class MountainRabbit1 extends Rabbit11 {
    String mountain;
    void eatWildgrass() {
        System.out.println("산토끼가 풀을 먹습니다.");
    }
}
public class Code08_06 {
    public static void main(String[] args){
        HouseRabbit1 hrabbit1 = new HouseRabbit1();
        MountainRabbit1 mRabbit1 = new MountainRabbit1();

        hrabbit1.shape = "삼각형";
        hrabbit1.owner = "소연";
        hrabbit1.move(100,100);
        hrabbit1.eatFeed();

        mRabbit1.shape = "네모";
        mRabbit1.mountain = "설악산";
        mRabbit1.move(200,200);
        mRabbit1.eatWildgrass();

    }
}
