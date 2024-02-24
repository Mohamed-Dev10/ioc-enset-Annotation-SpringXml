package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresentationSpringAnnotation {
    private static IMetier metier;

        public static void main(String[] args) throws Exception{

            ApplicationContext context = new AnnotationConfigApplicationContext("dao","ext","metier");
             metier = context.getBean(IMetier.class);
            System.out.println("Resultat Annotation = "+metier.calcul());

        }

}
