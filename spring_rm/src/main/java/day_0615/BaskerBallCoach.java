package day_0615;

import java.util.Arrays;

/**
 * 篮球教练
 */
public class BaskerBallCoach extends SportsMan{

    private Integer sports;
    private BasketBallPlayer[] basketBallPlayers;

    public Integer getSports() {
        return sports;
    }

    public void setSports(Integer sports) {
        this.sports = sports;
    }

    public BasketBallPlayer[] getBasketBallPlayers() {
        return basketBallPlayers;
    }

    public void setBasketBallPlayers(BasketBallPlayer[] basketBallPlayers) {
        this.basketBallPlayers = basketBallPlayers;
    }


    @Override
    public String toString() {
        return  "篮球教练姓名:" + name + '\n' +
                "篮球教练年龄:" + age +"岁"+'\n' +
                "篮球教练训练时间:" + year +"年"+'\n'+
                "篮球教练兴趣爱好:" + interest + '\n' +
                "篮球队员有:" + sports +"个"+'\n' +
                "他们分别是:" + Arrays.toString(basketBallPlayers);
    }

    @Override
    public void playBall() {
        System.out.println("打篮球，篮球教练");
    }
}
