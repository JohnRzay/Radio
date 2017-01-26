/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;

import java.util.Scanner;

/**
 *
 * @author Acer-PC
 */
public class Radio {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        maradio R;
        R = new maradio();
        
        R.regarder();
        R.chvolume();
        R.regarder();
        R.chcanal();
        R.regarder();
        
    Scanner clavier; 
    clavier= new Scanner(System.in);
    
    double volume;
    int canal;
        
    }
}   
    class maradio
    {
    
    private double volume;
    private int canal;
    

        maradio()
        {
        volume = 0;
        canal = 450;
        }
        
        public void chvolume()
        {
        Scanner clavier; 
        clavier= new Scanner(System.in);

        volume = clavier.nextDouble() + 0.25;
        if (volume>4)volume = 0; 
           
        }
        
        public void chcanal()
        {
            
        Scanner clavier; 
        clavier= new Scanner(System.in);
    
        canal = clavier.nextInt() + 50;
        if (canal>900) canal = 0; 
        }  
        
        public void regarder()
        {
          System.out.println("volume :"  + " " + volume +  " ===== " + "canal :" + canal  );
        }
        
    }
        

   