/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JCheckbox;

/**
 *
 * @author usuario
 */
public class Ej2JCheckbox extends javax.swing.JFrame {

    /**
     * Creates new form Ej2JCheckbox
     */
    public Ej2JCheckbox() {
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

        chkAceptoAsCondicions = new javax.swing.JCheckBox();
        btnAcepto = new javax.swing.JButton();
        btnNonAcepto = new javax.swing.JButton();
        btnPodeContinuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        chkAceptoAsCondicions.setText("Acepto as condicions");
        chkAceptoAsCondicions.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkAceptoAsCondicionsItemStateChanged(evt);
            }
        });
        chkAceptoAsCondicions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAceptoAsCondicionsActionPerformed(evt);
            }
        });

        btnAcepto.setText("Acepto");
        btnAcepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptoActionPerformed(evt);
            }
        });

        btnNonAcepto.setText("Non Acepto");
        btnNonAcepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNonAceptoActionPerformed(evt);
            }
        });

        btnPodeContinuar.setText("Pode continuar");
        btnPodeContinuar.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnAcepto, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNonAcepto, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnPodeContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(chkAceptoAsCondicions)
                .addGap(110, 110, 110))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(chkAceptoAsCondicions)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAcepto)
                    .addComponent(btnNonAcepto))
                .addGap(31, 31, 31)
                .addComponent(btnPodeContinuar)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkAceptoAsCondicionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAceptoAsCondicionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAceptoAsCondicionsActionPerformed

    private void btnAceptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptoActionPerformed
        // TODO add your handling code here:
        chkAceptoAsCondicions.setSelected(true);

    }//GEN-LAST:event_btnAceptoActionPerformed

    private void btnNonAceptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNonAceptoActionPerformed
        // TODO add your handling code here:
        chkAceptoAsCondicions.setSelected(false);
    }//GEN-LAST:event_btnNonAceptoActionPerformed

    private void chkAceptoAsCondicionsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkAceptoAsCondicionsItemStateChanged
        // TODO add your handling code here:
        if (chkAceptoAsCondicions.isSelected()) {
            btnPodeContinuar.setEnabled(true);
        } else {
            btnPodeContinuar.setEnabled(false);
        }
    }//GEN-LAST:event_chkAceptoAsCondicionsItemStateChanged

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
            java.util.logging.Logger.getLogger(Ej2JCheckbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ej2JCheckbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ej2JCheckbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ej2JCheckbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ej2JCheckbox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcepto;
    private javax.swing.JButton btnNonAcepto;
    private javax.swing.JButton btnPodeContinuar;
    private javax.swing.JCheckBox chkAceptoAsCondicions;
    // End of variables declaration//GEN-END:variables
}
