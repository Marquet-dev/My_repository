package Proyecto1;

public class Disco extends Multimedia{
	private String genero;
	
	public Disco(String titulo, String autor, String formato, double duracion, String genero) {
		super(titulo, autor, formato, duracion);
		this.genero = genero;
	}
	public String dameGenero() {
		return this.genero;
	}
	@Override
	public String toString() {
		return "Disco genero=" + genero + super.toString() +"";
	}
}
