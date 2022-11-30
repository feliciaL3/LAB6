import Controller.Controller;
import Model.*;
import View.View;
import java.util.*;
import java.lang.Math;

public class MVCMain {
    public static void main(String[] args) {
        boolean works= true;

        System.out.println(ConsoleColors.BLUE_BOLD_BRIGHT +"   Go beyond with  " + TaxiCompany.CompanyName + "!" + ConsoleColors.RESET);

        float Money = 0.1f;
        //int moneyType = 1000;
        Scanner money = new Scanner(System.in);
        Float  moneyType;
        System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT+ "Decide how much money the company has at the beginning of simulation: " + ConsoleColors.RESET);
        moneyType = Float.valueOf(money.nextLine());


        Random generate = new Random();
        String[] responses = { "satisfied" , "dissapointed" };
        String[] prices = {"10", "15", "20", "21", "22", "23", "24", "25", "26", "27", "30", "35", "40"};
        String[] colors = { "red", "black" , "blue", "gray", "white", "brown", "green"};
        String[] types = { 
                "Bus"    ,"Sedan", "Hatchback", "Automat", "Sandero", "Convertible", "Wagon", "Luxury"  ,"Crossover",
                "Hibrid" ,"Sports Car", "PickupTruck" ,"Hibrid" , "Limousine"  ,"Hybrid", "Electric", "Diesel"  ,"Hibrid" };
        String[] numbers = { 
                "+222-231-2711", "+222-459-3961", "+232-551-0236", "+332 623-3679", "+507-510-0237", "+770-026-1723", 
                "+222-171-0245", "+422-725-6735", "+222-240-7219", "+329-525-9527", "+230-692-1224", "+657 633-1153",
                "+222-108-8568", "+222-691-5495", "+222-888-9426", "+232 708-0999", "+701-119-2424", "+908-948-9618",
                "+222-567-7748", "+222-312-1744", "2+24-205-2808", "+203-968-8500", "+469-767-0882", "+715-900-3666",
                "+905-050-1079", "+856-761-1261", "+309-778-7372", "+669-485-2980", "+551-416-8772", "+678-004-0073",
                "+965-179-9485", "+217-496-3598", "+517-907-5076", "+910-566-3061", "+563-348-3065", "+612-055-6500",
                "+615-527-1701", "+682-174-0140", "+405-733-6070", "+806-316-7700", "+606-570-9467", "+606-240-4448",
                "+001-303-7359", "+737-829-0766", "+678-991-5553", "+403-225-1552", "+552-415-0237", "+952-554-6718",
                "+619-023-9736", "+808-472-3736", "+504-692-3508", "+409-290-4894", "+667-345-9912", "+302-242-5488",
                "+908-912-1176", "+496-144-3005", "+006-019-8025", "+178-806-7055", "+340-006-1725", "+704-106-3551",
                "+929-223-1442", "+806-355-4830", "+956-124-0858", "+726-653-2111", "+339-492-9719", "+226-599-4731",
                "+507-510-0237", "+770-026-1723", "+351-235-9855", "+606-796-8015", "+727-735-7243", "+702-889-8331",
                "+344-342-5223", "+209-683-6320", "+320-161-9592", "+555-992-9231", "+925-737-0788", "+801-545-6795",
                "+444-478-0373", "+535-870-8536", "+404-299-9993", "+601-987-4948", "+212-609-0148", "+309-228-7291",
                "+806-209-1472", "+680-794-5661", "+763-449-0168", "+709-763-6110", "+331-969-3351", "+978-241-4854",
                "+925-106-0119", "+324-371-9670", "+856-419-0566", "+118-972-3523", "+237-742-1291", "+253-497-5635",
                "+507-554-9639", "+356-479-1161", "+403-000-9729", "+487-600-0223", "+235-274-6716" };
        String[] models = { 
                    "BMW"       ,"Mercedes"  ,"Aston Martin" ,"Audi"    ,"Bentley"       ,"BMW"         ,"Bugatti"    ,"Cadillac"    ,"Jaguar",
                    "Chevrolet" ,"Chrysler"  ,"Citroën"      ,"Dacia"   ,"Dacia"         ,"Daihatsu"    ,"Dodge"      ,"Yamaha"      ,"Dacia",
                    "Ferrari"   ,"Fiat"      ,"Fisker"       ,"Ford"    ,"Honda"         ,"Hummer"      ,"Hyundai"    ,"Infiniti"    ,"Iveco"  ,
                    "Jeep"      ,"Kia"       ,"BMW"          ,"Lada"    ,"Lamborghini"   ,"Dacia"       ,"Land Rover" ,"Landwind"    ,"Lexus"  ,
                    "Maserati"  ,"Maybach"   ,"Mazda"        ,"Merceds" ,"Mercedes-Benz" ,"BMW"         ,"Mini"       ,"Mitsubishi"  ,"Daciaa",
                    "Nissan"    ,"Opel"      ,"Peugeot"      ,"Porsche" ,"Renault"       ,"Rolls-Royce" ,"Rover"      ,"Saab"        ,"Seat" ,
                    "Smart"     ,"Subaru"    ,"Suzuki"       ,"Tesla"   ,"Toyota"        ,"Volkswagen"  ,"Volvo"      ,"Lada"        ,"Skoda"};

