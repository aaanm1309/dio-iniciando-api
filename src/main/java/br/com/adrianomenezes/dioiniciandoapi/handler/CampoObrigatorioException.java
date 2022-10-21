package br.com.adrianomenezes.dioiniciandoapi.handler;

public class CampoObrigatorioException extends BusinessException{
    public CampoObrigatorioException(String campo) {
        super("O campo %s é obrigatório",campo);
    }

    public CampoObrigatorioException(String mensagem, Object... params) {
        super(mensagem, params);
    }
}
