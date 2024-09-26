package objetos;
import fag.principal;

public class Cadastrofuncionarios {
	
	private String nome;
	private Integer ID;
	private String Cargo;
	private Integer Totaldevenda;
	
    public Cadastrofuncionarios() {
        this.nome = "";
        this.ID = null;
        this.Cargo = "";
        this.Totaldevenda = null;
    }
	
	public Cadastrofuncionarios(String nome, Integer iD, String cargo, Integer totaldevenda) {
		super();
		this.nome = nome;
		this.ID = iD;
		this.Cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
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
