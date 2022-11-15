package tech.ada.challenge.StatusCartao.servico;

import tech.ada.challenge.StatusCartao.requisicao.RequisicaoCartao;
import tech.ada.challenge.StatusCartao.resposta.RespostaCartao;
import java.util.UUID;
public class IncluirCartaoServico {
    public RespostaCartao executar(RequisicaoCartao requisicaoCartao) {
        RespostaCartao respostaCartao = new RespostaCartao();
        respostaCartao.setStatusEntrega(UUID.randomUUID().toString());
        respostaCartao.setNumeroCartao(requisicaoCartao.getNumeroCartao());
        return respostaCartao;
    }

}

