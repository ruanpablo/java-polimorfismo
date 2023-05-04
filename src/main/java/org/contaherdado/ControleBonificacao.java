package org.contaherdado;

public class ControleBonificacao {

    private double soma;

    public void registra(Funcionario f) { //coloca-se a referência mais genérica, pois abrange todos os tipos de funcionário
                                            //e executa segundo o tipo de objeto
        double bonificacao = f.getBonificacao();
        this.soma += bonificacao;
        //vantagem do polimorfismo, não precisar especificar o tipo de objeto quando há herança, apenas colocar a classe mais genérica
    }
    //criar método com referências genéricas não necessita altera esse código quando criado outros tipos específicos com herança
    //aplicada a essa genérica

    public double getSoma() {
        return soma;
    }
}
