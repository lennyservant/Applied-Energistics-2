/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2021 TeamAppliedEnergistics
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package appeng.api.ids;

import java.util.Map;

import com.google.common.collect.ImmutableMap;

import net.minecraft.resources.ResourceLocation;

import appeng.api.util.AEColor;

/**
 * Contains {@link net.minecraft.world.item.Item} ids for various items defined by Ae2.
 */
@SuppressWarnings("unused")
public final class AEItemIds {
    public static final ResourceLocation NETWORK_TOOL = id("network_tool");
    public static final ResourceLocation VIEW_CELL = id("view_cell");
    public static final ResourceLocation MEMORY_CARD = id("memory_card");

    public static final ResourceLocation BLANK_PATTERN = id("blank_pattern");
    public static final ResourceLocation CRAFTING_PATTERN = id("crafting_pattern");
    public static final ResourceLocation PROCESSING_PATTERN = id("processing_pattern");
    public static final ResourceLocation SMITHING_TABLE_PATTERN = id("smithing_table_pattern");
    public static final ResourceLocation STONECUTTING_PATTERN = id("stonecutting_pattern");
    public static final ResourceLocation ENTROPY_MANIPULATOR = id("entropy_manipulator");
    public static final ResourceLocation MATTER_CANNON = id("matter_cannon");
    public static final ResourceLocation CHARGED_STAFF = id("charged_staff");
    public static final ResourceLocation COLOR_APPLICATOR = id("color_applicator");
    public static final ResourceLocation WIRELESS_TERMINAL = id("wireless_terminal");
    public static final ResourceLocation WIRELESS_CRAFTING_TERMINAL = id("wireless_crafting_terminal");
    public static final ResourceLocation WRAPPED_GENERIC_STACK = id("wrapped_generic_stack");
    public static final ResourceLocation FACADE = id("facade");

    ///
    /// STORAGE CELLS
    ///
    public static final ResourceLocation STORAGE_CELL_1K = id("storage_cell_1k");
    public static final ResourceLocation STORAGE_CELL_4K = id("storage_cell_4k");
    public static final ResourceLocation STORAGE_CELL_16K = id("storage_cell_16k");
    public static final ResourceLocation STORAGE_CELL_64K = id("storage_cell_64k");
    public static final ResourceLocation STORAGE_CELL_256K = id("storage_cell_256k");
    public static final ResourceLocation ITEM_CELL_1K = id("item_storage_cell_1k");
    public static final ResourceLocation ITEM_CELL_4K = id("item_storage_cell_4k");
    public static final ResourceLocation ITEM_CELL_16K = id("item_storage_cell_16k");
    public static final ResourceLocation ITEM_CELL_64K = id("item_storage_cell_64k");
    public static final ResourceLocation ITEM_CELL_256K = id("item_storage_cell_256k");
    public static final ResourceLocation FLUID_CELL_1K = id("fluid_storage_cell_1k");
    public static final ResourceLocation FLUID_CELL_4K = id("fluid_storage_cell_4k");
    public static final ResourceLocation FLUID_CELL_16K = id("fluid_storage_cell_16k");
    public static final ResourceLocation FLUID_CELL_64K = id("fluid_storage_cell_64k");
    public static final ResourceLocation FLUID_CELL_256K = id("fluid_storage_cell_256k");
    public static final ResourceLocation SPATIAL_CELL_2 = id("spatial_storage_cell_2");
    public static final ResourceLocation SPATIAL_CELL_16 = id("spatial_storage_cell_16");
    public static final ResourceLocation SPATIAL_CELL_128 = id("spatial_storage_cell_128");
    public static final ResourceLocation CREATIVE_CELL = id("creative_storage_cell");
    public static final ResourceLocation PORTABLE_ITEM_CELL1K = id("portable_item_cell_1k");
    public static final ResourceLocation PORTABLE_ITEM_CELL4K = id("portable_item_cell_4k");
    public static final ResourceLocation PORTABLE_ITEM_CELL16K = id("portable_item_cell_16k");
    public static final ResourceLocation PORTABLE_ITEM_CELL64K = id("portable_item_cell_64k");
    public static final ResourceLocation PORTABLE_ITEM_CELL256K = id("portable_item_cell_256k");
    public static final ResourceLocation PORTABLE_FLUID_CELL1K = id("portable_fluid_cell_1k");
    public static final ResourceLocation PORTABLE_FLUID_CELL4K = id("portable_fluid_cell_4k");
    public static final ResourceLocation PORTABLE_FLUID_CELL16K = id("portable_fluid_cell_16k");
    public static final ResourceLocation PORTABLE_FLUID_CELL64K = id("portable_fluid_cell_64k");
    public static final ResourceLocation PORTABLE_FLUID_CELL256K = id("portable_fluid_cell_256k");

