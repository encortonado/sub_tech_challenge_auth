package br.com.fiap.tech.sub_tech_challenge_auth.entrypoint.persistance;

import br.com.fiap.tech.sub_tech_challenge_auth.application.client.entities.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, Long> {

    Optional<ClientEntity> findByCpf(String cpf);
}
