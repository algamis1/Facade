import java.util.ArrayList;

public class Combo {

    ArrayList<Produto> produtos = new ArrayList<>();

    public void CriarCombo(int tipo){

        if(tipo == 2) {
            produtos.add(new Sobremesa("PUDIM", 7, "PEQUENO"));
        }

        produtos.add(new Burguer("X-BACON", 12, 140));
        produtos.add(new Bebida("PEPSI", 5, 339));
    }

    @Override
    public String toString() {
        String combo = "";

        for (Produto produto: produtos) {
            combo += produto.toString() + "\n";
        }

        return combo;
    }
}