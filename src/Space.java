// data model class

public class Space {
    private String name;
    private String icon;

    public Space(String name, String icon) {
        this.name = name;
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String newIcon) {
        icon = newIcon;
    }
}
