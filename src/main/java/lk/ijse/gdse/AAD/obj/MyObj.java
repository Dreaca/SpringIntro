package lk.ijse.gdse.AAD.obj;

import org.springframework.stereotype.Component;

@Component // This annotation notifies that this class is to managed by Spring Framework
public class MyObj {
    public MyObj() {
        System.out.println(" Hello MyObj");
    }
}
