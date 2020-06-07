
package io.alaska.nsfw.world.biome;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.BiomeManager;

import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.init.Blocks;
import net.minecraft.entity.passive.EntityZombieHorse;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntitySkeletonHorse;
import net.minecraft.entity.passive.EntityShoulderRiding;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityParrot;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityMule;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.passive.EntityLlama;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityDonkey;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityAmbientCreature;
import net.minecraft.entity.monster.EntityZombieVillager;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.EntityWitherSkeleton;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityVindicator;
import net.minecraft.entity.monster.EntityVex;
import net.minecraft.entity.monster.EntityStray;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntitySpellcasterIllager;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntityShulker;
import net.minecraft.entity.monster.EntityPolarBear;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityIllusionIllager;
import net.minecraft.entity.monster.EntityHusk;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.entity.monster.EntityGolem;
import net.minecraft.entity.monster.EntityGiantZombie;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityEvoker;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityElderGuardian;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;

import java.util.Random;

import io.alaska.nsfw.block.BlockVulgariumGrassBlock;
import io.alaska.nsfw.ElementsNSFW;

@ElementsNSFW.ModElement.Tag
public class BiomeVulgariumBiome0 extends ElementsNSFW.ModElement {
	@GameRegistry.ObjectHolder("nsfw:vulgariumbiome0")
	public static final BiomeGenCustom biome = null;
	public BiomeVulgariumBiome0(ElementsNSFW instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new BiomeGenCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		BiomeManager.addSpawnBiome(biome);
		BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(biome, 10));
	}
	static class BiomeGenCustom extends Biome {
		public BiomeGenCustom() {
			super(new Biome.BiomeProperties("Vulgarium Biome0").setRainfall(0.5F).setBaseHeight(0.1F).setWaterColor(-65332).setHeightVariation(0.2F)
					.setTemperature(0.5F));
			setRegistryName("vulgariumbiome0");
			topBlock = BlockVulgariumGrassBlock.block.getDefaultState();
			fillerBlock = Blocks.STONE.getStateFromMeta(0);
			decorator.generateFalls = true;
			decorator.treesPerChunk = 3;
			decorator.flowersPerChunk = 4;
			decorator.grassPerChunk = 4;
			decorator.deadBushPerChunk = 0;
			decorator.mushroomsPerChunk = 0;
			decorator.bigMushroomsPerChunk = 0;
			decorator.reedsPerChunk = 0;
			decorator.cactiPerChunk = 0;
			decorator.sandPatchesPerChunk = 0;
			decorator.gravelPatchesPerChunk = 0;
			this.spawnableMonsterList.clear();
			this.spawnableCreatureList.clear();
			this.spawnableWaterCreatureList.clear();
			this.spawnableCaveCreatureList.clear();
			this.spawnableCreatureList.add(new SpawnListEntry(EntityAgeable.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityAmbientCreature.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityAnimal.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityBat.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityBlaze.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityZombie.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityCaveSpider.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityChicken.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityZombie.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityCow.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityCreature.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityCreeper.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityDonkey.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityZombie.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityZombie.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityDragon.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityElderGuardian.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityEnderman.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityEndermite.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityEvoker.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityZombie.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityGhast.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityGiantZombie.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityGolem.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityGuardian.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityHorse.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityHusk.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityIllusionIllager.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityIronGolem.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityLiving.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityLlama.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityMagmaCube.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityMob.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityMooshroom.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityMule.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityOcelot.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityZombie.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityParrot.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityPig.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityZombie.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityZombie.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityPigZombie.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityPolarBear.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityRabbit.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityZombie.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntitySheep.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityShoulderRiding.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityShulker.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntitySilverfish.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntitySkeleton.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntitySkeletonHorse.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntitySlime.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntitySnowman.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntitySpellcasterIllager.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntitySpider.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntitySquid.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityStray.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityZombie.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityTameable.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityZombie.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityZombie.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityZombie.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityVex.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityVillager.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityVindicator.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityWaterMob.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityZombie.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityWitch.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityWither.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityWitherSkeleton.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityWolf.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityZombie.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityZombieHorse.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityZombieVillager.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityZombie.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityZombie.class, 40, 1, 5));
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int getGrassColorAtPos(BlockPos pos) {
			return -65281;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int getFoliageColorAtPos(BlockPos pos) {
			return -65281;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int getSkyColorByTemp(float currentTemperature) {
			return -39169;
		}

		@Override
		public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
			return new CustomTree();
		}
	}

	static class CustomTree extends WorldGenAbstractTree {
		CustomTree() {
			super(false);
		}

		@Override
		public boolean generate(World world, Random rand, BlockPos position) {
			int height = rand.nextInt(5) + 14;
			boolean spawnTree = true;
			if (position.getY() >= 1 && position.getY() + height + 1 <= world.getHeight()) {
				for (int j = position.getY(); j <= position.getY() + 1 + height; j++) {
					int k = 1;
					if (j == position.getY())
						k = 0;
					if (j >= position.getY() + height - 1)
						k = 2;
					for (int px = position.getX() - k; px <= position.getX() + k && spawnTree; px++) {
						for (int pz = position.getZ() - k; pz <= position.getZ() + k && spawnTree; pz++) {
							if (j >= 0 && j < world.getHeight()) {
								if (!this.isReplaceable(world, new BlockPos(px, j, pz))) {
									spawnTree = false;
								}
							} else {
								spawnTree = false;
							}
						}
					}
				}
				if (!spawnTree) {
					return false;
				} else {
					Block ground = world.getBlockState(position.add(0, -1, 0)).getBlock();
					Block ground2 = world.getBlockState(position.add(0, -2, 0)).getBlock();
					if (!((ground == BlockVulgariumGrassBlock.block.getDefaultState().getBlock()
							|| ground == Blocks.STONE.getStateFromMeta(0).getBlock())
							&& (ground2 == BlockVulgariumGrassBlock.block.getDefaultState().getBlock()
									|| ground2 == Blocks.STONE.getStateFromMeta(0).getBlock())))
						return false;
					IBlockState state = world.getBlockState(position.down());
					if (position.getY() < world.getHeight() - height - 1) {
						world.setBlockState(position.down(), Blocks.STONE.getStateFromMeta(0), 2);
						for (int genh = position.getY() - 3 + height; genh <= position.getY() + height; genh++) {
							int i4 = genh - (position.getY() + height);
							int j1 = (int) (1 - i4 * 0.5);
							for (int k1 = position.getX() - j1; k1 <= position.getX() + j1; ++k1) {
								for (int i2 = position.getZ() - j1; i2 <= position.getZ() + j1; ++i2) {
									int j2 = i2 - position.getZ();
									if (Math.abs(position.getX()) != j1 || Math.abs(j2) != j1 || rand.nextInt(2) != 0 && i4 != 0) {
										BlockPos blockpos = new BlockPos(k1, genh, i2);
										state = world.getBlockState(blockpos);
										if (state.getBlock().isAir(state, world, blockpos) || state.getBlock().isLeaves(state, world, blockpos)
												|| state.getBlock() == Blocks.VINE.getDefaultState().getBlock()
												|| state.getBlock() == Blocks.LEAVES.getStateFromMeta(0).getBlock()) {
											this.setBlockAndNotifyAdequately(world, blockpos, Blocks.LEAVES.getStateFromMeta(0));
										}
									}
								}
							}
						}
						for (int genh = 0; genh < height; genh++) {
							BlockPos genhPos = position.up(genh);
							state = world.getBlockState(genhPos);
							if (state.getBlock().isAir(state, world, genhPos) || state.getBlock() == Blocks.VINE.getDefaultState().getBlock()
									|| state.getBlock() == Blocks.LEAVES.getStateFromMeta(0).getBlock()) {
								this.setBlockAndNotifyAdequately(world, position.up(genh), Blocks.LOG.getStateFromMeta(0));
								if (genh > 0) {
									if (rand.nextInt(3) > 0 && world.isAirBlock(position.add(-1, genh, 0)))
										this.setBlockAndNotifyAdequately(world, position.add(-1, genh, 0), Blocks.VINE.getDefaultState());
									if (rand.nextInt(3) > 0 && world.isAirBlock(position.add(1, genh, 0)))
										this.setBlockAndNotifyAdequately(world, position.add(1, genh, 0), Blocks.VINE.getDefaultState());
									if (rand.nextInt(3) > 0 && world.isAirBlock(position.add(0, genh, -1)))
										this.setBlockAndNotifyAdequately(world, position.add(0, genh, -1), Blocks.VINE.getDefaultState());
									if (rand.nextInt(3) > 0 && world.isAirBlock(position.add(0, genh, 1)))
										this.setBlockAndNotifyAdequately(world, position.add(0, genh, 1), Blocks.VINE.getDefaultState());
								}
							}
						}
						for (int genh = position.getY() - 3 + height; genh <= position.getY() + height; genh++) {
							int k4 = (int) (1 - (genh - (position.getY() + height)) * 0.5);
							for (int genx = position.getX() - k4; genx <= position.getX() + k4; genx++) {
								for (int genz = position.getZ() - k4; genz <= position.getZ() + k4; genz++) {
									BlockPos bpos = new BlockPos(genx, genh, genz);
									state = world.getBlockState(bpos);
									if (state.getBlock().isLeaves(state, world, bpos)
											|| state.getBlock() == Blocks.LEAVES.getStateFromMeta(0).getBlock()) {
										BlockPos blockpos1 = bpos.south();
										BlockPos blockpos2 = bpos.west();
										BlockPos blockpos3 = bpos.east();
										BlockPos blockpos4 = bpos.north();
										if (rand.nextInt(4) == 0 && world.isAirBlock(blockpos2))
											this.addVines(world, blockpos2);
										if (rand.nextInt(4) == 0 && world.isAirBlock(blockpos3))
											this.addVines(world, blockpos3);
										if (rand.nextInt(4) == 0 && world.isAirBlock(blockpos4))
											this.addVines(world, blockpos4);
										if (rand.nextInt(4) == 0 && world.isAirBlock(blockpos1))
											this.addVines(world, blockpos1);
									}
								}
							}
						}
						if (rand.nextInt(4) == 0 && height > 5) {
							for (int hlevel = 0; hlevel < 2; hlevel++) {
								for (EnumFacing enumfacing : EnumFacing.Plane.HORIZONTAL) {
									if (rand.nextInt(4 - hlevel) == 0) {
										EnumFacing enumfacing1 = enumfacing.getOpposite();
										this.setBlockAndNotifyAdequately(world,
												position.add(enumfacing1.getFrontOffsetX(), height - 5 + hlevel, enumfacing1.getFrontOffsetZ()),
												Blocks.AIR.getDefaultState());
									}
								}
							}
						}
						return true;
					} else {
						return false;
					}
				}
			} else {
				return false;
			}
		}

		private void addVines(World world, BlockPos pos) {
			this.setBlockAndNotifyAdequately(world, pos, Blocks.VINE.getDefaultState());
			int i = 5;
			for (BlockPos blockpos = pos.down(); world.isAirBlock(blockpos) && i > 0; --i) {
				this.setBlockAndNotifyAdequately(world, blockpos, Blocks.VINE.getDefaultState());
				blockpos = blockpos.down();
			}
		}

		@Override
		protected boolean canGrowInto(Block blockType) {
			return blockType.getDefaultState().getMaterial() == Material.AIR || blockType == Blocks.LOG.getStateFromMeta(0).getBlock()
					|| blockType == Blocks.LEAVES.getStateFromMeta(0).getBlock()
					|| blockType == BlockVulgariumGrassBlock.block.getDefaultState().getBlock()
					|| blockType == Blocks.STONE.getStateFromMeta(0).getBlock();
		}

		@Override
		protected void setDirtAt(World world, BlockPos pos) {
			if (world.getBlockState(pos).getBlock() != Blocks.STONE.getStateFromMeta(0).getBlock())
				this.setBlockAndNotifyAdequately(world, pos, Blocks.STONE.getStateFromMeta(0));
		}

		@Override
		public boolean isReplaceable(World world, BlockPos pos) {
			net.minecraft.block.state.IBlockState state = world.getBlockState(pos);
			return state.getBlock().isAir(state, world, pos) || canGrowInto(state.getBlock()) || state.getBlock().isReplaceable(world, pos);
		}
	}
}
