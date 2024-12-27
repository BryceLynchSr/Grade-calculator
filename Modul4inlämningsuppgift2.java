/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul4inlämningsuppgift2;
import java.util.Scanner;


public class Modul4inlämningsuppgift2 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //initialiserar arrays för ämnen, poäng samt betyg
        String[] ämnen = {"Matematik","Svenska","Engelska","Historia","Fysik"};
        int[] poäng = new int[ämnen.length];
        String[] betyg = new String[ämnen.length];
        
        //anropar metoden läsPoäng med parametrar ämnen och betyg
        läsPoäng(ämnen, poäng);
        //anropar metoden beräknaBetyg med parametrar poäng och betyg
        beräknaBetyg(poäng, betyg);
        //anropar metoden skrivUtBetyg med parametrar ämnen och betyg
        skrivUtBetyg(ämnen, betyg);
        //anropar metoden Statistik med parametar poäng och betyg
        Statistik(poäng, betyg);
        
    //en bubbelsortering för att ändra ordningen i arrayen poäng så att
    //lägst poäng kommer först och sedan stigande, gör samtidigt en spegling
    //i arrayen ämnen så att ordningen där följer den i arrayen poäng
   for(int m = poäng.length-1; m>0; m--){
       for(int n = 0; n<m; n++){
           if (poäng[n] > poäng[n+1]){
               int temp = poäng[n];
               poäng[n] = poäng[n+1];
               poäng[n+1] = temp;
               String temp1 = ämnen[n];
               ämnen[n] = ämnen[n+1];
               ämnen[n+1] = temp1;
               
           }
       }
   }
    
    
}
    //huvudet för metoden läsPoäng
   public static int läsPoäng (String[] ämnen, int[] poäng){
        Scanner input = new Scanner(System.in);
        int poäng1 =0;
        
        //användaren matar in poäng för respektive ämne. Poängen lagras i 
        //arrayen poäng och returneras till main
        for(int i=0; i<ämnen.length;i++){
            System.out.println(ämnen[i]);
            System.out.print("Ange elevens poäng (50-100): ");
            poäng1 = input.nextInt();
            poäng[i]= poäng1;
    }

       return poäng1; 
    }
   
   //huvudet för metoden beräknaBetyg
   public static void beräknaBetyg (int [] poäng, String[] betyg){
       
       int bäst = 100;
       
       //poängen för respektive ämne omvandlas till betyg A-F och lagras i
       //arrayen betyg
       for (int i = 0; i < poäng.length; i++) {
      if (poäng[i] == bäst)
        betyg[i] = "A";
      else if (poäng[i] >= bäst - 20)
        betyg[i] = "B";
      else if (poäng[i] >= bäst - 30)
        betyg[i] = "C";
      else if (poäng[i] >= bäst - 40)
        betyg[i] = "D";
      else
        betyg[i] = "F";
       }
   }
   
   //huvudet för metoden skrivUtBetyg
   public static void skrivUtBetyg(String[] ämnen, String[] betyg){
       
       //när metoden anropas skrivs betyg A-F ut för respektive ämne
       for(int i=0; i<ämnen.length; i++){
           System.out.print("Betyg i "+ämnen[i] +": " +betyg[i] +"\n");
           }
       }
   
   //huvudet för metoden Statistik
   public static void Statistik (int[] poäng, String[] betyg){
       
       //samtliga poäng summeras och lagras i variabeln totalpoäng
       int totalpoäng = 0;
       int antalA = 0;
       int antalB = 0;
       int antalC = 0;
       int antalD = 0;
       int antalF = 0;
       
       for(int i= 0; i<poäng.length; i++){
           totalpoäng += poäng[i];}
       
       //antalet av respektive betyg summeras
       for(int j =0; j<betyg.length; j++){
           if(betyg[j]== "A"){
               antalA += 1;}
           else if(betyg[j]== "B"){
               antalB += 1;}
           else if(betyg[j]== "C"){
               antalC += 1;}
           else if(betyg[j]== "D"){
               antalD += 1;}
           else if(betyg[j]== "F"){
               antalF += 1;}
       }
       
       //antalet av respektive betyg samt totalpoängen skrivs ut
       System.out.println("Antal A: " +antalA);
       System.out.println("Antal B: " +antalB);
       System.out.println("Antal C: " +antalC);
       System.out.println("Antal D: " +antalD);
       System.out.println("Antal F: " +antalF);
       
       System.out.println("Totalpoäng: " +totalpoäng);
           }
       }
   
           
       
   

    
  
    
   

 
    

