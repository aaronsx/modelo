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

public class Actualizar {
	
	public void ActualizarUsuario(EntityManager em,Usuario usu){
		
		em.getTransaction().begin();
		em.merge(usu);
		em.getTransaction().commit();
		
	}
	public void ActualizarAcceso(EntityManager em,Acceso acceso){
		em.getTransaction().begin();
		em.merge(acceso);
		em.getTransaction().commit();
	}
	public void ActualizarLibro(EntityManager em,Libro libro){
		em.getTransaction().begin();
		em.merge(libro);
		
		em.getTransaction().commit();
	}
	public void ActualizarColeccion(EntityManager em,Coleccion coleccion){
		em.getTransaction().begin();
		em.merge(coleccion);
		em.getTransaction().commit();
	}
	public void ActualizarPrestamos(EntityManager em,Prestamo prestamo){
		em.getTransaction().begin();
		em.merge(prestamo);
		em.getTransaction().commit();
	}
	public void ActualizarEditorial(EntityManager em,Editorial editorial){
		em.getTransaction().begin();
		em.merge(editorial);
		em.getTransaction().commit();
	}
	public void ActualizarGenero(EntityManager em,Genero genero){
		em.getTransaction().begin();
		em.merge(genero);
		em.getTransaction().commit();
	}
	public void ActualizarEstadoPrestamo(EntityManager em,EstadoPrestamo estapres){
		em.getTransaction().begin();
		em.merge(estapres);
		em.getTransaction().commit();
	}

}
