package mcjty.theoneprobe.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
    public static CreativeProbe creativeProbe;
    public static ProbeNote probeNote;

    public static String PROBETAG_HAND = "theoneprobe_hand";

    public static void init() {
        creativeProbe = new CreativeProbe();
        probeNote = new ProbeNote();

    }

    @SideOnly(Side.CLIENT)
    public static void initClient() {
        creativeProbe.initModel();
        probeNote.initModel();

    }

    public static boolean isProbeInHand(ItemStack stack) {
        if (stack.isEmpty()) {
            return true;
        }
        if (stack.getItem() == creativeProbe) {
            return true;
        }
        if (stack.getTagCompound() == null) {
            return true;
        }
        return stack.getTagCompound().hasKey(PROBETAG_HAND);
    }


    public static boolean hasAProbeSomewhere(EntityPlayer player) {
        return hasProbeInHand(player, EnumHand.MAIN_HAND) || hasProbeInHand(player, EnumHand.OFF_HAND);
    }

    private static boolean hasProbeInHand(EntityPlayer player, EnumHand hand) {
        ItemStack item = player.getHeldItem(hand);
        return isProbeInHand(item);
    }
}
