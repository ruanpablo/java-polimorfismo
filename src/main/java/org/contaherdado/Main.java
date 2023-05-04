package org.contaherdado;

public class Main {
    public static void main(String[] args) {
        Funcionario nico = new Gerente();
        nico.setSalario(2850.89);
        nico.setNome("Nico Steppat");
        nico.setCpf("22232739927");

        System.out.println(nico.getBonificacao());
        System.out.println(nico.getBonificacao());
    }
}
