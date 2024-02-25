package taller3.televisores;

public class Control {
	
	TV tv;
	
	public Control (TV tv) {
		
		this.tv = tv;
	}
	
	public void setTV (TV tv) {
		
		this.tv = tv;
	}
	
	public TV getTV() {
		
		return tv;
	}
	
	public void turnOn (){
		
		tv.estado = true;
				
	}
	
	public void turnOff () {
		
		tv.estado = false;
	}
	
	public void canalUp(){
		
		if (tv.estado && tv.canal <= 120) {
			
			tv.canal++;
		}
		
	}
	
	public void canalDown() {
		
		if (tv.estado && tv.canal > 0) {
			
			tv.canal--;
		}
					
	}
	
	public void volumenUp () {
		
		if (tv.estado && tv.volumen < 7) {
			tv.volumen++;
		}
		
	}
	
	public void volumenDown() {
		
		if (tv.estado && tv.volumen > 0) {
			
			tv.volumen--;
		}
			
}
	
	public void setVolumen (int volumen) {
		
		tv.volumen = volumen;
	}
	
	public void setCanal (int canal) {
		
		tv.canal = canal;
	}
	
	public void Enlazar(TV tv) {
		
		this.tv = tv;
		tv.setControl(this);
	}
	
}
