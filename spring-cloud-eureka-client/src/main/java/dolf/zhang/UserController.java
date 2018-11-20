package dolf.zhang;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


/**
 * @author dolf
 * @version V1.0
 * @description TODO:说明
 * @date 2018/11/16
 */
@RestController
public class UserController {



    @GetMapping("/users")
    public List<User> users() {
        User user = new User();
        user.setId("1");
        user.setUserName("张三");
        return Arrays.asList(user);
    }

    class User{
        private String id ;
        private String userName;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }
    }
}
