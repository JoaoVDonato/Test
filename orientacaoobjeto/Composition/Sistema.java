package orientacaoobjeto.Composition;

public class Sistema {
    public static void main(String[] args) {
        Cliente Fran = new Cliente("Francielle");

        Compra compra1 = new Compra();
        compra1.adicionarItem("Iphone 11", 4499.90, 1);
        compra1.adicionarItem("alfajor", 10.00, 5);

        Compra compra2 = new Compra(); 
        compra2.adicionarItem("Pulseira de Ouro", 5800.90, 1);
        compra2.adicionarItem("Samsung Tab 6", 3600.00, 1);

         Fran.compras.add(compra1);
         Fran.compras.add(compra2);

        double compraFinalizada = Fran.obterValorTotal();

        System.out.println("Francielle você gastou: R$ " +  compraFinalizada);

    }
    
}
