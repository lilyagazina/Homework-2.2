public class СompareQualityStudents { //сравнивает качества студента по количеству баллов
        public static void getBestStudentSlytherin(Slytherin[]slytherins){
                int best = slytherins[0].getSumPoints();
                for (int i = 0; i < slytherins.length; i++) {
                        if (best< slytherins[i].getSumPoints())
                                best = slytherins[i].getSumPoints();
                        System.out.println(best);
                        slytherins[i].getNameStudents();
                        System.out.println( slytherins[i].getNameStudents());
                }

        }


           /* System.out.println("Ученик " + gryffindor.getNameStudents() +
                    ", сила магии  " + gryffindor.getPowerOfMagic() +
                    ", растояние трансгрессии  " + gryffindor.getTransgressionDistance() +
                    ", храбрость  " + gryffindor.getCourage() +
                    ", честь  " + gryffindor.getHonor() +
                    ", благородство  " + gryffindor.getNobility());*/
        }


