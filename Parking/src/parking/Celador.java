package parking;

public class Celador {
    
    String saludarh(){
        return "Hola doctor.";
    }
    String saludarm(){
        return "Que cuerpazo";
    }
    String sobrio(){
        return "Buenos días";
    }
    String ebrio(){
        return "Largo de acá";
    }
    String gafas(){
        return "No olvíde llevar sus gafas al salir";
    }
    
    String saludar(int sexo, int nalcohol, int gafas){
        if (sexo==0){
            return saludarm();            
        }else{
            return saludarh();
        }
        if (nalcohol>1){
            return ebrio();
        }else{
            return sobrio();
        }
        if (gafas==1){
            return gafas();
        }else{
            return "";
        }
    }
        
}
