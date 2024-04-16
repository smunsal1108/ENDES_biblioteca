package com.endes.biblioteca;

import java.sql.Date;
import java.util.List;

public abstract class Libro {
    private String isbn;
    private String title;
	private String resumen;
	private String editorial;
	private Date fechaPublicacion;
    
    
    private List<Autor> autores;
	
    public Libro(String isbn, String title, List<Autor> autores) {
		this.isbn = isbn;
		this.title = title;
		this.autores = autores;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}

    
    
}
