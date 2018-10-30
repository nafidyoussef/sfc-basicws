package ma.valueit.core.helpers;

import java.io.File;

public class StringUtils extends org.springframework.util.StringUtils {
    public static boolean isEmpty(Object str) {
        return (str == null || "".equals(str) || str.toString().trim().length() == 0);
    }

    public static boolean isEmpty(final CharSequence cs) {
        return cs == null || "".equals(cs) || cs.toString().trim().length() == 0;
    }

    public static String normalize(String string) {
        return normalize(string, true);
    }

	public static String normalize(String string, boolean removeSpace) {
		String result = string.replaceAll("[^a-zA-Z0-9 /._-]+", "")
				.replaceAll("[ ]{2,}", "[ ]{1}")
				.replaceAll("//", "/").trim();
		if (removeSpace)
			result = result.replace(" ", "_");
		return result;
	}

	public static String formatStringPath(String path) {
		String[] newpath = path.split(File.separator);
		path = "";
		for(int i=1;i<newpath.length;i++) {
			path += newpath[i];
		}
		return path;
	}
}