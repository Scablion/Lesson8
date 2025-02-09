public class RecyclableMaterial {

    // объявите переменные с правильными модификаторами
    final private int code;
    final private MaterialType type;
    final private boolean isRecyclable;
    final private String description;


    RecyclableMaterial(int code, MaterialType type, boolean isRecyclable, String description) {
        this.code = code;
        this.type = type;
        this.isRecyclable = isRecyclable;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public MaterialType getType() {
        return type;
    }

    public boolean isRecyclable() {
        return isRecyclable;
    }

    public String getDescription() {
        return description;
    }
}
