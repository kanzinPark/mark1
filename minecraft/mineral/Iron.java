package minecraft.mineral;

import minecraft.Player;
import minecraft.tools.tool.Pickaxe;
import minecraft.tools.tool.Tools;

public class Iron extends Minerals{

    Player player;
    Tools tools;

    @Override
    public void dropMinerals() {
        if (!player.mine(MineralType.IRON) && (tools instanceof Pickaxe)) {
            System.out.println("철을 드롭합니다");
        }
    }
}
