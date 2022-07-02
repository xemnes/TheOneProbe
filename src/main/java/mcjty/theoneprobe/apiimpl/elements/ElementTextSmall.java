package mcjty.theoneprobe.apiimpl.elements;

import io.netty.buffer.ByteBuf;
import mcjty.theoneprobe.api.IElement;
import mcjty.theoneprobe.apiimpl.TheOneProbeImp;
import mcjty.theoneprobe.apiimpl.client.ElementTextSmallRender;
import mcjty.theoneprobe.network.NetworkTools;

public class ElementTextSmall implements IElement {

    private final String text;

    public ElementTextSmall(String text) {
        this.text = text;
    }

    public ElementTextSmall(ByteBuf buf) {
        text = NetworkTools.readStringUTF8(buf);
    }

    @Override
    public void render(int x, int y) {
        ElementTextSmallRender.render(text, x, y);
    }

    @Override
    public int getWidth() {
        return ElementTextSmallRender.getWidth(text);
    }

    @Override
    public int getHeight() {
        return 5;
    }

    @Override
    public void toBytes(ByteBuf buf) {
        NetworkTools.writeStringUTF8(buf, text);
    }

    @Override
    public int getID() {
        return TheOneProbeImp.ELEMENT_TEXT_SMALL;
    }
}
