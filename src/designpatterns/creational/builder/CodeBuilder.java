package designpatterns.creational.builder;

public class CodeBuilder {
    private String nameOfClass;
    CodeClass codeClass;

    public CodeBuilder(String nameOfClass) {
        this.nameOfClass = nameOfClass;
        codeClass = new CodeClass(nameOfClass);
    }

    public CodeBuilder addField(String accesModifier, String type, String name){
        codeClass.addField(accesModifier, type, name);
        return this;
    }

    public CodeClass buildClass(){
        return codeClass;
    }

}

