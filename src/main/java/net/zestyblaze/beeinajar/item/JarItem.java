package net.zestyblaze.beeinajar.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.zestyblaze.beeinajar.registry.BIAJBlockInit;
import org.jetbrains.annotations.NotNull;

public class JarItem extends ItemNameBlockItem {
    public JarItem(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    public InteractionResult interactLivingEntity(ItemStack stack, @NotNull Player player, LivingEntity interactionTarget, InteractionHand usedHand) {
        if(!player.getLevel().isClientSide()) {
            if(interactionTarget instanceof Bee) {
                if(!player.isCreative()) {
                    stack.shrink(1);
                }
                if(stack.isEmpty()) {
                    player.getInventory().add(new ItemStack(BIAJBlockInit.BEE_IN_A_JAR));
                } else if(!player.getInventory().add(new ItemStack(BIAJBlockInit.BEE_IN_A_JAR))) {
                    player.drop(new ItemStack(BIAJBlockInit.BEE_IN_A_JAR), false);
                }
                interactionTarget.discard();
                return InteractionResult.SUCCESS;
            }
        }
        return InteractionResult.FAIL;
    }
}
