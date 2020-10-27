package io.github.overlordsiii.villagernames.util;

import net.minecraft.util.Formatting;

import java.util.Locale;

public enum FormattingDummy {
    BLACK(Formatting.BLACK),
    DARK_BLUE(Formatting.DARK_BLUE),
    DARK_GREEN(Formatting.DARK_GREEN),
    DARK_AQUA(Formatting.DARK_AQUA),
    DARK_RED(Formatting.DARK_RED),
    DARK_PURPLE(Formatting.DARK_PURPLE),
    GOLD(Formatting.GOLD),
    GRAY(Formatting.GRAY),
    DARK_GRAY(Formatting.DARK_GRAY),
    BLUE(Formatting.BLUE),
    GREEN(Formatting.GREEN),
    AQUA(Formatting.AQUA),
    RED(Formatting.RED),
    LIGHT_PURPLE(Formatting.LIGHT_PURPLE),
    YELLOW(Formatting.YELLOW),
    WHITE(Formatting.WHITE),
    OBFUSCATED(Formatting.OBFUSCATED),
    BOLD(Formatting.BOLD),
    STRIKETHROUGH(Formatting.STRIKETHROUGH),
    UNDERLINE(Formatting.UNDERLINE),
    ITALIC(Formatting.ITALIC),
    RESET(Formatting.RESET);

    private Formatting formatting;

    private FormattingDummy(Formatting formatting){
        this.formatting = formatting;
    }

    public String toString(){
        return formatting.getName().toUpperCase(Locale.ROOT);
    }

    public Formatting getFormatting(){
        return this.formatting;
    }

}
