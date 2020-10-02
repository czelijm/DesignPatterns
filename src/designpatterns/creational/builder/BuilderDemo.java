package designpatterns.creational.builder;

public class BuilderDemo {
    public static void runDemo() {
        CodeBuilder codeBuilder = new CodeBuilder("MyClass");
        codeBuilder
                .addField("private","String","name")
                .addField("public","int","number");

        System.out.println(codeBuilder.buildClass().toString());
    }
}
