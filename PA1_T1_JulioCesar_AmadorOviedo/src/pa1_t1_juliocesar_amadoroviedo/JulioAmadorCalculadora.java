/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa1_t1_juliocesar_amadoroviedo;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zero
 */
public class JulioAmadorCalculadora extends javax.swing.JFrame {
    
    DefaultTableModel modelo;

    int a=0;
    int b=0;
    double c;
    double d;
    int resultado;
    double result;
    int suma=0;
    int conteo=0;
    String operacion, tresultado, signo;

    
    public JulioAmadorCalculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSaludo = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        btnregresar = new javax.swing.JButton();
        lbltotal = new javax.swing.JLabel();
        lblSaludo1 = new javax.swing.JLabel();
        lblSaludo2 = new javax.swing.JLabel();
        txtb = new javax.swing.JTextField();
        txta = new javax.swing.JTextField();
        lblSaludo3 = new javax.swing.JLabel();
        lblresultado = new javax.swing.JLabel();
        lblSaludo4 = new javax.swing.JLabel();
        btnsuma = new javax.swing.JButton();
        btnresta = new javax.swing.JButton();
        btndivision = new javax.swing.JButton();
        btnmultiplicacion = new javax.swing.JButton();
        btnexponente = new javax.swing.JButton();
        lblHistorial = new javax.swing.JLabel();
        btnquitar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        lblSaludo5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblregistros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculador");
        setForeground(new java.awt.Color(255, 255, 255));

        lblSaludo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSaludo.setText("Buen Dia:");

        lblnombre.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblnombre.setForeground(new java.awt.Color(0, 153, 51));
        lblnombre.setText("Julio");

        btnregresar.setText("Regresar");

        lbltotal.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        lbltotal.setForeground(new java.awt.Color(0, 153, 51));
        lbltotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblSaludo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSaludo1.setText("A:");

        lblSaludo2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSaludo2.setText("B:");

        lblSaludo3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSaludo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaludo3.setText("Resultado :");

        lblresultado.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        lblresultado.setForeground(new java.awt.Color(0, 153, 51));

        lblSaludo4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSaludo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaludo4.setText("Operaciones:");

