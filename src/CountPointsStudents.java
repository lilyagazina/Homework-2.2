public class CountPointsStudents { //считает количество баллов
    public void countPointsGryffindor(Gryffindor[]gryffindors){
        int sumPoints;
        for (Gryffindor gryffindor:gryffindors) {
        sumPoints = gryffindor.getPowerOfMagic() + gryffindor.getTransgressionDistance() +
                gryffindor.getCourage() + gryffindor.getHonor() + gryffindor.getNobility();
            System.out.println(sumPoints);
        }
    }

    public void countPointsHufflepuff(Hufflepuff[]hufflepuffs){
        int sumPoints;
        for (Hufflepuff hufflepuff:hufflepuffs) {
           sumPoints =hufflepuff.getPowerOfMagic() + hufflepuff.getTransgressionDistance() +
                hufflepuff.getLoyal() + hufflepuff.getHardworking() + hufflepuff.getHonest();
            System.out.println(sumPoints);
        }
    }public void countPointsRavenclaw(Ravenclaw[]revenclaws){
        int sumPoints;
        for (Ravenclaw ravenclaw : revenclaws) {
        sumPoints = ravenclaw.getPowerOfMagic() + ravenclaw.getTransgressionDistance() +
                ravenclaw.getWise() + ravenclaw.getSmart() + ravenclaw.getWitty()+ravenclaw.getCreativity();
            System.out.println(sumPoints);
        }
    }public void countPointsSlytherin(Slytherin[]slytherins){
        int sumPoints;
        for (Slytherin slytherin:slytherins) {
        sumPoints = slytherin.getPowerOfMagic() + slytherin.getTransgressionDistance() +
                slytherin.getCunning() + slytherin.getAmbition() + slytherin.getResourcefulness()+
                slytherin.getDetermination() + slytherin.getLustForPower();
            System.out.println(sumPoints);
        }
    }
}
