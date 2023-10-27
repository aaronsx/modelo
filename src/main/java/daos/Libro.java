  package daos;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="libros", schema="gbp_almacen")
public class Libro {
	
	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_libro", nullable=false)
	private long idLibro;
	


	@Column(name="isbn_libro", nullable=false)
	private String isbnLibro;
	
	@Column(name="titulo_libro")
	private String tituloLibro;
	
	
	@Column(name="edicion_libro")
	private String edicionLibro;
	
	@Column(name="cantidad_libro")
	private int cantidadLibro;
	
    @ManyToOne
    @JoinColumn(name="id_editorial")
    Editorial editorial; 

	@ManyToOne
    @JoinColumn(name="id_genero")
    Genero genero;
	
	
	@ManyToOne
    @JoinColumn(name="id_coleccion")
    Coleccion coleccion;
	
	@ManyToMany(mappedBy = "prestamoLibro")
	 private List<Prestamo> prestamo;
	 
	@ManyToMany(cascade = {
	        CascadeType.PERSIST,
	        CascadeType.MERGE
	    })
	    @JoinTable(
	        name = "Rel_Autores_Libros",schema="gbp_almacen",
	        joinColumns = @JoinColumn(name = "id_libro"),
	        inverseJoinColumns = @JoinColumn(name = "id_autor")
	    )
	    private List<Autor> libroAutor;
	   
	
	//CONSTRUCTORES
	public Libro() {
		super();
	}
	public Libro(long idLibro, String isbnLibro, String tituloLibro, String edicionLibro, Editorial editorial,
			Genero genero, Coleccion coleccion,int cantidadLibro) {
		super();
		this.idLibro = idLibro;
		this.isbnLibro = isbnLibro;
		this.tituloLibro = tituloLibro;
		this.edicionLibro = edicionLibro;
		this.editorial = editorial;
		this.genero = genero;
		this.coleccion = coleccion;
		this.cantidadLibro=cantidadLibro;
	}
	public Libro(String isbnLibro) {
		super();
		this.isbnLibro = isbnLibro;
		
	}
	

}
