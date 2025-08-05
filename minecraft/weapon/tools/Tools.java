package minecraft.weapon.tools;

import lombok.Getter;

@Getter
public abstract class Tools {

    protected String name;
    protected int atk;

    protected ToolsMaterials toolsMaterials;

    public Tools(String name, ToolsMaterials toolsMaterials) {
        this.name = name;
        this.toolsMaterials = toolsMaterials;
    }


    public boolean touch() {
        return false;
    }
}
