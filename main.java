import Tollbooth.java;
import F150.java;
import Tonka.java;
import Truck.java;
import BaltimoreTollBooth.java;


public class TestTollBooth {
Public static void main(String [] args){
	TollBooth booth = new BaltimoreTollBooth();

	Truck ford = new F150(5, 12000); 	// 5 axles and 12000 kilograms
	Truck nissan = new Tonka(2, 5000); 	// 2 axles and 5000kg 		Truck daewoo = new DaewooTruck(6, 17000); // ….
    Truck daewoo = new Tonka(2, 700)
	booth.calculateToll(ford);
	booth.displayData();
    booth.calculateToll(nissan);
	booth.reset();	// zero out receipts, print out aforementioned summary information.
	booth.calculateToll(daewoo);
	booth.displayData();	
}
}
