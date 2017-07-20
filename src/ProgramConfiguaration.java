public final class ProgramConfiguaration {
    private static int connectionLimit;
    private static int portNumber;
    private static String URL;
    private static int timeout;

    private static ProgramConfiguaration instance = null;

    private ProgramConfiguaration() {
    }

    public static ProgramConfiguaration getInstance() {
        if(instance==null){
            instance = new ProgramConfiguaration();
        }
        return instance;
    }

    public static void setInstance(ProgramConfiguaration instance) {
        ProgramConfiguaration.instance = instance;
    }

    public static int getConnectionLimit() {
        return connectionLimit;
    }

    public static void setConnectionLimit(int connectionLimit) {
        ProgramConfiguaration.connectionLimit = connectionLimit;
    }

    public static int getPortNumber() {
        return portNumber;
    }

    public static void setPortNumber(int portNumber) {
        ProgramConfiguaration.portNumber = portNumber;
    }

    public static String getURL() {
        return URL;
    }

    public static void setURL(String URL) {
        ProgramConfiguaration.URL = URL;
    }

    public static int getTimeout() {
        return timeout;
    }

    public static void setTimeout(int timeout) {
        ProgramConfiguaration.timeout = timeout;
    }
}
