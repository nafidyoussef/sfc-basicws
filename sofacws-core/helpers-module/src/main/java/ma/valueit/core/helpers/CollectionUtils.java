package ma.valueit.core.helpers;

import java.util.Collection;

/**
 * Created by valueit-mac-yelansari on 3/21/18.
 */
public class CollectionUtils extends org.springframework.util.CollectionUtils{
    public static boolean containsAll(Collection<?> source, Collection<?> candidates) {
        if (isEmpty(source) || isEmpty(candidates)) {
            return false;
        }
        for (Object candidate : candidates) {
            if (!source.contains(candidate)) {
                return false;
            }
        }
        return true;
    }
}
