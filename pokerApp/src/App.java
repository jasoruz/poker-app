import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) throws Exception {
        
        Card card1 = new Card(Card.Suit.CLUBS, Card.Rank.ACE);
        System.out.println("As de treboles " + card1);
    }
}
