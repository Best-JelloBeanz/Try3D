package com.jello.core;

import com.jello.test.Launcher;

public class RenderManager {

    private final WindowManagerwindow;

    public RenderManager() {
        window = Launcher.getWindow;
    }

    public void init() throws Exception {

    }

    public void render() {

    }

    public void clear() {
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
    }

    public void cleanup() {
        
    }

}