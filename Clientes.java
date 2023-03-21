package ProjetosProprios.JonBank;

import java.util.ArrayList;

public class Clientes {

    private ArrayList<Cadastro> cadastros = new ArrayList<>();

    public boolean salvar(Cadastro C) {
      if(C != null) {
          cadastros.add(C);
          return true;
      }else {
          return false;
      }
    }
    public ArrayList<Cadastro> retornarTodos () {
        return cadastros;
    }


}
