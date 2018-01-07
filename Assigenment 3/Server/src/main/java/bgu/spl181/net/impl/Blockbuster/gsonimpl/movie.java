package bgu.spl181.net.impl.Blockbuster.gsonimpl;

import static java.lang.Integer.*;

/**
 * This class represent a movie object with its information.
 * data member :
 *  	id := the movie id in the database.
 *  	name := the movie name that will be requested by the clients.
 *  	price := the cost to rent this movie.
 *  	bannedCountries := the banned countries that this movie cannot be broadcast into.
 * 	 	availableAmount := how many copies left to the server to rent to clients.
 * 		totalAmount := general amount of copies of this movie.
 */
public class movie {
    private String id;
    private String name;
    private String price;
    private String [] bannedCountries;
    private String availableAmount;
    private String totalAmount;

    /**
     * default constructor.
     * @param name
     * @param price
     * @param bannedCountries
     * @param totalAmount
     */
    public movie(String name, String price, String [] bannedCountries, String totalAmount){
        this.id = "0";
        this.totalAmount = totalAmount;
        this.availableAmount = totalAmount;
        this.bannedCountries = bannedCountries;
        this.name = name;
        this.price = price;
    }
    
    /**
     * rent this movie and reduce the current available amount of copies.
     */
    public void RentThisMovie(){
        int availableAmount = valueOf(this.availableAmount);
        availableAmount--;
        this.availableAmount = "" + availableAmount;
    }
    
    /**
     * @return a boolean that indicate if this movie can be rent by more clients.
     */
    public boolean IsThereAMovieLeft(){
        int availableAmount = valueOf(this.availableAmount);
        return availableAmount > 0;
    }
    
    /**
     * set the price for this movie.
     * @param price
     */
    public void setPrice(int price){
        this.price = "" + price;
    }
    
    /**
     * getter for the price movie.
     * @return price movie
     */
    public int getPrice(){
        return valueOf(price);
    }
    
    /**
     * setter for this movie ID
     * @param id
     */
    public void setId (int id){this.id = "" + id;}

    /**
     * getter for the movie name
     * @return this movie name
     */
    public String getName() {
        return name;
    }

    /**
     * getter for the movie ID
     * @return this movie ID
     */
    public int getId() {
        return valueOf(id);
    }
    
    /**
     * End of File.
     */
}
