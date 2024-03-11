package n2exercici1.beans;

import n2exercici1.interfaces.ICamara;
import n2exercici1.interfaces.IReloj;

public class Smartphone extends Telefono implements IReloj, ICamara{
	
	
	public Smartphone() {
		super();
	}
	public Smartphone(String marca, String modelo) {
		super(marca, modelo);
		
	}

	@Override
	public void llamar(String numeroTelefono) {
		
		System.out.println("Estás llamando al teléfono " + numeroTelefono + ".");
		
	}
	
	@Override
	public void fotografiar() {
		
		System.out.println("Se está haciendo una fotografía.");
		
	
	}

	@Override
	public void alarma() {
		
		System.out.println("Está sonando la alarma.");
		
	}

}
