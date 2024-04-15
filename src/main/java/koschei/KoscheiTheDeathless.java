package koschei;

import koschei.models.Ocean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KoscheiTheDeathless {

    private Ocean1 ocean;

    public String getRulesByDeth() {
        return "На свете есть океан , " + ocean.toString();
    }

    //связываем кощея с океаном
    //через сеттер и аннотацию
    @Autowired
    public void setOcean(Ocean1 ocean) {
        this.ocean = ocean;
    }
}
