package tech.ada.challenge.StatusCartao.entidades;

import lombok.Data;
import javax.persistence.*;

/***
 * create table empresa_transportadora (
 * bin varchar (6) not null, -- 6 primeiros números do cartão
 * tem_AR bit default 0 -- COMO USA BOOLEAN NO SQL?
 * ) -- QUEM É A ID DA TRANSPORTADORA?
 */

@Entity
@Table(name = "empresa_transportadora")
@Data


    //Acrescentado por Jessica mediante mentoria

    public enum Transportadora {

        CORREIOS, FLASH }


//    @Column(nullable = false) = não pode receber resultado nulo, tem que trazer alguma informação
//    @Column(nullable = true) = pode receber resultado nulo
//    @Column(name = "id_endereco") = caso a coluna no SQL esteja com um nome diferente do atributo da Classe

    //quem é o ID da transportadora?
    //@Column(nullable = false)
    //private String bin;
    //@Column(name = "tem_AR", nullable = false)
    //private boolean temAr; // tem que estar preenchido verdadeiro ou falso, não pode ser nulo!

    //@OneToOne
    //@JoinColumn(name = "numero_AR")
    //private AvisoRecebimento avisoRecebimento; // uma AR pertence a uma transportadora
    //desconsiderar, já que esta em cartao (orientação Matheus)


