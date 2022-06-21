package endio.Bluefood.domain.cliente;

import javax.persistence.Entity;

import endio.Bluefood.domain.usuario.Usuario;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;



@SuppressWarnings("serial")
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
@Entity
public class Cliente extends Usuario{
	
	private String cpf;
	
	private String cep;


}
