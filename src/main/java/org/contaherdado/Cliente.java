package org.contaherdado;
//polimorfismo - obrigatório implementar os métodos - as interfaces obrigam - e alterar os métodos
//de acordo com a classe específica
//herança apenas quando o método é abstract - polimorfismo essa ideia de mudar - alterar
public class Cliente implements Autenticavel {

    private int senha;

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }
}
