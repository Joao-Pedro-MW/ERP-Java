package objetos;

public class Pedido {
	Integer numeroMesa;
	Integer idGarcom;
	Integer cardapioCodPrato;
	
	public Pedido(Integer numeroMesa, Integer idGarcom, Integer cardapioCodPrato) {
		super();
		this.numeroMesa = numeroMesa;
		this.idGarcom = idGarcom;
		this.cardapioCodPrato = cardapioCodPrato;
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
	@Override
	public String toString() {
		return "Pedido [numeroMesa=" + numeroMesa + ", idGarcom=" + idGarcom + ", cardapioCodPrato=" + cardapioCodPrato
				+ "]";
	}
	
	
	
}
