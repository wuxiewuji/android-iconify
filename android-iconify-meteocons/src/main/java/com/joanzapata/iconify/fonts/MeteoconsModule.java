package com.joanzapata.iconify.fonts;

import com.joanzapata.iconify.Icon;
import com.joanzapata.iconify.IconFontDescriptor;

public class MeteoconsModule implements IconFontDescriptor {

    @Override
    public String ttfFileName() {
        return "iconify/android-iconify-meteocons.ttf";
    }

    @Override
    public Icon[] characters() {
        return MeteoconsIcons.values();
    }
}
