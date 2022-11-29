package tech.ada.challenge.StatusCartao.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tech.ada.challenge.StatusCartao.entidades.Cliente;
import java.util.Optional;
@Repository
public interface ClienteRepositorio extends JpaRepository <Cliente, String>{


    @Query("Select c FROM Cliente c inner join c.enderecoList Where c.cpf = identificador")
    Optional<Cliente> findCpf (@Param("identificador") String identificador);
    Optional<Cliente> findByCpf (String identificador);

    @Modifying Long deleteByCpf (String identificador);//Jessica mediante mentoria



}
