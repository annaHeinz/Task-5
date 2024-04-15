package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ocean1 {

    //связали Ocean с айленд
    //в config есть метод getIsland()
    @Autowired
    private Island2 island;

    @Override
    public String toString() {
        return "на океане остров " + island.toString();
    }
}
