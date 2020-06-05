/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1java;

import javax.swing.JOptionPane;
import controll.Controll;
/**
 *
 * @author Diego
 */
public class Taller1Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int op;
       int op2;
       int op3;
       int op4;
       int op5;
       do{           
            op=Controll.menuPrincipal();
            switch (op){
            case 1:                    
                 do{
                     op2=Controll.menuOpcionesDelBAnco();
                     switch (op2){
                     case 1:                    
                         do{
                             op3=Controll.menuCrearCuenta();
                             switch (op3){
                             case 1:                    
                                Controll.validarTipoCuentaIngresadaAhorros();
                             break;                       
                             case 2: 
                                Controll.validarTipoCuentaIngresadaCorriente();
                             break;
                             case 0:                                                          
                                JOptionPane.showMessageDialog(null, "Regresando...");
                             break;
                             default:
                                JOptionPane.showMessageDialog(null, "La opcion no existe en el menú ");
                             break;
                             }
                         }while (op3!=0);
                     break;                       
                     case 2: 
                            JOptionPane.showMessageDialog(null, "Ha seleccionado que no, Ha finalizado el programa.");
                            Controll.menuPrincipal();
                     break;
                     case 0:                    
                            JOptionPane.showMessageDialog(null, "Regresando...");
                     break;
                     default:
                            JOptionPane.showMessageDialog(null, "La opcion no existe en el menú ");
                    break;
                                }                            
                    }while (op2!=0);
            break;                       
                        
            case 2:
             do{
                op5=Controll.menuProductosAlmacen();
                switch (op5){
                case 1:                    
                    Controll.comprarProducto();
                    Controll.generarFacturaAlmacen();
                break;                       
                case 2: 
                    Controll.comprarProducto();
                    Controll.generarFacturaAlmacen();
                break;
                case 3: 
                    Controll.comprarProducto();
                    Controll.generarFacturaAlmacen();
                break;
                case 4: 
                    Controll.comprarProducto();
                    Controll.generarFacturaAlmacen();
                break;
                case 0:                                                          
                    JOptionPane.showMessageDialog(null, "Regresando...");
                break;
                default:
                    JOptionPane.showMessageDialog(null, "La opcion no existe en el menú ");
                break;
                             }
                }while (op5!=0);    
            break;
                
            case 3:
                do{
                    op4=Controll.menuJuegoAdivinar();
                    switch (op4){
                    case 1:                    
                        Controll.validarNumeroIngresado();
                    break;                       
                    case 2: 
                        Controll.validarNumeroIngresado();
                    break;
                    case 0:                                                          
                        JOptionPane.showMessageDialog(null, "Regresando...");
                    break;
                    default:
                        JOptionPane.showMessageDialog(null, "La opcion no existe en el menú ");
                    break;
                                }
                    }while (op4!=0);
            break;
            
            case 0:
                JOptionPane.showMessageDialog(null, "Ha finalizado el programa.");
            break;   
            default:
                JOptionPane.showMessageDialog(null, "La opcion no existe en el menú ");
            break;
                        }        
        }while (op!=0);
    }
}