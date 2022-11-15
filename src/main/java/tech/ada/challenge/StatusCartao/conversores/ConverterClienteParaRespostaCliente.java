package tech.ada.challenge.StatusCartao.conversores;

import tech.ada.challenge.StatusCartao.entidades.Cliente;
import tech.ada.challenge.StatusCartao.entidades.Endereco;
import tech.ada.challenge.StatusCartao.requisicao.EnderecoRequisicao;
import tech.ada.challenge.StatusCartao.resposta.RespostaCliente;

public class ConverterClienteParaRespostaCliente {
    public static RespostaCliente converte(Cliente cliente){
        RespostaCliente respostaCliente = new RespostaCliente();
        respostaCliente.setNome(cliente.getNome());
        respostaCliente.setCpf(cliente.getCpf());
        if(!cliente.getEnderecoList().isEmpty()){
            Endereco endereco = cliente.getEnderecoList().iterator().next();
            EnderecoRequisicao enderecoRequisicao = new EnderecoRequisicao();
            enderecoRequisicao.setLogradouro(endereco.getLogradouro());
            respostaCliente.setEnderecoRequisicao(enderecoRequisicao);
        }

        return respostaCliente;
    }

}
