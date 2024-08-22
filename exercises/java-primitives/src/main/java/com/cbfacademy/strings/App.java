package com.cbfacademy.strings;
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    }

    public static String concatenate(String word1, String word2, String word3) {
        String first2 = word1.concat(word2);
            return first2.concat(word3) ;
    }

    public static Boolean areEqual(String word1, String word2) {
        Boolean equality = word1.equals(word2);
            return equality ;
    }

    public static String format(String item, int quantity, double price) {
       // Format the price with a pound (£) symbol and two decimal places
       String formattedPrice = String.format("£%.2f", price);
       // Format the output string with item, quantity, and price
       return String.format("Item: %s. Price: %s. Quantity: %d", item, formattedPrice,quantity);
   }
    
     
}
