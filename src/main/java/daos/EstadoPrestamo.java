package daos;

import java.util.Calendar;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="estados_Prestamos", schema="gbp_almacen")
public class EstadoPrestamo {
	
	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_estado_prestamo", nullable=false)
	private long id_estado_prestamo;
	

	@Column(name="fch_inicio_prestamo")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fchIniPresta;

	@Column(name="fch_fin_prestamo")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fchFinPresta;
	
	@Column(name="fch_entrega_prestamo")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fchEntrePresta;
	
	@OneToMany(mappedBy="estadoPresta")
	List<Prestamo> PrestamoEstado;
	
	//CONSTRUCTORES
		public EstadoPrestamo() {
			super();
		}
		public EstadoPrestamo(long id_estado_prestamo, Calendar fchIniPresta, Calendar fchFinPresta,
				Calendar fchEntrePresta, List<Prestamo> prestamoEstado) {
			super();
			this.id_estado_prestamo = id_estado_prestamo;
			this.fchIniPresta = fchIniPresta;
			this.fchFinPresta = fchFinPresta;
			this.fchEntrePresta = fchEntrePresta;
			PrestamoEstado = prestamoEstado;
		}
}

		