package tech.ada.challenge.StatusCartao.entidades;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDate;

/***
 * create table cartao (
 * numero_cartao varchar (16) not null primary key, -- chave primária
 * status_cartao varchar (9) not null, -- ativo, cancelado, bloqueado
 * data_emissao date,
 * tipo_cartao varchar (8) not null, -- crédito, débito, múltiplo
 * bandeira varchar (6) not null, -- VISA, Master, Elo, Amex
 * prateleira bit default 0, -- COMO USA BOOLEAN NO SQL?
 * bin varchar (6) not null, -- 6 primeiros números do cartão
 * status_entrega varchar (100) not null,
 * numero_AR varchar (30) not null, -- quantidade de caracteres no código de rastreio
 * id_conta int identity (1,1) not null, -- faz relação com a tabela conta, através da id_conta
 * cpf varchar (11) not null, -- faz relação com a tabela cliente, através do cpf
 * foreign key (id_conta) references conta (id_conta),
 * foreign key (cpf) references cliente (cpf)
 * )
 */
@Entity
@Table(name = "cartao")
@Data
public class Cartao {

//    @Column(nullable = false) = não pode receber resultado nulo, tem que trazer alguma informação
//    @Column(nullable = true) = pode receber resultado nulo
//    @Column(name = "id_endereco") = caso a coluna no SQL esteja com um nome diferente do atributo da Classe
    @Id
    @Column(name = "numero_cartao", nullable = false)
    private String numeroCartao;
    @Column(name = "status_cartao", nullable = false)
    private String statusCartao;
    @Column(name = "data_emissao", nullable = false)
    private LocalDate dataEmissão;
    @Column(name = "tipo_cartao", nullable = false)
    private String tipoCartao;
    @Column(nullable = false)
    private String bandeira;
    @Column(name = "prateleira", nullable = false)
    private boolean temPrateleira; // tem que estar preenchido verdadeiro ou falso, não pode ser nulo!
    @Column(nullable = false)
    private String bin;
    @Column(name = "status_entrega", nullable = false)
    private String statusEntrega; // AR - tem que fazer a chave para vincular a entidade, ao invés de ficar descrito da forma que está
    @OneToOne
    @JoinColumn (name = "numero_AR")
    private AvisoRecebimento avisoRecebimento; // uma AR pertence a um cartão
    @ManyToOne
    @JoinColumn (name = "id_conta")
    private Conta conta; // uma conta pode ter muitos cartões
    @ManyToOne
    @JoinColumn (name = "cpf")
    private Cliente cliente; // um cliente pode ter muitos cartões

    //acrescentados por Jessica orientada na mentoria
    @Column (name = "tem_AR", nullable = false)
    private boolean temAr;

    @Column (name = "transportadora")
    private Transportadora transportadora;

}
