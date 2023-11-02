package controladores;


import java.util.ArrayList;
import java.util.List;

import Service.Buscar;
import Service.Insertar;
import daos.Acceso;
import daos.Autor;
import daos.Coleccion;
import daos.Editorial;
import daos.Genero;
import daos.Libro;
import daos.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class Inicio {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
		EntityManager em = emf.createEntityManager();
		Insertar insert =new Insertar();
		Acceso acceso = new Acceso("Usu","Acceso usuarios biblioteca");
		Acceso acceso2 = new Acceso("Emp","Empleados biblioteca");
		insert.InsertarAcceso(em, acceso);
		insert.InsertarAcceso(em, acceso2);
		Usuario usu =new Usuario("7547457p","Juan","Gustavo Perez",acceso);
		Usuario usu2 =new Usuario("675676r","Pepe","Prada Jope",acceso2);
		insert.InsertarUsuario(em, usu);
		insert.InsertarUsuario(em, usu2);
		Coleccion colecion =new Coleccion("43");
		Coleccion colecion2 =new Coleccion("65");
		insert.InsertarColeccion(em, colecion);
		insert.InsertarColeccion(em, colecion2);
		Editorial editorial =new Editorial("PRe");
		Editorial editorial2 =new Editorial("ION");
		insert.InsertarEditorial(em, editorial);
		insert.InsertarEditorial(em, editorial2);
		Genero genero =new Genero("Comedia","De JAJAS");
		Genero genero2 =new Genero("Miedo","Feliz juabulin grupo soy vanesa");
		insert.InsertarGenero(em, genero);
		insert.InsertarGenero(em, genero2);
		
		List<Autor>autor=new ArrayList<Autor>();
		autor.add(new Autor("Jose","Perez"));
		Libro libro =new Libro("45645645756","Dos lugares","3",editorial2,genero,colecion2,1,autor);
		List<Autor>autor2=new ArrayList<Autor>();
		autor2.add(new Autor("Lucas","Mesi"));
		Libro libro2 =new Libro("78796784","Tres lugares","4",editorial,genero2,colecion,2,autor2);
		insert.InsertarLibro(em, libro);
		insert.InsertarLibro(em, libro2);
		Buscar select =new Buscar();
		List<Usuario>listaUsuario=new ArrayList<Usuario>();
		
		List<Usuario> usuarios =select.BuscarUsuario(em, usu2,"SELECT u FROM Usuario u WHERE u.dniUsuario=:dni");
		
		for (Usuario aux:usuarios)
			System.out.println(aux.getDniUsuario());
		em.close();
		emf.close();
		
		
	}

}
