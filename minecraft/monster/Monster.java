package minecraft.monster;

public abstract class Monster {

    public boolean die() {
        return false;
    }

    public void attack() {
        System.out.println("공격");
    }

    public void move() {
        System.out.println("움직임");
    }

    public void dropItems() {
        System.out.println("아이템을 드롭합니다.");
    }
}
