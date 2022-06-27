package endio.Bluefood.domain.usuario;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import endio.Bluefood.util.StringUtils;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@MappedSuperclass
public class Usuario implements Serializable{

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@NotBlank(message="O campo nome não pode ser vazio")
	@Size(max = 80, message = "O nome é muito grande")
	private String nome;
	
	@NotBlank(message="O campo e-mail não pode ser vazio")
	@Size(max = 60, message = "O e-mail é muito grande")
	@Email(message = "O e-mail é inválido")
	private String email;
	
	@NotBlank(message="O campo senha não pode ser vazio")
	@Size(max = 80, message = "A senha é muito grande")
	private String senha;
	
	@NotBlank(message="O campo telefone não pode ser vazio")
	@Pattern(regexp = "[0-9]{10,12}?", message ="O Telefone não tem tamanho válido")
	@Column(length= 11, nullable = false)
	private String telefone;
	
	public void encryptPasssword() {
		
		this.senha = StringUtils.encrypt(this.senha);
		
		
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
