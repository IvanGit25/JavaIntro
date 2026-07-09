package homeworks.work7team;

public class Player {
    private String name;
    private PlayerStats stats;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }else {
            System.out.println("Player name should not be empty.");
        }
    }

    public double getOverallSkill() {
        return stats.getStats();
    }

    public void setStats(PlayerStats stats) {
        if (stats != null){
            this.stats = stats;
        }else {
            System.out.println("Stats should be between 0 and 100.");
        }
    }

    public Player(String name, PlayerStats stats){
        setName(name);
        setStats(stats);
    }
}
