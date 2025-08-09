package minecraft.mineral;

import lombok.Getter;
import minecraft.Player;
import minecraft.tools.tool.Pickaxe;
import minecraft.tools.tool.Tools;

@Getter
public class Coal extends Minerals{
    private final String name;
    private final MineralType mineralType;

    Player player;
    Coal coal;
    Tools tools;

    @Override
    public void dropMinerals() {
        if (!player.mine(MineralType.COAL) && (tools instanceof Pickaxe)) {
            System.out.println("석탄을 드롭합니다");
        }
    }

    public Coal(String name, MineralType mineralType) {
        this.name = name;
        this.mineralType = mineralType;
    }
}
