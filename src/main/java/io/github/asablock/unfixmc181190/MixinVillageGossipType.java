package io.github.asablock.unfixmc181190;

import net.minecraft.village.VillageGossipType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(VillageGossipType.class)
public class MixinVillageGossipType {
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 25, ordinal = 0))
    private static int modifyConstant1(int constant) {
        return 200;
    }

    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 20, ordinal = 2))
    private static int modifyConstant2(int constant) {
        return 100;
    }

    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 20, ordinal = 3))
    private static int modifyConstant3(int constant) {
        return 100;
    }
}
