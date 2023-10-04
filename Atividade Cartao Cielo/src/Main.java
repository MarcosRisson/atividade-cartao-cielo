import br.edu.umfg.estrategia.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception{
        Produto produto1 = new Produto("0001",
                "Coca cola 350ml", 3.59);
        Produto produto2 = new Produto("0002",
                "X-salada", 15.99);
        Carrinho carrinho = new Carrinho();

        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);


        carrinho.pagar(new MeioDePagamentoCartaoDeDebitoCielo("7849561257541236", "09478494910", "978", "08/25"));
        carrinho.pagar(new MeioDePagamentoCartaoDeCreditoCielo("9453257810920347", "09478494910", "275", "10/26"));

        carrinho.pagar(new MeioPagamentoDinheiroEstrategia());
    }
}