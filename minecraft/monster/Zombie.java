package minecraft.monster;

import minecraft.Weather;

public class Zombie extends Monster implements AbstractMonster {

    Weather weather = new Weather();

    @Override
    public void attack() {
        System.out.println("사람을 할큅니다");
    }

    @Override
    public void move() {
        System.out.println("사람을 향해 옵니다");
    }

    @Override
    public boolean die() {
        if (!weather.night()) {
            return true;
        }
        dropItems();
        return false;
    }
}
