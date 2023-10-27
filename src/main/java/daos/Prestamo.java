

  
package daos;

import java.util.Calendar;
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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="prestamos", schema="gbp_almacen")
public class Prestamo {
	
	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_prestamo", nullable=false)
	private long id_prestamo;
	

	@Column(name="fch_inicio_prestamo")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fchIniPresta;

	@Column(name="fch_fin_prestamo")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fchFinPresta;
	
	@Column(name="fch_entrega_prestamo")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fchEntrePresta;
	
	@ManyToOne
    @JoinColumn(name="id_estado_prestamo")
    EstadoPrestamo estadoPresta;
	
	@ManyToMany(cascade = {
	        CascadeType.PERSIST,
	        CascadeType.MERGE
	    })  
    @JoinTable(
        name = "rel_Libros_Prestamos",schema="gbp_almacen",
        joinColumns = @JoinColumn(name = "id_prestamo",referencedColumnName="id_prestamo"),
        inverseJoinColumns = @JoinColumn(name = "id_libro",referencedColumnName="id_libro")
    )
    private List<Libro> prestamoLibro;
	
	//CONSTRUCTORES
	public Prestamo() {
		super();
	}
	public Prestamo(long id_prestamo, Calendar fchIniPresta, Calendar fchFinPresta, Calendar fchEntrePresta,
			EstadoPrestamo estadoPresta) {
		super();
		this.id_prestamo = id_prestamo;
		this.fchIniPresta = fchIniPresta;
		this.fchFinPresta = fchFinPresta;
		this.fchEntrePresta = fchEntrePresta;
		this.estadoPresta = estadoPresta;
	}
	
	
}