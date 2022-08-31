public class Main {
    public static void main(String[] args) {
        System.out.println(); // Выполняем Домашнее задание
        System.out.println("Домашнее задание-1. Задание 1");
        {
            int age = 18; // возраст 18 лет
            if (age >= 18) {System.out.println("Поздравляем тебя с Совершеннолетием сынок!!!");}
            if (age < 18) {System.out.println("Тебе еще рановато, подрасти сынок.");}
        }
        System.out.println();
        System.out.println("Домашнее задание-1. Задание 2");
        {
            int age = 7; // условия для учебы в школе
            if (age >= 7) {System.out.println("Ребенок учится в школе.");}
            if (age < 7) {System.out.println("Ребеноку рано учиться в школе");}
        }
        {
            int age = 18; //условия для учебы в университете
            if (age >= 18) {System.out.println("Студент учится в университете.");}
            if (age < 18) {System.out.println("Ребенку рано учится в университете.");}
        }
        {
            int age = 24; // условия для начала работы
            if (age >= 24) {System.out.println("Человек должен искать себе новую работу");}
            if (age < 24) {System.out.println("Человек долежен еще учиться в университете.");}
        }

        System.out.println();
        System.out.println("Домашнее задание-1. Задание 3");
        {
            byte seatsInCar = 102; // Мест в вагоне
            byte seatPlaces = 60;  // Сидячих мест в вагоне
            int standingPlace = seatsInCar - seatPlaces; // Стоячих мест в вагоне
            int seatPlacesOccupied = 60; // Сидячих мест занято
            int standingPlacesOccuped = 42; // Стоячих мест занято
            int seatsInCarOccupied = seatPlacesOccupied + standingPlacesOccuped; // Всего занято мест в вагоне
            if (seatPlacesOccupied >= seatPlaces) {System.out.println("Сидячих мест в вагоне нет.");}
            if (seatPlacesOccupied < seatPlaces) {System.out.println("Есть свободные сидячие места в вагоне.");}
            if (standingPlacesOccuped >= standingPlace) {System.out.println("Стоячих мест в вагоне нет.");}
            if (standingPlacesOccuped < standingPlace) {System.out.println("Есть свободные стоячие места в вагоне.");}
            if (seatsInCarOccupied >= seatsInCar) {System.out.println("Свободных мест в вагоне нет.");}
            else {System.out.println("Есть сободные места в вагоне.");}
        }

        System.out.println();
        System.out.println("Домашнее задание-2. Задание 1");
        {
            int age = 18; // возраст 18 лет
            if (age >= 18) {System.out.println("Поздравляем тебя с Совершеннолетием сынок!!!");}
            else {System.out.println("Тебе еще рановато, подрасти сынок.");}
        }

        System.out.println();
        System.out.println("Домашнее задание-2. Задание 2");
        {int age = 7; // условия для учебы в школе
            if (age >= 7) {System.out.println("Ребенок учится в школе.");}
            else  {System.out.println("Ребеноку рано учиться в школе");}}
        {int age = 18; //условия для учебы в университете
            if (age >= 18) {System.out.println("Студент учится в университете.");}
            else {System.out.println("Ребенку рано учится в университете.");}
        }
        {int age = 24; // условия для начала работы
            if (age >= 24) {System.out.println("Человек должен искать себе новую работу");}
            else  {System.out.println("Человек долежен еще учиться в университете.");}
        }


        System.out.println();
        System.out.println("Домашнее задание-2. Задание 3");
        {
            byte seatsInCar = 102; // Мест в вагоне
            byte seatPlaces = 60;  // Сидячих мест в вагоне
            int standingPlace = seatsInCar - seatPlaces; // Стоячих мест в вагоне
            int seatPlacesOccupied = 55; // Сидячих мест занято
            int standingPlacesOccuped = 38; // Стоячих мест занято
            int seatsInCarOccupied = seatPlacesOccupied + standingPlacesOccuped; // Всего занято мест в вагоне
            if (seatPlacesOccupied >= seatPlaces) {System.out.println();
            } else {System.out.println("Есть свободные сидячие места в вагоне.");}
            if (standingPlacesOccuped >= standingPlace) {System.out.println();
            } else {System.out.println("Есть свободные стоячие места в вагоне.");}
            if (seatsInCarOccupied >= seatsInCar) {System.out.println("Свободных мест в вагоне нет.");
            } else {System.out.println();}
        }

        System.out.println();
        System.out.println("Домашнее задание-3. Задание 1");
        {
            int age = 15;
            if (age >= 2 && age <= 6) {
                System.out.println("Если возраст ребенка равен " + age + ", то ему нужно ходить в детский сад.");
            } else if (age > 6 && age < 18){System.out.println("Если возраст ребенка равен " + age + ", то ему нужно ходить в школу.");
            } else if (age > 18 && age < 24){
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
            } else if (age > 24){
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
            }
        }


        System.out.println();
        System.out.println("Домашнее задание-3. Задание 2");
        {int age = 17;
            if (age < 5){System.out.println("Если возраст ребенка равен " + age + ", он не может кататься на аттракционе");}
            else if (age >= 5 && age < 14){System.out.println("Если возраст ребенка равен " + age + ", " +
                    "он может кататься на аттракционе, но только, в сопровождении взрослого.");}
            else {System.out.println("Если возраст ребенка равен " + age + ", он может кататься на аттракционе без сопровождения взрослого");
            }}

        System.out.println();
        System.out.println("Домашнее задание -3. Задание 3");
        {int one = 1;
            int two = 99;
            int tree = 3;
            if (one > two && one >tree){System.out.println("Большее число " + one);}
            else if (two > one && two > tree){System.out.println("Большее число " + two);}
            else if (tree > one && tree > two){
                System.out.println("Большее число "+ tree);}

        }
    }
}
