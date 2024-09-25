package objetos;

public class Cadastrofuncionarios {
	
	private String nome;
	private String ID;
	private String Cargo;
	private Integer Totaldevenda;
	
	public Cadastrofuncionarios(String nome, String iD, String cargo, Integer totaldevenda) {
		super();
		this.nome = nome;
		ID = iD;
		Cargo = cargo;
		Totaldevenda = totaldevenda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getCargo() {
		return Cargo;
	}

	public void setCargo(String cargo) {
		Cargo = cargo;
	}

	public Integer getTotaldevenda() {
		return Totaldevenda;
	}

	public void setTotaldevenda(Integer totaldevenda) {
		Totaldevenda = totaldevenda;
	}

	@Override
	public String toString() {
		return "Cadastrofuncionarios [nome=" + nome + ", ID=" + ID + ", Cargo=" + Cargo + ", Totaldevenda="
				+ Totaldevenda + "]";
	}
	
	

}
