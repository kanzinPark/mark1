package minecraft.tools.tool;

public class Pickaxe extends Tools{

    Pickaxe woodPickaxe = new Pickaxe(ToolsMaterials.WOOD);
    Pickaxe stonePickaxe = new Pickaxe(ToolsMaterials.STONE);
    Pickaxe ironPickaxe = new Pickaxe(ToolsMaterials.IRON);
    Pickaxe goldPickaxe = new Pickaxe(ToolsMaterials.GOLD);
    Pickaxe diamondPickaxe = new Pickaxe(ToolsMaterials.DIAMOND);

    public Pickaxe getPickAxe(Pickaxe pickaxe) {
        return pickaxe;
    }

    public Pickaxe(ToolsMaterials toolsMaterials) {
        super(toolsMaterials.name() + " 곡괭이", toolsMaterials);
    }
}
