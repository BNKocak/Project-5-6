package datatypes;

import java.util.List;

public class Order {

    private String id;
    private String email;
    private String date;
    private List<String> adres;
    private List<List<String>> items;

    public Order(String id, String email, String date, List<String> adres, List<List<String>> items) {
        this.id = id;
        this.email = email;
        this.date = date;
        this.adres = adres;
        this.items = items;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getDate() {
        return date;
    }

    public List<String> getAdres() {
        return adres;
    }

    public List<List<String>> getItems() {
        return items;
    }
}
