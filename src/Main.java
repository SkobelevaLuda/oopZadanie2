import animals.Cat;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada ", "Granta, ", 1.7, " желтая, ", 2015,
                " Россия", " автомат ", " седан", А778КК777, 5,
                "зима");

        Car audi = new Car("Audi ", "A8 50 L TDI quattro ", -3.0, " черная, ",
                2020, " Германия", "автомат ", " седан, ", "Е879ВК71",
                5, "зима");


        Car bmv = new Car("BMW ", "Z 8, ", 3.0, " черная, ", 2021,
                " Германия", "автомат", " седан ", " А255КК55 ", 5,
                " зима");


        Car kia = new Car("Kia ", "Sportage 4-го поколения, ", 2.4, " красная, ",
                2015, " Южная Корея", "робот", "хечбек", "Т997ТТ99",
                5, "лето");

        Car hyundai = new Car("Hyundai ", "Avante, ", 1.7, " оранжевая, ",
                -55, " Южная Корея", "механическая", "седан", "Н556АА17",
                5, "лето");
        System.out.println(lada.);






        Cat myrzik = new Cat("Мурзик");
        myrzik.getAge();
        myrzik.meow();

        Cat begemot = new Cat("Бегемот",-5);
        begemot.meow();

        System.out.println(" У кота "+myrzik.getName()+" "+myrzik.getFriends().length+" друзей");
        myrzik.addFriend (begemot);

        System.out.println(" У кота "+myrzik.getName()+" "+myrzik.getFriends().length+" друзей");
        //myrzik.friends[]meow;
    }

}
