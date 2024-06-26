package net.ezkidtrix.epicmcmod.entity.custom;

import net.ezkidtrix.epicmcmod.entity.ModEntities;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.world.World;

public class ThrowableAnvilEntity extends ThrownItemEntity {
    public ThrowableAnvilEntity(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }

    public ThrowableAnvilEntity(LivingEntity livingEntity, World world) {
        super(ModEntities.THROWABLE_ANVIL, livingEntity, world);
    }

    @Override
    protected Item getDefaultItem() {
        return Blocks.ANVIL.asItem();
    }

    @Override
    public Packet<ClientPlayPacketListener> createSpawnPacket() {
        return new EntitySpawnS2CPacket(this);
    }

    @Override
    protected float getGravity() {
        return 0.015f;
    }



    @Override
    protected void onBlockHit(BlockHitResult blockHitResult) {
        if (!this.getWorld().isClient()) {
            if (!this.getWorld().getBlockState(getBlockPos().down()).isOf(Blocks.AIR)) {
                this.getWorld().setBlockState(getBlockPos(), Blocks.ANVIL.getDefaultState());
                this.discard();
            }
        }

        this.setVelocity(-this.getVelocity().getX() * 0.5, this.getVelocity().getY(), -this.getVelocity().getZ() * 0.5);
        super.onBlockHit(blockHitResult);
    }
}
