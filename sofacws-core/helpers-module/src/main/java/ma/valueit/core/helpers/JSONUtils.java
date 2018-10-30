package ma.valueit.core.helpers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Created by yelkarkouri-valueit on 25/05/18
 */
public class JSONUtils {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static String toJSON(Object obj) throws JsonProcessingException {
        String jsonString = mapper.writeValueAsString(obj);

        return jsonString;
    }

    public static <T> T toObject(String jsonString, Class<T> clazz) throws IOException {
        T obj = mapper.readValue(jsonString, clazz);

        return obj;
    }

}
