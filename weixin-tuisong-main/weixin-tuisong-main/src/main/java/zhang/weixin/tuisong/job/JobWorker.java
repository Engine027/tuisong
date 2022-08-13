package zhang.weixin.tuisong.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import zhang.weixin.tuisong.util.Pusher;

/**
 *@ClassName JobWorker
 *@Description TODO
 *@Author 张辉
 *@Date 2022/8/2 16:00
 */
@Component
public class JobWorker {
    //要推送的用户openid
    private static String openid = "xxx";

    @Scheduled(cron = "0 30 8 * * ?")
    public void goodMorning(){
        Pusher.pushMorning(openid);
    }

    @Scheduled(cron = "0 0 19 * * ?")
    public void goodNight(){
        Pusher.pushNight(openid);
    }



}
