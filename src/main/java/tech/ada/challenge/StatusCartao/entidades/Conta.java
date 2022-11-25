package tech.ada.challenge.StatusCartao.entidades;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/***
 * create table conta (
 * id_conta int identity (1,1) not null primary key, -- chave primária
 * agencia varchar (4) not null, -- quantidade de caracteres agencia sem dígito
 * numero_conta varchar (7) not null, -- quantidade de caracteres conta sem dígito
 * segmento varchar (9) not null, -- classic, exclusive, prime
 * tipo_conta varchar (8) not null, -- física, jurídica
 * status_conta varchar (8) not null, -- ativa, inativa
 * cpf varchar (11) not null, -- faz relação com a tabela cliente, através do cpf
 * numero_cartao varchar (16) not null -- faz relação com a tabela cartão, através do numero_cartao
 * foreign key (cpf) references cliente (cpf),
 * foreign key (numero_cartao) references cartao (numero_cartao)
 * )
 */
@Entity
@Table(name = "conta")
@Data
public class Conta {

//    @Column(nullable = false) = não pode receber resultado nulo, tem que trazer alguma informação
//    @Column(nullable = true) = pode receber resultado nulo
//    @Column(name = "id_endereco") = caso a coluna no SQL esteja com um nome diferente do atributo da Classe
    @Id
    @Column(name = "id_conta", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // usado para criação de ID's aleatórias
    private Long idConta;
    @Column(nullable = false)
    private String agencia;
    @Column(name = "numero_conta", nullable = false)
    private String numeroConta;
    @Column(nullable = false)
    private String segmento;
    @Column(name = "tipo_conta", nullable = false)
    private String tipoConta;
    @Column(name = "status_conta", nullable = false)
    private String statusConta;

    //excluido  por Jessica conforme mentoria
    //@ManyToMany
   // @JoinColumn (name = "cpf")
    //private Cliente cliente; // a conta com essa ID pode pertencer a mais de um cliente (conta conjunta)

    //incluso por Jessica conforme mentoria
    @ManyToMany
    @JoinTable (name = "Conta_Cliente",
    joinColumns =
    @JoinColumn (name = "id_conta", referencedColumnName = "id_conta"),
     inverseJoinColumns =
     @JoinColumn (name = "Cpf", referencedColumnName = "Cpf")

    )
    @OneToMany
    @JoinColumn(name = "numero_cartao")
    private List<Cartao> cartaoList; // o cartão com essa numeração pertence somente a essa conta

}
