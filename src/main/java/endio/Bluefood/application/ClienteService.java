package endio.Bluefood.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import endio.Bluefood.domain.cliente.Cliente;
import endio.Bluefood.domain.cliente.ClienteRepository;

@Service
public class ClienteService {
	
	
	@Autowired
	private ClienteRepository clienteRepository;

	public void  saveCliente(Cliente cliente) {
		clienteRepository.save(cliente);
	}

}
