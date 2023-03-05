public class СompareQualityStudents {
    //сравнивает качества студента по количеству баллов с одного факультета
    public static void getBestStudentGryffindor(Gryffindor student1, Gryffindor student2) {
        if (student1.getNobility() + student1.getHonor() + student1.getCourage() +
                student1.getPowerOfMagic() + student1.getTransgressionDistance() >
                student2.getNobility() + student2.getHonor() + student2.getCourage() +
                        student2.getPowerOfMagic() + student2.getTransgressionDistance()) {
            System.out.println(student1.getNameStudents() + " лучший Гриффиндорец, чем "
                    + student2.getNameStudents());

        } else if (student1.getNobility() + student1.getHonor() + student1.getCourage() +
                student1.getPowerOfMagic() + student1.getTransgressionDistance() <
                student2.getNobility() + student2.getHonor() + student2.getCourage() +
                        student2.getPowerOfMagic() + student2.getTransgressionDistance()) {
            System.out.println(student2.getNameStudents() + " лучший Гриффиндорец, чем " +
                    student1.getNameStudents());
        }
    }

    public static void getBestStudentHufflepuff(Hufflepuff student1, Hufflepuff student2) {
        if (student1.getHonest() + student1.getHardworking() + student1.getLoyal() +
                student1.getPowerOfMagic() + student1.getTransgressionDistance() >
                student2.getHonest() + student2.getHardworking() + student2.getLoyal() +
                        student2.getPowerOfMagic() + student2.getTransgressionDistance()) {
            System.out.println(student1.getNameStudents() + " лучший Пуффендуец, чем " + student2.getNameStudents());

        } else if (student1.getHonest() + student1.getHardworking() + student1.getLoyal() +
                student1.getPowerOfMagic() + student1.getTransgressionDistance() <
                student2.getHonest() + student2.getHardworking() + student2.getLoyal() +
                        student2.getPowerOfMagic() + student2.getTransgressionDistance()) {
            System.out.println(student1.getNameStudents() + " лучший Пуффендуец, чем " + student2.getNameStudents());
        }
    }

    public static void getBestStudentRavenclaw(Ravenclaw student1, Ravenclaw student2) {
        if (student1.getCreativity() + student1.getSmart() + student1.getWise() +
                student1.getWitty() + student1.getPowerOfMagic() + student1.getTransgressionDistance() >
                student2.getCreativity() + student2.getSmart() + student2.getWise() +
                        student2.getWitty() + student2.getPowerOfMagic() + student2.getTransgressionDistance()) {
            System.out.println(student1.getNameStudents() + " лучший Когтевранец, чем " + student2.getNameStudents());

        } else if (student1.getCreativity() + student1.getSmart() + student1.getWise() +
                student1.getWitty() + student1.getPowerOfMagic() + student1.getTransgressionDistance() <
                student2.getCreativity() + student2.getSmart() + student2.getWise() +
                        student2.getWitty() + student2.getPowerOfMagic() + student2.getTransgressionDistance()) {
            System.out.println(student2.getNameStudents() + " лучший Когтевранец, чем " + student1.getNameStudents());
        }
    }

    public static void getBestStudentSlytherin(Slytherin student1, Slytherin student2) {
        if (student1.getDetermination() + student1.getAmbition() + student1.getCunning() +
                student1.getLustForPower() + student1.getResourcefulness() + student1.getPowerOfMagic()
                + student1.getTransgressionDistance() >
                student2.getDetermination() + student2.getAmbition() + student2.getCunning() +
                        student2.getLustForPower() + student2.getResourcefulness() + student2.getPowerOfMagic()
                        + student2.getTransgressionDistance()) {
            System.out.println(student1.getNameStudents() + " лучший Слизеринец, чем " + student2.getNameStudents());

        } else if (student1.getDetermination() + student1.getAmbition() + student1.getCunning() +
                student1.getLustForPower() + student1.getResourcefulness() + student1.getPowerOfMagic()
                + student1.getTransgressionDistance() <
                student2.getDetermination() + student2.getAmbition() + student2.getCunning() +
                        student2.getLustForPower() + student2.getResourcefulness() + student2.getPowerOfMagic()
                        + student2.getTransgressionDistance()) {
            System.out.println(student2.getNameStudents() + " лучший Слизеринец, чем " + student1.getNameStudents());
        }
    }

    //сравнивает двух любых учеников Хогвартса по силе магии и расстоянию трансгрессии,
    // и выводит в консоль сравнительную оценку между двумя учениками.
    public static void getBestStudentHogwarts(Hogwarts student1, Hogwarts student2) {
        if (student1.getPowerOfMagic() + student1.getTransgressionDistance() >
                student2.getPowerOfMagic() + student2.getTransgressionDistance()) {
            System.out.println(student1.getNameStudents() + " обладает большей силой магии " +
                    "и растоянием трансгрессии, чем "
                    + student2.getNameStudents());

        } else if (student1.getPowerOfMagic() + student1.getTransgressionDistance() <
                student2.getPowerOfMagic() + student2.getTransgressionDistance()) {
            System.out.println(student1.getNameStudents() + " обладает большей силой магии и " +
                    "растоянием трансгрессии, чем "
                    + student2.getNameStudents());
        }
    }
}


