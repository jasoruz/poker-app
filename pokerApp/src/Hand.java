public final class Hand {
    
    public static final int HAND_SIZE = 5;

    public enum HandType {
        
        HIGH_CARD,
        PAIR, 
        TWO_PAIR,
        THREE_OF_A_KIND,
        STRAIGHT,
        FLUSH, 
        FULL_HOUSE,
        FOUR_OF_A_KIND,
        STRAIGHT_FLUSH,
        ROYAL_FLUSH
    }

    private Hand() {}
}
