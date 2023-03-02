public class Main {

    public static void main(String[] args) {
      //  Gryffindor[] gryffindor = new Gryffindor[3];
        Gryffindor[] gryffindor = {
                new Gryffindor("Гарри Поттер", 10, 30,
                        10,10,10),
                new Gryffindor("Гермиона Грейнджер", 10, 30,
                        10,10,10),
                new Gryffindor("Рон Уизли", 10, 30,
                        10,10,10)
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
               new Slytherin("Грэхэм Монтегю", 10, 30,
                       10,10,10,12,12),
               new Slytherin("Грегори Гойл", 10, 30,
                       10,10,10,12,12),
       };

        PrintQualityOfStudents printQualityOfStudents = new PrintQualityOfStudents();
        printQualityOfStudents.printQualityGryffindor(gryffindor);
        printQualityOfStudents.printQualityHufflepuff(hufflepuffs);
        printQualityOfStudents.printQualityRavenclaw(ravenclaws);
        printQualityOfStudents.printQualitySlytherin(slytherins);

    }

}