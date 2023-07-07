/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

/**
 *
 * @author pc
 */
public class estructuraReloj {
    
    public void reloj(){
        
        int a=0;
        int b=0;
        int c=0;
        
        for(int i=0; i<=24; i++){
            
            a=i;
            System.out.println(a+":"+b+":"+c);
            
            for(int l=0; l<=59; l++){
                b=l;
                System.out.println(a+":"+b+":"+c);
                
                for(int n=0;n<=59;n++){
                    c=n;
                    System.out.println(a+":"+b+":"+c);
                }
            }
        }
    }
    
}
