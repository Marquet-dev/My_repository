package Proyecto2;

public class Escrito {
	private int codigo;
	private String titulo;
	private int anno_publicacion;
	
	public Escrito(int codigo, String titulo, int anno){
		this.codigo = codigo;
		this.titulo = titulo;
		this.anno_publicacion = anno;
	}
	public int dameCodigo() {
		return this.codigo;
	}
	public String dameTitulo() {
		return this.titulo;
	}
	public int dameAnnoPublicacion() {
		return this.anno_publicacion;
	}
	public String toString() {
		return " Codigo: "+codigo+" Titulo: "+titulo+" anno de publicacion: "+anno_publicacion;
	}
}
