package designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FontSchemeFactory {
    private Map<String,FontScheme> fontSchemeMap = new HashMap<>();
    private static class MapKeyGenerator{
        public static String generateKey(FontFamilyType fontFamilyType , int i, boolean b){
            return fontFamilyType.toString() + i + b;
        }
    }

    public FontScheme getFontScheme(FontFamilyType fontFamilyType , int i, boolean b){
        String key = MapKeyGenerator.generateKey(fontFamilyType, i, b);
        if (!fontSchemeMap.containsKey(key) ){
            fontSchemeMap.put(key,new FontScheme(fontFamilyType,i,b));
        }
        return fontSchemeMap.get(key);
    }

}
