package lesson1.maraphon;

public class Wall extends Obstacle {
    int height;

    public Wall(int heigth) {
        this.height = heigth;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}
