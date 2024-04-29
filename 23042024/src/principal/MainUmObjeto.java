package principal;

import umobjeto.UmObjeto;

public class MainUmObjeto {
    public static void main(String[] args) {
        UmObjeto umObjetoInstancia = UmObjeto.pegaInstancia();
        System.out.println(umObjetoInstancia.toString());

    }
}
