package domain;

public class ConfigurationManager {
	private static ConfigurationManager instance;

    	private String storeName;

    	private ConfigurationManager() {
        	// private constructor to prevent instantiation
    	}

    	public static ConfigurationManager getInstance() {
        	if (instance == null) {
            		instance = new ConfigurationManager();
        	}
        	return instance;
    	}

   	public void setStoreName(String storeName) {
    		this.storeName = storeName;
	}
}

