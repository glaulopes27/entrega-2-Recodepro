package agenciadeviagem;

public class funcionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 private Integer id_func_PK;
	 private String nome_func;
	 private Integer cpf_func;
	 private String email_func;
	 private String tel_func;
	 private String senha_func;
	 private acesso acesso;
	 
	 public funcionario() {
		}

	public funcionario(Integer id_func_PK, String nome_func, Integer cpf_func, String email_func, String tel_func,
			String senha_func, agenciadeviagem.acesso acesso) {
		super();
		this.id_func_PK = id_func_PK;
		this.nome_func = nome_func;
		this.cpf_func = cpf_func;
		this.email_func = email_func;
		this.tel_func = tel_func;
		this.senha_func = senha_func;
		this.acesso = acesso;
	}

	public Integer getId_func_PK() {
		return id_func_PK;
	}

	public void setId_func_PK(Integer id_func_PK) {
		this.id_func_PK = id_func_PK;
	}

	public String getNome_func() {
		return nome_func;
	}

	public void setNome_func(String nome_func) {
		this.nome_func = nome_func;
	}

	public Integer getCpf_func() {
		return cpf_func;
	}

	public void setCpf_func(Integer cpf_func) {
		this.cpf_func = cpf_func;
	}

	public String getEmail_func() {
		return email_func;
	}

	public void setEmail_func(String email_func) {
		this.email_func = email_func;
	}

	public String getTel_func() {
		return tel_func;
	}

	public void setTel_func(String tel_func) {
		this.tel_func = tel_func;
	}

	public String getSenha_func() {
		return senha_func;
	}

	public void setSenha_func(String senha_func) {
		this.senha_func = senha_func;
	}

	public acesso getAcesso() {
		return acesso;
	}

	public void setAcesso(acesso acesso) {
		this.acesso = acesso;
	}
	
	
}
