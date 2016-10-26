import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import static spark.Spark.*;
/**
 * Created by Admin on 25-10-2016.
 */
public class main {

    static mongodb db = new mongodb();
    static String name;
    public static void main(String[] args) {
//        db.addTest();
        get("/hello", (req, res) ->  "Hello World");
        get("/test/:name", (req, res) -> {
            name = req.params(":name");
            System.out.println(name);
            return "Hello: " + req.params(":name");
            }
        );
    };
}