/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueaderotigre;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author juane
 */
public class Datos extends javax.swing.JFrame {

    Parqueadero miParqueadero=new Parqueadero();
    int ficha=0;
    
    public Datos() {
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

        Placa = new javax.swing.JLabel();
        ValorPlaca = new javax.swing.JTextField();
        Cedula = new javax.swing.JLabel();
        ValorCedula = new javax.swing.JTextField();
        Modelo = new javax.swing.JLabel();
        Color = new javax.swing.JLabel();
        ValorModelo = new javax.swing.JTextField();
        ValorColor = new javax.swing.JTextField();
        Estado = new javax.swing.JLabel();
        EstadoCarro = new javax.swing.JComboBox<>();
        Registrar = new javax.swing.JButton();
        MostrarDatos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Placa.setText("Digite la placa");

        ValorPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorPlacaActionPerformed(evt);
            }
        });
        ValorPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ValorPlacaKeyTyped(evt);
            }
        });

        Cedula.setText("Digite su cedula");

        Modelo.setText("Digite el modelo");

        Color.setText("Digite el color");

        Estado.setText("Estado");

        EstadoCarro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bueno", "Malo", "Regular" }));

        Registrar.setText("REGISTRAR");
        Registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarMouseClicked(evt);
            }
        });
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });

        MostrarDatos.setText("MOSTRAR REGISTRO");
        MostrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarDatosActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Modelo)
                    .addComponent(Color)
                    .addComponent(Estado)
                    .addComponent(Placa)
                    .addComponent(Cedula))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EstadoCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Registrar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ValorColor, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ValorModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ValorPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ValorCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(MostrarDatos))
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Placa)
                            .addComponent(ValorPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cedula)
                            .addComponent(ValorCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Modelo)
                            .addComponent(ValorModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Color)
                            .addComponent(ValorColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EstadoCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Estado)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MostrarDatos)
                            .addComponent(Registrar))))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ValorPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorPlacaActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        //initComponents();
        boolean GuardarEstadoPlaca = false, GuardarEstadoCedula = false, GuardarEstadoModelo = false, GuardarEstadoColor = false;
        if(ValorPlaca.getText().equals("")||ValorCedula.getText().equals("")||ValorModelo.getText().equals("")||ValorColor.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Hay campos vacíos, por favor ingrese TODOS los datos");
        }else{
            Pattern PatronPlaca = Pattern.compile("^[A-Z]{3}[0-9]{3}$");
            Matcher placa = PatronPlaca.matcher(ValorPlaca.getText());
            if(placa.find()==false){
                JOptionPane.showMessageDialog(null, "La placa es invalida");
            }else{
                GuardarEstadoPlaca = true;
            }
            
            Pattern PatronCedula = Pattern.compile("^[0-9]{10}$");
            Matcher cedula = PatronCedula.matcher(ValorCedula.getText());
            if(cedula.find()==false){
                JOptionPane.showMessageDialog(null, "La cedula es invalida");
            }else{
                GuardarEstadoCedula = true;
            }
            
            Pattern PatronModelo = Pattern.compile("^[0-9]{4}$");
            Matcher modelo = PatronModelo.matcher(ValorModelo.getText());
            if(modelo.find()==false){
                JOptionPane.showMessageDialog(null, "La modelo es invalido");
            }else{
                GuardarEstadoModelo = true;
            }
            
            Pattern PatronColor = Pattern.compile("^[A-Z]|[a-z]$");
            Matcher color  = PatronColor.matcher(ValorColor.getText());
            if(color.find()==false){
                JOptionPane.showMessageDialog(null, "La color es invalido");
            }else{
                GuardarEstadoColor = true;
            }
            System.out.println(placa.find());
            if((GuardarEstadoPlaca == true) && (GuardarEstadoModelo == true) && (GuardarEstadoCedula==true) && (GuardarEstadoColor == true)){
                miParqueadero.misCarros[ficha++]=new Carro();
                miParqueadero.misCarros[ficha-1].setPlaca(ValorPlaca.getText());
                miParqueadero.misCarros[ficha-1].setCedula(ValorCedula.getText());
                miParqueadero.misCarros[ficha-1].setMarca(ValorModelo.getText());
                miParqueadero.misCarros[ficha-1].setColor(ValorColor.getText());
                JOptionPane.showMessageDialog(null,"El carro ha sido registrado con exito");
            }else{   
            }   
        }
    }//GEN-LAST:event_RegistrarActionPerformed

    private void RegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarMouseClicked
        System.out.println("Cedula:"+ miParqueadero.misCarros[0].getCedula());
        Vista vista = new Vista();
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_RegistrarMouseClicked

    private void ValorPlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValorPlacaKeyTyped
        
    }//GEN-LAST:event_ValorPlacaKeyTyped

    private void MostrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarDatosActionPerformed
                String msj="";
                for(int i =0; i<ficha;i++){
                    
                String mesj="Datos: \n"
                  +"Cedula:"+ miParqueadero.misCarros[i].getCedula()
                   +"\nMarca:"+ miParqueadero.misCarros[i].getMarca()
                   +"\nColor:"+ miParqueadero.misCarros[i].getColor()
                   +"\nPlaca:"+ miParqueadero.misCarros[i].getPlaca();
                  msj=msj+mesj+"\n";
      }
                System.out.println(msj);
                this.jTextArea1.setText(msj);
    }//GEN-LAST:event_MostrarDatosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Datos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cedula;
    private javax.swing.JLabel Color;
    private javax.swing.JLabel Estado;
    private javax.swing.JComboBox<String> EstadoCarro;
    private javax.swing.JLabel Modelo;
    private javax.swing.JButton MostrarDatos;
    private javax.swing.JLabel Placa;
    private javax.swing.JButton Registrar;
    private javax.swing.JTextField ValorCedula;
    private javax.swing.JTextField ValorColor;
    private javax.swing.JTextField ValorModelo;
    private javax.swing.JTextField ValorPlaca;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}