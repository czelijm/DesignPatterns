package designpatterns.structural.flyweight;

public class FontScheme {
    private FontFamilyType fontFamily;
    private int fontSize;
    private boolean isBold;

    public FontScheme(FontFamilyType fontFamily, int fontSize, boolean isBold) {
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
        this.isBold = isBold;
    }

    public FontFamilyType getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(FontFamilyType fontFamily) {
        this.fontFamily = fontFamily;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public boolean isBold() {
        return isBold;
    }

    public void setBold(boolean bold) {
        isBold = bold;
    }


}
