package com.jello.core;

import com.jello.core.entity.Model;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL30;

import java.util.ArrayList;
import java.util.List;

public class ObjectLoader {
  
  private List<Integer> vaos = new ArrayList<>();
  private List<Integer> vbos = new ArrayList<>();
  
  public Model loadModel(float[] vertices) {
    
  }
	
  private int createVAO() {

  }

  private void storeDataInAttribList(int attribNo, int vertexCount, float[] data) {
	int vbo = GL15.glGenBuffers();
	vbos.add(vbo);
	GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, vbo);

  }

  private void unbind() {
  	GL30.glBindVertexArray(0);
  }

  public void cleanup() {
	for(int vao : vaos) {
		GL30.glDeleteVertexArrays(vao);
	}
	for(int vbo : vbos) {
		GL30.glDeleteVertexArrays(vbo);
	}
  }
	
}
