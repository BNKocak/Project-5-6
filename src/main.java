import database.mongodb;

import static spark.Spark.*;

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
    }
}