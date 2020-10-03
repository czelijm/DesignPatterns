package designpatterns.behavioral.memento;

public class MementoDemo {

    public static void runDemo()
    {
        System.out.println("-------------------------Memento demo------------------------------");
        Document document = new Document();
        document.setFontSize(15);
        document.setFontName("ubuntu");
        document.setContent("Chocolate is briliant!!!");

        System.out.println(document.toString());
        History history = new History();
        history.push(document.createState());

        document.setFontSize(72);
        document.setFontName("Comic Sands");
        document.setContent("Cabbage is briliant!!!");
        System.out.println(document.toString());

        document.restoreState(history.pop());
        System.out.println(document.toString());



    }

}
