package designpatterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class CodeClass {
    private List<CodeField> fields =new ArrayList<>();
    private String name;

    public CodeClass(String name) {
        this.name = name;
    }

    public CodeClass addField(String accesModifier, String type, String value){
        fields.add(new CodeField(accesModifier,type,value));
        return this;
    }

    public CodeClass removeField(String name){
       var field = fields.stream().filter(((CodeField f) -> (f.getName()).equals(name))).findFirst();
       fields.remove(field);
        return this;
    }

    @Override
    public String toString() {
        var v = "";
        v+="class " + name + "{\n";
        for (CodeField f: fields) {
            v += "  " + f.toString()+";\n";
        }
        v+="}";
        return v;
    }
}
