public class NewApplication {

public static void main(String...args) {

NewCar opel = new NewCar();
opel.name = "Opel";

NewCar fiat = new NewCar();
fiat.name = "Fiat";
System.out.println("Name of first car is: " + opel.name);
System.out.println("Name of second car is: " + fiat.name);

}

}