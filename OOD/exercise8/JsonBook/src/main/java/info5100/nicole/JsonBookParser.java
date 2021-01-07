package info5100.nicole;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * Program: JsonBook
 * CreatedBy: Nicole_Z
 * CreatDate: 12/14/2020
 * Description:
 **/

public class JsonBookParser {
    private static String getJsonFromResources(String fileName) throws IOException {
        InputStream jsonStream = JsonBookParser.class.getClassLoader().getResourceAsStream(fileName);
        BufferedReader jsonReader = new BufferedReader(new InputStreamReader(jsonStream));

        StringBuilder json = new StringBuilder();
        String line = jsonReader.readLine();
        while (line != null) {
            json.append(line);
            line = jsonReader.readLine();
        }
        jsonReader.close();
        return json.toString();
    }

    private static void printResourceFileToConsole(String fileName) throws IOException {
        InputStream inputStream = JsonBookParser.class.getClassLoader().getResourceAsStream(fileName);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line = bufferedReader.readLine();
        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
    }

    public static void main(String[] args) throws IOException, URISyntaxException {
        String fileName = "book.json";
        // print initial file to the console
        System.out.println("Initial json file:");
        printResourceFileToConsole(fileName);
        // decoding json file to java object
        String json = getJsonFromResources(fileName);
        JSONArray books = new JSONObject(json).getJSONArray("books");
        // add a new book to the json object programmatically
        JSONObject newBook = new JSONObject();
        newBook
                .put("title", "Book" + books.length())
                .put("publishedYeah", books.length())
                .put("numOfPages", 100 + books.length())
                .put("authors", Arrays.asList("Author1", "Author2"));
        books.put(newBook);
        // write out put json to file
        JSONObject outputJson = new JSONObject();
        outputJson.put("books", books);
        URL url = JsonBookParser.class.getClassLoader().getResource(fileName);
        File file = Paths.get(url.toURI()).toFile();
        String filePath = file.getAbsolutePath();
        FileWriter fileWriter = new FileWriter(filePath); // filePath: ./target/classes/book.json
        fileWriter.write(outputJson.toString(2));
        fileWriter.flush();
        // print final file to the console
        System.out.println("Final json file:");
        printResourceFileToConsole(fileName);
    }
}