    ///
    /// PAINT BALLS
    ///
    public static final ResourceLocation COLORED_LUMEN_PAINT_BALL_WHITE = id("white_lumen_paint_ball");
    public static final ResourceLocation COLORED_LUMEN_PAINT_BALL_ORANGE = id("orange_lumen_paint_ball");
    public static final ResourceLocation COLORED_LUMEN_PAINT_BALL_MAGENTA = id("magenta_lumen_paint_ball");
    public static final ResourceLocation COLORED_LUMEN_PAINT_BALL_LIGHT_BLUE = id("light_blue_lumen_paint_ball");
    public static final ResourceLocation COLORED_LUMEN_PAINT_BALL_YELLOW = id("yellow_lumen_paint_ball");
    public static final ResourceLocation COLORED_LUMEN_PAINT_BALL_LIME = id("lime_lumen_paint_ball");
    public static final ResourceLocation COLORED_LUMEN_PAINT_BALL_PINK = id("pink_lumen_paint_ball");
    public static final ResourceLocation COLORED_LUMEN_PAINT_BALL_GRAY = id("gray_lumen_paint_ball");
    public static final ResourceLocation COLORED_LUMEN_PAINT_BALL_LIGHT_GRAY = id("light_gray_lumen_paint_ball");
    public static final ResourceLocation COLORED_LUMEN_PAINT_BALL_CYAN = id("cyan_lumen_paint_ball");
    public static final ResourceLocation COLORED_LUMEN_PAINT_BALL_PURPLE = id("purple_lumen_paint_ball");
    public static final ResourceLocation COLORED_LUMEN_PAINT_BALL_BLUE = id("blue_lumen_paint_ball");
    public static final ResourceLocation COLORED_LUMEN_PAINT_BALL_BROWN = id("brown_lumen_paint_ball");
    public static final ResourceLocation COLORED_LUMEN_PAINT_BALL_GREEN = id("green_lumen_paint_ball");
    public static final ResourceLocation COLORED_LUMEN_PAINT_BALL_RED = id("red_lumen_paint_ball");
    public static final ResourceLocation COLORED_LUMEN_PAINT_BALL_BLACK = id("black_lumen_paint_ball");
    public static final Map<AEColor, ResourceLocation> COLORED_LUMEN_PAINT_BALL = ImmutableMap
            .<AEColor, ResourceLocation>builder().put(AEColor.WHITE, COLORED_LUMEN_PAINT_BALL_WHITE)
            .put(AEColor.ORANGE, COLORED_LUMEN_PAINT_BALL_ORANGE)
            .put(AEColor.MAGENTA, COLORED_LUMEN_PAINT_BALL_MAGENTA)
            .put(AEColor.LIGHT_BLUE, COLORED_LUMEN_PAINT_BALL_LIGHT_BLUE)
            .put(AEColor.YELLOW, COLORED_LUMEN_PAINT_BALL_YELLOW)
            .put(AEColor.LIME, COLORED_LUMEN_PAINT_BALL_LIME)
            .put(AEColor.PINK, COLORED_LUMEN_PAINT_BALL_PINK)
            .put(AEColor.GRAY, COLORED_LUMEN_PAINT_BALL_GRAY)
            .put(AEColor.LIGHT_GRAY, COLORED_LUMEN_PAINT_BALL_LIGHT_GRAY)
            .put(AEColor.CYAN, COLORED_LUMEN_PAINT_BALL_CYAN)
            .put(AEColor.PURPLE, COLORED_LUMEN_PAINT_BALL_PURPLE)
            .put(AEColor.BLUE, COLORED_LUMEN_PAINT_BALL_BLUE)
            .put(AEColor.BROWN, COLORED_LUMEN_PAINT_BALL_BROWN)
            .put(AEColor.GREEN, COLORED_LUMEN_PAINT_BALL_GREEN)
            .put(AEColor.RED, COLORED_LUMEN_PAINT_BALL_RED)
            .put(AEColor.BLACK, COLORED_LUMEN_PAINT_BALL_BLACK)
            .build();

