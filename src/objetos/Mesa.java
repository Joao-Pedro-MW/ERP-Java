package objetos;


public class Mesa {

    private String numeromesa;
    private String qtdpedido;
    private String capacidadepessoa;
    private Boolean disponibilidade;


    public Mesa() {
        this.numeromesa = "";
        this.qtdpedido = "";
        this.capacidadepessoa = "";
        this.disponibilidade = false;
    }
    
    public Mesa(String numeromesa, String qtdpedido, String capacidadepessoa, Boolean disponibilidade) {
        this.numeromesa = "";
        this.qtdpedido = "";
        this.capacidadepessoa = "";
        this.disponibilidade = false;
    }
    
 
    
	public String getNumeromesa() {
		return numeromesa;
	}
	public void setNumeromesa(String numeromesa) {
		this.numeromesa = numeromesa;
	}
	public String getQtdpedido() {
		return qtdpedido;
	}
	public void setQtdpedido(String qtdpedido) {
		this.qtdpedido = qtdpedido;
	}
	public String getCapacidadepessoa() {
		return capacidadepessoa;
	}
	public void setCapacidadepessoa(String capacidadepessoa) {
		this.capacidadepessoa = capacidadepessoa;
	}
	public Boolean getDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(Boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
	@Override
	public String toString() {
		return "Mesa [numeromesa=" + numeromesa + ", qtdpedido=" + qtdpedido + ", capacidadepessoa=" + capacidadepessoa
				+ ", disponibilidade=" + disponibilidade + "]";
	}
}
