package minecraft.monster;

public class Witch extends Monster {
    @Override
    public void attack() {
        System.out.println("너프 물약을 던집니다");
    }

    @Override
    public void move() {
        System.out.println("사람의 주변을 빙빙 돕니다");
    }

    @Override
    public boolean die() {
        dropItems();
        return false;
    }
}
