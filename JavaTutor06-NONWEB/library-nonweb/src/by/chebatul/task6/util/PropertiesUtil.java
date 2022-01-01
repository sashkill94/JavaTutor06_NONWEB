package by.chebatul.task6.util;

import java.io.IOException;
import java.util.Properties;

import lombok.experimental.UtilityClass;

@UtilityClass
public final class PropertiesUtil {

	private static final Properties PROPERTIES = new Properties();

	static {
		loadProperties();
	}

	public static String get(String key) {
		return PROPERTIES.getProperty(key);
	}

	private static void loadProperties() {
		try (var inputStream = PropertiesUtil.class.getClassLoader().getResourceAsStream("application.properties")) {
			PROPERTIES.load(inputStream);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