        String[] FirstNames = { 
                "Maria"  ,"Mike"    ,"Isabella","Hugo"   ,"Marcel"     ,"Alex"    ,"Eleonora","Laurentiu","Casandra","Olivia","Carla",
                "Paula"  ,"Felicia" ,"Mark"    ,"Adelina","Raluca"     ,"Ovidiu"  ,"Masha"   ,"Ionela"   ,"John"    ,"Drake" ,"Kim",
                "James"  ,"Evelyn"  ,"Leo"     ,"Harper" ,"Grayson"    ,"Scarlett","Luca"    ,"Nova"     ,"Elsa"    ,"Aurora","Ethan",
                "Andreea","Rodica"  ,"Emila"   ,"Leila"  ,"Chloe"      ,"Cristina","Marinela","Mariana"  ,"Lilea"   ,"Max"   ,"Viorica",
                "Elena"  ,"Violeta" ,"Alexandr","Boris"  ,"Jack"       ,"Pavel"   ,"Sasha"   ,"Jina"     ,"George"  ,"Vicria","Daniel",
                "Oxana"  ,"Gicu"    ,"Vika"    ,"Vlad"   ,"Kylie"      ,"Elena"   ,"Liuba"   ,"lilia"    ,"Gabriela","Mircea","Vasile",
                "Stefan" ,"Margaret","Vio"     ,"Sanda"  ,"Alexandrina","Ina"     ,"Naomi"   ,"Marian"   ,"Victoria","Valeia","Gina",
                "Eleanor","Michael" ,"Ivy"     ,"Samuel" ,"Elizabeth"  ,"Isla"    ,"Sam"     ,"Natan"    ,"Riley"   ,"Nicole","Mya",
                "Abigail","Jayden"  ,"Nora"    ,"Luke"   ,"Stella"     ,"Zina"    ,"Ion"     ,"Cristofor","Tudor"   ,"Oxana" ,"Gaby", 
                "Giccu"  ,"Viika"   ,"Vlaad"   ,"Kylie"  ,"Elena"      ,"Liuba"   ,"lilia"   ,"Gabriela" ,"Mircea"  };
        String[] LastNames = {
                "Bounty"   ,"Boaghe"  ,"Ursu"    ,"Brown"    ,"Guzun"     ,"Jones"   ,"Miller"   ,"Spinu"   ,"Davis"    ,"Garcia",
                "Rodriguez","Wilson"  ,"Martinez","Emines"   ,"Taylor"    ,"Thomas"  ,"Hernandez","Poolut"  ,"Martinot" ,"Kells",
                "Cabriz"   ,"Cara"    ,"Broom"   ,"Martiz"   ,"Monter"    ,"Moo"     ,"Lupascu"  ,"Harris"  ,"Clark"    ,"Lewis", 
                "Holand"   ,"Perez"   ,"Hallon"  ,"Young"    ,"Allen"     ,"Sanchez" ,"Kapo"     ,"Scott"   ,"Reed"     ,"Baker",
                "Bercu"    ,"Nepolson","Hillard" ,"Ramirezet","Campbell"  ,"Mitchell","Roberts"  ,"Carter"  ,"Phillips" ,"Cooper",
                "Filat"    ,"Taporres","Parker"  ,"Collinser","Carl"      ,"Stewart" ,"Flores"   ,"Morris"  ,"Nguyen"   ,"Murphy",
                "Chiperi"  ,"Carook"  ,"Rogers"  ,"Morgan"   ,"Petersone" ,"Cooperk" ,"Breteed"  ,"Bailey"  ,"Bell"     ,"Gomez", 
                "Mourse"   ,"Warder"  ,"Cox"     ,"Diaz"     ,"Richardson","Wood"    ,"Pernot"   ,"Brooks"  ,"Bennett"  ,"Gray", 
                "Zafir"    ,"Cruzer"  ,"Hughes"  ,"Buzu"     ,"Myers"     ,"Skinu"   ,"Foster"   ,"Sanderon","Ross"     ,"Morales", 
                "Moor"     ,"Richer"  ,"Ortiz"   ,"Jenkins"  ,"Guatemal"  ,"Gaga"    ,"Hart"     ,"Parol"   ,"Redd"     ,"Bowl" };

        
        HumanResourcesRepresentant HumanResourcesRepresentant = new HumanResourcesRepresentant ("Maia", "Moon", true);

