package daos;

import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="autores", schema="gbp_almacen")
public class Autor {
	
	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_autor", nullable=false)
	private long idAutor;
	
	@Column(name="nombre_autor", nullable=false)
	private String nombreAutor;
	
	@Column(name="apellidos_autor", nullable=false)
	private String apellidosAutor;


	@ManyToMany(mappedBy = "libroAutor")
	 private List<Libro> libros;

	//GET
	public String getNombreAutor() {
		return nombreAutor;
	}
	//CONSTRUCTORES
	public Autor() {
		super();
	}
	public Autor(String nombreAutor, String apellidosAutor) {
		super();
		this.nombreAutor = nombreAutor;
		this.apellidosAutor = apellidosAutor;
	}

	

}
