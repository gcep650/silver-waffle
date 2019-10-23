 

/**
 * This class is used to convert values into specified formats.
 * Can only convert a double into a price (USD) and an integer amount of seconds into time.
 * @author Gabriel C.
 * @version 1.0.0
 */
public class Converters
{
    /**
     * Converts a double into a price format (USD, 2 decimal places).
     * 
     * @param  price  The price as a double (Example: 5.633).
     * @return    String formatted into a price (Example: $5.63).
     */
    public static String getPrice(double price)
    {
        return String.format("$%2.2f", price);
    }

    /**
     * Converts an integer amount of seconds into time (minutes and seconds only).
     *
     * @param  length  The length in seconds (Example: 128).
     * @return    String formatted into minutes and seconds (Example: 02:08).
     */
    public static String getLength(int length)
    {
        int seconds = length % 60;
        int minutes = length / 60;
        return String.format("%02d:%02d", minutes, seconds);
    }

}
