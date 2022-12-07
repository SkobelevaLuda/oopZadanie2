public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada ", "Granta, ", 1.7, " желтая, ", 2015,
                " Россия");
        lada.cars();
        Car audi = new Car("Audi ", "A8 50 L TDI quattro ", 3.0, " черная, ",
                2020, " Германия");
        audi.cars();

        Car bmv = new Car("BMW ", "Z 8, ", 3.0, " черная, ", 2021,
                " Германия");
        bmv.cars();

        Car kia = new Car("Kia ", "Sportage 4-го поколения, ", 2.4, " красная, ",
                2015, " Южная Корея");
        kia.cars();

        Car hyundai = new Car("Hyundai ", "Avante, ", 1.7, " оранжевая, ",
                2016, " Южная Корея");
        hyundai.cars();

    }
}