    public static final ResourceLocation COLORED_PAINT_BALL_WHITE = id("white_paint_ball");
    public static final ResourceLocation COLORED_PAINT_BALL_ORANGE = id("orange_paint_ball");
    public static final ResourceLocation COLORED_PAINT_BALL_MAGENTA = id("magenta_paint_ball");
    public static final ResourceLocation COLORED_PAINT_BALL_LIGHT_BLUE = id("light_blue_paint_ball");
    public static final ResourceLocation COLORED_PAINT_BALL_YELLOW = id("yellow_paint_ball");
    public static final ResourceLocation COLORED_PAINT_BALL_LIME = id("lime_paint_ball");
    public static final ResourceLocation COLORED_PAINT_BALL_PINK = id("pink_paint_ball");
    public static final ResourceLocation COLORED_PAINT_BALL_GRAY = id("gray_paint_ball");
    public static final ResourceLocation COLORED_PAINT_BALL_LIGHT_GRAY = id("light_gray_paint_ball");
    public static final ResourceLocation COLORED_PAINT_BALL_CYAN = id("cyan_paint_ball");
    public static final ResourceLocation COLORED_PAINT_BALL_PURPLE = id("purple_paint_ball");
    public static final ResourceLocation COLORED_PAINT_BALL_BLUE = id("blue_paint_ball");
    public static final ResourceLocation COLORED_PAINT_BALL_BROWN = id("brown_paint_ball");
    public static final ResourceLocation COLORED_PAINT_BALL_GREEN = id("green_paint_ball");
    public static final ResourceLocation COLORED_PAINT_BALL_RED = id("red_paint_ball");
    public static final ResourceLocation COLORED_PAINT_BALL_BLACK = id("black_paint_ball");
    public static final Map<AEColor, ResourceLocation> COLORED_PAINT_BALL = ImmutableMap
            .<AEColor, ResourceLocation>builder().put(AEColor.WHITE, COLORED_PAINT_BALL_WHITE)
            .put(AEColor.ORANGE, COLORED_PAINT_BALL_ORANGE)
            .put(AEColor.MAGENTA, COLORED_PAINT_BALL_MAGENTA)
            .put(AEColor.LIGHT_BLUE, COLORED_PAINT_BALL_LIGHT_BLUE)
            .put(AEColor.YELLOW, COLORED_PAINT_BALL_YELLOW)
            .put(AEColor.LIME, COLORED_PAINT_BALL_LIME)
            .put(AEColor.PINK, COLORED_PAINT_BALL_PINK)
            .put(AEColor.GRAY, COLORED_PAINT_BALL_GRAY)
            .put(AEColor.LIGHT_GRAY, COLORED_PAINT_BALL_LIGHT_GRAY)
            .put(AEColor.CYAN, COLORED_PAINT_BALL_CYAN)
            .put(AEColor.PURPLE, COLORED_PAINT_BALL_PURPLE)
            .put(AEColor.BLUE, COLORED_PAINT_BALL_BLUE)
            .put(AEColor.BROWN, COLORED_PAINT_BALL_BROWN)
            .put(AEColor.GREEN, COLORED_PAINT_BALL_GREEN)
            .put(AEColor.RED, COLORED_PAINT_BALL_RED)
            .put(AEColor.BLACK, COLORED_PAINT_BALL_BLACK)
            .build();

