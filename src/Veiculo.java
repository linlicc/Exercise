
public class Veiculo {

	 private String chassi;
	 private String cor;
	 private int totalDePortas;
	 private int placa;
	 
	 public Veiculo (String chassi) {
			this.chassi = chassi;
			
		}
	 
	public Veiculo (String chassi, String cor, int totalDePortas, int placa) {
		this.chassi = chassi;
		this.cor = cor;
		this.totalDePortas = totalDePortas;
		this.placa = placa;
		
	
				
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getTotalDePortas() {
		return totalDePortas;
	}

	public void setTotalDePortas(int totalDePortas) {
		this.totalDePortas = totalDePortas;
	}

	public int getPlaca() {
		return placa;
	}

	public void setPlaca(int placa) {
		this.placa = placa;
	}
	 
}
