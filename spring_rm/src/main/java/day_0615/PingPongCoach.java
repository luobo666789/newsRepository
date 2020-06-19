package day_0615;

import java.util.Arrays;

/**
 * 乒乓球教练
 */
public class PingPongCoach extends SportsMan implements English{

    private Integer sports;
    private PingPongPlayer[] pingPongPlayers;



    public Integer getSports() {
        return sports;
    }

    public void setSports(Integer sports) {
        this.sports = sports;
    }

    public PingPongPlayer[] getPingPongPlayers() {
        return pingPongPlayers;
    }

    public void setPingPongPlayers(PingPongPlayer[] pingPongPlayers) {
        this.pingPongPlayers = pingPongPlayers;
    }

    @Override
    public String toString() {
        return  "乒乓球教练姓名:" + name + '\n' +
                "乒乓球教练年龄:" + age +"岁"+'\n' +
                "乒乓球教练训练时间:" + year +"年"+'\n'+
                "乒乓球教练兴趣爱好:" + interest + '\n' +
                "乒乓球队员有:" + sports +"个"+'\n' +
                "他们分别是:" + Arrays.toString(pingPongPlayers);
    }

    @Override
    public void study() {
        System.out.println(this.name+"教练要学习英语");
    }

    @Override
    public void playBall() {
        System.out.println("打乒乓球,乒乓球教练");
    }
}