    ///
    /// TOOLS
    ///
    public static final ResourceLocation CERTUS_QUARTZ_AXE = id("certus_quartz_axe");
    public static final ResourceLocation CERTUS_QUARTZ_HOE = id("certus_quartz_hoe");
    public static final ResourceLocation CERTUS_QUARTZ_SHOVEL = id("certus_quartz_shovel");
    public static final ResourceLocation CERTUS_QUARTZ_PICK = id("certus_quartz_pickaxe");
    public static final ResourceLocation CERTUS_QUARTZ_SWORD = id("certus_quartz_sword");
    public static final ResourceLocation CERTUS_QUARTZ_WRENCH = id("certus_quartz_wrench");
    public static final ResourceLocation CERTUS_QUARTZ_KNIFE = id("certus_quartz_cutting_knife");

    public static final ResourceLocation NETHER_QUARTZ_AXE = id("nether_quartz_axe");
    public static final ResourceLocation NETHER_QUARTZ_HOE = id("nether_quartz_hoe");
    public static final ResourceLocation NETHER_QUARTZ_SHOVEL = id("nether_quartz_shovel");
    public static final ResourceLocation NETHER_QUARTZ_PICK = id("nether_quartz_pickaxe");
    public static final ResourceLocation NETHER_QUARTZ_SWORD = id("nether_quartz_sword");
    public static final ResourceLocation NETHER_QUARTZ_WRENCH = id("nether_quartz_wrench");
    public static final ResourceLocation NETHER_QUARTZ_KNIFE = id("nether_quartz_cutting_knife");

    public static final ResourceLocation FLUIX_UPGRADE_SMITHING_TEMPLATE = id("fluix_upgrade_smithing_template");
    public static final ResourceLocation FLUIX_AXE = id("fluix_axe");
    public static final ResourceLocation FLUIX_HOE = id("fluix_hoe");
    public static final ResourceLocation FLUIX_SHOVEL = id("fluix_shovel");
    public static final ResourceLocation FLUIX_PICK = id("fluix_pickaxe");
    public static final ResourceLocation FLUIX_SWORD = id("fluix_sword");

    public static final ResourceLocation METEORITE_COMPASS = id("meteorite_compass");

