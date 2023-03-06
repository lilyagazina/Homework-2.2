public class Main {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Гарри Потер", 15,
                16, 12, 11, 19);
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер",
                18, 20, 18, 16, 18);
        Gryffindor ron = new Gryffindor("Рон Уизли", 10,
                9, 11, 7, 15);
        Hufflepuff zechariah = new Hufflepuff("Захария Смит", 13, 10,
                16, 17, 12);
        Hufflepuff cedric = new Hufflepuff("Седрик Диггори", 16, 30,
                19, 16, 19);
        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли", 10, 16,
                18, 19, 14);
        Ravenclaw zhou = new Ravenclaw("Чжоу Чанг", 14, 20,
                16, 14, 13, 14);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 13, 16,
                16, 12, 11, 12);
        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 14, 10,
                19, 10, 17, 12);
        Slytherin draco = new Slytherin("Драко Малфой", 20, 20,
                19, 18, 19, 18, 17);
        Slytherin graham = new Slytherin("Грэхэм Монтегю", 18, 20,
                10, 10, 17, 18, 12);
        Slytherin gregory = new Slytherin("Грегори Гойл", 15, 10,
                13, 14, 16, 15, 16);
        System.out.println("-----------------------------------------------");
        System.out.println(gregory);
        harry.print();
        System.out.println("------------------------------------------------");
        СompareQualityStudents compareQualityStudents = new СompareQualityStudents();
        compareQualityStudents.getBestStudentGryffindor(hermione, ron);
        compareQualityStudents.getBestStudentHufflepuff(zechariah, cedric);
        compareQualityStudents.getBestStudentRavenclaw(zhou, padma);
        compareQualityStudents.getBestStudentSlytherin(draco, graham);
        System.out.println("-----------------------------------------------");
        compareQualityStudents.getBestStudentHogwarts(draco, harry);

    }
}
