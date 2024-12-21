public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " годам, то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " годам, то он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println();

        System.out.println("Задча 2");
        int temperature = 6;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        System.out.println();

        System.out.println("Задча 3");
        int speed = 60;
        if (speed >= 61) {
            System.out.println("Если скорость " + speed + " км/ч, то придётся заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }
        System.out.println();

        System.out.println("Задча 4");
        int humanAge = 16;
        if (humanAge >= 2 && humanAge <= 6) {
            System.out.println("Если человеку " + humanAge + ", то он ходит в детский сад");
        }
        if (humanAge >= 7 && humanAge <= 17) {
            System.out.println("Если человеку " + humanAge + ", то он ходит в школу");
        }
        if (humanAge >= 18 && humanAge <= 24) {
            System.out.println("Если человеку " + humanAge + ", то он учится в университете");
        }
        if (humanAge > 24) {
            System.out.println("Если человеку " + humanAge + ", то ему пора работать");
        }
        System.out.println();

        System.out.println("Задча 5");
        int childAge = 14;
        if (childAge < 5){
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
        }
        if (childAge >= 5 && childAge <= 14){
            System.out.println("Если возраст ребенка равен " + childAge + ", то он может кататься на аттракционе в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        if (childAge >14){
            System.out.println("Если возраст ребенка равен " + childAge + ", то он может кататься на аттракционе самостоятельно");
        }
        System.out.println();

        System.out.println("Задча 6");
        int seatInVagon = 103;
        if (seatInVagon >= 1 && seatInVagon <= 60){
            System.out.println("Вы можете купить сидячее место");
        }
        if (seatInVagon >= 61 && seatInVagon <= 102){
            System.out.println("Вы можете купить только стоячее место");
        } else {
            System.out.println("Свободных мест нет");
        }
        System.out.println();

        System.out.println("Задача 7");
        int one = 10;
        int two = 300;
        int three = 50;
        if (one > two && one > three) {
            System.out.println("Наибольшее число " + one);
        } else if (two > one && two > three){
            System.out.println("Наибольшее число " + two);
        } else {
            System.out.println("Наибольшее число " + three);
        }
    }
}