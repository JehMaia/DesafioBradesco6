package tech.ada.challenge.StatusCartao.entidades;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

/***
 * create table aviso_recebimento (
 * numero_AR varchar (30) not null primary key, -- quantidade de caracteres no código de rastreio (chave primária)
 * status_entrega varchar (100) not null,
 * numero_cartao varchar (30) not null, -- faz relação com a tabela cartão, através do numero_cartao
 * foreign key (numero_cartao) references cartao (numero_cartao)
 * )
  */
@Entity
@Table(name = "aviso_recebimento")
@Data
public class AvisoRecebimento {

    //    @Column(nullable = false) = não pode receber resultado nulo, tem que trazer alguma informação
//    @Column(nullable = true) = pode receber resultado nulo
//    @Column(name = "id_endereco") = caso a coluna no SQL esteja com um nome diferente do atributo da Classe
    @Id
    @Column(name = "numero_AR", nullable = false)
    private String numeroAr;
    @Column(name = "status_entrega", nullable = false)
    private String statusEntrega;

    @OneToOne (mappedBy = "avisoRecebimento")
    private Cartao cartao;

}



