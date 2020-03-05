import Tollbooth.java;
import F150.java;
import Tonka.java;
import Truck.java;

public class BaltimoreTollBooth{
    private int NumTrucks;
    private int TotalReciepts;
    private int CurrentTotal;
    private Truck truck;

    public reset(){
        this.NumTrucks =0;
        this.TotalReciepts =0;
        this.CurrentTotal= 0;
    }
    public int calculateToll(Truck truck){
        this.truck = truck;
        int price = this.truck.getTotalWeight() * 2 + this.truck.getAxles() * 3;
        this.CurrentTotal += price;
        System.out.println("Truck arrival- Num axles" + String(this.truck.getAxles()) + " Total Weight" + String(this.truck.getTotalWeight()) + " $" + String(price));
    }
    public void diplayData(){
        System.out.println("Number Trucks" + String(NumTrucks) + "TotalReciepts $" + String(CurrentTotal));
        reset();
    }
    




}