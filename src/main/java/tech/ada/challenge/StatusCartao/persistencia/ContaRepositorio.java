package tech.ada.challenge.StatusCartao.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.ada.challenge.StatusCartao.entidades.Conta;
@Repository
public interface ContaRepositorio extends JpaRepository <Conta, Long> {

}
