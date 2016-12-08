import static spark.Spark.*;
import spark.Route;
import spark.Request;
import spark.Response;

public class Library {
    public static void main(String[] args) {
        get(new Route("/hello") {
            public Object handle(Request request, Response response) {
        	return "Hello World";
            }
        });
    }
}
