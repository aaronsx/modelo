package Service;

import daos.Acceso;
import daos.Coleccion;
import daos.Editorial;
import daos.EstadoPrestamo;
import daos.Genero;
import daos.Libro;
import daos.Prestamo;
import daos.Usuario;
import jakarta.persistence.EntityManager;

public class Eliminar {
	
	public void EliminarUsuario(EntityManager em,Usuario usu){
		em.getTransaction().begin();
		em.remove(usu);
		em.getTransaction().commit();
		
	}
	public void EliminarAcceso(EntityManager em,Acceso acceso){
		em.getTransaction().begin();
		em.remove(acceso);
		em.getTransaction().commit();
	}
	public void EliminarLibro(EntityManager em,Libro libro){
		em.getTransaction().begin();
		em.remove(libro);
		em.getTransaction().commit();
	}
	public void EliminarColeccion(EntityManager em,Coleccion coleccion){
		em.getTransaction().begin();
		em.remove(coleccion);
		em.getTransaction().commit();
	}
	public void EliminarPrestamos(EntityManager em,Prestamo prestamo){
		em.getTransaction().begin();
		em.remove(prestamo);
		em.getTransaction().commit();
	}
	public void EliminarEditorial(EntityManager em,Editorial editorial){
		em.getTransaction().begin();
		em.remove(editorial);
		em.getTransaction().commit();
	}
	public void EliminarGenero(EntityManager em,Genero genero){
		em.getTransaction().begin();
		em.remove(genero);
		em.getTransaction().commit();
	}
	public void EliminarEstadoPrestamo(EntityManager em,EstadoPrestamo estapres){
		em.getTransaction().begin();
		em.remove(estapres);
		em.getTransaction().commit();
	}
	
}
