package taller3.televisores;

public class Control {
	
	private TV tv;

	public void setTv (TV tv) {
		
		this.tv = tv;
	}
	
	public TV getTv() {
		
		return this.tv;
	}
	
	public void turnOn (){
		
		tv.estado = true;
				
	}
	
	public void turnOff () {
		
		tv.estado = false;
	}
	
	public void canalUp(){
		
		if ((tv.estado && tv.canal <= 120)&&(tv.canal>=1)){
			
			tv.canal++;
		}
		
	}
	
	public void canalDown() {
			
		if ((tv.estado && tv.canal > 0) &&(tv.canal <=120)) {
			
			tv.canal--;
		}
					
	}
	
	public void volumenUp () {
		
		if ((tv.estado && tv.volumen < 7) && (tv.volumen>=0)) {
			tv.volumen++;
		}
		
	}
	
	public void volumenDown() {
		
		if ((tv.estado && tv.volumen > 0) && (tv.volumen <=7)) {
			
			tv.volumen--;
		}
			
}
	
	public void setVolumen (int volumen) {
		
		if ((tv.estado && tv.volumen>= 0) && (tv.volumen <= 7)) {
			tv.volumen = volumen;
		}
		
	}
	
	public void setCanal (int canal) {
		
		if ((tv.estado && tv.canal <= 120) && (tv.canal>=1)) {
			tv.canal = canal;
		}
		
	}
	
	public void enlazar(TV tv) {
		
		this.tv = tv;
		tv.setControl(this);
	}
	
}
