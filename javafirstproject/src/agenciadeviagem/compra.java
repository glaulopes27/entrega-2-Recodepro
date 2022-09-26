package agenciadeviagem;
import java.time.LocalDate;
import java.util.List;

public class compra {

	public static void main(String[] args) {
	}

	private Integer id_compraPK;
	private LocalDate data_compra;
	private cliente cliente;


	
	
	public compra(Integer id_compraPK, Integer id_cliente_FK, LocalDate data_compra, agenciadeviagem.cliente cliente,
			List<itens_compra> itens) {
		super();
		this.id_compraPK = id_compraPK;
		this.data_compra = data_compra;
		this.cliente = cliente;

	}

	public compra () {
	}
	

	public Integer getId_compraPK() {
		return id_compraPK;
	}

	public void setId_compraPK(Integer id_compraPK) {
		this.id_compraPK = id_compraPK;
	}


	public LocalDate getData_compra() {
		return data_compra;
	}

	public void setData_compra(LocalDate data_compra) {
		this.data_compra = data_compra;
	}

	public cliente getCliente() {
		return cliente;
	}

	public void setCliente(cliente cliente) {
		this.cliente = cliente;
	}
	
	
	    
}