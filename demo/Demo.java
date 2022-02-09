import java.util.*;
/**
 * Write a description of class Demo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Demo
{
    private ArrayList<Card> cards;
    
    public Demo(){
        cards = new ArrayList<>();
        addMockData();
    }
    
    public void print()
    {
        new Cat();
        for(Card card : cards)
        {           
            card.print();
        }
    }
    
    private void addMockData(){
       for(String symbol : CardValues.getCardSymbols())
       {
            for(int cardValue = 1; cardValue <=13;cardValue++)
            {
                cards.add(new Card(cardValue, symbol));
            }
       }
    }
    
    // private void alterListContents()
    // {
        // System.out.println("STARTING TO ALTER LIST");
        // ListIterator<Cat> iterator = listOfStrings.listIterator();
        // while(iterator.hasNext()){
            // String value = iterator.next();
            // if(value.equals("add"))
            // {
                // iterator.add("Added in loop");
            // } 
            // else if(value.equals("delete"))
            // {    
                // iterator.remove();    
            // }
            // else if(value.equals("addInPlace"))
            // {
              // //  iterator."Added at index0 in loop");
            // }
            
            
            // System.out.println(value);
        // }    
        // System.out.println("DONE ALTERING LIST");
    // }
}
