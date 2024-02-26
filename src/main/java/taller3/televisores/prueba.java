package taller3.televisores;

public class prueba {
	
		public static void main(String[] args) {
			
			Marca marca =  new Marca("Mitorola");
			
			TV tv1 =  new TV(marca, true);
			Control control1 = new Control();
			control1.enlazar(tv1);
			control1.setVolumen(6);
			control1.volumenDown();
			control1.volumenUp();
			control1.volumenDown();
			control1.turnOff();
			control1.volumenUp();
			
			TV tv2 = new TV(marca, false);
			Control control2 = new Control();
			control2.enlazar(tv2);
			control2.setVolumen(2);
			control2.volumenUp();
			control2.volumenDown();
			control2.turnOn();
			control2.volumenUp();
			control2.volumenDown();
			control2.volumenUp();
			
			TV tv3 = new TV(marca, true);
			Control control3 = new Control();
			control3.enlazar(tv3);
			control3.setVolumen(8);
			control3.volumenDown();
			
			TV tv4 = new TV(marca, true);
			Control control4 = new Control();
			control4.enlazar(tv4);
			control4.setVolumen(-1);
			control4.volumenUp();
			control4.volumenDown();
			
			TV tv5 = new TV(marca, true);
			Control control5 = new Control();
			control5.enlazar(tv5);
			control5.setVolumen(0);
			control5.volumenDown();
			control5.volumenUp();
			
			TV tv6 = new TV(marca, true);
			Control control6 = new Control();
			control6.enlazar(tv6);
			control6.setVolumen(7);
			control6.volumenUp();
			control6.volumenDown();
			
			TV tv7 = new TV(marca, true);
			Control control7 = new Control();
			control7.enlazar(tv7);
			control7.setVolumen(3);
			control7.volumenUp();
			control7.setVolumen(26);
			
			boolean ok = false;
			if (tv1.getVolumen() == 5 && 
				tv2.getVolumen() == 2 &&
				tv3.getVolumen() == 0 &&
				tv4.getVolumen() == 1 &&
				tv5.getVolumen() == 1 &&
				tv6.getVolumen() == 6 &&
				tv7.getVolumen() == 4)
				ok = true;
			
			System.out.println(ok);
		}
}

