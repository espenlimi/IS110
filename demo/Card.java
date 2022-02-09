import java.util.*;
/**
 * Write a description of class Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Card
{
    private int value;
    private String symbol;

    public Card(int value, String symbol)
    {
        
        if(value >0 && value <=13 && CardValues.getCardSymbols().contains(symbol))
        {
            this.value = value;
            this.symbol = symbol;
        }
    }
    public void print()
    {
        System.out.println("" + value + " "+symbol);
    }
    public void setCardValues(int value, String symbol)
    {
      if(value >0 && value <=13 && CardValues.getCardSymbols().contains(symbol))
        {
            this.value = value;
            this.symbol = symbol;
        }
    }

}
