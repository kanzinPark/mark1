package minecraft;

import lombok.Getter;
import minecraft.amor.Armor;

@Getter
public class Player {

    int attakRaiting = 1;

    int armRaiting = 0;

    public boolean attack() {
        return false;
    }

    public void mine() {
        System.out.println("캡니다");;
    }

    public int getArmRaiting(Armor armor) {

        return armRaiting;
    }


}
