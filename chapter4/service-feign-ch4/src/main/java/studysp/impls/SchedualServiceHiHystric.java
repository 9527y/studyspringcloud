package studysp.impls;

import org.springframework.stereotype.Component;
import studysp.inters.SchedualServiceHi;

/**
 * Created by alex on 2018/10/23.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}