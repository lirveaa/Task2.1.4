package koschei.config;

import koschei.models.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public static Island2 getIsland(@Qualifier("wood3") Wood3 wood) {
        return new Island2(wood);
    }

    @Bean
    public static Wood3 getWood(@Qualifier("rabbit4") Rabbit4 rabbit) {
        return new Wood3(rabbit);
    }

    @Bean
    public static Egg6 getEgg( Needle7 needle) {
        return new Egg6(needle);
    }




}
