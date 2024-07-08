package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import com.esmods.keepersofthestonestwo.network.PowerModVariables;
import com.esmods.keepersofthestonestwo.PowerMod;

public class ElementalPowerGeneratorSaveElementalPowerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(PowerModVariables.PLAYER_VARIABLES).battery == false) {
			if (entity.isShiftKeyDown()) {
				if (!(entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("0")) {
					PowerMod.queueServerWork(1, () -> {
						if (!world.isClientSide()) {
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putString("powerRecorded", entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
					});
					{
						int _value = 1;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else {
					PowerMod.queueServerWork(1, () -> {
						if (!world.isClientSide()) {
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putString("powerRecorded", "0");
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
					});
					{
						int _value = 0;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				}
			} else {
				if (!(new Object() {
					public String getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getString(tag);
						return "";
					}
				}.getValue(world, BlockPos.containing(x, y, z), "powerRecorded")).equals("0")) {
					if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals("0")) {
						if (!(entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_second).equals(new Object() {
							public String getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getString(tag);
								return "";
							}
						}.getValue(world, BlockPos.containing(x, y, z), "powerRecorded")) && !(entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_third).equals(new Object() {
							public String getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getString(tag);
								return "";
							}
						}.getValue(world, BlockPos.containing(x, y, z), "powerRecorded"))) {
							if (entity.getData(PowerModVariables.PLAYER_VARIABLES).active == false && entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first_timer == 0) {
								{
									PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
									_vars.fake_element_name_first = new Object() {
										public String getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getString(tag);
											return "";
										}
									}.getValue(world, BlockPos.containing(x, y, z), "powerRecorded");
									_vars.syncPlayerVariables(entity);
								}
								{
									PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
									_vars.fake_element_name_first_timer = 3000;
									_vars.syncPlayerVariables(entity);
								}
								{
									PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
									_vars.power_recorded = true;
									_vars.syncPlayerVariables(entity);
								}
								{
									PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
									_vars.power = 100;
									_vars.syncPlayerVariables(entity);
								}
							}
						}
					} else if (!(entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals("0") && (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_second).equals("0")) {
						if (!(entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals(new Object() {
							public String getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getString(tag);
								return "";
							}
						}.getValue(world, BlockPos.containing(x, y, z), "powerRecorded")) && !(entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_third).equals(new Object() {
							public String getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getString(tag);
								return "";
							}
						}.getValue(world, BlockPos.containing(x, y, z), "powerRecorded"))) {
							if (entity.getData(PowerModVariables.PLAYER_VARIABLES).active == false && entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_second_timer == 0) {
								{
									PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
									_vars.fake_element_name_second = new Object() {
										public String getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getString(tag);
											return "";
										}
									}.getValue(world, BlockPos.containing(x, y, z), "powerRecorded");
									_vars.syncPlayerVariables(entity);
								}
								{
									PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
									_vars.fake_element_name_second_timer = 3000;
									_vars.syncPlayerVariables(entity);
								}
								{
									PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
									_vars.power_recorded = true;
									_vars.syncPlayerVariables(entity);
								}
								{
									PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
									_vars.power = 100;
									_vars.syncPlayerVariables(entity);
								}
							}
						}
					} else if (!(entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals("0") && !(entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_second).equals("0")
							&& (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_third).equals("0")) {
						if (!(entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals(new Object() {
							public String getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getString(tag);
								return "";
							}
						}.getValue(world, BlockPos.containing(x, y, z), "powerRecorded")) && !(entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_second).equals(new Object() {
							public String getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getString(tag);
								return "";
							}
						}.getValue(world, BlockPos.containing(x, y, z), "powerRecorded"))) {
							if (entity.getData(PowerModVariables.PLAYER_VARIABLES).active == false && entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_third_timer == 0) {
								{
									PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
									_vars.fake_element_name_third = new Object() {
										public String getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getString(tag);
											return "";
										}
									}.getValue(world, BlockPos.containing(x, y, z), "powerRecorded");
									_vars.syncPlayerVariables(entity);
								}
								{
									PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
									_vars.fake_element_name_third_timer = 3000;
									_vars.syncPlayerVariables(entity);
								}
								{
									PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
									_vars.power_recorded = true;
									_vars.syncPlayerVariables(entity);
								}
								{
									PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
									_vars.power = 100;
									_vars.syncPlayerVariables(entity);
								}
							}
						}
					}
				}
			}
		}
	}
}