        Driver[] driver;
        driver = new Driver[100];
        List<Driver> DriverArray = new ArrayList<>();
        Driver Driver = new Driver(String.valueOf(FirstNames[generate.nextInt(80)]),String.valueOf(LastNames[generate.nextInt(80)]),getRandomNumberInRange(0, 50),5,
         generate.nextBoolean(), generate.nextBoolean(),
         generate.nextBoolean(), getRandomNumberInRange(0, 30));
        for (int i = 0; i < 100; i++) {
            driver[i] = new Driver(String.valueOf(FirstNames[generate.nextInt(80)]),
                    String.valueOf(LastNames[generate.nextInt(100)]), getRandomNumberInRange(18, 70),
                    getRandomNumberInRange(0, 50), generate.nextBoolean(), generate.nextBoolean(),
                    generate.nextBoolean(), getRandomNumberInRange(0, 30));
            DriverArray.add(driver[i]);
        }
        
        Car[] car;
        car = new Car[DriverArray.size()];
        List<Car> CarArray = new ArrayList<>();
        for (int i = 0; i < DriverArray.size(); i++) {
            String.valueOf(colors[generate.nextInt(colors.length)]);
            car[i] = new Car(String.valueOf(models[generate.nextInt(models.length)]),
                    String.valueOf(types[generate.nextInt(types.length)]),
                    String.valueOf(colors[generate.nextInt(colors.length)]),
                    String.valueOf(prices[generate.nextInt(prices.length)])
                    );
            CarArray.add(car[i]);
        }
        Passenger[] passenger;
        passenger = new Passenger[100];
        List<Passenger> PassengerArray = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            passenger[i] = new Passenger(String.valueOf(FirstNames[generate.nextInt(100)]),
                    String.valueOf(LastNames[generate.nextInt(100)]),
                    String.valueOf(numbers[generate.nextInt(numbers.length)]));
            PassengerArray.add(passenger[i]);
        }

        PartnershipsRepresentant pr1 = new PartnershipsRepresentant("Theodor", "Holland");
        PartnershipsRepresentant pr2 = new PartnershipsRepresentant("Josh", "Fast");

        Marketolog marketing1 = new Marketolog("Bill", "Grande");
        Marketolog marketing2 = new Marketolog("Teo", "Rose");
        Marketolog marketing3 = new Marketolog("Andrew", "Redd");

        Director director = new Director("Richard", "Thomson");
        Director AsociatedDirector = new Director("Blake", "Carrington");

        CustomerServiceRepresentant operator1 = new CustomerServiceRepresentant("Mariana", "Ree;");
        CustomerServiceRepresentant operator2 = new CustomerServiceRepresentant("Greg", "Meen");
        CustomerServiceRepresentant operator3 = new CustomerServiceRepresentant("Mike", "Seen");
        CustomerServiceRepresentant operator4 = new CustomerServiceRepresentant("Viktoria", "Ween");
        CustomerServiceRepresentant operator5 = new CustomerServiceRepresentant("Benjaminu", "Keen");
        List<CustomerServiceRepresentant> OperatorArray = new ArrayList<>();
        OperatorArray.add(operator1);
        OperatorArray.add(operator2);
        OperatorArray.add(operator3);
        OperatorArray.add(operator4);
        OperatorArray.add(operator5);

        Mechanic mechanic1 = new Mechanic("Michael", "Boonamite",35, "+223 234-232-232");
        Mechanic mechanic2 = new Mechanic("Georgel", "Beerkuter",31, "+222 234-232-233");
        Mechanic mechanic3 = new Mechanic("Mirel", "Sneerkut",31, "+322 234-232-233");
        Mechanic mechanic4 = new Mechanic("Cristi", "Cooler",31, "+232 234-232-233");

        List<Mechanic> MechanicArray = new ArrayList<>();
        MechanicArray.add(mechanic1);
        MechanicArray.add(mechanic2);
        MechanicArray.add(mechanic3);
        MechanicArray.add(mechanic4);

        Accountant accountant1 = new Accountant("Mirela", "Boonami", "Salary");
        Accountant accountant2 = new Accountant("Emilly", "Coonami", "Price");
        List<Accountant> AccountantArray = new ArrayList<>();
        AccountantArray.add(accountant1);
        AccountantArray.add(accountant2);

        boolean help1 = false, help2 = false, Facebook = false, Street = false, Television  = false, promotion = false;
        int clients;
        int day = 1;
        int week = day % 7;
        
        List<Driver> OccupiedDrivers = new ArrayList<>();

        while (works) {
            float initialPrice = getRandomNumberInRange(40, 47) / 10;
            float CombustiblePrice = 2;
            float MoneyOfDay = 0, MoneyCombustible = 0;

            for (int i = 0; i < 24; i++) {
                int DissatisfiedClients = 0;
                int NumberClients = getsNumberClients(i);
                for (int j = 0; j <= NumberClients; j++) {
                    OccupiedDrivers.add(DriverArray.get(0));
                    DriverArray.remove(0);
                    PassengerArray.get(0);
                    System.out.println("Operator " + OperatorArray.get(getRandomNumberInRange(0, 2)).getFirstName() + " answers to "
                            + PassengerArray.get(getRandomNumberInRange(0, 4)).getPhone_number()
                            + " and allocates  the car "
                            + CarArray.get(getRandomNumberInRange(0, 20)).getcar_model() + " "
                            + CarArray.get(getRandomNumberInRange(0, 20)).getcar_type() + "  "
                            + CarArray.get(getRandomNumberInRange(0, 20)).getcar_color() + " " + "for the customer " 
                            + PassengerArray.get(getRandomNumberInRange(0, 4)).getFirstName() + (" .\n") +
                            "The Accountant " + AccountantArray.get(getRandomNumberInRange(0, 1)).getFirstName() +
                         // " sets the price for the ride = " +CarArray.get(getRandomNumberInRange(0, 4)).getcar_price() + CombustiblePrice+ " dolars."  );
                            " sets the price for the ride = " + MoneyCombustible+ " dolars."  );

                            Passenger.AcceptedTheOffer(PassengerArray.get(getRandomNumberInRange(0, 4)).getFirstName(),
                            CarArray.get(getRandomNumberInRange(0, 20)).getcar_model() ,
                            CarArray.get(getRandomNumberInRange(0, 20)).getcar_type(),
                            CarArray.get(getRandomNumberInRange(0, 20)).getcar_model());
                            CombustiblePrice = 2 * getCoeficient(i);

                }
                DissatisfiedClients = (int) (DissatisfiedClients + Math.floor(NumberClients * 0.1F));
                for (int m = 0; m < DissatisfiedClients; m++) {
                    System.out.println(PassengerArray.get(0));
                    PassengerArray.remove(0);
                }
                MoneyOfDay = MoneyOfDay + NumberClients * initialPrice * getCoeficient(i);
                MoneyCombustible = MoneyCombustible + NumberClients * CombustiblePrice;
                for (int k = 0; k <= NumberClients; k++) {
                    DriverArray.add(OccupiedDrivers.get(0));
                    OccupiedDrivers.remove(0);
                }
                System.out.println(ConsoleColors.YELLOW + "Week " + day/7 + " Day " + day + " approximately Hour "
                        + String.valueOf(i) +":00 " + ConsoleColors.RESET);
                System.out.println(ConsoleColors.WHITE_BOLD+ "The company has this amount of profit=" + (MoneyOfDay - MoneyCombustible)+ConsoleColors.RESET);
                System.out.println(ConsoleColors.WHITE_BOLD + "The company has this amount of money = " + String.valueOf(Money)       +ConsoleColors.RESET);

                clients = PassengerArray.size();
               // if (clients < 13 && Money < 15000) {
                if ( Money < 2000000) {
                    pr1.helpfinances();
                    help1 = true;
                    Money = Money + 8000;
                    System.out.println( "The Partnership Representant decide to help Taxy Company with 80000 dolars. ");

                }
                if ( Money > 2000) {
                    marketing1.supports("Facebook");
                    marketing2.supports("Street");
                    marketing3.supports("Television ");
                    promotion = true;
                    Money = Money - 2000;
                }
                if (clients < 10 && Money > 3000 && promotion == false) {
                    marketing1.supports("Facebook");
                    Facebook = true;
                    Money = Money - 100;
                }
                if (clients < 10 && Money > 1000 && promotion == false) {
                    marketing2.supports("Street");
                    Street = true;
                    Money = Money - 200;
                }
                if (clients < 10 && Money > 200 && promotion == false) {
                    marketing3.supports("Television ");
                    Television  = true;
                    Money = Money - 300;
                }
                if (clients <100 && Money < 500 && help2 == false) {
                    pr2.helpfinances();
                    help2 = true;
                    Money = Money + 5000;
                }
                if (clients <  25) {
                    Driver.isOnBreak(DriverArray.get(getRandomNumberInRange(0, 4)).getFirstName());
                    System.out.println("The Driver "  + DriverArray.get(getRandomNumberInRange(0, 4)).getFirstName() 
                    + " has a pause right now  and can't take orders."  );
                }
                if (Money <= 0) {
                    System.out.println("We have no money, so we are closing.");
                    works = false;
                    break;
                }
                if (clients <= 0) {
                    System.out.println("We have no clients, so we are closing");
                    works = false;
                    break;
                }
                if (DriverArray.size() <= 0) {
                    System.out.println("We have no drivers, so we are closing.");
                    works = false;
                    break;
                }
                if (CarArray.size() <= 0) {
                    System.out.println("We have no cars, so we are closing.");
                    works = false;
                    break;
                }

                Money = Money + MoneyOfDay - MoneyCombustible;
            }

            clients = PassengerArray.size();
            if (help1) {
                if (clients <= 94) {
                    for (int l = clients; l < clients + 5; l++) {
                        passenger[l] = new Passenger(String.valueOf(FirstNames[generate.nextInt(100)]),
                                String.valueOf(LastNames[generate.nextInt(100)]),
                                String.valueOf(numbers[generate.nextInt(numbers.length)]));
                        PassengerArray.add(passenger[l]);
                    }
                }
                Money = Money - 55;
            }
            if (help2) {
                if (clients <= 97) {
                    for (int l = clients; l < clients + 2; l++) {
                        passenger[l] = new Passenger(String.valueOf(FirstNames[generate.nextInt(100)]),
                                String.valueOf(LastNames[generate.nextInt(100)]),
                                String.valueOf(numbers[generate.nextInt(numbers.length)]));
                        PassengerArray.add(passenger[l]);
                    }
                }
                Money = Money - 50;
            }
            if (promotion) {
                if (clients <= 32) {
                    for (int l = clients; l < clients + 8; l++) {
                        passenger[l] = new Passenger(String.valueOf(FirstNames[generate.nextInt(100)]),
                                String.valueOf(LastNames[generate.nextInt(100)]),
                                String.valueOf(numbers[generate.nextInt(numbers.length)]));
                        PassengerArray.add(passenger[l]);
                    }
                }
                promotion = false;
            }
            if (Facebook) {
                if (clients <= 29) {
                    for (int l = clients; l < clients + 5; l++) {
                        passenger[l] = new Passenger(String.valueOf(FirstNames[generate.nextInt(100)]),
                                String.valueOf(LastNames[generate.nextInt(100)]),
                                String.valueOf(numbers[generate.nextInt(numbers.length)]));
                        PassengerArray.add(passenger[l]);
                    }
                }
                Facebook = false;
            }
            if (Television ) {
                if (clients <= 27) {
                    for (int l = clients; l < clients + 1; l++) {
                        passenger[l] = new Passenger(String.valueOf(FirstNames[generate.nextInt(100)]),
                                String.valueOf(LastNames[generate.nextInt(100)]),
                                String.valueOf(numbers[generate.nextInt(numbers.length)]));
                        PassengerArray.add(passenger[l]);
                    }
                }
                Television  = false;
            }
            if (Street) {
                if (clients <= 25) {
                    for (int l = clients; l < clients + 1; l++) {
                        passenger[l] = new Passenger(String.valueOf(FirstNames[generate.nextInt(100)]),
                                String.valueOf(LastNames[generate.nextInt(100)]),
                                String.valueOf(numbers[generate.nextInt(numbers.length)]));
                        PassengerArray.add(passenger[l]);
                    }
                }
                Street = false;
            }

            if (Money > 15000.0) {
                int priceCar = getRandomNumberInRange(3000, 5000);
                Money = Money - priceCar;
                for (int s = 0; s <= 1; s++) {
                    MechanicArray.get(getRandomNumberInRange(0, 3)).repairs(
                            CarArray.get(getRandomNumberInRange(0, 20)).getcar_model(),
                            CarArray.get(getRandomNumberInRange(0, 20)).getcar_type(),
                            CarArray.get(getRandomNumberInRange(0, 20)).getcar_color());
                }
                System.out.println( "We will provide new or repaired cars" );
            }

            System.out.println(ConsoleColors.WHITE_BOLD + "The company has this amount of profit=" + (MoneyOfDay - MoneyCombustible)+" dolars " 
            +ConsoleColors.RESET);
            System.out.println(ConsoleColors.WHITE_BOLD + "The company has this amount of money = "+ String.valueOf(Money)          +" dolars"    
            +ConsoleColors.RESET);

            if (day == getRandomNumberInRange(60 * 365, 80 * 365)) {
                System.out.println(ConsoleColors.WHITE_BOLD+"The company is closed."+ ConsoleColors.RESET);
                break;
            }
            day++;
            week++;

        }
    }

    public static int getsNumberClients(int hour) {
        int NumberClients = 0;
        if (hour < 6) {
            NumberClients = getRandomNumberInRange(1, 4);
        } else if (hour >= 6 && hour <= 18) {
            NumberClients = getRandomNumberInRange(4, 6);
        } else if (hour > 18 && hour < 24) {
            NumberClients = getRandomNumberInRange(3, 9);
        }
        return NumberClients;
    }

    public static float getCoeficient(int hour) {
        float Coeficient = 0;
        if (hour < 6) {
            Coeficient = 1.1F;
        } else if (hour >= 6 && hour <= 18) {
            Coeficient = 1;
        } else if (hour > 18 && hour < 24) {
            Coeficient = 1.3F;
        }
        return Coeficient;
    }


    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}
