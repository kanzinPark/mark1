package minecraft.tools.weapon;

public class Sword extends Weapons {

    Sword woodSword = new Sword(WeaponsMaterials.WOOD);
    Sword stoneSword = new Sword(WeaponsMaterials.STONE);
    Sword ironSword = new Sword(WeaponsMaterials.IRON);
    Sword goldSword = new Sword(WeaponsMaterials.GOLD);
    Sword diamondSword = new Sword(WeaponsMaterials.DIAMOND);

    public Sword(WeaponsMaterials weaponsMaterials) {
        super(weaponsMaterials.name() + " 검", weaponsMaterials);
    }

    public Sword getSword(Sword sword) {
        return sword;
    }
}
