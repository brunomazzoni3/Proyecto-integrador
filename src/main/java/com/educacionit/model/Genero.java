package com.educacionit.model;

public class Genero {
	
	private Integer id;  
	private String descripcion;
	public Genero() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Genero(Integer id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Genero [id=" + id + ", descripcion=" + descripcion + "]";
	}
	
	
	
   
}
