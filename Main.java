public class Main {
    public static void main(String[] args) {
        Participant[] participants = {
                new Cat("Уали", 150, 3),
                new Robot("For", 300, 5),
                new Robot("Crv", 200, 4),
                new Robot("Xz2", 400, 6),
                new Human("Славик", 200, 3),
                new Human("Алешка", 150, 2),
                new Cat("Башмак", 150, 3)
        };

        Trials[] trials = {
                new Road(LengthRoad.Low),
                new Road(LengthRoad.Hard),
                new Road(LengthRoad.Hard),
//                new Road(LengthRoad.Hard),
//                new Road(LengthRoad.Hard),
//                new Road(LengthRoad.Hard),
                new Wall(HightWall.Low),
                new Road(LengthRoad.Low),
                new Wall(HightWall.Standart),
                new Road(LengthRoad.Standart),

                new Wall(HightWall.Low),
                new Wall(HightWall.Hard),
                new Road(LengthRoad.Low)
        };

        for (Participant p : participants) {
            for (Trials t : trials) {
                if (!t.smog(p)) break;
            }
        }
    }
}


// запуск серии испытаний