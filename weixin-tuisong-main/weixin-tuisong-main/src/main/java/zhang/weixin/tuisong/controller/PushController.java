package zhang.weixin.tuisong.controller;

/**
 *@ClassName PushController
 *@Description TODO
 *@Author 张辉
 *@Date 2022/8/12 09:54
 */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import zhang.weixin.tuisong.util.Pusher;

@RestController
public class PushController {
    //要推送的用户openid
    private static String openid = "xxx";


    /**
     * 微信测试账号推送今天
     *
     */
    @GetMapping("/push/today")
    public void push() {
        Pusher.pushMorning(openid);
    }

    /**
     * 微信测试账号推送明天
     * */
    @GetMapping("/push/tomorrow")
    public void pushZyd() {
        Pusher.pushNight(openid);
    }

}