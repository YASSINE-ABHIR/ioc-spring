package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation_V2 {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(new File("Conf.txt"));
            String daoClassName = scanner.nextLine();
            Class cDao = Class.forName(daoClassName);
            IDao objectDao = (IDao) cDao.getConstructor().newInstance();

            String metierClassName = scanner.nextLine();
            Class cMetier = Class.forName(metierClassName);
            IMetier objectMetier = (IMetier) cMetier.getConstructor().newInstance();

            Method setDao = cMetier.getDeclaredMethod("setDao", IDao.class);
            setDao.invoke(objectMetier, objectDao);
            System.out.println("Res = " + objectMetier.calcul());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
