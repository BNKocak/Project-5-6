package database;

import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.MongoWriteException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;
import datatypes.Account;
import org.bson.Document;

public class mongodb {
    private MongoClient mongoClient = new MongoClient("mikenachtigaal.nl", 27017);
    private MongoDatabase db = mongoClient.getDatabase("test");

    public boolean addAccount(Account acc) {
        Boolean status = true;
        try {
            db.getCollection("accounts").insertOne(
                    new Document()
                            .append("voornaam",acc.getVoornaam())
                            .append("achternaam",acc.getAchternaam())
                            .append("isadmin",false)
                            .append("email",acc.getEmail())
                            .append("wachtwoord",acc.getWachtwoord())
                            .append("mobiel_nummer",acc.getMobielnummer())
                            .append("huis_nummer",acc.getHuistelnummer())
                            .append("favorites",new Document())
                            .append("winkelwagen", new Document())
                            .append("wishlist", new Document())
                            .append("adres", new Document()
                                    .append("land",acc.getAdres().get(0))
                                    .append("stad",acc.getAdres().get(1))
                                    .append("postcode",acc.getAdres().get(2))
                                    .append("straat",acc.getAdres().get(3))
                                    .append("huisnummer",acc.getAdres().get(4)))

            );
        } catch (MongoWriteException exc) {
            status = false;
        }
        return status;
    }

    public void addTest(){
        db.getCollection("accounts").insertOne(
                new Document().append("email", "keeskaas@foobar.com")
        );
    }
}
