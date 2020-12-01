package src;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class RestClient {

    public static void main(String[] args) throws IOException {

        URL url = new URL("https://cat-fact.herokuapp.com/facts/random");
        InputStreamReader reader = new InputStreamReader(url.openStream());

        CatFakt catFakt = new Gson().fromJson(reader, CatFakt.class);

        System.out.println(catFakt.getText());
    }
}
