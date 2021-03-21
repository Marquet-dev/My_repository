package Proyecto2;

import Proyecto3.DiscoPrestable;

public class EscritoMain {

	
	public static int cuentaPrestados(Escrito []lista) {
		int contador = 0;
		for(int i=0; i<lista.length; i++) {
			if(lista[i] instanceof Libro ) {
			Libro l = (Libro) lista[i];
				if(l.prestado()) {
				contador++;
				}
			}
		}
		return contador;
	}
	public static int cuentaPrestados(DiscoPrestable []lista1) {
		int contador = 0;
		for(int i=0; i<lista1.length; i++) {
			if(lista1[i] instanceof DiscoPrestable ) {
			DiscoPrestable d = (DiscoPrestable) lista1[i];
				if(d.prestado()) {
				contador++;
				}
			}
		}
		return contador;
	}
	public static int publicacionesAnterioresA(Escrito []publicaciones, int anno) {
		int contador_fecha = 0;
		for (int i=0; i<publicaciones.length; i++) {
			if(publicaciones[i].dameAnnoPublicacion() < anno) {
				contador_fecha++;
			}
		}
		return contador_fecha;
	}
	public static void main(String[] args) {
		
		Libro l1 = new Libro(3,"titulo1",2006);
		Libro l2 = new Libro(7, "titulo2",1975);
		Revista r1 = new Revista(6, "titulo3", 1960, 05);
		Revista r2 = new Revista(8, "titulo4", 1950, 02);		
		Escrito lista[] = {l1, l2 , r1, r2};
		Escrito publicaciones[] = {l1, l2, r1, r2};
		l1.prestar();
		
		for(int i=0; i<lista.length; i++) {
			System.out.println(lista[i]);
		}
		System.out.println("Numero de libros prestados: "+cuentaPrestados(lista));
		System.out.println("Numero de libros publicados antes de la fecha dada: "+publicacionesAnterioresA(publicaciones, 1980));
	}
}
