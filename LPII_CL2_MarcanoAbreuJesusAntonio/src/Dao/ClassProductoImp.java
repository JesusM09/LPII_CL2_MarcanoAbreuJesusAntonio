package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.Iproducto;
import model.TblProductocl2;

public class ClassProductoImp implements Iproducto {

	@Override
	public List<TblProductocl2> ListarProductos() {
		EntityManagerFactory em= Persistence.createEntityManagerFactory("LPII_CL2_MarcanoAbreuJesusAntonio");
		EntityManager emanager = em.createEntityManager();
		emanager.getTransaction().begin();
		List<TblProductocl2> listado=emanager.createQuery("select c from TblProductocl2 c",TblProductocl2.class).getResultList();
		emanager.getTransaction().commit();
		emanager.close();
		return listado;
	} // fin metodo listar producto

	@Override
	public void RegistrarProducto(TblProductocl2 producto) {
		EntityManagerFactory em= Persistence.createEntityManagerFactory("LPII_CL2_MarcanoAbreuJesusAntonio");
		EntityManager emanager = em.createEntityManager();
		emanager.getTransaction().begin();
		emanager.persist(producto);
		System.out.println("Producto Registrado");
		emanager.getTransaction().commit();
		emanager.close();
	} // fin metodo registrar producto

}
