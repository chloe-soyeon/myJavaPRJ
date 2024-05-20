package chapter07;
class Tree{
    private String color;

    public void setTree(String color){
        this.color=color;
    }
}
class AppleTree extends Tree{
    public void setTree(String color) {
        super.setTree(color);
        System.out.printf("%s 색상으로 설정하였습니다.\n",color);

    }
}
public class Quiz0520 {
    public static void main(String[] args) {
        AppleTree at = new AppleTree();
        at.setTree("노란색");
    }

}
