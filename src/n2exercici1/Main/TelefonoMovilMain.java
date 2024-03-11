package n2exercici1.Main;

import n2exercici1.beans.Smartphone;

public class TelefonoMovilMain {

	public static void main(String[] args) {
		
		Smartphone telefono1 = new Smartphone("Nokia", "3000A");
		telefono1.fotografiar();
		telefono1.alarma();
		telefono1.llamar("666 00 00 00");
	}

}
