public class Main {

    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Гарри Потер", 15,
                16, 12, 11, 19);
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер",
                18, 13, 24, 11, 18);
        Gryffindor ron = new Gryffindor("Рон Уизли", 10,
                9, 11, 7, 15);
        Hufflepuff zechariah = new Hufflepuff("Захария Смит", 10, 30,
                10, 10, 10);
        Hufflepuff cedric = new Hufflepuff("Седрик Диггори", 10, 30,
                10, 10, 10);
        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли", 10, 30,
                10, 10, 10);
        Ravenclaw zhou = new Ravenclaw("Чжоу Чанг", 10, 30,
                10, 10, 10, 12);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 10, 30,
                10, 10, 10, 12);
        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 10, 30,
                10, 10, 10, 12);
        Slytherin draco = new Slytherin("Драко Малфой", 10, 30,
                10, 10, 10, 12, 12);
        Slytherin graham = new Slytherin("Грэхэм Монтегю", 8, 20,
                10, 10, 7, 8, 2);
        Slytherin gregory = new Slytherin("Грегори Гойл", 5, 10,
                3, 4, 6, 5, 6);

        System.out.println(harry);
        PrintQualityOfStudents printQualityOfStudents = new PrintQualityOfStudents();
        printQualityOfStudents.printQualityStudents(harry);
         printQualityOfStudents.printQualitySlytherin(draco);


        СompareQualityStudents compareQualityStudents = new СompareQualityStudents();
        compareQualityStudents.getBestStudent(hermione, ron);
        compareQualityStudents.getBestStudent(hermione, ron);
        compareQualityStudents.getBestStudent(hermione, ron);
        compareQualityStudents.getBestStudent(hermione, ron);
    }
}