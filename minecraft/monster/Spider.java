package minecraft.monster;

import minecraft.Weather;

public class Spider extends Monster implements AbstractMonster {

    Weather weather = new Weather();

    @Override
    public void attack() {
        System.out.println("점프를 하며 공격합니다");
        if(!weather.night()) {
            System.out.println("사람 공격");
        } else {
            System.out.println("노공격");
        }
    }

    @Override
    public void move() {
        System.out.println("사람을 향해 옵니다");
    }

    public boolean die() {
        dropItems();
        return false;
    }

}
