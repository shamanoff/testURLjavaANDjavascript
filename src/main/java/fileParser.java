import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;

public class fileParser {

    File input = new File("../test1.html");
    Document doc = Jsoup.parse(input, "UTF-8", "http://example.com/");

    public fileParser() throws IOException {

    }


}
