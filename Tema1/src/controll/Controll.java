/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controll;

import javax.swing.JOptionPane;
import models.Banco;
/**
 *
 * @author Diego
 */
public class Controll {
       
    private static int op;
    private static int opmenuSiNo;
    private static int opCrearCuentaCorrienteAhorros;
    private static int opJuegoAdivinar;
    private static int opMenuAlmacen; 
    private static int opMenuproductosAlmacen;
    private static String eleccionAlmacen;
    private static int opSiNoCompra;
    
    public static int menuPrincipal(){ 
        op=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de la aplicacion que quiere ver \n"
                + "1. BANCO \n"
                + "2. ALMACEN \n"
                + "3. JUEGO ADIVINAR NUMERO \n"             
                + "0. Salir"));
        return op;
    }  
          
    public static int menuOpcionesDelBAnco()
    {
        opmenuSiNo=Integer.parseInt(JOptionPane.showInputDialog("DESEA CREAR UNA CUENTA A UN CLIENTE? \n"
                + "1. SI \n"
                + "2. NO \n"           
                + "0. Salir"));
        return opmenuSiNo;           
    }  

 public static int menuCrearCuenta()
    {        
        opCrearCuentaCorrienteAhorros=Integer.parseInt(JOptionPane.showInputDialog("SELECCIONE QUE TIPO DE CUENTA QUIERE CREAR \n"
                + "1. AHORROS \n"
                + "2. CORRIENTE \n"             
                + "0. Salir"));
        return opCrearCuentaCorrienteAhorros;
    }
 
    public static void validarTipoCuentaIngresadaAhorros(){
        Banco cuentaAhorros = new Banco(0,"",0,"","","");
        int numeroCuentaBanco= Integer.parseInt(JOptionPane.showInputDialog("INGRESE NUMERO DE CUENTA"));
        cuentaAhorros.setNumeroCuentaBanco(numeroCuentaBanco);
        
        String nombreClienteBanco=JOptionPane.showInputDialog("INGRESE NOMBRE");
        cuentaAhorros.setNombreClienteBanco(nombreClienteBanco);
        
        double saldoBanco=Double.parseDouble(JOptionPane.showInputDialog("INGRESE SALDO"));
        cuentaAhorros.setSaldoBanco(saldoBanco);
        
        String claveBanco=JOptionPane.showInputDialog("INGRESE CLAVE");
        cuentaAhorros.setClaveBanco(claveBanco);
        
        cuentaAhorros.setTipoCuentaAhorros("AHORROS");
        JOptionPane.showMessageDialog(null, "SE HA CREADO LA CUENTA DE AHORROS "+cuentaAhorros.getNumeroCuentaBanco()+" PARA EL CLIENTE "+cuentaAhorros.getNombreClienteBanco()+" CON EXITO");              
    }
    
    public static void validarTipoCuentaIngresadaCorriente(){          
        Banco cuentaCorriente = new Banco(0,"",0,"","",""); 
        int  numeroCuentaBancoCorriente= Integer.parseInt(JOptionPane.showInputDialog("INGRESE NUMERO DE CUENTA"));
        cuentaCorriente.setNumeroCuentaBanco(numeroCuentaBancoCorriente);
        
        String nombreClienteBancoC=JOptionPane.showInputDialog("INGRESE NOMBRE");
        cuentaCorriente.setNombreClienteBanco(nombreClienteBancoC);
        
        double saldoBancoC=Double.parseDouble(JOptionPane.showInputDialog("INGRESE SALDO"));
        cuentaCorriente.setSaldoBanco(saldoBancoC);
        
        String claveBancoC=JOptionPane.showInputDialog("INGRESE CLAVE");
        cuentaCorriente.setClaveBanco(claveBancoC);
        
        cuentaCorriente.setTipoCuentaAhorros("CORRIENTE");
        JOptionPane.showMessageDialog(null, "SE HA CREADO LA CUENTA CORRIENTE "+cuentaCorriente.getNumeroCuentaBanco()+" PARA EL CLIENTE "+cuentaCorriente.getNombreClienteBanco()+" CON EXITO");
    }
 
 public static int menuJuegoAdivinar()
    {        
        opJuegoAdivinar=Integer.parseInt(JOptionPane.showInputDialog("SELECCIONE QUE TIPO DE CUENTA QUIERE CREAR \n"
                + "1. Jugar \n"
                + "2. Intentar de nuevo \n"             
                + "0. Salir"));
        return opJuegoAdivinar;
    }
    
 public static void validarNumeroIngresado()
    {   
        int numAdivinar = (int)(Math.random()*5)+1;
         try {    //Para controlar que si igrese un valor numerico valido
            int numeroIngresado = Integer.parseInt(JOptionPane.showInputDialog("BIENVENIDO AL JUEGO DE ADIVINAR NUMERO BUENA SUERTE!! \nINGRESE NUMERO DE 1 AL 5"));
            if(numeroIngresado>5 || numeroIngresado<0){
                JOptionPane.showMessageDialog(null,"El numero se encuentra fuera del rango");
            }else if(numeroIngresado == numAdivinar){
                 JOptionPane.showMessageDialog(null,"!! FELICITACIONES AH GANADO !!");                        
            } else {
                 JOptionPane.showMessageDialog(null,"El numero no es correcto");
             }
         }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"El valor ingresado no es valido");    
        }
    }
 
 public static int menuProductosAlmacen()
    {        
        opMenuproductosAlmacen=Integer.parseInt(JOptionPane.showInputDialog("ESTOS SON LOS PRODUCTOS DISPONIBLES, QUE DESEA COMPRAR \n"
                + "1. Camisas \n"
                + "2. Pantalones \n" 
                + "3. Gorras \n"
                + "4. Zapatos \n" 
                + "0. Salir"));
        return opMenuproductosAlmacen;
    }
 public static int menuAlmacen()
    {        
        opMenuAlmacen=Integer.parseInt(JOptionPane.showInputDialog("DESEA COMPRAR LA PRENDA? \n"
                + "1. Si \n"
                + "2. No \n"             
                + "0. Salir"));
        return opMenuAlmacen;
    }
 
 public static void comprarProducto(){
     
    if(opMenuproductosAlmacen==1){
       JOptionPane.showMessageDialog(null, "Las camisas cuestan 10.000");
       eleccionAlmacen = "10.000";
    }else if(opMenuproductosAlmacen==2){
       JOptionPane.showMessageDialog(null, "Los pantalones cuestan 70.000");
       eleccionAlmacen = "70.000";
    }else if(opMenuproductosAlmacen==3){
       JOptionPane.showMessageDialog(null, "Las gorras cuesta 20.000");
       eleccionAlmacen = "20.000";
    }else if(opMenuproductosAlmacen==4){
       JOptionPane.showMessageDialog(null, "Los zapatos cuestan 120.000");
       eleccionAlmacen = "120.000";
    }
 }
 
 public static void generarFacturaAlmacen()
    {        
       do{
          opSiNoCompra=menuAlmacen();
          switch (opSiNoCompra){
            case 1:                    
                String nombre = JOptionPane.showInputDialog("Por favor ingrese su nombre ");
                int cedula = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese su cedula: "));   
                JOptionPane.showMessageDialog(null, "Muchas gracias por su compra \n\nFACTURA:\nNOMBRE: "+nombre+"\nCEDULA:"+cedula+"\nVALOR DE LA COMPRA:"+eleccionAlmacen+"\n\nMUCHAS GRACIAS POR SU COMPRA");
                menuProductosAlmacen();
            break;                       
            case 2: 
                JOptionPane.showMessageDialog(null, "Vuelva pronto ");
                menuProductosAlmacen();
             break;
             case 0:                                                          
                JOptionPane.showMessageDialog(null, "Regresando...");
             break;
             default:
                JOptionPane.showMessageDialog(null, "La opcion no existe en el menú ");
             break;
             }
        }while (opSiNoCompra!=0);
    }
}