package tech.ada.challenge.StatusCartao.entidades;

import lombok.Data;

import javax.persistence.*;

/***
 * create table endereco (
 * id_endereco int identity (1,1) not null primary key, -- chave primária
 * logradouro varchar (150) not null,
 * numero varchar (10) not null,
 * complemento varchar (50),
 * bairro varchar (50) not null,
 * cidade varchar (50) not null,
 * estado varchar (2) not null,
 * CEP varchar (8) not null,
 * cpf varchar(11) not null, -- faz relação com a tabela cliente, através do cpf
 * foreign key (cpf) references cliente (cpf)
 * )
 */
@Entity
@Table(name = "endereco")
@Data
public class Endereco {

//    @Column(nullable = false) = não pode receber resultado nulo, tem que trazer alguma informação
//    @Column(nullable = true) = pode receber resultado nulo
//    @Column(name = "id_endereco") = caso a coluna no SQL esteja com um nome diferente do atributo da Classe
    @Id
    @Column(name = "id_endereco", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // usado para criação de ID's aleatórias
    private Long idEndereco;
    @Column(nullable = false)
    private String logradouro;
    @Column(nullable = false)
    private String numero; // endereço pode ter numeração 42A, por isso String e não Long
    @Column(nullable = true)
    private String complemento; // apartamento, bloco, etc
    @Column(nullable = false)
    private String bairro;
    @Column(nullable = false)
    private String cidade;
    @Column(nullable = false)
    private String estado;
    @Column(nullable = false)
    private String cep;
    @ManyToOne
    @JoinColumn (name = "cpf")
    private Cliente cliente; // um cliente pode ter muitos endereços

}
