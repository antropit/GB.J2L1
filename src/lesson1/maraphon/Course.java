package lesson1.maraphon;

public class Course {
    Obstacle[] obstacles;

    Course (Obstacle[] obstacles){
        setObstacles(obstacles);
    }

    public Obstacle[] getObstacles() {
        return obstacles;
    }

    public void setObstacles(Obstacle[] obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        for(Competitor c: team.getCompetitors()){
            for(Obstacle o: obstacles){
                o.doIt(c);
                if(!c.isDistance()){
                    break;
                }
            }
        }
    }
}
