package mcjty.theoneprobe.apiimpl.styles;

import mcjty.theoneprobe.api.IProgressStyle;
import mcjty.theoneprobe.api.NumberFormat;

/**
 * Style for the progress bar.
 */
public class ProgressStyle implements IProgressStyle {
    private int borderColorTop = 0xff5000FF;
    private int borderColorBottom = 0xff28007F;
    private int backgroundColor = 0xff000000;
    private int filledColor = 0xffaaaaaa;
    private int alternatefilledColor = 0xffaaaaaa;
    private boolean showText = true;
    private boolean renderBG = true;
    private String prefix = "";
    private String suffix = "";
    private int width = 100;
    private int height = 14;
    private boolean lifeBar = false;
    private boolean armorBar = false;
    private boolean arrowBar = false;

    private NumberFormat numberFormat = NumberFormat.FULL;

    /// The color that is used for the border of the progress bar
    @Override
    public ProgressStyle borderColorTop(int c) {
        borderColorTop = c;
        return this;
    }

    @Override
    public ProgressStyle borderColorBottom(int c) {
        borderColorBottom = c;
        return this;
    }

    /// The color that is used for the background of the progress bar
    @Override
    public ProgressStyle backgroundColor(int c) {
        backgroundColor = c;
        return this;
    }

    /// The color that is used for the filled part of the progress bar
    @Override
    public ProgressStyle filledColor(int c) {
        filledColor = c;
        return this;
    }

    /// If this is different from the filledColor then the fill color will alternate
    @Override
    public ProgressStyle alternateFilledColor(int c) {
        alternatefilledColor = c;
        return this;
    }

    /// If true then text is shown inside the progress bar
    @Override
    public ProgressStyle showText(boolean b) {
        showText = b;
        return this;
    }

    /// If true then background will be rendered
    @Override
    public ProgressStyle renderBG(boolean b) {
        renderBG = b;
        return this;
    }

    /// The number format to use for the text inside the progress bar
    @Override
    public ProgressStyle numberFormat(NumberFormat f) {
        numberFormat = f;
        return this;
    }

    @Override
    public ProgressStyle prefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    @Override
    public ProgressStyle suffix(String suffix) {
        this.suffix = suffix;
        return this;
    }

    @Override
    public ProgressStyle width(int w) {
        this.width = w;
        return this;
    }

    @Override
    public ProgressStyle height(int h) {
        this.height = h;
        return this;
    }

    @Override
    public IProgressStyle lifeBar(boolean b) {
        this.lifeBar = b;
        return this;
    }

    @Override
    public IProgressStyle armorBar(boolean b) {
        this.armorBar = b;
        return this;
    }

    @Override
    public IProgressStyle arrowBar(boolean b) {
        this.arrowBar = b;
        return this;
    }

    @Override
    public int getBorderColorTop() {
        return borderColorTop;
    }
    public int getBorderColorBottom() {
        return borderColorBottom;
    }

    @Override
    public int getBackgroundColor() {
        return backgroundColor;
    }

    @Override
    public int getFilledColor() {
        return filledColor;
    }

    @Override
    public int getAlternatefilledColor() {
        return alternatefilledColor;
    }

    @Override
    public boolean isShowText() {
        return showText;
    }

    @Override
    public boolean isRenderBG() {
        return renderBG;
    }

    @Override
    public NumberFormat getNumberFormat() {
        return numberFormat;
    }

    @Override
    public String getPrefix() {
        return prefix;
    }

    @Override
    public String getSuffix() {
        return suffix;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public boolean isLifeBar() {
        return lifeBar;
    }

    @Override
    public boolean isArmorBar() {
        return armorBar;
    }

    @Override
    public boolean isArrowBar() {
        return arrowBar;
    }
}
