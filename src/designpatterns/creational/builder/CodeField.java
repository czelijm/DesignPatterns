package designpatterns.creational.builder;

public class CodeField {
    private String accessModifier;
    private String fieldType;
    private String name;

    public CodeField(String accessModifier, String fieldType, String name) {
        this.accessModifier = accessModifier;
        this.fieldType = fieldType;
        this.name = name;
    }

    public String getAccessModifier() {
        return accessModifier;
    }

    public void setAccessModifier(String accessModifier) {
        this.accessModifier = accessModifier;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return accessModifier + " " + fieldType + " " + name;
    }
}
