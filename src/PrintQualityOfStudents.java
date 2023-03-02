public class PrintQualityOfStudents { //выводит качества студента
    public void printInfo(){

    }
    //2 вариант
    public void printQualityStudents(Hogwarts students){
        System.out.println("Ученик " + students.getNameStudents() +
                    ", сила магии " + students.getPowerOfMagic() +
                    ", растояние трансгрессии " + students.getTransgressionDistance());
        }
    public void printQualitySlytherin(Slytherin slytherins) {
            System.out.println("Ученик " + slytherins.getNameStudents() +
                    ", сила магии " +slytherins.getPowerOfMagic() +
                    ", растояние трансгрессии " + slytherins.getTransgressionDistance() +
                    ", амбициозность " + slytherins.getAmbition() +
                    ", хитрость " + slytherins.getCunning() +
                    ", жажда власти " + slytherins.getLustForPower() +
                    ", решительность " + slytherins.getDetermination() +
                    ", находчивость " + slytherins.getResourcefulness());
        }

// 1 вариант
   /* public void printQualityGryffindor(Gryffindor[] gryffindors) {
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println("Ученик " + gryffindor.getNameStudents() +
                    ", сила магии " + gryffindor.getPowerOfMagic() +
                    ", растояние трансгрессии " + gryffindor.getTransgressionDistance() +
                    ", храбрость " + gryffindor.getCourage() +
                    ", честь " + gryffindor.getHonor() +
                    ", благородство " + gryffindor.getNobility());
        }}
    public void printQualityHufflepuff(Hufflepuff[] hufflepuffs) {
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println("Ученик " + hufflepuff.getNameStudents() +
                    ", сила магии " + hufflepuff.getPowerOfMagic() +
                    ", растояние трансгрессии " + hufflepuff.getTransgressionDistance() +
                    ", верны " + hufflepuff.getLoyal() +
                    ", честны " + hufflepuff.getHonest() +
                    ", трудолюбивы " + hufflepuff.getHardworking());
        }
    }

    public void printQualityRavenclaw(Ravenclaw[] ravenclaws) {
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println("Ученик " + ravenclaw.getNameStudents() +
                    ", сила магии " + ravenclaw.getPowerOfMagic() +
                    ", растояние трансгрессии " + ravenclaw.getTransgressionDistance() +
                    ", умны " + ravenclaw.getSmart() +
                    ", мудры " + ravenclaw.getWise() +
                    ", остроумны " + ravenclaw.getWitty() +
                    ", полны творчества " + ravenclaw.getCreativity());
        }
    }

    public void printQualitySlytherin(Slytherin[] slytherins) {
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("Ученик " + slytherin.getNameStudents() +
                    ", сила магии " + slytherin.getPowerOfMagic() +
                    ", растояние трансгрессии " + slytherin.getTransgressionDistance() +
                    ", амбициозность " + slytherin.getAmbition() +
                    ", хитрость " + slytherin.getCunning() +
                    ", жажда власти " + slytherin.getLustForPower() +
                    ", решительность " + slytherin.getDetermination() +
                    ", находчивость " + slytherin.getResourcefulness());
        }
    }*/
}