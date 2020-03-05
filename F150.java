import Truck.java;

class F150 implements Truck{
    private String make;
    private int Weight;
    private int numAxles;

    public F150(int numAxles, int Weight){
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