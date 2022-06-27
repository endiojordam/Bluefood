package endio.Bluefood.domain.cliente;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import endio.Bluefood.domain.usuario.Usuario;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;



@SuppressWarnings("serial")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
@Entity
public class Cliente extends Usuario{
	
	
	
	@NotBlank(message = "O campo CPF não pode ser vazio")
	@Pattern(regexp = "[0-9]{11}?", message ="O CPF não tem tamanho válido")
	@Column(length = 11)
	private String cpf;
	
	@NotBlank(message = "O campo CEP não pode ser vazio")
	@Pattern(regexp = "[0-9]{8}?", message ="O CEP não tem tamanho válido") 
	@Column(length = 8)
	private String cep;
	
	

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}


}
