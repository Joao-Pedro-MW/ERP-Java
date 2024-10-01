package objetos;

public class Pedido {
	Integer idPedido;
	Integer numeroMesa;
	Integer idGarcom;
	Integer cardapioCodPrato;
	Integer quantidadePratos;
	
	
	public Pedido(Integer idPedido, Integer numeroMesa, Integer idGarcom, Integer cardapioCodPrato, Integer quantidadePratos) {
		super();
		this.idPedido = idPedido;
		this.numeroMesa = numeroMesa;
		this.idGarcom = idGarcom;
		this.cardapioCodPrato = cardapioCodPrato;
		this.quantidadePratos = quantidadePratos;
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
	public Integer getCardapioCodPrato() {
		return cardapioCodPrato;
	}
	public void setCardapioCodPrato(Integer cardapioCodPrato) {
		this.cardapioCodPrato = cardapioCodPrato;
	}
	public Integer getQuantidadePratos() {
		return quantidadePratos;
	}
	public void setQuantidadePratos(Integer quantidadePratos) {
		this.quantidadePratos = quantidadePratos;
	}
	@Override
	public String toString() {
		return "Pedido [numeroMesa=" + numeroMesa + ", idGarcom=" + idGarcom + ", cardapioCodPrato=" + cardapioCodPrato
				+ ", quantidadePratos=" + quantidadePratos + "]";
	}	
	
}
