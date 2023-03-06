package src2;

import java.util.Random;

public class Main1 {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Gryffindor harry = generateGryffindor("Гарри Поттер");
        Gryffindor hermione = generateGryffindor("Гермиона Грейнджер");
        Gryffindor ron = generateGryffindor("Рон Уизли");
        Ravenclaw zhou = generateRavenclaw("Чжоу Чанг");
        Ravenclaw marcus = generateRavenclaw("Маркус Белби");
        Ravenclaw padma = generateRavenclaw("Падма Патил");
        Slytherin draco = generateSlytherin("Драко Малфой");
        Slytherin graham = generateSlytherin("Грэхэм Монтегю");
        Slytherin gregory = generateSlytherin("Грегори Гойл");
        Hufflepuff cedric = generateHufflepuff("Седрик Диггори");
        Hufflepuff zechariah = generateHufflepuff("Захария Смит");
        Hufflepuff justin = generateHufflepuff("Джастин Финч-Флетчли");

        harry.print();
        hermione.print();
        cedric.print();
        padma.print();
        draco.print();
        System.out.println("--------------------------------------------------------");
        harry.compareHogwarts(draco);
        System.out.println("--------------------------------------------------------");
        harry.compareGriffindor(hermione);
    }

    private static Gryffindor generateGryffindor(String name) {
        return new Gryffindor(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static Ravenclaw generateRavenclaw(String name) {
        return new Ravenclaw(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static Hufflepuff generateHufflepuff(String name) {
        return new Hufflepuff(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static Slytherin generateSlytherin(String name) {
        return new Slytherin(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }


}