    ///
    /// The following items were previously part of ApiItems
    ///
    public static final ResourceLocation CERTUS_QUARTZ_CRYSTAL = id("certus_quartz_crystal");
    public static final ResourceLocation CERTUS_QUARTZ_CRYSTAL_CHARGED = id("charged_certus_quartz_crystal");
    public static final ResourceLocation CERTUS_QUARTZ_DUST = id("certus_quartz_dust");
    public static final ResourceLocation SILICON = id("silicon");
    public static final ResourceLocation MATTER_BALL = id("matter_ball");
    public static final ResourceLocation FLUIX_CRYSTAL = id("fluix_crystal");
    public static final ResourceLocation FLUIX_DUST = id("fluix_dust");
    public static final ResourceLocation FLUIX_PEARL = id("fluix_pearl");
    public static final ResourceLocation PURIFIED_CERTUS_QUARTZ_CRYSTAL = id("purified_certus_quartz_crystal");
    public static final ResourceLocation PURIFIED_NETHER_QUARTZ_CRYSTAL = id("purified_nether_quartz_crystal");
    public static final ResourceLocation PURIFIED_FLUIX_CRYSTAL = id("purified_fluix_crystal");
    public static final ResourceLocation CALCULATION_PROCESSOR_PRESS = id("calculation_processor_press");
    public static final ResourceLocation ENGINEERING_PROCESSOR_PRESS = id("engineering_processor_press");
    public static final ResourceLocation LOGIC_PROCESSOR_PRESS = id("logic_processor_press");
    public static final ResourceLocation CALCULATION_PROCESSOR_PRINT = id("printed_calculation_processor");
    public static final ResourceLocation ENGINEERING_PROCESSOR_PRINT = id("printed_engineering_processor");
    public static final ResourceLocation LOGIC_PROCESSOR_PRINT = id("printed_logic_processor");
    public static final ResourceLocation SILICON_PRESS = id("silicon_press");
    public static final ResourceLocation SILICON_PRINT = id("printed_silicon");
    public static final ResourceLocation NAME_PRESS = id("name_press");
    public static final ResourceLocation LOGIC_PROCESSOR = id("logic_processor");
    public static final ResourceLocation CALCULATION_PROCESSOR = id("calculation_processor");
    public static final ResourceLocation ENGINEERING_PROCESSOR = id("engineering_processor");
    public static final ResourceLocation BASIC_CARD = id("basic_card");
    public static final ResourceLocation REDSTONE_CARD = id("redstone_card");
    public static final ResourceLocation CAPACITY_CARD = id("capacity_card");
    public static final ResourceLocation VOID_CARD = id("void_card");
    public static final ResourceLocation ADVANCED_CARD = id("advanced_card");
    public static final ResourceLocation FUZZY_CARD = id("fuzzy_card");
    public static final ResourceLocation SPEED_CARD = id("speed_card");
    public static final ResourceLocation INVERTER_CARD = id("inverter_card");
    public static final ResourceLocation CRAFTING_CARD = id("crafting_card");
    public static final ResourceLocation ENERGY_CARD = id("energy_card");
    public static final ResourceLocation EQUAL_DISTRIBUTION_CARD = id("equal_distribution_card");
    public static final ResourceLocation SPATIAL_2_CELL_COMPONENT = id("spatial_cell_component_2");
    public static final ResourceLocation SPATIAL_16_CELL_COMPONENT = id("spatial_cell_component_16");
    public static final ResourceLocation SPATIAL_128_CELL_COMPONENT = id("spatial_cell_component_128");
    public static final ResourceLocation CELL_COMPONENT_1K = id("cell_component_1k");
    public static final ResourceLocation CELL_COMPONENT_4K = id("cell_component_4k");
    public static final ResourceLocation CELL_COMPONENT_16K = id("cell_component_16k");
    public static final ResourceLocation CELL_COMPONENT_64K = id("cell_component_64k");
    public static final ResourceLocation CELL_COMPONENT_256K = id("cell_component_256k");
    public static final ResourceLocation ITEM_CELL_HOUSING = id("item_cell_housing");
    public static final ResourceLocation FLUID_CELL_HOUSING = id("fluid_cell_housing");
    public static final ResourceLocation WIRELESS_RECEIVER = id("wireless_receiver");
    public static final ResourceLocation WIRELESS_BOOSTER = id("wireless_booster");
    public static final ResourceLocation FORMATION_CORE = id("formation_core");
    public static final ResourceLocation ANNIHILATION_CORE = id("annihilation_core");
    public static final ResourceLocation SKY_DUST = id("sky_dust");
    public static final ResourceLocation GUIDE = id("guide");
    public static final ResourceLocation ENDER_DUST = id("ender_dust");
    public static final ResourceLocation SINGULARITY = id("singularity");
    public static final ResourceLocation QUANTUM_ENTANGLED_SINGULARITY = id("quantum_entangled_singularity");

    private static ResourceLocation id(String id) {
        return new ResourceLocation(AEConstants.MOD_ID, id);
    }
}
