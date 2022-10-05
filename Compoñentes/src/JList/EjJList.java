/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JList;

import JTextField.LimiteLonxitudeJTextField;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class EjJList extends javax.swing.JFrame {

    private javax.swing.DefaultListModel<Alfombra> modeloAlfombras;

    /**
     * Creates new form Alfombras
     */
    public EjJList() {
        initComponents();
        //crear o modelo para almacenar as alfombras
        modeloAlfombras = new DefaultListModel<Alfombra>();
        //ligar o modelo ao control JList
        lstAlfombras.setModel(modeloAlfombras);
        txtAncho.setDocument(new LimiteLonxitudeJTextField(5));
        txtAlto.setDocument(new LimiteLonxitudeJTextField(5));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panNovaAlfombra = new javax.swing.JPanel();
        lblModelo = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        lblCor = new javax.swing.JLabel();
        txtCor = new javax.swing.JTextField();
        lblAncho = new javax.swing.JLabel();
        txtAncho = new javax.swing.JTextField();
        btnEngadir = new javax.swing.JButton();
        lblCm1 = new javax.swing.JLabel();
        lblAlto = new javax.swing.JLabel();
        txtAlto = new javax.swing.JTextField();
        lblCm2 = new javax.swing.JLabel();
        panPrincipal = new javax.swing.JPanel();
        scpAlfombras = new javax.swing.JScrollPane();
        lstAlfombras = new javax.swing.JList<>();
        btnInfo = new javax.swing.JButton();
        brnEliminar = new javax.swing.JButton();
        btnEliminarTodas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panNovaAlfombra.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Nova Alfombra"));

        lblModelo.setText("Modelo");

        lblCor.setText("Cor");

        lblAncho.setText("Ancho");

        btnEngadir.setText("Engadir");
        btnEngadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEngadirActionPerformed(evt);
            }
        });

        lblCm1.setText("(cm)");

        lblAlto.setText("Alto");

        lblCm2.setText("(cm)");

        javax.swing.GroupLayout panNovaAlfombraLayout = new javax.swing.GroupLayout(panNovaAlfombra);
        panNovaAlfombra.setLayout(panNovaAlfombraLayout);
        panNovaAlfombraLayout.setHorizontalGroup(
            panNovaAlfombraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panNovaAlfombraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panNovaAlfombraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panNovaAlfombraLayout.createSequentialGroup()
                        .addComponent(lblModelo)
                        .addGap(38, 38, 38)
                        .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panNovaAlfombraLayout.createSequentialGroup()
                        .addComponent(lblCor)
                        .addGap(29, 29, 29)
                        .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblAncho)
                        .addGap(18, 18, 18)
                        .addComponent(txtAncho, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCm1)
                        .addGap(18, 18, 18)
                        .addComponent(lblAlto)
                        .addGap(18, 18, 18)
                        .addComponent(txtAlto, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCm2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEngadir, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panNovaAlfombraLayout.setVerticalGroup(
            panNovaAlfombraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panNovaAlfombraLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(panNovaAlfombraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelo)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEngadir))
                .addGap(18, 18, 18)
                .addGroup(panNovaAlfombraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCor)
                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAncho)
                    .addComponent(txtAncho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCm1)
                    .addComponent(lblAlto)
                    .addComponent(txtAlto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCm2))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Alfombras Dispoñibles"));

        lstAlfombras.setToolTipText("");
        lstAlfombras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstAlfombrasMouseClicked(evt);
            }
        });
        scpAlfombras.setViewportView(lstAlfombras);

        btnInfo.setText("Informacion de las alfombras");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        brnEliminar.setText("Eliminar alfombra");
        brnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnEliminarActionPerformed(evt);
            }
        });

        btnEliminarTodas.setText("Eliminar Todas");
        btnEliminarTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTodasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panPrincipalLayout = new javax.swing.GroupLayout(panPrincipal);
        panPrincipal.setLayout(panPrincipalLayout);
        panPrincipalLayout.setHorizontalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPrincipalLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(scpAlfombras, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(brnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarTodas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panPrincipalLayout.setVerticalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPrincipalLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panPrincipalLayout.createSequentialGroup()
                        .addComponent(btnInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(brnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarTodas))
                    .addComponent(scpAlfombras, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panNovaAlfombra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(panNovaAlfombra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEngadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEngadirActionPerformed
        // TODO add your handling code here:
        String incorrecto = "El ";
        if (!(txtAlto.getText().equals("") && txtAncho.getText().equals("") && txtCor.getText() == null && txtModelo.getText().equals(""))) {
            modeloAlfombras.addElement(new Alfombra(txtModelo.getText(), txtCor.getText(), Integer.parseInt(txtAlto.getText()), Integer.parseInt(txtAncho.getText())));
            JOptionPane.showMessageDialog(this, "Alfombra añadida correctamente", "Exito", JOptionPane.PLAIN_MESSAGE);
        } else {
            if (txtAlto.getText().equals("")) {
                incorrecto += "alto, ";
            }
            if (txtAlto.getText().equals("")) {
                incorrecto += "ancho, ";
            }
            if (txtModelo.getText().equals("")) {
                incorrecto += "modelo, ";
            }
            if (txtCor.getText().equals("")) {
                incorrecto += "cor, ";
            }
            incorrecto += " es/son incorrecto(s).";

            JOptionPane.showMessageDialog(this, incorrecto, "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnEngadirActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        // TODO add your handling code here:
        // Comprobar se hai alfombras na lista
        if (modeloAlfombras.getSize() == 0) {
            JOptionPane.showMessageDialog(this, "Non hai alfombras dispoñibles");
            return;
        }

        //Comprobar se seleccionamos algunha alfombra
        if (lstAlfombras.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar ao menos unha alfombra");
            return;
        }

        //Recuperar as alfombras do meodelo
        int posicionsSeleccionados[] = lstAlfombras.getSelectedIndices();
        String mensaxe = "";
        for (int i = 0; i < posicionsSeleccionados.length; i++) {
            Alfombra alfombra = modeloAlfombras.getElementAt(posicionsSeleccionados[i]);
            mensaxe = mensaxe + "MODELO: " + alfombra.getModelo() + "\nCOR: " + alfombra.getCor()
                    + "\nANCHO: " + alfombra.getAncho() + " cm\nALTO: " + alfombra.getAlto() + " cm\n\n";
        }

        //Mostras información das alfombra por pantalla
        JOptionPane.showMessageDialog(this, mensaxe);
    }//GEN-LAST:event_btnInfoActionPerformed

    private void lstAlfombrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstAlfombrasMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            // Comprobar se hai alfombras na lista
            if (modeloAlfombras.getSize() == 0) {
                JOptionPane.showMessageDialog(this, "Non hai alfombras dispoñibles");
                return;
            }
            //Comprobar se seleccionamos algunha alfombra. Dependendo da version da maquina
            //virtual esta comprobación pódese obviar xa que nalgunhas versións, ao facer clic
            //sobre unha lista con elementos, se o clic non se fai sobre ningún deles
            //automáticamente o entorno selecciona un por nos.
            if (lstAlfombras.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(this, "Debe seleccionar unha alfombra");
                return;
            }
            //Recuperar a alfombra do modelo
            Alfombra alfombra = modeloAlfombras.getElementAt(lstAlfombras.getSelectedIndex());
            //Mostras información da alfombra por pantalla
            String mensaxe = "MODELO: " + alfombra.getModelo() + "\nCOR: " + alfombra.getCor()
                    + "\nANCHO: " + alfombra.getAncho() + " cm\nALTO: " + alfombra.getAlto() + " cm";
            JOptionPane.showMessageDialog(this, mensaxe);
        }

    }//GEN-LAST:event_lstAlfombrasMouseClicked

    private void brnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnEliminarActionPerformed
        // TODO add your handling code here:
        modeloAlfombras.removeElementAt(lstAlfombras.getSelectedIndex());
    }//GEN-LAST:event_brnEliminarActionPerformed

    private void btnEliminarTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTodasActionPerformed
        // TODO add your handling code here:
        modeloAlfombras.removeAllElements();
    }//GEN-LAST:event_btnEliminarTodasActionPerformed

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
            java.util.logging.Logger.getLogger(EjJList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjJList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjJList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjJList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjJList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnEliminar;
    private javax.swing.JButton btnEliminarTodas;
    private javax.swing.JButton btnEngadir;
    private javax.swing.JButton btnInfo;
    private javax.swing.JLabel lblAlto;
    private javax.swing.JLabel lblAncho;
    private javax.swing.JLabel lblCm1;
    private javax.swing.JLabel lblCm2;
    private javax.swing.JLabel lblCor;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JList<Alfombra> lstAlfombras;
    private javax.swing.JPanel panNovaAlfombra;
    private javax.swing.JPanel panPrincipal;
    private javax.swing.JScrollPane scpAlfombras;
    private javax.swing.JTextField txtAlto;
    private javax.swing.JTextField txtAncho;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtModelo;
    // End of variables declaration//GEN-END:variables
}
