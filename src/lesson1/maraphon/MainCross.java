package lesson1.maraphon;

public class MainCross {
    public static void main(String[] args) {
        Competitor[] competitors = {new Human("Bob"),
                new Cat("Vaska"),new Dog("Tuzik")};
        Obstacle[] obstacles = {new Cross(80),new Wall(5),new Water(3)};
        for(Competitor c: competitors){
            for(Obstacle o: obstacles){
                o.doIt(c);
                if(!c.isDistance()){
                    break;
                }
            }
        }

        for(Competitor c:competitors){
            c.info();
        }

    }


}
