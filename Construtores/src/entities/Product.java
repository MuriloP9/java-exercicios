package entities;

public class Product { // Classe de entidade que representa um produto

    public String name;
    public double price;
    public int quantity;

    public Product(){

    }
    // Construtor com todos os atributos
    public Product(String name, double price, int quantity) {
        this.name = name;       // Referência ao atributo da classe
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Construtor sem quantidade inicial
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Calcula o valor total em estoque
    public double totalValueInStock() {
        return price * quantity;
    }

    // Adiciona produtos ao estoque /* metodo
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    // Remove produtos do estoque
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    // Retorna a representação do objeto em formato de texto
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
