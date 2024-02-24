package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresntationSpringXml {
    private static IMetier metier;
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
         metier = context.getBean(IMetier.class);
        System.out.println("Resultat Spring xml="+metier.calcul());
    }
}
