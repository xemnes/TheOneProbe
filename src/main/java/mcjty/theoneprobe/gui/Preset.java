package mcjty.theoneprobe.gui;

import mcjty.theoneprobe.api.TextStyleClass;
import org.apache.commons.lang3.tuple.Pair;

import java.util.HashMap;
import java.util.Map;

class Preset {
    private final String name;
    private final int boxBorderColorTop;
    private final int boxBorderColorBottom;
    private final int boxFillColor;
    private final int boxThickness;
    private final int boxOffset;
    private final Map<TextStyleClass, String> textStyleClasses;

    @SafeVarargs
    public Preset(String name, int boxBorderColorTop, int boxBorderColorBottom, int boxFillColor, int boxThickness, int boxOffset, Pair<TextStyleClass, String>... styles) {
        this.name = name;
        this.boxBorderColorTop = boxBorderColorTop;
        this.boxBorderColorBottom = boxBorderColorBottom;
        this.boxFillColor = boxFillColor;
        this.boxThickness = boxThickness;
        this.boxOffset = boxOffset;
        textStyleClasses = new HashMap<>();
        for (Pair<TextStyleClass, String> style : styles) {
            textStyleClasses.put(style.getLeft(), style.getRight());
        }
    }

    public String getName() {
        return name;
    }

    public int getBoxBorderColorTop() {
        return boxBorderColorTop;
    }

    public int getBoxBorderColorBottom() {
        return boxBorderColorBottom;
    }

    public int getBoxFillColor() {
        return boxFillColor;
    }

    public int getBoxThickness() {
        return boxThickness;
    }

    public int getBoxOffset() {
        return boxOffset;
    }

    public Map<TextStyleClass, String> getTextStyleClasses() {
        return textStyleClasses;
    }
}
