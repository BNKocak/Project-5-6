import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 * Created by Admin on 25-10-2016.
 */
public class mongodb {
    MongoClient mongoClient = new MongoClient("mikenachtigaal.nl", 27017);
    MongoDatabase db = mongoClient.getDatabase("test");

    public void addTest(){
        db.getCollection("Test").insertOne(new Document("Info",
                new Document()
                    .append("bsn", "2058741963")
                    .append("naam", "kaas")
        ));
    }
}
