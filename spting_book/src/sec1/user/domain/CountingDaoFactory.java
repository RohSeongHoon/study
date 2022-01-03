package sec1.user.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CountingDaoFactory {


    @Bean
    public UserDao userDao() {
        UserDao userDao = new UserDao();
        userDao.setConnectionMaker(connectionMaker());
        return userDao();
    }


    @Bean
    public ConnectionMaker connectionMaker() {
        return new CountingConnectionMaker(realConnectionMaker());
    } //DI 방식을 적용하면 여기부분을 변경하는것만으로도 db를 변경할수있다

    //효율이 높아짐
    @Bean
    public ConnectionMaker realConnectionMaker() {
        return new NConnectionMaker();
    }
}
