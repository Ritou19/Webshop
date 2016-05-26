package ch.hearc.ig.odi.webshop.business;

/**
 *
 * @author steven.habegger
 */
public class Product {
    private Long id;
    private String name;
    private Long quantity;

    /**
     * Constructeur de Product
     *
     * @param id Identifiant du panier
     * @param name Nom du panier
     */
    public Product(Long id, String name) {
        this.id = id;
        this.name = name;
        this.quantity = new Long(0);
    }

    /**
     * Getter et setter des attributs de Bag
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
    
    public void addQuantity(Long quantity) {
        this.quantity = this.quantity + quantity;
    }
    
}
