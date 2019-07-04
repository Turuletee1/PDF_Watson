package facturas;

public class Facturas {
	int numeroDeComprobante;
	String fechaDeEmision;
	int total;
	int neto;
	String compania;
	String moneda;	
	
	public int getNumeroDeComprobante() {
		return numeroDeComprobante;
	}
	public void setNumeroDeComprobante(int numeroDeComprobante) {
		this.numeroDeComprobante = numeroDeComprobante;
	}
	public String getFechaDeEmision() {
		return fechaDeEmision;
	}
	public void setFechaDeEmision(String fechaDeEmision) {
		this.fechaDeEmision = fechaDeEmision;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getNeto() {
		return neto;
	}
	public void setNeto(int neto) {
		this.neto = neto;
	}
	public String getCompania() {
		return compania;
	}
	public void setCompania(String compania) {
		this.compania = compania;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

}
