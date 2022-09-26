package agenciadeviagem;

public class acesso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	   private Integer id_acesso;
	   private String tipo_acesso;
	   private cliente cliente;
	   private funcionario funcionario;
	   
	   public acesso () {
		}

	public acesso(Integer id_acesso, String tipo_acesso, agenciadeviagem.cliente cliente,
			agenciadeviagem.funcionario funcionario) {
		super();
		this.id_acesso = id_acesso;
		this.tipo_acesso = tipo_acesso;
		this.cliente = cliente;
		this.funcionario = funcionario;
	}

	public Integer getId_acesso() {
		return id_acesso;
	}

	public void setId_acesso(Integer id_acesso) {
		this.id_acesso = id_acesso;
	}

	public String getTipo_acesso() {
		return tipo_acesso;
	}

	public void setTipo_acesso(String tipo_acesso) {
		this.tipo_acesso = tipo_acesso;
	}

	public cliente getCliente() {
		return cliente;
	}

	public void setCliente(cliente cliente) {
		this.cliente = cliente;
	}

	public funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(funcionario funcionario) {
		this.funcionario = funcionario;
	}
		
	   
}
