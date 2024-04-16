package com.endes.biblioteca;

import java.util.List;

/**
 * Representa a un autor de libros dentro de un sistema de gestión de biblioteca.
 * Contiene información personal del autor y una lista de libros que ha escrito.
 * 
 * @author Saul
 * @version 1.0
 */

public class Autor {
    private String name;
    private String biography;
    private List<Libro> librosEscritos;
	
    /**
     * Obtiene la lista de libros escritos por el autor
     * 
     * @return Una lista de objetos {@link Libro} que representa los libros escritos por el autor.
     */
    
    public List<Libro> getLibrosEscritos() {
    	return librosEscritos;
    }
    
    public Autor(String name, String biography) {
		this.name = name;
		this.biography = biography;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

    
    
}
