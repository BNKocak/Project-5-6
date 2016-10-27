package datatypes;

import java.util.List;

public class Product {

    private String product_id;
    private String categorie;
    private String naam;
    private String description;
    private Float price;
    private Integer voorraad;
    private String imagepath;
    private List<String> specs;

    public Product(String product_id,String categorie,String naam,String description,Float price, Integer voorraad,
                   String imagepath, List<String> specs) {
        this.product_id = product_id;
        this.categorie = categorie;
        this.naam = naam;
        this.description = description;
        this.price = price;
        this.voorraad = voorraad;
        this.imagepath = imagepath;
        this.specs = specs;
    }

    public String getProduct_id() {
        return product_id;
    }

    public String getCategorie() {
        return categorie;
    }

    public String getNaam() {
        return naam;
    }

    public String getDescription() {
        return description;
    }

    public Float getPrice() {
        return price;
    }

    public Integer getVoorraad() {
        return voorraad;
    }

    public String getImagepath() {
        return imagepath;
    }

    public List<String> getSpecs() {
        return specs;
    }
}
