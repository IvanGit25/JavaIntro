package homeworks.work7team;

public class PlayerStats {
    private double endurance;
    private double sprint;
    private double dribble;
    private double passing;
    private double shooting;

    public double getEndurance() {
        return endurance;
    }

    public void setEndurance(double endurance) {
        if (endurance >= 0 && endurance <= 100){
            this.endurance = endurance;
        }else {
            System.out.println("Endurance must be between 0 and 100.");
        }
    }

    public double getSprint() {
        return sprint;
    }

    public void setSprint(double sprint) {
        if (sprint >= 0 && sprint <= 100){
            this.sprint = sprint;
        }else {
            System.out.println("Sprint must be between 0 and 100.");
        }
    }

    public double getDribble() {
        return dribble;
    }

    public void setDribble(double dribble) {
        if (dribble >= 0 && dribble <= 100){
            this.dribble = dribble;
        }else {
            System.out.println("Dribble must be between 0 and 100.");
        }
    }

    public double getPassing() {
        return passing;
    }

    public void setPassing(double passing) {
        if (passing >= 0 && passing <= 100){
            this.passing = passing;
        }else {
            System.out.println("Passing must be between 0 and 100.");
        }
    }

    public double getShooting() {
        return shooting;
    }

    public void setShooting(double shooting) {
        if (shooting >= 0 && shooting <= 100){
            this.shooting = shooting;
        }else {
            System.out.println("Shooting must be between 0 and 100.");
        }
    }

    public PlayerStats(double endurance, double sprint, double dribble,
                       double passing, double shooting){
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
    }

    public double getStats(){
        return (endurance + sprint + dribble + passing + shooting) / 5;
    }
}

