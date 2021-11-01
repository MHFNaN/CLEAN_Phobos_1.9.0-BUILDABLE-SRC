package me.earth.phobos.features.modules.render;

import me.earth.phobos.features.modules.Module;

public class Zoom
extends Module {
    float cachedFov;

    public Zoom() {
        super("Zoom", "zoomss", Module.Category.RENDER, true, false, false);
        this.cachedFov = this.mc.gameSettings.fovSetting;
    }

    @Override
    public void onEnable() {
        if (this.mc.player != null) {
            this.mc.gameSettings.fovSetting = 15.0f;
        }
    }

    public void onDissable() {
        if (this.mc.player != null) {
            this.mc.gameSettings.fovSetting = this.cachedFov;
        }
    }
}
