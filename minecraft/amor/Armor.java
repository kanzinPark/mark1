package minecraft.amor;

import minecraft.Player;

public class Armor {

    private Player player;

    public Armor(Player player) {
        this.player = player;
    }

    public int eqip(Armor armor) {
        return player.getArmRaiting(armor);
    }
}
