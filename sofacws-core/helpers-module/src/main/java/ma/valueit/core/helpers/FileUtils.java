package ma.valueit.core.helpers;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by valueit-mac-yelansari on 3/21/18.
 */
public class FileUtils {
    public static String extractContentFromFile(final String fileName) throws IOException, SAXException, TikaException {
        BodyContentHandler handler = new BodyContentHandler();
        Metadata metadata = new Metadata();
        FileInputStream inputstream = new FileInputStream(new File(fileName));
        Parser parser = new AutoDetectParser();
        ParseContext pcontext = new ParseContext();
        parser.parse(inputstream, handler, metadata, pcontext);
        return handler.toString();
    }
}
