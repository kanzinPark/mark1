package minecraft.mineral;

import minecraft.Player;
import minecraft.tools.tool.Pickaxe;
import minecraft.tools.tool.Tools;

public class Diamond extends Minerals{

    Player player;
    Tools tools;

    @Override
    public void dropMinerals() {
        if (!player.mine(MineralType.DIAMOND) && (tools instanceof Pickaxe)) {
            System.out.println("다이아몬드를 드롭합니다");
        }
    }
}
