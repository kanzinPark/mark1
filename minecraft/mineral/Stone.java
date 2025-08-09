package minecraft.mineral;

import minecraft.Player;
import minecraft.tools.tool.Pickaxe;
import minecraft.tools.tool.Tools;

public class Stone extends Minerals{

    Player player;
    Tools tools;

    @Override
    public void dropMinerals() {
        if (!player.mine(MineralType.STONE) && (tools instanceof Pickaxe)) {
            System.out.println("돌을 드롭합니다");
        }
    }
}
