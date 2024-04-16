package com.endes.biblioteca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class AutorTest{
	private Autor autor;
	private List<Libro> libros;

	@BeforeEach
	public void setUp() {
		autor = new Autor("Gabriel García Márquez", "Escritor colombiano, premio Nobel de Literatura en 1982.");
		
		libros = new ArrayList<>();
		libros.add(new EjemplarLibro("Cien años de soledad", null, null, null, null));
		libros.add(new EjemplarLibro("El amor en los tiempos del cólera", null, null, null, null)); 
		autor.setLibrosEscritos(libros);
	}
	@Test
	@DisplayName("Obtener nombre del autor")
	public void testGetNombre() {
		assertEquals("Gabriel García Márquez", autor.getName());
	}

	@Test
	@DisplayName("Obtener biografía del autor")
	public void testGetBiografia () {
		assertEquals("Escritor colombiano, premio Nobel de Literatura en 1982.", autor.getBiography());
	}

	@Test
	@DisplayName("Obtener libros escritos por el autor")
	public void testGetLibrosEscritos() {
		assertNotNull(autor.getLibrosEscritos());
		assertEquals(2, autor.getLibrosEscritos ().size());
		assertEquals("Cien años de soledad", autor.getLibrosEscritos ().get(0).getTitle());
		assertEquals("El amor en los tiempos del cólera", autor.getLibrosEscritos().get(1).getTitle());
	}

	@Test
	@DisplayName("Establecer nombre del autor")
	public void testSetNombre() {	
		
	}
}
