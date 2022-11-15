package tech.ada.challenge.StatusCartao.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.ada.challenge.StatusCartao.entidades.AvisoRecebimento;
import tech.ada.challenge.StatusCartao.entidades.Cliente;

@Repository
public interface AvisoRecebimentoRepositorio extends JpaRepository <AvisoRecebimento, String> {
}
