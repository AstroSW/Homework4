public class Main {
    public static void main(String[] args) {

        // Задача 1
        int age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }

        // Задача 2
        int t = 7;
        if (t < 5) {
            System.out.println("На улище " + t + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улище " + t + " градусов, можно идти без шапки.");
        }

        // Задача 3
        int v = 66;
        if (v > 60) {
            System.out.println("Если скорость " + v + ", то придётся заплатить штраф.");
        } else {
            System.out.println("Если скорость " + v + ", то можно ездить спокойно.");
        }

        // Задача 4
        age = 18;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
        }

        // Задача 5
        age = 15;
        if (age < 5) {
            System.out.println("Если возраст ребёнка равен " + age + ", то ему нельзя кататься на аттракционе.");
        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребёнка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println("Если возраст ребёнка равен " + age + ", то ему можно кататься на аттракционе без сопровождения.");
        }

        // Задача 6
        int pass = 110;
        if (pass < 60) {
            System.out.println("В вагоне свободны " + (60 - pass) + " сидячих и " + (102 - 60) + " стоячих места.");
        } else if (pass >= 60 && pass < 102) {
            System.out.println("В вагоне осталось только " + (102 - pass) + " стоячих мест.");
        } else {
            System.out.println("В вагоне свободных мест нет.");
        }

        // Задача 7
        int one = 46;
        int two = 41;
        int three = 130;
        if (one > two && one > three) {
            System.out.println("Самое большее число " + one);
        } else if (two > three) {
            System.out.println("Самое большее число " + two);
        } else {
            System.out.println("Самое большее число " + three);
        }
    }
}