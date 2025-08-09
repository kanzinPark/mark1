package minecraft.tools.tool;

import lombok.Getter;

@Getter
public class Tools {

    protected String name;
    protected ToolsMaterials toolsMaterials;

    public Tools(String name, ToolsMaterials toolsMaterials) {
        this.name = name;
        this.toolsMaterials = toolsMaterials;
    }

    public boolean touch() {
        return false;
    }
}
