package Proyecto1;

import java.util.Iterator;

public class PruebaListaMultimedia {

		
	public static void main(String[] args) throws Exception {
		
			int contadorGenero = 0;
		Multimedia m = new Multimedia();
		ListaMultimedia lista = new ListaMultimedia();
		Disco d1 = new Disco("thriller", "michael jackson", "mp3", 3.5,"pop");
		Disco d2 = new Disco("like a prayer", "madona", "mp3", 2, "rock");
		Disco d3 = new Disco("when doves cry", "prince", "mp3", 2.5, "rock");
		
		Pelicula p1 = new Pelicula("interestellar", "cristopher nolan", "mp4", 3, "matthew mcconall", null);
		Pelicula p2 = new Pelicula("spiderman", "stan lee","wav", 2.8, null, "Michelle watson");
		Pelicula p3 = new Pelicula("iron man", "jon favreau", "mpg", 4, "robert downey jr", null);
		
		/*
		 * Annado las los discos y peliculas en la lista Multimedia
		 */
		lista.annadir(d1);
		lista.annadir(d2);
		lista.annadir(d3);
		lista.annadir(p1);
		lista.annadir(p2);
		lista.annadir(p3);
		
		System.out.println(lista);
		
		System.out.println("Duracion total: "+lista.duracionTotal());
		System.out.println("Numero de discos con el genero rock: "+lista.cuentaGenero("rock"));
		System.out.println("Numero de peliculas que no tienen actriz principal: "+lista.cuentaNoActrizPrincipal());
			  
			  
	}
}
