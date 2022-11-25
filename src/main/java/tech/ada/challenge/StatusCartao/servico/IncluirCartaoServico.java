package tech.ada.challenge.StatusCartao.servico;

import org.springframework.stereotype.Service;
import tech.ada.challenge.StatusCartao.requisicao.RequisicaoCartao;
import tech.ada.challenge.StatusCartao.resposta.RespostaCartao;
import java.util.UUID;

@Service //incluido por Jessica conforme orientado na mentoria
public class IncluirCartaoServico {
    public RespostaCartao executar(RequisicaoCartao requisicaoCartao) {
        RespostaCartao respostaCartao = new RespostaCartao();
        respostaCartao.setStatusEntrega(UUID.randomUUID().toString());
        respostaCartao.setNumeroCartao(requisicaoCartao.getNumeroCartao());
        return respostaCartao;
    }

}

