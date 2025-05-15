package frq;

public class Scoreboard {
    private int team1Score;
    private int team2Score;
    private int activeTeam;
    private String team1;
    private String team2;

    public Scoreboard(String team1, String team2) {
        activeTeam = 1;
        team1Score = 0;
        team2Score = 0;
        this.team1 = team1;
        this.team2 = team2;
    }
    
    public void recordPlay(int points) {
        if (points > 0) {
            if (activeTeam == 1) {
                team1Score += points;
            } else {
                team2Score += points;
            }
        } else {
            if (activeTeam == 1) {
                activeTeam = 2;
            } else {
                activeTeam = 1;
            }
        }
    }

    public String getScore() {
        String output = team1Score + "-" + team2Score + "-";
        if (activeTeam == 1) {
            output = output + team1;
        } else {
            output = output + team2;
        }
        return output;
    }
}
