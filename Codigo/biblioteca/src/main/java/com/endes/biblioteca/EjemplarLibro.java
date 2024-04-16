package com.endes.biblioteca;

import java.util.List;

public class EjemplarLibro extends Libro {

	private String barcode;
    private String tag;
	
    public EjemplarLibro(String isbn, String title, List<Autor> autores, String barcode, String tag) {
		super(isbn, title, autores);
		this.barcode = barcode;
		this.tag = tag;
	}
    
    
	
	

}
