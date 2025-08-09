package minecraft.monster;

import minecraft.Weather;

public class Skeleton extends Monster {

    Weather weather = new Weather();

    @Override
    public void attack() {
        System.out.println("활을 쏩니다");
    }

    @Override
    public void move() {
        System.out.println("와리가리 와리가리");
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
