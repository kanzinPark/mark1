package minecraft.monster;

public class Monster {

    public boolean die() {
        return false;
    }

    public void dropItems() {
        if (die()) {
            System.out.println("아이템을 드롭합니다.");
        }
    }


}
