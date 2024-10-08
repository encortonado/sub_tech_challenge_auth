package br.com.fiap.tech.sub_tech_challenge_auth.application.client.ports;

import br.com.fiap.tech.sub_tech_challenge_auth.application.client.entities.ClientEntity;

public interface IClientService {

    ClientEntity registraCliente(ClientEntity clienteDTO);

    ClientEntity buscaClientePorCPF(String cpf);

    Boolean login(String cpf, String senha);

}
