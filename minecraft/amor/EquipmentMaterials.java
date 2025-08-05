package minecraft.amor;

public enum EquipmentMaterials {
    LEATHER(1, 20),
    IRON(2, 50),
    GOLD(3,30),
    DIAMOND(4,70),
    NETHERITE(5,85),
    TURTLE(2, 30); //only Helmet

    private final int defense;
    private final int durability;

    EquipmentMaterials(int defense, int durability) {
        this.defense = defense;
        this.durability = durability;
    }
}
