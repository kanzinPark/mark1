package minecraft.tools.weapon;

public class Axe extends Weapons {

    Axe woodAxe = new Axe(WeaponsMaterials.WOOD);
    Axe stoneAxe = new Axe(WeaponsMaterials.STONE);
    Axe ironAxe = new Axe(WeaponsMaterials.IRON);
    Axe goldAxe = new Axe(WeaponsMaterials.GOLD);
    Axe diamondAxe = new Axe(WeaponsMaterials.DIAMOND);


    public Axe getAxe(Axe axe) {
        return axe;
    }


    public Axe(WeaponsMaterials weaponsMaterials)
    {super(weaponsMaterials.name() + " 도끼", weaponsMaterials);}
}
