package ch.hearc.ig.odi.webshop.business;

import java.util.HashMap;

/**
 *
 * @author steven.habegger
 */
public class Bag {
    private Long id;
    private String name;
    private HashMap<Long,Product> products;

    /**
     * Constructeur de Bag
     *
     * @param id Identifiant du panier
     * @param name Nom du panier
     */
    public Bag(Long id, String name) {
        this.id = id;
        this.name = name;
        this.products = new HashMap<Long,Product>();
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

    public HashMap<Long, Product> getProducts() {
        return products;
    }

    public void setProducts(HashMap<Long, Product> products) {
        this.products = products;
    }
    
    
    /**
     * Méthodes supplémentaires de recherche, suppression, ajout d'un film
     */
    public Product getProductById(Long id){
        return this.products.get(id);
    }
    
    public void addProduct(Product product) throws Exception {
        if (this.products.get(product.getId()) == null) {
            this.products.put(product.getId(), product);
        } else {
            throw new Exception("Ce produit est déjà dans le panier");
        }
    }
    
    public void removeProduct(Product product) throws Exception {
        if (this.products.get(product.getId()) != null) {
            this.products.remove(product.getId());
        } else {
            throw new Exception("Ce produit n'existe pas dans le panier");
        }

    }
}
