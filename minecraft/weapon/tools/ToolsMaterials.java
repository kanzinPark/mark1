package minecraft.weapon.tools;

public enum ToolsMaterials {
    BOW(3,50),
    IRON(2, 50),
    GOLD(3, 30),
    DIAMOND(4, 70),
    NETHERITE(5,85);

    private final int atk;
    private final int durability;

    ToolsMaterials(int atk, int durability) {
        this.atk = atk;
        this.durability = durability;
    }
}
