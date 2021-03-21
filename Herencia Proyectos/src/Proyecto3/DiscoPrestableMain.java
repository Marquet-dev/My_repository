package Proyecto3;

public class DiscoPrestableMain {

	public static void main(String[] args) {
		/*
		 * He tenido que cambiar el tipo de clase a DiscoPrestable
		 * @author Marco Benegas.
		 */
		DiscoPrestable d1 = new DiscoPrestable("Ven aqui que te meto", "Marco", "Mp3", 2.5, "PopRap");
		DiscoPrestable d2 = new DiscoPrestable("Amo el codigo", "Alberto", "Mp3", 3, "Rock");
		DiscoPrestable d3 = new DiscoPrestable("Heart in pieces", "Lil Uzi Vert", "Mp3", 3.16, "PopRap");
		DiscoPrestable d4 = new DiscoPrestable("Not playing", "Playboi Carti", "Mp3", 3, "Rap");
		
		
		DiscoPrestable[] lista = {d1,d2,d3,d4};
		d1.prestar();
		d4.prestar();
	
		System.out.println("Discos prestados: "+Proyecto2.EscritoMain.cuentaPrestados(lista));
		
	}

}
