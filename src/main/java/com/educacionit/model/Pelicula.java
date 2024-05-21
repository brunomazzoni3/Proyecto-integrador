package com.educacionit.model;

import java.util.List;

public class Pelicula {
	private Integer codigo;
	private String titulo;
	private String url;
	private String imagen;
	private List <Genero> generos;
	public Pelicula() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public List<Genero> getGeneros() {
		return generos;
	}
	public void setGeneros(List<Genero> generos) {
		this.generos = generos;
	}
	@Override
	public String toString() {
		return "Pelicula [codigo=" + codigo + ", titulo=" + titulo + ", url=" + url + ", imagen=" + imagen
				+ ", generos=" + generos + "]";
	}
	
	
	
	
 }
