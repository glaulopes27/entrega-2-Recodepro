package agenciadeviagem;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class cliente {

	public static void main(String[] args) {
	}
	
	private Integer id_cliente_PK;
	private String nome_cliente;
	private Integer cpf_cliente;
	private String email_cliente;
	private Integer id_destino_FK;
	private LocalDate data_viagem;
	

	public cliente () {
	}
	public cliente(Integer id_cliente_PK, String nome_cliente, Integer cpf_cliente, String email_cliente,
			Integer id_destino_FK, LocalDate data_viagem, DateTimeFormatter formatter) {
		super();
		this.id_cliente_PK = id_cliente_PK;
		this.nome_cliente = nome_cliente;
		this.cpf_cliente = cpf_cliente;
		this.email_cliente = email_cliente;
		this.id_destino_FK = id_destino_FK;
		this.data_viagem = data_viagem;
		this.formatter = formatter;
	}


	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Integer getId_cliente_PK() {
		return id_cliente_PK;
	}

	public void setId_cliente_PK(Integer id_cliente_PK) {
		this.id_cliente_PK = id_cliente_PK;
	}

	public String getNome_cliente() {
		return nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}

	public Integer getCpf_cliente() {
		return cpf_cliente;
	}

	public void setCpf_cliente(Integer cpf_cliente) {
		this.cpf_cliente = cpf_cliente;
	}

	public String getEmail_cliente() {
		return email_cliente;
	}

	public void setEmail_cliente(String email_cliente) {
		this.email_cliente = email_cliente;
	}

	public Integer getId_destino_FK() {
		return id_destino_FK;
	}

	public void setId_destino_FK(Integer id_destino_FK) {
		this.id_destino_FK = id_destino_FK;
	}

	public LocalDate getData_viagem() {
		return data_viagem;
	}

	public void setData_viagem(LocalDate data_viagem) {
		this.data_viagem = data_viagem;
	}
	
	
	 
	 
	 
	 
}
	