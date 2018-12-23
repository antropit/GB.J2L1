package lesson1.maraphon;

public class MainCross {
    public static void main(String[] args) {
        Course course = new Course(new Obstacle[]{new Cross(80),
                new Wall(5), new Water(3)}); // Создаем полосу препятствий
        Team team = new Team(new Competitor[] {new Human("Bob"), new Gepard(),
                new Cat("Vaska"), new Dog("Tuzik")}); // Создаем команду
        course.doIt(team); // Просим команду пройти полосу
        team.showResults();  // Показываем результаты
    }
}
