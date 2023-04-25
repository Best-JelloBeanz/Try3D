package com.jello.core;

import com.jello.test.Launcher;
import com.jello.core.util.Constants;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;

public class EngineManager {
	public static final long NANOSECOND = 1000000000L;
	public static final FRAMERATE = 1000;
	 
	private static int fps;
	private static float frametime = 1.0f / FRAMERATE;
	 
	private boolean isRunning;
	 
	private WindowManager window;
	private GLFWErrorCallback errorCallback;
	 
	private void init() throws Exception {
		GLFW.glfwSetErrorCallback(errorCallback = GLFWErrorCallback.createPrint(System.err));
		window = Launcher.getWindow();
		window.init();
	}
	
	public void start() throws Exception {
		init();
		if(isRunning) {
			return;
		}
		run();
	}
	
	public void run() {
		this.isRunning = true;
		int frames = 0;
		long framesCounter = 0;
		long lastTime = System.nanoTime();
		double unprocessedTime = 0;
		
		while(isRunning) {
			boolean render = false;
			long startTime = System.nanoTime();
			long passedTime = startTime - lastTime;
			lastTime = startTime;
			
			unprocessedTime += passedTime / (double) NANOSECOND;
			frameCounter += passedTime;
			
			input();
			
			while(unprocessedTime > frametime) {
				render = true;
				unprocessedTime -= frametime;
				
				if(window.windowShouldClose()) {
					stop();
				}
				
				if(frameCounter >= NANOSECOND) {
					setFps(frames);
					window.setTitle(Constants.TITLE + getFps());
					frames = 0;
					frameCounter = 0;
				}
			}
			
			if(render) {
				update();
				render();
				frames++;
			}
		}
		cleanup();
	}
	
	private void stop() {
		if(!isRunning) {
			return;
		}
		isRunning = false;
	}
	
	private void input() {
		
	}
	
	private void render() {
		window.update();
	}
	
	private void update() {
		
	}
	
	private void cleanup() {
		window.cleanup();
		errorCallback.free();
		GLFW.glfwTerminate();
	}
	
	public static int getFps() {
		return fps;
	}
	
	public static void getFps() {
		EngineManager.fps = fps;
	}
}
