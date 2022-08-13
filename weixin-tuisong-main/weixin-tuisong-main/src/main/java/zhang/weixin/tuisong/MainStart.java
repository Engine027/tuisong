package zhang.weixin.tuisong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 *@ClassName MainStart
 *@Description TODO
 *@Author 张辉
 *@Date 2022/8/2 15:44
 */

@SpringBootApplication
@EnableScheduling
public class MainStart {
    public static void main(String[] args) {
        SpringApplication.run(MainStart.class, args);
    }
}
