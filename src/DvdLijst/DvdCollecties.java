/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DvdLijst;
import java.util.ArrayList;


/**
 *
 * @author Barry Grevink
 * @version 1.0
 */
public class DvdCollecties {

       
    private String naam;
    private int jaartal;
    private String Auteur;
    
    
    public DvdCollecties(String naam, int jaartal, String Auteur){
        this.naam = naam;
        this.jaartal = jaartal;
        this.Auteur = Auteur;
    }
    
    

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getJaartal() {
        return jaartal;
    }

    public void setJaartal(int jaartal) {
        this.jaartal = jaartal;
    }

    public String getAuteur() {
        return Auteur;
    }

    public void setAuteur(String Auteur) {
        this.Auteur = Auteur;
    }

    @Override
    public String toString() {
        return "Naam: " + naam + "\nJaartal: " + jaartal + "\nAuteur: " + Auteur + "\n";
    }
    
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Dvd collectie\n");
        
        DvdCollecties List = new DvdCollecties("Avengers: Infinity War", 2018 , "Marvel Cinematic");
        DvdCollecties List2 = new DvdCollecties("The Avengers", 2012 , "Marvel Cinematic");
        DvdCollecties List3 = new DvdCollecties("Captain America: Civil War", 2018 , "Marvel Cinematic");
        DvdCollecties List4 = new DvdCollecties("Guardians of the Galaxy", 2014 , "Marvel Cinematic");
        DvdCollecties List5 = new DvdCollecties("Mission: Impossible - Fallout", 2018 , "Cristopher McQuarrie");
        DvdCollecties List6 = new DvdCollecties("The Darkest Minds", 2018 , "Jennifer Yuh Nielson");
        DvdCollecties List7 = new DvdCollecties("Teen Titans Go! To the Movies", 2018 , "Aaron Horvath");
        DvdCollecties List8 = new DvdCollecties("Big Fish", 2003 , "Tim Burton");
        DvdCollecties List9 = new DvdCollecties("Sky High", 2005 , "Mike Mitchell");
        
           
            
        
       
        
        System.out.println(List.toString());
        System.out.println(List2.toString());
        System.out.println(List3.toString());
        System.out.println(List4.toString());
        System.out.println(List5.toString());
        System.out.println(List6.toString());
        System.out.println(List7.toString());
        System.out.println(List8.toString());
        System.out.println(List9.toString());
        
             
        
        
        
        
      
        
    } 
    
} 

