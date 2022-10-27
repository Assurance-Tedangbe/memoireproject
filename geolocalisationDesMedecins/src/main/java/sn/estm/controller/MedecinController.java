package sn.estm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import sn.estm.domain.*;
import sn.estm.metier.MedecinServiceImpl;

@Controller
public class MedecinController {
    
    @Autowired
    private MedecinServiceImpl medecinService;

    @GetMapping("/")
    public String home(){ 
        return "index";
    }
    @GetMapping("/connexion")
    public String connexion(){
        return "connexion";
    }
   
    @GetMapping("/getAllMedecins")
    public String getallMedecins(Model model){
     //   Medecin med = new Medecin();
        model.addAttribute("listMedecins",medecinService.getAllMedecins());
        return "listMedecins";
    }
    
    @GetMapping("/addAccountMedecin")
    public String medecinAddForm(Model model)
    {
        Medecin med = new Medecin();
        model.addAttribute("medecin",med);
        return "addMedecin";
    }
    
    @PostMapping("/saveMedecin")
    public String saveMedecin(@ModelAttribute("medecin") Medecin med)
    {
        medecinService.addMedecin(med);
        return "redirect:/";
        
    }
    
}
 