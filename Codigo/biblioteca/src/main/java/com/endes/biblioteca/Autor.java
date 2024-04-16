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
    
    /**
     * Obtiene los atributos de Autor
     * 
     * @return Un constructor {@link Libro} que representa los datos del autor.
     */
    
    public Autor(String name, String biography) {
		this.name = name;
		this.biography = biography;
	}
    
    /**
     * Establece la lista de libros escritos por el autor.
     * 
     * @param librosEscritos Una lista de objetos {@link Libro} que representa los libros escritos por el autor.
     */
    
    public void setLibrosEscritos(List<Libro> librosEscritosLibros) {
    	this.librosEscritos = librosEscritos;
    }
    
    /**
     * Obtiene el nombre del autor.
     * 
     * @return El nombre del autor.
     */
    
    public String getName() {
		return name;
	}
    
    /**
     * Establece el nombre del autor.
     * 
     * @param name El nombre que representa al autor.
     */
    
    public void setName(String name) {
		this.name = name;
	}
    
    /**
     * Obtiene la biografía del autor.
     * 
     * @return La biografía del autor.
     */

	public String getBiography() {
		return biography;
	}
	
	/**
     * Establece la biografía del autor.
     * 
     * @param biography La biografía que representa al autor.
     */

	public void setBiography(String biography) {
		this.biography = biography;
	}

    
    
}
