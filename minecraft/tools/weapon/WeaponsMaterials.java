package minecraft.tools.weapon;

import lombok.Getter;

@Getter
public enum WeaponsMaterials {

    BOW(3,50),
    WOOD(1, 20),
    STONE(2,30),
    IRON(3, 50),
    GOLD(4, 30),
    DIAMOND(5, 70),
    NETHERITE(6,85);

    private final int atk;
    private final int durability;

    public int getAtkBow() {
        return BOW.atk;
    }

    WeaponsMaterials(int atk, int durability) {
        this.atk = atk;
        this.durability = durability;
    }
}
