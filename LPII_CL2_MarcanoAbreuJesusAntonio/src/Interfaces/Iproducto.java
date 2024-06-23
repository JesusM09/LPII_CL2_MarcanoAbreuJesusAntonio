package Interfaces;

import java.util.List;

import model.TblProductocl2;

public interface Iproducto {
	public List<TblProductocl2> ListarProductos();
	public void RegistrarProducto(TblProductocl2 producto);
}