        btnsuma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnsuma.setText("+");
        btnsuma.setPreferredSize(new java.awt.Dimension(51, 29));
        btnsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsumaActionPerformed(evt);
            }
        });

        btnresta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnresta.setText("-");
        btnresta.setPreferredSize(new java.awt.Dimension(51, 29));
        btnresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestaActionPerformed(evt);
            }
        });

        btndivision.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btndivision.setText("/");
        btndivision.setPreferredSize(new java.awt.Dimension(51, 29));
        btndivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivisionActionPerformed(evt);
            }
        });

        btnmultiplicacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnmultiplicacion.setText("*");
        btnmultiplicacion.setPreferredSize(new java.awt.Dimension(51, 29));
        btnmultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultiplicacionActionPerformed(evt);
            }
        });

        btnexponente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnexponente.setText("^");
        btnexponente.setPreferredSize(new java.awt.Dimension(51, 29));
        btnexponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexponenteActionPerformed(evt);
            }
        });

        lblHistorial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHistorial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHistorial.setText("Historial:");

        btnquitar.setText("Quitar");
        btnquitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquitarActionPerformed(evt);
            }
        });

        btnactualizar.setText("Actualizar");

        lblSaludo5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSaludo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaludo5.setText("Calculos Realizados :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Calculadora");

        tblregistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Operacion", "Resultado", "Signo"
            }
        ));
        jScrollPane2.setViewportView(tblregistros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSaludo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblSaludo1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txta))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblSaludo2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                            .addComponent(txtb, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblSaludo3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblSaludo5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSaludo4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnsuma, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnresta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btndivision, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnexponente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnregresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnquitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnactualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSaludo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSaludo1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtb, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSaludo2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSaludo3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(lblHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnregresar)
                        .addGap(54, 54, 54)
                        .addComponent(lblSaludo4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnsuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnresta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnmultiplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btndivision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnexponente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btnquitar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnactualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSaludo5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblnombre.getAccessibleContext().setAccessibleDescription("Calculador");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsumaActionPerformed
        // TODO add your handling code here:
        
        conteo=conteo+1;
                
        a = Integer.parseInt(txta.getText());
        b = Integer.parseInt(txtb.getText());
        resultado=a+b;
        
        if (resultado>0)
        {
            signo="Positivo";
            
        } else {
            signo="Negativo";
        }
                
        lbltotal.setText(String.valueOf(conteo));
        lblresultado.setText(String.valueOf(resultado));
        operacion=(a+"+"+b);
        tresultado=String.valueOf(resultado);
        
        JulioAmadorRegistros registros = new JulioAmadorRegistros(operacion, tresultado, signo);
        JulioAmadorRegistroControler.agregarRegistroLista(registros);
        
        tblregistros.setModel(new javax.swing.table.DefaultTableModel(JulioAmadorRegistroControler.getListaRegistrosComoArreglo(),
                new String [] { 
                    "Operación", "Resultado", "Signo"        
                        
        }
                
        ));
                
        
        
        
        
    }//GEN-LAST:event_btnsumaActionPerformed

    private void btnrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestaActionPerformed
        // TODO add your handling code here:
                conteo=conteo+1;
                
        a = Integer.parseInt(txta.getText());
        b = Integer.parseInt(txtb.getText());
        resultado=a-b;
        
        if (resultado>0)
        {
            signo="Positivo";
            
        } else {
            signo="Negativo";
        }
                
        lbltotal.setText(String.valueOf(conteo));
        lblresultado.setText(String.valueOf(resultado));
        operacion=(a+"-"+b);
        tresultado=String.valueOf(resultado);
        
        JulioAmadorRegistros registros = new JulioAmadorRegistros(operacion, tresultado, signo);
        JulioAmadorRegistroControler.agregarRegistroLista(registros);
        
        tblregistros.setModel(new javax.swing.table.DefaultTableModel(JulioAmadorRegistroControler.getListaRegistrosComoArreglo(),
                new String [] { 
                    "Operación", "Resultado", "Signo"        
                        
        }
        ));
                     
    }//GEN-LAST:event_btnrestaActionPerformed

    private void btnmultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultiplicacionActionPerformed
        // TODO add your handling code here:
        
                conteo=conteo+1;
                
        a = Integer.parseInt(txta.getText());
        b = Integer.parseInt(txtb.getText());
        resultado=a*b;
        
        if (resultado>0)
        {
            signo="Positivo";
            
        } else {
            signo="Negativo";
        }
                
        lbltotal.setText(String.valueOf(conteo));
        lblresultado.setText(String.valueOf(resultado));
        operacion=(a+"*"+b);
        tresultado=String.valueOf(resultado);
        
        JulioAmadorRegistros registros = new JulioAmadorRegistros(operacion, tresultado, signo);
        JulioAmadorRegistroControler.agregarRegistroLista(registros);
        
        tblregistros.setModel(new javax.swing.table.DefaultTableModel(JulioAmadorRegistroControler.getListaRegistrosComoArreglo(),
                new String [] { 
                    "Operación", "Resultado", "Signo"        
                        
        }
        ));
                
    }//GEN-LAST:event_btnmultiplicacionActionPerformed

    private void btndivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivisionActionPerformed
        // TODO add your handling code here:
        
                conteo=conteo+1;
                
        c = Integer.parseInt(txta.getText());
        d = Integer.parseInt(txtb.getText());
        result=c/d;
        
        if (resultado>0)
        {
            signo="Positivo";
            
        } else {
            signo="Negativo";
        }
                
        lbltotal.setText(String.valueOf(conteo));
        lblresultado.setText(String.valueOf(result));
        operacion=(c+"/"+d);
        tresultado=String.valueOf(result);
        
        JulioAmadorRegistros registros = new JulioAmadorRegistros(operacion, tresultado, signo);
        JulioAmadorRegistroControler.agregarRegistroLista(registros);
        
        tblregistros.setModel(new javax.swing.table.DefaultTableModel(JulioAmadorRegistroControler.getListaRegistrosComoArreglo(),
                new String [] { 
                    "Operación", "Resultado", "Signo"        
                        
        }
        ));
        
        
    }//GEN-LAST:event_btndivisionActionPerformed

    private void btnexponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexponenteActionPerformed
        // TODO add your handling code here:
        
                 conteo=conteo+1;
                
        c = Double.parseDouble(txta.getText());
        d = Double.parseDouble(txtb.getText());
        result=Math.pow(c, d);
        
        if (resultado>0)
        {
            signo="Positivo";
            
        } else {
            signo="Negativo";
        }
                
        lbltotal.setText(String.valueOf(conteo));
        lblresultado.setText(String.valueOf(result));
        operacion=(c+"^"+d);
        tresultado=String.valueOf(result);
        
        JulioAmadorRegistros registros = new JulioAmadorRegistros(operacion, tresultado, signo);
        JulioAmadorRegistroControler.agregarRegistroLista(registros);
        
        tblregistros.setModel(new javax.swing.table.DefaultTableModel(JulioAmadorRegistroControler.getListaRegistrosComoArreglo(),
                new String [] { 
                    "Operación", "Resultado", "Signo"        
                        
        }
        ));
                
        
    }//GEN-LAST:event_btnexponenteActionPerformed

    private void btnquitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquitarActionPerformed
        // Para eliminar una linea de la tabla
        
        
        
    }//GEN-LAST:event_btnquitarActionPerformed

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
            java.util.logging.Logger.getLogger(JulioAmadorCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JulioAmadorCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JulioAmadorCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JulioAmadorCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JulioAmadorCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btndivision;
    private javax.swing.JButton btnexponente;
    private javax.swing.JButton btnmultiplicacion;
    private javax.swing.JButton btnquitar;
    private javax.swing.JButton btnregresar;
    private javax.swing.JButton btnresta;
    private javax.swing.JButton btnsuma;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblHistorial;
    private javax.swing.JLabel lblSaludo;
    private javax.swing.JLabel lblSaludo1;
    private javax.swing.JLabel lblSaludo2;
    private javax.swing.JLabel lblSaludo3;
    private javax.swing.JLabel lblSaludo4;
    private javax.swing.JLabel lblSaludo5;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblresultado;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JTable tblregistros;
    private javax.swing.JTextField txta;
    private javax.swing.JTextField txtb;
    // End of variables declaration//GEN-END:variables
}
