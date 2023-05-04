package com.jello.core;

import com.jello.core.entity.Model;

import java.util.ArrayList;
import java.util.List;

public class ObjectLoader {
  
  private List<integer> vaos = new ArrayList<>();
  private List<integer> vbos = new ArrayList<>();
  
  public Model loadModel(float[] vertices) {
    
  }
	
	private int createVAO() {
		
	}
	
	private void storeDataInAttribList(int attribNo, int vertexCount, float[] data) {
		
	}
	
	private void unbind() {
		
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
