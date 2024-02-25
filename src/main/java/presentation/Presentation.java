package presentation;

import dao.DaoImpl;
import dao.IDao;
import extension.DaoImplV2;
import metier.IMetier;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
        IDao d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d);
        //metier.setDao(d);
        System.out.println("Res = " + metier.calcul());
    }
}
