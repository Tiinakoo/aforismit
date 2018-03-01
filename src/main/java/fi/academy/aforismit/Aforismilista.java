package fi.academy.aforismit;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Aforismilista {
    List<Aforismi> aforismit = new ArrayList<>();

    public List<Aforismi> getAforismit() {
        return aforismit;
    }

    public void setAforismit(List<Aforismi> aforismit) {
        this.aforismit = aforismit;
    }

    public void lisaaAforismiListalle(Aforismi aforismi){
        aforismit.add(aforismi);
    }

    public void poistaAforismiListalta(Aforismi aforismi){
        aforismit.remove(aforismi);
    }

    @Override
    public String toString() {
        return "Aforismilista{" +
                "aforismit=" + aforismit +
                '}';
    }
}
