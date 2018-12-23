package lesson1.maraphon;

public class Team {
    protected Competitor[] competitors;

    public Team(Competitor[] competitors) {
        setCompetitors(competitors);
    }

    public Competitor[] getCompetitors() {
        return competitors;
    }

    public void setCompetitors(Competitor[] competitors) {
        this.competitors = competitors;
    }

    public void showResults() {
        for(Competitor c:competitors){
            c.info();
        }
    }
}
