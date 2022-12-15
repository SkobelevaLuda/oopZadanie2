import transport.*;

public class Main {
    public static void main(String[] args) {
        /*Car lada = new Car("Lada", "granta", 2010, "Россия", "седан", 5,
                " АКПП", 55);

        Car audi = new Car("Audi ", "A8 50 L TDI quattro ", 2020, " Англия",
                "седан", 5, " АККП", 40);


        Car bmv = new Car("BMW ", "Z 8, ", -2021, " Германия", "седан",
                7, "АККП", 10);


        Car kia = new Car("Kia ", "Sportage 4-го поколения, ", 2010, " Южная Корея ",
                "седан", 5, " РКПП", 100);

        Car hyundai = new Car("Hyundai ", "Avante, ", 2020, " Южная Корея ",
                "седан", 5, " РКПП ", 98);
        printInfo(lada);
        printInfo(audi);
        printInfo(bmv);
        printInfo(kia);
        printInfo(hyundai);

        Поезд «Ласточка», модель B-901, 2011 год выпуска в России, скорость передвижения — 301 км/ч, отходит от
        Белорусского вокзала и следует до станции Минск-Пассажирский. Цена поездки — 3500 рублей, в поезде 11 вагонов.
                Поезд «Ленинград», модель D-125, 2019 год выпуска в России, скорость передвижения — 270 км/ч, отходит
                от Ленинградского вокзала и следует до станции Ленинград-Пассажирский. Цена поездки — 1700 рублей, в
                поезде 8 вагонов.*/


        Train lastochka = new Train("B-901", "Россия,", 3500
        );
        Train leningrad = new Train("D-125", "Россия", 1700
        );
        /*printInfo2(lastochka);
        printInfo2(leningrad);

      Bus bus12=new Bus("12", 2022, " Россия ",100, 99);
        Bus bus15=new Bus("15", 2021, " Россия ",85,12);
        Bus bus155=new Bus("155", 2021, " Россия ",110,12);
        printInfo3(bus12);
        printInfo3(bus15);
        printInfo3(bus155);






    }
    private static void printInfo(Car car) {
        System.out.println(car.getBrand() + " " + car.getModel() + ", год выпуска: " + car.getYear() + ", страна: "
                + car.getCountry() + ", объем двигателя " + car.getEngineVolume()+", коробка передач"
                +car.getTransmission()+", тип кузова "+car.getBodyType()+", рег номер: "+ car.getRegistrtionNumber()+
                ", количество мест"+ car.getNumberOfSeats()+", "+(car.isTypeOfRubber()?"летняя":"зимняя")+" резина"+
                ", "+(car.getKey().isKeylessAccess()?"безключевой доступ":"ключевой доступ")+
                ", "+(car.getKey().isRemoteEngineStart()? "удаленный запуск": "обычный запуск")+", номер страховки"+
                car.getInsurance().getNumber()+", стоимость страховки: " +car.getInsurance().getCost()+
                ", срок действия страховки: "+car.getInsurance().getExpireDate()+", Можно заправлять бензином, дизелем " +
                "или заряжать на электропарковках,"+car.getFuelPercentage()+"%");
    }
    private static void printInfo2(Train train){
        System.out.println("Модель "+train.getBrand()+", год выпуска "+train.getYear()+", Страна производитель: "
                +train.getCountry()+", цеа билета: "+train.getPriceOfTrip()+", время в пути "+train.getTravelTime()+
                " , Станция отбытия "+ train.getStationName()+", станция прибытия "+ train.getFinalStop()+
                ", количество вагонов:"+train.getNamberOfWagons()+"Можно заправлять дизелем "+train.getFuelPercentage()+"%");
    }

    private static void printInfo3(Bus bus) {
        System.out.println("Модель " + bus.getBrand() + ", год выпуска " + bus.getYear() + ", Страна производитель: "
                + bus.getCountry() + ", максимальная скорось: " + bus.getMaxSpeed()+" Можно заправлять бензином " +
                "или дизелем "+bus.getFuelPercentage()+"%");*/

        Car audi2 = new Car(" Audi", " A-8", TypeOfBody.HACHBACK, 4);
        Car audi3 = new Car(" Audi", " A-10", TypeOfBody.COMPARTMENT, 2);
        Car audi4 = new Car(" Audi", " A-11", TypeOfBody.PICKUP, 2.2);
        Car audi5 = new Car(" Audi", " A-100", TypeOfBody.COMPARTMENT, -8);
        Truck kamaz2 = new Truck(" Камаз ", " к100 ", 12, Weigth.N1);
        Truck kamaz3 = new Truck(" Камаз", " к1000", 10, Weigth.N1);
        Truck kamaz4 = new Truck(" Камаз", " A-100", 35, Weigth.N1);
        Truck kamaz5 = new Truck(" Ока", " A-100", 100, Weigth.N2);
        Bus a154 = new Bus(" BMW", " К200", 12, Capasity.BIG);
        Bus b100 = new Bus(" BMW", " трамвайчик", 10, Capasity.SMALL);
        Bus c444 = new Bus(" BMW", " к300", 6, Capasity.BIG);
        Bus d478 = new Bus(" Зил", " вездеход", 90, Capasity.SMALL);


        a154.pitStop();
        kamaz4.finishOfMoving();
        audi3.finishOfMoving();
        b100.startMoving();
        kamaz5.startMoving();
        c444.pitStop();

        DriverB vasiliy = new DriverB("Василий", true, 2);
        DriverC oleg = new DriverC(" Олег", true, 5);
        DriverD ivan = new DriverD(" Иван", true, 10);

        oleg.startMoving(kamaz2);
        oleg.finishOfMoving(kamaz3);
        ivan.refuei(c444);
        vasiliy.startMoving(audi2);
        vasiliy.printInformation(audi5);

        kamaz4.printType();


    }


}
