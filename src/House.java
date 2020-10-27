public class House { //House Class

    // instance variables
    private double purchasePrice;
    private int initialPrice;
    private int energyRating;
    private char councilTax;
    private String houseType;
    private String hasGarage;
    private String address;
    private String owner;
    private String houseChenge; //End of instance variables

    //Constructor for objects of class House
    public House(int initialPrice, int energyRating, char councilTax, String houseType, String hasGarage, String address) {
        this.initialPrice = initialPrice;
        this.energyRating = energyRating;
        this.councilTax = councilTax;
        this.houseType = houseType;
        this.hasGarage = hasGarage;
        this.address = address;
    }

    //Get Purchase Price
    public double getPurchasePrice() {
        return purchasePrice;
    }

    //Get House Type
    public String getHouseType() {
        return houseType;
    }

    //Get adress
    public String getAddress() {
        return address;
    }

    //Get Owmer
    public String getOwner() {
        return owner;
    }

    //Get if House has Chenge
    public String getHouseChenge() {
        return houseChenge;
    }

    //Get Purchase Price
    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    //Set Owner
    public void setOwner(String owner) {
        this.owner = owner;
    }

    // set House Chenge
    public void setHouseChenge(String houseChenge) {
        this.houseChenge = houseChenge;
    }

    public static void main(String[] args) //Main method
    {
        House a = new House(64849, 3, 'C', "4 Bedroom Detached", "no garage", "456 Jule Close Road"); //House A Object

        System.out.println("\n HOUSE A DETAIlS: \n"); //new line

        a.setPurchasePrice(85000); //set purchase price house A
        a.setOwner("Munef");  //new owner house A
        a.printDetails();     //print house A details

        System.out.println("\n\n MORE DETAIlS:"); //new line

        System.out.println(a.checkHomeEnergy()); //print energy check house A
        a.goingGreener("I have increased the area of the house from the back garden"); //More info house A

        System.out.println("\n SOLD: "); //new line

        a.sall("Ali", 35000);  //Sale info house B

        System.out.println("\n HOUSE B DETAIlS: \n"); //new line

        House b = new House(62330, 2, 'A', "2 Bedroom Flat", "6 garage", "24 Bolton Road");  //House B Object

        b.setPurchasePrice(73000); //set purchase price house B
        b.setOwner("John");  //new owner house B
        b.printDetails();    //print house B details

        System.out.println("\n \n MORE DETAIlS:"); //new line

        System.out.println(b.checkHomeEnergy());  //print energy check house B
        b.goingGreener("I added another shower room");  //More info house B
        b.goingGreener("and new 1 bedroom in the 2th flore");  //More info house B

        System.out.println("\n SOLD: "); //new line
        b.sall("Nosa", 50000); //Sale info house B
    } //End of the main method


    public void sall(String newOwner, double newPurchasePrice)  //Sall method
    {
        setOwner(newOwner); //Set new owner
        setPurchasePrice(newPurchasePrice); //set new purchase price

        //Print sale info
        System.out.println("      " + "This house was sold with a price of £" + getPurchasePrice() + ", and the new owner is " + getOwner() + ".");
    }  //End Sall method

    public String checkHomeEnergy() //Checking house energy raiting method
    {
        //Return Ternary operator  that evaluates energy rating
        return (energyRating < 3) ? "\n      Be aware that extra green taxes may be imposed on this house," : "\n      This house will not be subject to extra taxes.";
    } //Checking house energy raiting method

    public void goingGreener(String houseChenge) //More info and changes in houses method
    {
        setHouseChenge(houseChenge); //set house change

        System.out.println("      " + getHouseChenge() + "."); //print house change
    } //End of More info and changes in houses method

    public void printDetails() //print house details
    {
        System.out.print("This house is a " + getHouseType() + ", at " + getAddress());
        System.out.println(", with an original purchase price of £" + initialPrice + ".");
        System.out.print("It's home energy rating is " + energyRating);
        System.out.print(", the current price is £" + getPurchasePrice());
        System.out.println(", and its council Tax Band is " + councilTax+".");
        System.out.print("It has had 2 owners and the current owner is " + owner+".");
    } //End of print house details
}
