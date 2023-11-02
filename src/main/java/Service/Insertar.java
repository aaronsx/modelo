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

public class Insertar {
	
	public void InsertarUsuario(EntityManager em,Usuario usu){
		em.getTransaction().begin();
		em.persist(usu);
		em.getTransaction().commit();
		
	}
	public void InsertarAcceso(EntityManager em,Acceso acceso){
		em.getTransaction().begin();
		em.persist(acceso);
		em.getTransaction().commit();
	}
	public void InsertarLibro(EntityManager em,Libro libro){
		em.getTransaction().begin();
		em.persist(libro);
		em.getTransaction().commit();
	}
	
	public void InsertarColeccion(EntityManager em,Coleccion coleccion){
		em.getTransaction().begin();
		em.persist(coleccion);
		em.getTransaction().commit();
	}
	public void InsertarPrestamos(EntityManager em,Prestamo prestamo){
		em.getTransaction().begin();
		em.persist(prestamo);
		em.getTransaction().commit();
	}
	public void InsertarEditorial(EntityManager em,Editorial editorial){
		em.getTransaction().begin();
		em.persist(editorial);
		em.getTransaction().commit();
	}
	public void InsertarGenero(EntityManager em,Genero genero){
		em.getTransaction().begin();
		em.persist(genero);
		em.getTransaction().commit();
	}
	public void InsertarEstadoPrestamo(EntityManager em,EstadoPrestamo estapres){
		em.getTransaction().begin();
		em.persist(estapres);
		em.getTransaction().commit();
	}
	
}
