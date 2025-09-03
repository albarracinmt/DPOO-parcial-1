package logic;

public class Principal {
	
    public static void main(String[ ] args) {
    	
        String sexo = "mujer";
        double pesokilo = 100;
        double alturacenti = 189;
        int edad = 16;

        double tmb;

        if (sexo.equals("hombre"))
        	
        	//si se ecribe hombre, y se cumple la condicion de sus atributos,  o si se escribe hombre y no se cumple la condicion de sus atributos, o si por string se recibe cualquir cosa que no sea hombre o mujer.
        
        
        
        {
            if (pesokilo>= 60 && pesokilo <= 110 && alturacenti >= 160 && alturacenti <= 195 && edad > 15)
            
            
            {
                tmb = 88.362 + (13.397 * pesokilo) + (4.799 * alturacenti) - (5.677 * edad);
                System.out.println("La Tmb del hombre es: " + tmb);
                
            } else
            
            
            {
                System.out.println("Atributos fuera de rango para el  hombre");
            }
            
        	//Si se ecribe hombre, y se cumple la condicion de sus atributos,  o si se escribe hombre y no se cumple la condicion de sus atributos, o si por string se recibe cualquir cosa que no sea hombre o mujer.

            
        } else if (sexo.equals("mujer")) 
        
        {
            if (pesokilo>=40 && pesokilo <= 80 && alturacenti >= 140 && alturacenti<= 180 && edad > 15)
            
            
            {
                tmb =  447.593 + (9.247  * pesokilo) + (3.098 * alturacenti) -  (4.33* edad );
                
                 System.out.println("La Tmb de la mujer es:" + tmb);
                
                
            } else {
                System.out.println("Atributos fuera de rango para la mujer.");
                
                
                
            }
        } else {
        	
        	
        	
            System.out.println("solo se admmite hombre o mujer");
        }
    }
}