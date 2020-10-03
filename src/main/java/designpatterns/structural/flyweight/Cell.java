package designpatterns.structural.flyweight;

public class Cell {
  private final int row;
  private final int column;
  private String content;
  private FontScheme fontScheme;

  public Cell(int row, int column, FontScheme fontScheme) {
    this.row = row;
    this.column = column;
    this.fontScheme = fontScheme;
  }

  public Cell(int row, int column) {
    this.row = row;
    this.column = column;
    this.fontScheme = null;
  }


  public FontScheme getFontScheme() {
    return fontScheme;
  }

  public void setFontScheme(FontScheme fontScheme) {
    this.fontScheme = fontScheme;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public FontFamilyType getFontFamily() {
    return fontScheme.getFontFamily();
  }

  public void setFontFamily(FontFamilyType fontFamily) {
    fontScheme.setFontFamily(fontFamily);
  }

  public int getFontSize() {
    return fontScheme.getFontSize();
  }

  public void setFontSize(int fontSize) {
    fontScheme.setFontSize(fontSize);
  }

  public boolean isBold() {
    return fontScheme.isBold();
  }

  public void setBold(boolean bold) {
    fontScheme.setBold(bold);
  }

  public void render() {
    System.out.printf("(%d, %d): %s [%s]\n", row, column, content, fontScheme.getFontFamily());
  }
}
