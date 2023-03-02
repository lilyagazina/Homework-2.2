public class Main {
    public static void main(String[] args) {
        //2 вариант
        Gryffindor harry = new Gryffindor("Гарри Потер", 15,
                16, 12, 11, 19);
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер",
                18, 13, 24, 11, 18);
        Gryffindor ron = new Gryffindor("Рон Уизли", 10,
                9, 11, 7, 15);
        Slytherin [] slytherins = new Slytherin[3];
        Slytherin draco = new Slytherin("Драко Малфой", 10, 30,
                        10,10,10,12,12);
         Slytherin graham = new Slytherin("Грэхэм Монтегю", 8, 20,
                        10,10,7,8,2);
          Slytherin gregory =  new Slytherin("Грегори Гойл", 5, 10,
                        3,4,6,5,6);
          //1вариант
        /*Gryffindor[] gryffindor = {
                new Gryffindor("Гарри Поттер", 13, 30,
                        13,13,15),
                new Gryffindor("Гермиона Грейнджер", 10, 20,
                        15,12,12),
                new Gryffindor("Рон Уизли", 11, 20,
                        10,10,12)
        };
       // Hufflepuff[] hufflepuffs = new Hufflepuff[3];
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит", 10, 30,
                        10,10,10),
                new Hufflepuff("Седрик Диггори", 10, 30,
                        10,10,10),
                new Hufflepuff("Джастин Финч-Флетчли", 10, 30,
                        10,10,10),
    };
       // Ravenclaw [] ravenclaws = new Ravenclaw[3];
        Ravenclaw [] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", 10, 30,
                        10,10,10,12),
                new Ravenclaw("Падма Патил", 10, 30,
                        10,10,10,12),
                new Ravenclaw("Маркус Белби", 10, 30,
                        10,10,10,12),
    };

//        Slytherin [] slytherins = new Slytherin[3];
       Slytherin [] slytherins = {
               new Slytherin("Драко Малфой", 10, 30,
                       10,10,10,12,12),
               new Slytherin("Грэхэм Монтегю", 8, 20,
                       10,10,7,8,2),
               new Slytherin("Грегори Гойл", 5, 10,
                       3,4,6,5,6),
       };*/

        PrintQualityOfStudents printQualityOfStudents = new PrintQualityOfStudents();
        printQualityOfStudents.printQualityGryffindor(harry);
//        printQualityOfStudents.printQualityHufflepuff(hufflepuffs);
//        printQualityOfStudents.printQualityRavenclaw(ravenclaws);
        printQualityOfStudents.printQualitySlytherin(draco);

        /*CountPointsStudents countPointsStudents = new CountPointsStudents();
        countPointsStudents.countPointsGryffindor(gryffindor);
        countPointsStudents.countPointsHufflepuff(hufflepuffs);
        countPointsStudents.countPointsRavenclaw(ravenclaws);
        countPointsStudents.countPointsSlytherin(slytherins);*/
       /* Slytherin.getBestStudentSlytherin(slytherins);
        СompareQualityStudents compareQualityStudents = new СompareQualityStudents();
        compareQualityStudents.getBestStudentSlytherin(slytherins);*/
    }

}