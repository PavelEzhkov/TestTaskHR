package poster;

public class PosterMain {

    private static final String EXCHANGE_NAME = "Messages";

    public static void main(String[] args) throws Exception {
        PosterExecutor posterExecutor = new PosterExecutor(EXCHANGE_NAME, "Test");
        }
    }

