package designpatterns.structural.flyweight;

public class FlyweightDemo {
  public static void runDemo() {
    var sheet = new SpreadSheet();
    sheet.setContent(0, 0, "Hello");
    sheet.setContent(1, 0, "World");
    sheet.setFontFamily(0, 0, FontFamilyType.ARIAL);
    sheet.render();
  }
}
