package koschei;

import koschei.models.*;
//import org.graalvm.compiler.lir.CompositeValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class KoscheiTheDeathless {

    private Ocean1 ocean;

    public String getRulesByDeth() {
        return "На свете есть океан , " + ocean.toString();

    }

    @Autowired
    public void setOcean(Ocean1 ocean) {
        this.ocean = ocean;
    }


}
