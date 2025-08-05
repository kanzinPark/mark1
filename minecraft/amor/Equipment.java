package minecraft.amor;

import lombok.Getter;

@Getter
public abstract class Equipment {

    //방어력
    protected String name;
    protected int defense;

    protected EquipmentMaterials equipmentMaterials;

    public Equipment(String name, EquipmentMaterials equipmentMaterials) {
        this.name = name;
        this.equipmentMaterials = equipmentMaterials;
    }

}
