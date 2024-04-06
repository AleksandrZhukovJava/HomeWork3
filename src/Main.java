public class Main {
    public static void main(String[] args) {
        System.out.println("task 1");
        int age = 18;
        if (age < 18) {
            System.out.printf("Возраст %s, не совершеннолетний%n", age);
        } else {
            System.out.printf("Возраст %s, совершеннолетний%n", age);
        }

        System.out.println("task 2"); //ctrl alt t
        double temperature = 2.0;
        if (temperature < 5) {
            System.out.printf("«На улице %s градусов, на улице холодно, нужно надеть шапку»%n", temperature);
        } else {
            System.out.printf("«На улице %s градусов, можно идти без шапки»%n", temperature);
        }

        System.out.println("task 3");
        int speed = 60;
        if (speed > 60) {
            System.out.printf("«Если скорость %s, то придется заплатить штраф».%n", speed);
        } else {
            System.out.printf("«Если скорость %s, то можно ездить спокойно».%n", speed);
        }

        System.out.println("task 4");
        if (age > 2 && age <= 6) {
            System.out.printf("«Если возраст человека равен %s, то ему нужно ходить в садик%n", age);
        } else if (age > 6 && age <= 17) {
            System.out.printf("«Если возраст человека равен %s, то ему нужно ходить в школу%n", age);
        } else if (age > 17 && age <= 24) {
            System.out.printf("«Если возраст человека равен %s, то ему нужно ходить в университет%n", age);
        } else if (age > 24) {
            System.out.printf("«Если возраст человека равен %s, то ему нужно ходить на работу%n", age);
        }

        System.out.println("task 5");
        int childAge = 6;
        if (childAge < 5) {
            System.out.printf("«Если возраст ребенка равен %s, то ему нельзя кататься на аттракционе».%n", childAge);
        } else if (childAge >= 5 && childAge < 14) {
            System.out.printf("«Если возраст ребенка равен %s, то ему можно кататься на аттракционе в сопровождении взрослого».%n", childAge);
        } else {
            System.out.printf("«Если возраст ребенка равен %s, то ему можно кататься на аттракционе без сопровождения взрослого)».%n", childAge);
        }

        System.out.println("task 6");
        int amountOfPeople = 102;

        if (amountOfPeople < 60) {
            System.out.println("Сидячее место есть");
        }
        if (amountOfPeople < 102) {
            System.out.println("Есть только стоячии места");
        }
        if (amountOfPeople >= 102) {
            System.out.println("Мест нет");
        }

        System.out.println("task 7");
        int one = 2;
        int two = 2;
        int three = 4;

        if (one > two && two > three) {
            System.out.println("Самое болшое первое");
        } else if (two > one && two > three) {
            System.out.println("Самое болшое второе");
        } else if (three > one && three > two) {
            System.out.println("Самое болшое третье");
        } else {
            System.out.println("Есть равные числа");
        }
    }
}




