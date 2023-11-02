package daos;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="generos", schema="gbp_almacen")
public class Genero {
	
	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_genero", nullable=false)
	private long id_genero;
	
	@Column(name="nombre_genero", nullable=false)
	private String nombre_genero;
	
	@Column(name="descripcion_genero")
	private String descripcion_genero;
	 
	@OneToMany(mappedBy="genero")
    List<Libro> librosConGenero;
	//GET
	public String getNombre_genero() {
		return nombre_genero;
	}
	//CONSTRUCTORES
	public Genero() {
		super();
	}
	public Genero(String nombre_genero, String descripcion_genero) {
		super();
		this.nombre_genero = nombre_genero;
		this.descripcion_genero = descripcion_genero;
	}
	

}
