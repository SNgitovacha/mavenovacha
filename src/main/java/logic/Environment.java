package logic;

public enum Environment {

    GOOGLE_RS, GOOGLE_COM, PROPERTY;

    private static final String DEFAULT_ENVIRONMENT = "com";

    static{
        System.setProperty("google.rs", "https://www.google.rs/");
        System.setProperty("google.com", "https://www.google.com");
    }

    public String getURL(){

        String url = "";

        switch (this){
            case GOOGLE_RS:
                url = System.getProperty("google_rs");
                break;
            case GOOGLE_COM:
                url = System.getProperty("google_com");
                break;
            case PROPERTY:
                switch (System.getProperty("url", DEFAULT_ENVIRONMENT)) {
                    case "rs":
                        url = System.getProperty("google_rs");
                        break;
                    case "com":
                        url = System.getProperty("google_com");
                        break;
                }
        }
        return url;
    }
}
