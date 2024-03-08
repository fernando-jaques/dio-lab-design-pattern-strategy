package ia.powered;

public class Main {
    public static void main(String[] args) {

        Pedido pedido01 = new Pedido();
        pedido01.setValor(1000);
        pedido01.setFrete(new FreteExpresso());

        System.out.println(pedido01.valorFrete());

        pedido01.setFrete(new FreteComun());

        System.out.println(pedido01.valorFrete());

        Pedido pedido02 = new Pedido();
        pedido02.setValor(1000);
        pedido02.setFrete(new FreteComun());

        System.out.println(pedido02.valorFrete());


    }
}