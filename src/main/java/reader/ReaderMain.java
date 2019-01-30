package reader;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

public class ReaderMain {
    private static final String EXCHANGE_NAME = "Messages";

    public static void main(String[] args) throws Exception {
    ReaderExecutor readerExecutor = new ReaderExecutor(EXCHANGE_NAME);
    }
}
