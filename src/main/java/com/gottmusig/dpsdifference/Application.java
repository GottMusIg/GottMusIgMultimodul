package com.gottmusig.dpsdifference;

import com.gottmusig.dpsdifference.configuration.DPSDifferenceConfiguration;
import com.gottmusig.dpsdifference.domain.api.DPSDifference;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author leong
 * @since 24.11.2016
 */

public class Application {




    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(DPSDifferenceConfiguration.class);
        DPSDifference dpsDifference = context.getBean(DPSDifference.class);
            dpsDifference.addSpecificationDPS(0,"Furor","Krieger");
            dpsDifference.addSpecificationDPS(0,"Waffen","Krieger");
            dpsDifference.addSpecificationDPS(0,"Schutz","Krieger");

            dpsDifference.addSpecificationDPS(0,"Heilig","Paladin");
            dpsDifference.addSpecificationDPS(0,"Schutz","Paladin");
            dpsDifference.addSpecificationDPS(0,"Vergeltung","Paladin");

            dpsDifference.addSpecificationDPS(0,"Tierherrschaft", "Jäger");
            dpsDifference.addSpecificationDPS(0,"Treffsicherheit", "Jäger");
            dpsDifference.addSpecificationDPS(0,"Überleben", "Jäger");

            dpsDifference.addSpecificationDPS(0,"Meucheln", "Schurke");
            dpsDifference.addSpecificationDPS(0,"Gesetzlosigkeit", "Schurke");
            dpsDifference.addSpecificationDPS(0,"Täuschung", "Schurke");

            dpsDifference.addSpecificationDPS(0,"Heilig", "Priester");
            dpsDifference.addSpecificationDPS(0,"Schatten", "Priester");
            dpsDifference.addSpecificationDPS(0,"Disziplin", "Priester");

            dpsDifference.addSpecificationDPS(0,"Blut", "Todesritter");
            dpsDifference.addSpecificationDPS(0,"Frost", "Todesritter");
            dpsDifference.addSpecificationDPS(0,"Unheilig", "Todesritter");

            dpsDifference.addSpecificationDPS(0,"Elementar", "Schamane");
            dpsDifference.addSpecificationDPS(0,"Verstärkung", "Schamane");
            dpsDifference.addSpecificationDPS(0,"Wiederherstellung", "Schamane");

            dpsDifference.addSpecificationDPS(0,"Frost", "Magier");
            dpsDifference.addSpecificationDPS(0,"Arkan", "Magier");
            dpsDifference.addSpecificationDPS(0,"Feuer", "Magier");

            dpsDifference.addSpecificationDPS(0,"Dämonologie", "Hexenmeister");
            dpsDifference.addSpecificationDPS(0,"Zerstörung", "Hexenmeister");
            dpsDifference.addSpecificationDPS(0,"Gebrechen", "Hexenmeister");

            dpsDifference.addSpecificationDPS(0,"Braumeister", "Mönch");
            dpsDifference.addSpecificationDPS(0,"Windläufer", "Mönch");
            dpsDifference.addSpecificationDPS(0,"Nebelwirker", "Mönch");

            dpsDifference.addSpecificationDPS(0,"Wächter", "Druide");
            dpsDifference.addSpecificationDPS(0,"Gleichgewicht", "Druide");
            dpsDifference.addSpecificationDPS(0,"Wilder Kampf", "Druide");
            dpsDifference.addSpecificationDPS(0,"Wiederherstellung", "Druide");

            dpsDifference.addSpecificationDPS(0,"Verwüstung", "Dämonenjäger");
            dpsDifference.addSpecificationDPS(0,"Rachsucht", "Dämonenjäger");

    }
}
