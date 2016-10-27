import database.mongodb;
import datatypes.Account;

import java.util.Arrays;
import java.util.List;

import static spark.Spark.*;

public class main {

    static mongodb db = new mongodb();
    static String name;


    static List<String> adres = Arrays.asList("Nederland","Foobarstad","8008ie","Foobarstraat","1337");
    static Account acc = new Account("Glenn","Scholte","glennscholte@foobar.com","12345","0612345678","123456789", adres );

    public static void main(String[] args) {
        db.addAccount(acc);
//        get("/hello", (req, res) ->  "Hello World");
//        get("/test/:name", (req, res) -> {
//            name = req.params(":name");
//            System.out.println(name);
//            return "Hello: " + req.params(":name");
//            }
//        );
    }
}