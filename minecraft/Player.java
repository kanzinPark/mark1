package minecraft;

import lombok.Getter;
import lombok.Setter;
import minecraft.amor.*;
import minecraft.weapon.tools.Bow;
import minecraft.weapon.tools.*;

@Getter
@Setter
public class Player {

    int atk = 1;
    private int baseDefense;
    private String name;

    //방어구
    private Helmet helmet;
    private Chestplate chestplate;
    private Leggings leggings;
    private Boots boots;

    //무기
    private Sword sword;
    private Axe axe;
    private Bow bow;

    //도구
    private Hoe hoe;
    private Pickaxe pickaxe;
    private int arrowCount;

    //방어구
    public void equipArmor(Equipment equipment) {
        if (equipment instanceof Helmet) {
            this.helmet = (Helmet) equipment;
        } else if (equipment instanceof Chestplate) {
            this.chestplate = (Chestplate) equipment;
        } else if (equipment instanceof Leggings) {
            this.leggings = (Leggings) equipment;
        } else if (equipment instanceof Boots) {
            this.boots = (Boots) equipment;
        }
    }

    //방어력 증가 및 감소
    public int getTotalDefense() {
        int total = baseDefense;
        if (helmet != null) total += helmet.getDefense();
        if (chestplate != null) total += chestplate.getDefense();
        if (leggings != null) total += leggings.getDefense();
        if (boots != null) total += boots.getDefense();
        return total;
    }

    //무기 및 도구
    public void equipTools(Tools tools) {
        if (tools instanceof Sword) {
            this.sword = (Sword) tools;
        } else if (tools instanceof Axe) {
            this.axe = (Axe) tools;
        } else if (tools instanceof Hoe) {
            this.hoe = (Hoe) tools;
        } else if (tools instanceof Pickaxe) {
            this.pickaxe = (Pickaxe) tools;
        }
    }

    //도구 공격력 증가 및 감소
    public int getTotalAtk(Tools tools) {
        if (tools instanceof Sword) {
            return this.sword.getAtk();
        } else if (tools instanceof Axe) {
            return this.axe.getAtk();
        } else {
            return atk;
        }
    }

    //활
    public int getBowAtk(Tools tools) {
        if (tools instanceof Bow && arrowCount != 0) {
            return this.bow.getAtk();
        }
        return 0;
    }

    //행동
    public void eat() {
        System.out.println("먹기");
    }

    public boolean jump() {
        return false;
    }

    public boolean attack() {
        return false;
    }

    public boolean run() {
        return false;
    }

    public void mine() {
        System.out.println("캡니다");
    }

    public boolean place() {
        return false;
    }

    public Player(String name, int baseDefense, int atk) {
        this.name = name;
        this.baseDefense = baseDefense;
        this.atk = atk;
    }
}
