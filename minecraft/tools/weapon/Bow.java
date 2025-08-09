package minecraft.tools.weapon;

public class Bow extends Weapons {

    public Bow getBow(Bow bow) {
        return bow;
    }

    public Bow(WeaponsMaterials weaponsMaterials) {
        super(weaponsMaterials.name(), weaponsMaterials);
    }
}
