public class Main {
    public static void main(String[] args) {


        Manager manager = new Manager (1, "Begüm Toy", 10000, "IT", 10);
        Developer developer = new Developer(2, "Buse Kat",4000,"Marketing","java" );

        manager.displayInfo();
        System.out.println("Bonus: "+ manager.calculateBonus());

        System.out.println("----------------------");

        developer.displayInfo();
        System.out.println("Bonus: "+ developer.calculateBonus());
    }
}