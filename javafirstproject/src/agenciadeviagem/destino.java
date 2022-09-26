package agenciadeviagem;

public class destino {

	public static void main(String[] args) {
	}
	
		private Integer id_destino_PK;
		private String nome_destino;
		private double valor_pacote;
	    
		public destino () {
		}

		public destino(Integer id_destino_PK, String nome_destino, double valor_pacote) {
			super();
			this.id_destino_PK = id_destino_PK;
			this.nome_destino = nome_destino;
			this.valor_pacote = valor_pacote;
		}

		public Integer getId_destino_PK() {
			return id_destino_PK;
		}

		public void setId_destino_PK(Integer id_destino_PK) {
			this.id_destino_PK = id_destino_PK;
		}

		public String getNome_destino() {
			return nome_destino;
		}

		public void setNome_destino(String nome_destino) {
			this.nome_destino = nome_destino;
		}

		public double getValor_pacote() {
			return valor_pacote;
		}

		public void setValor_pacote(double valor_pacote) {
			this.valor_pacote = valor_pacote;
		}
		
		
}
