package designpatterns.structural.flyweight;

public class SpreadSheet {
  private final int MAX_ROWS = 3;
  private final int MAX_COLS = 3;

  // In a real app, these values should not be hardcoded here.
  // They should be read from a configuration file.
  private final FontFamilyType fontFamily = FontFamilyType.UBUNTU;
  private final int fontSize = 12;
  private final boolean isBold = false;
  private FontSchemeFactory fontSchemeFactory = new FontSchemeFactory();
  private FontScheme fontScheme = fontSchemeFactory.getFontScheme(fontFamily,fontSize,isBold);

  private Cell[][] cells = new Cell[MAX_ROWS][MAX_COLS];

  public SpreadSheet() {
    generateCells();
  }

  public void setContent(int row, int col, String content) {
    ensureCellExists(row, col);

    cells[row][col].setContent(content);
  }

  public void setFontFamily(int row, int col, FontFamilyType fontFamily) {
    ensureCellExists(row, col);
    FontScheme fontScheme = fontSchemeFactory.getFontScheme(fontFamily,fontSize,isBold);
    var cell = cells[row][col];
    cells[row][col].setFontScheme(fontScheme);
  }

  private void ensureCellExists(int row, int col) {
    if (row < 0 || row >= MAX_ROWS)
      throw new IllegalArgumentException();

    if (col < 0 || col >= MAX_COLS)
      throw new IllegalArgumentException();
  }

  private void generateCells() {
    for (var row = 0; row < MAX_ROWS; row++)
      for (var col = 0; col < MAX_COLS; col++) {
        var cell = new Cell(row, col, fontScheme);
//        cell.setFontFamily(fontFamily);
        cells[row][col] = cell;
      }
  }

  public void render() {
    for (var row = 0; row < MAX_ROWS; row++)
      for (var col = 0; col < MAX_COLS; col++)
        cells[row][col].render();
  }
}
