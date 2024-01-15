package orientadoaobjetos;

public class uso_celular {

	public static void main(String[] args) {

		Celular iphone = new Celular();
		System.out.println("El Celular es de modelo " + iphone.modelo);
		System.out.println("La capacidad de almacenamiento del celular es de "+iphone.almacenamiento + " GB");
	}

}
