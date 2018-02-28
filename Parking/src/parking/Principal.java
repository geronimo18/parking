package parking;

public class Principal {
    public static void main(String[] args) {
        Propietario propietario1, propietario2, propietario3, propietario4;
        propietario1=new Propietario();
        propietario2=new Propietario();
        propietario3=new Propietario();
        propietario4=new Propietario();
        
        propietario1.niveldealcohol=0;
        propietario1.gafas=0;
        propietario1.sexo=1;
        
        propietario2.niveldealcohol=10;
        propietario2.gafas=0;
        propietario2.sexo=1;
        
        propietario3.gafas=0;
        propietario3.niveldealcohol=0;
        propietario3.sexo=0;
        
        propietario4.gafas=0;
        propietario4.niveldealcohol=10;
        propietario4.sexo=0;
        
        Celador miCelador;
        miCelador=new Celador(); 
        
        String saludo=miCelador.saludar(propietario1.sexo, propietario1.niveldealcohol, propietario1.gafas);
        System.out.println(saludo);
        
        String saludo1=miCelador.saludar(propietario2.sexo, propietario2.niveldealcohol, propietario2.gafas);
        System.out.println(saludo1);
        
        String saludo2=miCelador.saludar(propietario3.sexo, propietario3.niveldealcohol, propietario3.gafas);
        System.out.println(saludo2);
        
        String saludo3=miCelador.saludar(propietario4.sexo, propietario4.niveldealcohol, propietario4.gafas);
        System.out.println(saludo3);
        
    }  
}
