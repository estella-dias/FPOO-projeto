
public class DadosPessoais {
	
	private String nome;
	private String sobreNome;
	private String dataNascimento;
	private String genero;
	
		public String getNome() {
			return nome;
		}


		public String getSobreNome() {
			return sobreNome;
		}


		public void setSobreNome(String sobreNome) {
			this.sobreNome = sobreNome;
		}


		public String getDataNascimento() {
			return dataNascimento;
		}


		public String getGenero() {
			return genero;
		}


		//INICIO NOME//
		public void setNome(String nome) {
			
			if(nome.isEmpty()) {
				System.out.println("NOME OBRIGAT�RIO");
				System.exit(0);
			}else {
				int tamanho = nome.length();
				if(tamanho < 3) {
					System.out.println("MIN�MO DE TR�S CARACTERES");
				}else {
					this.nome = nome;
				}
			}
			
		}
		//FIM NOME//
		
		
		//INICIO SOBRENOME//
		public void setsobreNome(String sobreNome) {
			
			if(sobreNome.isEmpty()) {
				System.out.println("SOBRENOME OBRIGAT�RIO");
				System.exit(0);
			}else {
				int tamanho = sobreNome.length();
				if(tamanho < 3) {
					System.out.println("M�NIMO DE TR�S CARACTERES");
				}else {
					this.sobreNome = sobreNome;
				}
			}
		}
		//FIM SOBRENOME//
		
		
		//INICIO DATA DE NASCIMENTO//
		public void setDataNascimento(String dataNascimento) {
			if(dataNascimento.isEmpty()) {
				System.out.println("DATA OBRIGAT�RIA");
				System.exit(0);
			}else {
				int tamanho = dataNascimento.length();
				if(tamanho < 10) {
					System.out.println("MIN�MO DE 10 CARACTERES");
				}else {
					this.dataNascimento = dataNascimento;
				}
			}
		}
		//FIM DATA DE NASCIMENTO//
		
		
		//GENERO//
		public void setGenero(String Genero) {
			
			if(Genero.isEmpty()) {
				System.out.println("NAO DIGITOU UM GENERO");
				System.exit(0);
			}else {
				if (Genero.equalsIgnoreCase("FEMININO")) {
					this.genero = Genero;
			}else {
				if (Genero.equalsIgnoreCase("MASCULINO")) {
					this.genero = Genero;
			}else {
				if (Genero.equalsIgnoreCase("OUTRO")) {
					this.genero = Genero;
				}else {
					System.out.println("GENERO INVALIDO");
					System.exit(0);
						}
					}	
				}
			}
		}
	}
		//FIM GENERO//

	
	