
public class DadosdeContato {
	
	private String email;
	private String telefone;
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	//INICIO EMAIL//
	public void setemail(String email) {
		
		if(email.isEmpty()) {
			System.out.println("E-MAIL OBRIGAT�RIO");
			System.exit(0);
		}else {
				this.email = email;
		}
	}
	//FIM EMAIL//

		
	//INICIO TELEFONE//
	public void settelefone(String telefone) {
	
		if(telefone.isEmpty()) {
		System.out.println("TELEFONE OBRIGAT�RIO");
		System.exit(0);
		}else {
			int tamanho = telefone.length();
			if(tamanho < 10) {
				System.out.println("M�NIMO DE QUATORZE CARACTERES");
		}else {
			this.telefone = telefone;
			}
		}	
	}
}
	//FIM TELEFONE//