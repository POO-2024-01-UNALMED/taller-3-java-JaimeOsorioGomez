package taller3.televisores;

public class TV {
	
	private static int numTV = 0;
	public int canal = 1;
	public int volumen = 1;
	private int precio = 500;
	public boolean estado;
	private Marca marca;
	public Control control;
	
	public TV (Marca marca, boolean estado) {
		
		this.marca = marca;
		this.estado = estado;
	}
	
	public void setMarca (Marca marca) {
		
		this.marca = marca;		
	}
	
	public Marca getMarca () {
		
		return marca;
	}
	
	public void setCanal (int canal) {
		
		this.canal = canal;
	}
	
	public int getCanal () {
		
		return canal;
	}
	
	public void setPrecio (int precio) {
		
		this.precio = precio;
	}
	
	public int getPrecio () {
		
		return precio;
	}
	
	public void setVolumen (int volumen) {
		
		this.volumen = volumen;
	}
	
	public int getVolumen () {
		
		return volumen;
	}
	
	public void setControl(Control control) {
		
		this.control = control;
	
	}
	
	public Control getControl() {
		
		return control;
	}
	
	public void setNumTV (int numTV) {
		
		this.numTV = numTV;
	}
	
	public int getNumTV () {
		
		return numTV;
	}
	
	public void turnOn () {
		
		estado = true;		
	}
	
	public void turnOff () {
		
		estado = false;
	}
	
	public boolean getEstado () {
		
		return estado;
	}
	
	public void canalUp () {
		
	if (estado && canal <=120) {
		
		canal++;	
	}
		
	}
	
	public void canalDown() {
		
		if (estado && canal>1) {
			canal--;
		}
		
	}
	
	public void volumenUp () {
		
		if (estado && volumen < 7) {
			volumen++;
		}
		
	}
	
	public void volumenDown() {
		
		if (estado && volumen > 0) {
			
			volumen--;
		}
		
	}
	
}
