package controladores;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Inicio {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
		EntityManager em = emf.createEntityManager();
		Query query = em.createNativeQuery("INSERT INTO gbp_almacen.rel_autores_libros (id_libro, id_autor) VALUES (?, ?)");
		em.getTransaction().begin();
		query.setParameter(1, 1);
		query.setParameter(2, 2);
		query.executeUpdate();
		
		em.close();
		
		
		
		
		
		/*
		 * Acceso acceso = new Acceso("Usu","Acceso usuarios biblioteca");
		Acceso acceso2 = new Acceso("Emp","Empleados biblioteca");
		Libro lib=new Libro("Pepe la luna");
		Autor au=new Autor("Santi","Pepe");
		em.persist(acceso);
		em.persist(acceso2);
		em.persist(lib);
		em.persist(au);
		em.getTransaction().commit();
		 */
	}

}
