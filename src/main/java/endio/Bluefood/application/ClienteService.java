package endio.Bluefood.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import endio.Bluefood.domain.cliente.Cliente;
import endio.Bluefood.domain.cliente.ClienteRepository;

@Service
public class ClienteService {
	
	
	@Autowired
	private ClienteRepository clienteRepository;

	public void  saveCliente(Cliente cliente) throws ValidationException {
		
		if (!validateEmail(cliente.getEmail(), cliente.getId())) {
			throw new ValidationException("O email está duplicado");
		}
		
		if (cliente.getId() != null) {
			Cliente clienteDB = clienteRepository.findById(cliente.getId()).orElseThrow();
			cliente.setSenha(clienteDB.getSenha());
			
		} else {
			cliente.encryptPasssword();
		}
		
		clienteRepository.save(cliente);
		
	}
	
	private boolean validateEmail (String email, Integer id) {
		
		Cliente cliente = clienteRepository.findByEmail(email);
		
		if (cliente != null) {
			if (id == null) {
				return false;
			}
			
			if(!cliente.getId().equals(id)) {
				return false;
			}
			
		}
		
		return true;
	}
}
