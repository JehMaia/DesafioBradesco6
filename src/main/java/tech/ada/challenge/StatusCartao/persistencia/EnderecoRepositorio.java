package tech.ada.challenge.StatusCartao.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.ada.challenge.StatusCartao.entidades.Cliente;
import tech.ada.challenge.StatusCartao.entidades.Endereco;
@Repository
public interface EnderecoRepositorio extends JpaRepository <Endereco, Long> {
    Long deleteByCliente(Cliente cliente);
    Endereco findByCliente(Cliente cliente);

}
