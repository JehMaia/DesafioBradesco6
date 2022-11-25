package tech.ada.challenge.StatusCartao.servico;

import org.springframework.stereotype.Service; //acrescentado conforme mentoria

import tech.ada.challenge.StatusCartao.resposta.RespostaCartao;
import java.util.UUID;

@Service //acrescentado por Jessica conforme mentoria
public class ConsultarCartaoServico {
    public RespostaCartao executar(String statusEntrega) {
            RespostaCartao respostaCartao =  new RespostaCartao();
            respostaCartao.setStatusEntrega(UUID.randomUUID().toString());
            return respostaCartao;
    }



}
