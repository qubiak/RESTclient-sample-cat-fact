package src;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class RestClient {

    public static void main(String[] args) throws IOException {

        URL urlCatFakt = new URL("https://cat-fact.herokuapp.com/facts/random");
        InputStreamReader readerCatFakt = new InputStreamReader(urlCatFakt.openStream());

        CatFakt catFakt = new Gson().fromJson(readerCatFakt, CatFakt.class);

        System.out.println(catFakt.getText());

        //If the answer is one-line and it is not worth implementing the model

        URL urlCatImage = new URL("https://aws.random.cat/meow");
        InputStreamReader readerCatImage = new InputStreamReader(urlCatImage.openStream());
        JsonObject jsonObject =  JsonParser.parseReader(readerCatImage).getAsJsonObject();
        String object =  jsonObject.get("file").getAsString();
        System.out.println(object);
    }
}
