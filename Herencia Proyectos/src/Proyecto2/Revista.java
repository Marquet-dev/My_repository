package Proyecto2;

public class Revista extends Escrito {
	
	private int numero;
	
	public Revista(int codigo, String titulo, int anno, int numero) {
		super(codigo, titulo, anno);
		this.numero = numero;
	}
	public String toString() {
		return super.toString()+" Numero: "+numero;
	}
}
