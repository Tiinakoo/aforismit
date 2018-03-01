package fi.academy.aforismit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Kontrolleri {
    @Autowired Aforismilista aforismilista;

    @RequestMapping("/starwars")
    public String naytaetusivu(){
        return "starwars";
    }

    @RequestMapping("/sanonnat")
    public String naytaSanonnat(Model model){
        model.addAttribute("aforismilista", aforismilista);
        return "sanonnat";
    }

    @RequestMapping("/lisaasanonta")
    public String lisaasanonta(Model model){
        Aforismi uusiAforismi = new Aforismi();
        model.addAttribute("lisaasanonta", uusiAforismi);
        return "lisaasanonta";
    }

    @PostMapping("/sanonnat")
    public String lomakeKasittelija(@ModelAttribute Aforismi aforismi, Model model){
        aforismilista.lisaaAforismiListalle(aforismi);
        model.addAttribute("aforismilista", aforismilista);
        return "sanonnat";
    }


}
