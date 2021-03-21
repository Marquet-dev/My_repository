package Proyecto1;

public class Multimedia {
	private String titulo;
	private String autor;
	private String formato;
	private double duracion;
	
	public Multimedia() {
		this.titulo = new String("");
		this.autor = new String("");
		this.formato  = new String("");
		this.duracion = 0;
	}
	public Multimedia(String titulo, String autor, String formato, double duracion) {
		this.titulo = titulo;
		this.autor = autor;
		this.formato = formato;
		this.duracion = duracion;
	}
	public String dameTitulo() {
		return this.titulo;
	}
	public String dameAutor() {
		return this.autor;
	}
	public String dameFormato() {
		return this.formato;
	}
	public double dameDuracion() {
		return this.duracion;
	}
	@Override
	public String toString() {
		return " titulo= " + titulo + ", autor=" + autor + ", formato=" + formato + ", duracion=" + duracion
				+ "";
	}
	/*
	 * Metodo equals: nos devolverá verdadero en caso de que el titulo y el autor sean iguales a los del objeto recibido y false en caso contrario.
	 */
	public boolean equals(Multimedia m) {
		if (m.autor.equals(m.autor) && m.titulo.equals(m.titulo)) {
			return true;
		}
		else {
			return false;
		}
	}
}
