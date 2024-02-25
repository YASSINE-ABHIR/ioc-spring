package extension;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("daoV2")
public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Web Service");
        double t = 35.2;
        return t;
    }
}
