
package Fecade;


public class FecadeHotelAvion {
    
	private Vuelo vueloAvion;
	private Hotel  hotelEstadia;	

	public FecadeHotelAvion() {
		vueloAvion = new Vuelo();
		hotelEstadia = new Hotel();
	}

	public void buscar(String in, String out, String lugarDeOrigen, String lugarDeLlegada) {
		vueloAvion.Vuelo(in,out,lugarDeOrigen,lugarDeLlegada);
		hotelEstadia.Hoteles(in,out,lugarDeOrigen,lugarDeLlegada);
        }
}