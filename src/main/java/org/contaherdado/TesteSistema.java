package org.contaherdado;

public class TesteSistema {
    public static void main(String[] args) {
        Gerente gerenteAlberto = new Gerente();
        gerenteAlberto.setSenha(2222);

        Administrador adm = new Administrador();
        adm.setSenha(2223);

        SistemaInterno sistema = new SistemaInterno();
        sistema.autentica(gerenteAlberto);
        sistema.autentica(adm);


    }
}
