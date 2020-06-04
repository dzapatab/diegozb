package Controll;


import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class Empleado extends javax.swing.JFrame 
        
{     
    double nomina=0;   //Varible para sumar todos los salarios calculados
    int cont =0;       //Varible para conter todos los trabajador procesados
    int contSminimino =0, contUnoaDosS=0,contMasdeDosSalarios=0;       
    public Empleado() // Metodo constructor
    {
        initComponents();
       
    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gbGrupo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btEnviar = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        Calculo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txSalida = new javax.swing.JTextArea();
        btCalcular = new javax.swing.JButton();
        btVerNomina = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnNuevo = new javax.swing.JButton();
        lbGenero = new javax.swing.JLabel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFemenino = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        cbHijos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setBackground(new java.awt.Color(255, 51, 102));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PROGRAMA SALARIO EMPLEADO");

        lbNombre.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        lbNombre.setText("NOMBRE:");

        btEnviar.setBackground(new java.awt.Color(204, 204, 204));
        btEnviar.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btEnviar.setText("ENVIAR");
        btEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnviarActionPerformed(evt);
            }
        });

        btSalir.setBackground(new java.awt.Color(204, 204, 204));
        btSalir.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btSalir.setText("SALIR");
        btSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSalirMouseClicked(evt);
            }
        });

        Calculo.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setText("DATOS DE LA NOMINA EMPLEADOS");

        txSalida.setColumns(20);
        txSalida.setRows(5);
        jScrollPane2.setViewportView(txSalida);

        btCalcular.setBackground(new java.awt.Color(204, 204, 204));
        btCalcular.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btCalcular.setText("CALCULAR SALARIO");
        btCalcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCalcularMouseClicked(evt);
            }
        });
        btCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularActionPerformed(evt);
            }
        });

        btVerNomina.setBackground(new java.awt.Color(204, 204, 204));
        btVerNomina.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btVerNomina.setText("VER NOMINA");
        btVerNomina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btVerNominaMouseClicked(evt);
            }
        });
        btVerNomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVerNominaActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CalculoLayout = new javax.swing.GroupLayout(Calculo);
        Calculo.setLayout(CalculoLayout);
        CalculoLayout.setHorizontalGroup(
            CalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalculoLayout.createSequentialGroup()
                .addGroup(CalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CalculoLayout.createSequentialGroup()
                        .addGap(648, 648, 648)
                        .addComponent(jSeparator1))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CalculoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(192, 192, 192))
            .addGroup(CalculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CalculoLayout.createSequentialGroup()
                        .addComponent(btCalcular)
                        .addGap(173, 173, 173)
                        .addComponent(btVerNomina)
                        .addGap(75, 75, 75)
                        .addComponent(btnNuevo))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CalculoLayout.setVerticalGroup(
            CalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCalcular)
                    .addComponent(btVerNomina)
                    .addComponent(btnNuevo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
        );

        btCalcular.getAccessibleContext().setAccessibleDescription("Puede cambiar los datos y volver a calcular");

        lbGenero.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        lbGenero.setText("GENERO");

        gbGrupo.add(rbMasculino);
        rbMasculino.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        rbMasculino.setText("MASCULINO");

        gbGrupo.add(rbFemenino);
        rbFemenino.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        rbFemenino.setText("FEMENINO");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel4.setText("CEDULA:");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel5.setText("SALARIO:");

        jComboBox1.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OFICIOS VARIOS", "TENCNOLOGO", "INGENIERO" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        cbHijos.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        cbHijos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6" }));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel3.setText("CARGO:");

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel6.setText("CANT HIJOS:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(107, 107, 107))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbMasculino)
                                .addGap(18, 18, 18)
                                .addComponent(rbFemenino))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(258, 258, 258)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbHijos, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(186, 186, 186))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(txtNombre))))
                        .addGap(41, 41, 41)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(23, 23, 23))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(Calculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEnviar)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbHijos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbGenero)
                    .addComponent(rbMasculino)
                    .addComponent(rbFemenino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Calculo, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnviarActionPerformed
        
     
    }//GEN-LAST:event_btEnviarActionPerformed

    private void btCalcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCalcularMouseClicked
          //capura el contenido de la caja de texto nombre trabajador
          //Borra el contenido del area de texto y coloca el titulo
        double salariaIngresado=Double.parseDouble(txtSalario.getText());
        double salario=0;
      String tipo=jComboBox1.getSelectedItem().toString();    //Captura el tipo de trabajador de la lista Tipo
       if (tipo.equals("OFICIOS VARIOS"))
           salario=830000;
       if (tipo.equals("TECNOLOGO"))
           salario=1200000;
       if (tipo.equals("INGENIERO"))
           salario=2500000;
        txSalida.append("El salario basico para el tipo de trabajador "+tipo+ " es : "+salario+ "\n");  //Adjuta este mensaje a el area de texto Salida
       
        if(rbFemenino.isSelected()) { 
            double salarioConIncrementoF=salariaIngresado*1.05;  //se incrementa un 5%
            txSalida.append("El sexo es: Femenino"+"El incremento es de: "+salarioConIncrementoF+"\n");
        }
         if(rbMasculino.isSelected()) { 
           double salarioConIncrementoM=salariaIngresado*1.1;  //se incrementa 10% 
            txSalida.append("El sexo es: Masculino"+"El incremento es de: "+salarioConIncrementoM+"\n");
        }                          
        //calculo del salario dependiendo del numero de hijos
        String hijos=cbHijos.getSelectedItem().toString();    //Se captura el valor del numero de hijos de la lista desplegable
        int numHijos = Integer.parseInt(hijos);             //Se convierte a Entero
        if(numHijos == 0){
              // Si posee un hijo se le da una bonificacion 50.000$
            txSalida.append("No Tiene hijos, no posee Bonificacion y el salario es: "+salariaIngresado +"\n");
        } else if( numHijos >= 1 &&numHijos <= 3) { // Si posee entre un hijo y 3 la da una bonificacion de 100.000$
            salariaIngresado = salariaIngresado + 100000;   
            txSalida.append("Tiene "+hijos +" hijos, la Bonificacion es 100.000$ y el salario es: "+salariaIngresado +"\n");
        }
        else if( numHijos > 3 &&numHijos < 6) { // Si posee mas de 3  hijos y menos de 6 la da una bonificacion es 200.000$
            salariaIngresado = salariaIngresado + 200000;  
            txSalida.append("Tiene "+hijos +" hijos, la Bonificacion es 200.000$ y el salario es: "+salariaIngresado +"\n");
        } else { // Si posee mas de 6  hijos la bonificacion es 300.000$
            salariaIngresado = salariaIngresado + 300000;  
            txSalida.append("Tiene "+hijos +" hijos, la Bonificacion es 300.000$ y el salario es: "+salariaIngresado +"\n");
        }
         txSalida.append("EL TOTAL A PAGAR ES DE: " + salariaIngresado);
         nomina= nomina + salariaIngresado;        
    }//GEN-LAST:event_btCalcularMouseClicked

    
    private void btSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalirMouseClicked
        // TODO add your handling code here:
        dispose();   //Cierra la ventana de Empleado
    }//GEN-LAST:event_btSalirMouseClicked

    private void btVerNominaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btVerNominaMouseClicked
        // TODO add your handling code here:
        String nombre=txtNombre.getText();
         double salario = Double.parseDouble(txtSalario.getText());    //Varible para ir calculado el salario a pagar a una trabajador
          String masculino = "Masculino";
          String femenino = "Femenino";
          double promedioSalarios = 0;
          String tipo;
          cont=cont+1;
          contSminimino=0;
          contUnoaDosS=0;
          contMasdeDosSalarios=0;
           int acumSM=0;       
        txSalida.setText("LOS DATOS DE LA NOMINA DE LA EMPRESA SON:\n\n");
        txSalida.append("Total de trabajadores: "+cont+"\n");            
        txSalida.setText("EL CALCULO DEL SALARIO "+ cont+ " DE TRABAJADOR "+nombre+" ES: \n");  
        
          if(rbMasculino.isSelected()) { 
            masculino=masculino;    
            txSalida.append("Sexo: "+masculino+"\n");
        }
        if(rbFemenino.isSelected()) { 
            femenino=femenino;  
            txSalida.append("Sexo: "+femenino+"\n");
        }
        
        if(salario<826116){         
            txSalida.append("la cantidad de personas que ganan menos del salario minimo son: "+ contSminimino++ +"\n");        
        acumSM=acumSM+contSminimino;
        }else if(salario>=826116 && salario<=1652232){       
            txSalida.append("la cantidad de personas que ganan entre 1 y 2 salarios minimos son: "+contUnoaDosS++ +"\n");         
        } else if (salario>1652232){   
        txSalida.append("la cantidad de personas que ganan mas de 2 salarios minimos son: "+contMasdeDosSalarios++ +"\n"); 
        }
         txSalida.setText("LA CANTIDAD DE PERSONAS QUE GANAN MENOS DEL SALARIO MINIMO ES : "+ acumSM +" \n"+"LA CANTIDAD DE PERSONAS QUE GANAN DE UNO A DOS SALARIOS MINIMOS ES : "+ contUnoaDosS++ +"\n"+ "LA CANTIDAD DE PERSONAS QUE GANAN MAS DE DOS SALARIOS MINIMOS ES : "+ contMasdeDosSalarios++); 
          
    }//GEN-LAST:event_btVerNominaMouseClicked

    private void btVerNominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerNominaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btVerNominaActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:      
        txtNombre.setText("");
        txtCedula.setText("");
        txtSalario.setText(""); 
        txSalida.setText("");
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btCalcularActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Calculo;
    private javax.swing.JButton btCalcular;
    private javax.swing.JButton btEnviar;
    private javax.swing.JButton btSalir;
    private javax.swing.JButton btVerNomina;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cbHijos;
    private javax.swing.ButtonGroup gbGrupo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbGenero;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JRadioButton rbFemenino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTextArea txSalida;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
