package facturas;

public class FacturasDeCompra extends Facturas {
	int ordenDeCompra;
	int cantidadDeItem;
	
	public int getOrdenDeCompra() {
		return ordenDeCompra;
	}
	public void setOrdenDeCompra(int ordenDeCompra) {
		this.ordenDeCompra = ordenDeCompra;
	}
	public int getCantidadDeItem() {
		return cantidadDeItem;
	}
	public void setCantidadDeItem(int cantidadDeItem) {
		this.cantidadDeItem = cantidadDeItem;
	}


}
