package ejercicio10;

public class Gestisimal {

	// ATRIBUTOS
	private String codigo = "LIBRE", descripcion;
	private double precioCompra, precioVenta;
	private int stock;

	// GETTERS Y SETTERS
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "\n Código: " + codigo + "\n Descripcion: " + descripcion + "\n Precio de compra: " + precioCompra
				+ "\n Precio de venta: " + precioVenta + "\n Stock: " + stock;
	}

}
