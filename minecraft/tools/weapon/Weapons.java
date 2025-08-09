package minecraft.tools.weapon;

import lombok.Getter;

@Getter
public class Weapons {

    protected String name;
    protected WeaponsMaterials weaponsMaterials;

    public Weapons(String name, WeaponsMaterials weaponsMaterials) {
        this.name = name;
        this.weaponsMaterials = weaponsMaterials;
    }
}
