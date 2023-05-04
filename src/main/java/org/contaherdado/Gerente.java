package org.contaherdado;
/* gerente é um funcionário ou gerente herda da classe funcionário. Gerente tem tudo que
funcionário tem e faz tudo que funcionario faz - vai fazer implements da interface autenticável e implementar seus métodos
obrigatoriamente*/
//classe Gerente é funcionário e assina(é) autenticável
public class Gerente extends Funcionario implements Autenticavel {

    private int senha;

    public double getBonificacao() {
//        return super.salario; //slarário está private em Funcionário, por isso não pode ser acessado por gerente
//        //super olha para cima, salário vem da classe mãe
//        System.out.println("Bonificação gerente");
        return super.getSalario();

    }
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
