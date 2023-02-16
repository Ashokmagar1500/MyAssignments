import sports.basketball.FivePlayers;
import sports.football.ElevenPlayers;
import sports.volleyball.SixPlayers;

public class SportTest {
    public static void main(String[] args) {
        System.out.println("sports details :-");
        FivePlayers fp=new FivePlayers();
        fp.Score();
        ElevenPlayers ep=new ElevenPlayers();
        ep.goal();
        SixPlayers sp=new SixPlayers();
        sp.jump();
        }
    }
