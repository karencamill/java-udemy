package entities;

public class Product {

    // Atributos do produto
    public String name;
    public double price;
    public int quantity;

    // Calcula o valor total do estoque (preço * quantidade)
    public double totalValueInStock() {
        return price * quantity;
    }

    // Adiciona produtos ao estoque
    public void addProdutcs(int quantity) {
        // this.quantity = atributo da classe
        // quantity = parâmetro passado no método
        this.quantity += quantity;
    }

    // Remove produtos do estoque
    public void removeProdutcs(int quantity) {
        this.quantity -= quantity;
    }

    // Retorna uma representação em texto do produto
    // É chamado automaticamente quando fazemos System.out.println(product)
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price) // Formata o preço com 2 casas decimais
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock()); // Mostra valor total
    }

}
