package Vehicle;

public class InstanceOfExample {
	
//1. Vehicle      superclass 
	//2. HeavyVehicle subclass van Vehicle 
		//3. Truck        subclass van HeavyVehicle
	//2. LightVehicle subclass van Vehicle
		
	static boolean result;
    static HeavyVehicle hV = new HeavyVehicle();
    static Truck t = new Truck();
    static HeavyVehicle hv2 = null;
    public static void main(String[] args) {
        result = hV instanceof HeavyVehicle; 
        System.out.print("hV is an HeavyVehicle: " + result + "\n"); //true
        result = t instanceof HeavyVehicle;
        System.out.print("T is an HeavyVehicle: " + result + "\n"); //true
        result = hV instanceof Truck;
        System.out.print("hV is a Truck: " + result + "\n"); //false
        result = hv2 instanceof HeavyVehicle;
        System.out.print("hv2 is an HeavyVehicle: " + result + "\n"); //false
        hV = t; //Cast form child to parent
        result = hV instanceof Truck;
        System.out.print("hv is a Truck: " + result + "\n"); //false
        t = (Truck) hV; //Explicit Cast form parent to child
        result = t instanceof HeavyVehicle;
        System.out.print("t is an HeavyVehicle: " + result + "\n"); //false
    }
}
