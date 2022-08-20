package one.digitalinnovation.gof.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import one.digitalinnovation.gof.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
