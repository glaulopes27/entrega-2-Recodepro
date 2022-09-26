package agenciadeviagem;

public class agencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private Integer id_agenciaPK;
	private String nome_agencia;
	private String email_agencia;
	private String tel_agencia;

	public agencia(Integer id_agenciaPK, String nome_agencia, String email_agencia, String tel_agencia) {
		super();
		this.id_agenciaPK = id_agenciaPK;
		this.nome_agencia = nome_agencia;
		this.email_agencia = email_agencia;
		this.tel_agencia = tel_agencia;
	}
	public agencia () {
	}
	
	public Integer getId_agenciaPK() {
		return id_agenciaPK;
	}

	public void setId_agenciaPK(Integer id_agenciaPK) {
		this.id_agenciaPK = id_agenciaPK;
	}

	public String getNome_agencia() {
		return nome_agencia;
	}

	public void setNome_agencia(String nome_agencia) {
		this.nome_agencia = nome_agencia;
	}

	public String getEmail_agencia() {
		return email_agencia;
	}

	public void setEmail_agencia(String email_agencia) {
		this.email_agencia = email_agencia;
	}

	public String getTel_agencia() {
		return tel_agencia;
	}

	public void setTel_agencia(String tel_agencia) {
		this.tel_agencia = tel_agencia;
	}
	public void add(agencia agencia) {
		// TODO Auto-generated method stub
		
	}
	
}


	