package day_0615;

import java.util.Scanner;

public class SportsTest {
    public static void main(String[] args) {
        //乒乓球运动员
        PingPongPlayer[] pingPongPlayers = getPingPong();
        //篮球运动员
        BasketBallPlayer[] basketBallPlayers = getBasketBall();
        //乒乓球教练
        PingPongCoach pingPongCoach = getPingPongCoach(pingPongPlayers);
        //篮球教练
        BaskerBallCoach baskerBallCoach = getBaskerBallCoach(basketBallPlayers);
        //打印
        pingPongCoach.study();
        System.out.println(pingPongCoach);
        System.out.println(baskerBallCoach);

    }

    //获得运动员方法
    private static PingPongPlayer[] getPingPong() {
        PingPongPlayer[] ps = new PingPongPlayer[2];
        for (int i=0;i<ps.length;i++){
            ps[i] =  new PingPongPlayer();
            init(ps[i]);
        }
        return ps;
    }

    //获得运动员方法
    private static BasketBallPlayer[] getBasketBall() {
        BasketBallPlayer[] bp = new BasketBallPlayer[2];
        for (int i=0;i<bp.length;i++){
            bp[i] =  new BasketBallPlayer();
            init(bp[i]);
        }
        return bp;
    }
    //初始化教练
    private static PingPongCoach getPingPongCoach(PingPongPlayer[] pp){
        PingPongCoach pc = new PingPongCoach();
        init(pc);
        pc.setSports(pp.length);
        pc.setPingPongPlayers(pp);
        return pc;
    }

    //初始化教练
    private static BaskerBallCoach getBaskerBallCoach(BasketBallPlayer[] bs){
        BaskerBallCoach bc = new BaskerBallCoach();
        init(bc);
        bc.setSports(bs.length);
        bc.setBasketBallPlayers(bs);
        return bc;
    }

    //初始化运动员属性方法
    private static void init(SportsMan sportsMan){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名:");
        sportsMan.name = scanner.next();
        System.out.println("请输入年龄:");
        sportsMan.age = scanner.nextInt();
        System.out.println("请输入训练时间:");
        sportsMan.year = scanner.nextInt();
        System.out.println("请输入兴趣爱好:");
        sportsMan.interest = scanner.next();
        System.out.println("============================");
    }
}
