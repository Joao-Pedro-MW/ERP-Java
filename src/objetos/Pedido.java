package objetos;

public class Pedido {
	Integer idPedido;
	Integer numeroMesa;
	Integer idGarcom;
	Integer cardapioCodItem;
	Integer quantidadeItem;
	
	
	public Pedido(Integer idPedido, Integer numeroMesa, Integer idGarcom, Integer cardapioCodPrato, Integer quantidadePratos) {
		super();
		this.idPedido = idPedido;
		this.numeroMesa = numeroMesa;
		this.idGarcom = idGarcom;
		this.cardapioCodItem = cardapioCodPrato;
		this.quantidadeItem = quantidadePratos;
	}


	public Integer getIdPedido() {
		return idPedido;
	}


	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}


	public Integer getNumeroMesa() {
		return numeroMesa;
	}


	public void setNumeroMesa(Integer numeroMesa) {
		this.numeroMesa = numeroMesa;
	}


	public Integer getIdGarcom() {
		return idGarcom;
	}


	public void setIdGarcom(Integer idGarcom) {
		this.idGarcom = idGarcom;
	}


	public Integer getCardapioCodItem() {
		return cardapioCodItem;
	}


	public void setCardapioCodItem(Integer cardapioCodItem) {
		this.cardapioCodItem = cardapioCodItem;
	}


	public Integer getQuantidadeItem() {
		return quantidadeItem;
	}


	public void setQuantidadeItem(Integer quantidadeItem) {
		this.quantidadeItem = quantidadeItem;
	}


	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", numeroMesa=" + numeroMesa + ", idGarcom=" + idGarcom
				+ ", cardapioCodItem=" + cardapioCodItem + ", quantidadeItem=" + quantidadeItem + "]";
	}
	
}
