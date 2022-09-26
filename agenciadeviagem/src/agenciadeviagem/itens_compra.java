package agenciadeviagem;


public class itens_compra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private Integer id_itens_compraPK;
	private Integer qde_itens;
	private double valor_itens;
	private compra compra;
	private destino destino;
	
	public itens_compra () {
	}
	
	public itens_compra(Integer id_itens_compraPK, Integer qde_itens, double valor_itens, agenciadeviagem.compra compra,
			agenciadeviagem.destino destino) {
		super();
		this.id_itens_compraPK = id_itens_compraPK;
		this.qde_itens = qde_itens;
		this.valor_itens = valor_itens;
		this.compra = compra;
		this.destino = destino;
		
	}

	public Integer getId_itens_compraPK() {
		return id_itens_compraPK;
	}

	public void setId_itens_compraPK(Integer id_itens_compraPK) {
		this.id_itens_compraPK = id_itens_compraPK;
	}

	public Integer getQde_itens() {
		return qde_itens;
	}

	public void setQde_itens(Integer qde_itens) {
		this.qde_itens = qde_itens;
	}

	public double getValor_itens() {
		return valor_itens;
	}

	public void setValor_itens(double valor_itens) {
		this.valor_itens = valor_itens;
	}

	public compra getCompra() {
		return compra;
	}

	public void setCompra(compra compra) {
		this.compra = compra;
	}

	public destino getDestino() {
		return destino;
	}

	public void setDestino(destino destino) {
		this.destino = destino;
	}
	
    
	
}
