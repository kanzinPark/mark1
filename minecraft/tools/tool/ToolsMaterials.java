package minecraft.tools.tool;

import lombok.Getter;

@Getter
public enum ToolsMaterials {

    WOOD(20, 20),
    STONE(30,30),
    IRON(50,50),
    GOLD(70,30),
    DIAMOND(60,70),
    NETHERITE(70,85);

    private final int mineSpeed;
    private final int durability;

    ToolsMaterials(int mineSpeed, int durability) {
        this.mineSpeed = mineSpeed;
        this.durability = durability;
    }
}
