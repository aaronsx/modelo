package Service;

import java.util.List;

import daos.Acceso;
import daos.Autor;
import daos.Coleccion;
import daos.Editorial;
import daos.EstadoPrestamo;
import daos.Genero;
import daos.Libro;
import daos.Prestamo;
import daos.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class Buscar {
	
	public List<Usuario> BuscarUsuario(EntityManager em,Usuario usu,String query){
		TypedQuery<Usuario> consulta = em.createQuery(query,Usuario.class);
		consulta.setParameter("dni", usu.getDniUsuario());
		List<Usuario> usuarios = consulta.getResultList();
		return usuarios;
		
	}
	public List<Acceso> BuscarAcceso(EntityManager em,Acceso acceso,String query){
		TypedQuery<Acceso> consulta = em.createQuery(query,Acceso.class);
		consulta.setParameter("codigo", acceso.getCodigo_acceso());
		List<Acceso> listaAcceso = consulta.getResultList();
		return listaAcceso;
	}
	public List<Libro> BuscarLibro(EntityManager em,Libro libro,String query){
		TypedQuery<Libro> consulta = em.createQuery(query,Libro.class);
		consulta.setParameter("isbnLibro", libro.getIsbnLibro());
		List<Libro> listaLibro = consulta.getResultList();
		return listaLibro;
	}
	public List<Coleccion> BuscarColeccion(EntityManager em,Coleccion coleccion,String query){
		TypedQuery<Coleccion> consulta = em.createQuery(query,Coleccion.class);
		consulta.setParameter("nombreColeccion", coleccion.getNombre_coleccion());
		List<Coleccion> listaColeccion = consulta.getResultList();
		return listaColeccion;
	}
	public List<Prestamo> BuscarPrestamos(EntityManager em,Prestamo prestamo,String query){
		TypedQuery<Prestamo> consulta = em.createQuery(query,Prestamo.class);
		consulta.setParameter("fechaPrestamo", prestamo.getFchIniPresta());
		List<Prestamo> listaPrestamos = consulta.getResultList();
		return listaPrestamos;
	}
	public List<Editorial> BuscarEditorial(EntityManager em,Editorial editorial,String query){
		TypedQuery<Editorial> consulta = em.createQuery(query,Editorial.class);
		consulta.setParameter("nombreEditorial", editorial.getNombre_editorial());
		List<Editorial> listaEditorial = consulta.getResultList();
		return listaEditorial;
	}
	public List<Genero> BuscarGenero(EntityManager em,Genero genero,String query){
		TypedQuery<Genero> consulta = em.createQuery(query,Genero.class);
		consulta.setParameter("nombreGenero", genero.getNombre_genero());
		List<Genero> listaGenero = consulta.getResultList();
		return listaGenero;
	}
	public List<EstadoPrestamo> BuscarEstadoPrestamo(EntityManager em,EstadoPrestamo estapres,String query){
		TypedQuery<EstadoPrestamo> consulta = em.createQuery(query,EstadoPrestamo.class);
		consulta.setParameter("fechapresta", estapres.getFchEntrePresta());
		List<EstadoPrestamo> listaEstadoPrestamo = consulta.getResultList();
		return listaEstadoPrestamo;
	}
	public List<Autor> BuscarEstadoAutores(EntityManager em,Autor autor,String query){
		TypedQuery<Autor> consulta = em.createQuery(query,Autor.class);
		consulta.setParameter("nombre", autor.getNombreAutor());
		List<Autor> listaAutor = consulta.getResultList();
		return listaAutor;
	}
}
