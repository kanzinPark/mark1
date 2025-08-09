package minecraft.tools.tool;

public class Hoe extends Tools {

    Hoe woodHoe = new Hoe(ToolsMaterials.WOOD);
    Hoe stoneHoe = new Hoe(ToolsMaterials.STONE);
    Hoe ironHoe = new Hoe(ToolsMaterials.IRON);
    Hoe goldHoe = new Hoe(ToolsMaterials.GOLD);
    Hoe diamondHoe = new Hoe(ToolsMaterials.DIAMOND);

    public Hoe getHoe(Hoe hoe) {
        return hoe;
    }

    public Hoe(ToolsMaterials toolsMaterials) {
        super(toolsMaterials.name() + " 괭이", toolsMaterials);
    }
}
