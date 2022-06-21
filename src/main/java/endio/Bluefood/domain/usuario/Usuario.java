package endio.Bluefood.domain.usuario;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

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
	private Integer id;
	
	private String nome;
	
	private String email;
	
	private String senha;
	
	private String telefone;
}
