package datatypes;

import java.util.List;

public class Product {

    private String id;
    private String categorie;
    private String naam;
    private String description;
    private Float price;
    private Integer voorraad;
    private String imagepath;
    private List<String> specs;

    public Product(String id,String categorie,String naam,String description,Float price, Integer voorraad,
                   String imagepath, List<String> specs) {
        this.id = id;
        this.categorie = categorie;
        this.naam = naam;
        this.description = description;
        this.price = price;
        this.voorraad = voorraad;
        this.imagepath = imagepath;
        this.specs = specs;
    }

    public String getId() {
        return id;
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
