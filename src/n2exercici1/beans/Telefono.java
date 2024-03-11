package n2exercici1.beans;

public abstract class Telefono{
	
	private String marca;
	private String modelo;
	
	public Telefono() {
		super();
	}
	
	public Telefono(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	
	
	public String getMarca() {
		return marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public abstract void llamar(String numeroTelefono);
	

	
	@Override
	public String toString() {
		return "Telefono [marca=" + this.marca + ", modelo=" + this.modelo + "]";
	}
	
	

}
