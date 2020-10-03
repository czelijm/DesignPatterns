package designpatterns.behavioral.chainofresponsibilities;

public class ChainOfResponsibilitiesDemo {
    public static void runDemo() {
        FileTypeReader xlsReader = new FileTypeReader(".xls",null);
        FileTypeReader numbersReader = new FileTypeReader(".numbers",xlsReader);
        FileTypeReader qbwReader = new FileTypeReader(".qbw",numbersReader);
        DataReader dataReader = new DataReader(qbwReader);

        DataFile xls = new DataFile(".xls","XXDDD");
        DataFile numbers = new DataFile(".numbers","XXDDD");
        DataFile qbw = new DataFile(".qbw","XXDDD");
        DataFile unknown = new DataFile(".unknown","XXDDDunknown");


        dataReader.handle(xls);

    }
}
