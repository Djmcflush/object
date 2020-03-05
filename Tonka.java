import Truck.java;

class Tonka implement Truck{
    private String make;
    private int Weight;
    private int numAxles;

    public Tonka(int numAxles, int Weight){
        this.numAxles = numAxles;
        this.Weight = Weight;
    } 
    public int getAxles(){
        return this.numAxles;
    }
    public int getTotalWeight(){
        return this.Weight;
    }
    public String make(){
        return this.make;
    }



}