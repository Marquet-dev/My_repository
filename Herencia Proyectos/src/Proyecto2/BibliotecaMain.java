package Proyecto2;

public class BibliotecaMain {

	public static void main(String[] args) {
		Libro l1 = new Libro(4, "Titulo", 2012);
		l1.prestar();
		System.out.println(l1.prestar());
		l1.prestado();
	}

}
