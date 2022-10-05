/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JRadioButton;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class EjJRadiobutton extends javax.swing.JFrame {

    /**
     * Creates new form EjJRadiobutton
     */
    public EjJRadiobutton() {
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

        btnGrpMaterial = new javax.swing.ButtonGroup();
        btnGrpCor = new javax.swing.ButtonGroup();
        lblDeseñaCamiseta = new javax.swing.JLabel();
        lblLogotipo = new javax.swing.JLabel();
        txtLogotipo = new javax.swing.JTextField();
        chkMangaLonga = new javax.swing.JCheckBox();
        btnEncargar = new javax.swing.JButton();
        panMaterial = new javax.swing.JPanel();
        rbtAlgodon = new javax.swing.JRadioButton();
        rbtLino = new javax.swing.JRadioButton();
        rbtPoliester = new javax.swing.JRadioButton();
        panCor = new javax.swing.JPanel();
        rbtVermello = new javax.swing.JRadioButton();
        rbtVerde = new javax.swing.JRadioButton();
        rbtAzul = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblDeseñaCamiseta.setText("DESEÑA A TÚA CAMISETA");

        lblLogotipo.setText("Logotipo");

        chkMangaLonga.setText("Manga longa");

        btnEncargar.setText("Encargar");
        btnEncargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncargarActionPerformed(evt);
            }
        });

        panMaterial.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Material"));

        btnGrpMaterial.add(rbtAlgodon);
        rbtAlgodon.setSelected(true);
        rbtAlgodon.setText("Algodon");

        btnGrpMaterial.add(rbtLino);
        rbtLino.setText("Lino");
        rbtLino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtLinoActionPerformed(evt);
            }
        });

        btnGrpMaterial.add(rbtPoliester);
        rbtPoliester.setText("Poliester");

        javax.swing.GroupLayout panMaterialLayout = new javax.swing.GroupLayout(panMaterial);
        panMaterial.setLayout(panMaterialLayout);
        panMaterialLayout.setHorizontalGroup(
            panMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMaterialLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtLino)
                    .addComponent(rbtPoliester)
                    .addComponent(rbtAlgodon))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        panMaterialLayout.setVerticalGroup(
            panMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMaterialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtAlgodon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtLino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtPoliester)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panCor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Cor"));

        btnGrpCor.add(rbtVermello);
        rbtVermello.setSelected(true);
        rbtVermello.setText("Vermello");

        btnGrpCor.add(rbtVerde);
        rbtVerde.setText("Verde");

        btnGrpCor.add(rbtAzul);
        rbtAzul.setText("Azul");

        javax.swing.GroupLayout panCorLayout = new javax.swing.GroupLayout(panCor);
        panCor.setLayout(panCorLayout);
        panCorLayout.setHorizontalGroup(
            panCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtVermello)
                    .addComponent(rbtVerde)
                    .addComponent(rbtAzul))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        panCorLayout.setVerticalGroup(
            panCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtVermello)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtVerde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtAzul)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLogotipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtLogotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addComponent(panMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(panCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDeseñaCamiseta)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chkMangaLonga)
                                .addGap(38, 38, 38)
                                .addComponent(btnEncargar, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblDeseñaCamiseta)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogotipo)
                    .addComponent(txtLogotipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panCor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkMangaLonga)
                    .addComponent(btnEncargar))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtLinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtLinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtLinoActionPerformed

    private void btnEncargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncargarActionPerformed
        // TODO add your handling code here:
        String logotipo = txtLogotipo.getText().trim();
        if (logotipo.compareTo("") == 0) {
            JOptionPane.showMessageDialog(this, "Debe indicar o logotipo da camiseta");
            return;
        }

        //Nova Camiseta
        Camiseta camiseta = new Camiseta(logotipo, chkMangaLonga.isSelected());

        //Recollida de datos dos radio buttons do material
        if (rbtAlgodon.isSelected()) {
            camiseta.setMaterial(0);
        } else {
            if (rbtLino.isSelected()) {
                camiseta.setMaterial(1);
            } else {
                camiseta.setMaterial(2);
            }
        }

        // Recollida de datos dos radio buttons do cor
        // empregando unha variable local
        int cor;
        if (rbtVermello.isSelected()) {
            cor = 0;
        } else {
            if (rbtVerde.isSelected()) {
                cor = 1;
            } else {
                cor = 2;
            }
        }

        camiseta.setCor(cor);

        //Traza para comprobar a correccion do obxeto creado
        System.out.println(camiseta);

        //Insertar o obxeto creado na BD
        //Non é parte desta unidade didactica
        JOptionPane.showMessageDialog(this, "Rexistro gardado correctamente");
    }//GEN-LAST:event_btnEncargarActionPerformed

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
            java.util.logging.Logger.getLogger(EjJRadiobutton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjJRadiobutton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjJRadiobutton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjJRadiobutton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjJRadiobutton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEncargar;
    private javax.swing.ButtonGroup btnGrpCor;
    private javax.swing.ButtonGroup btnGrpMaterial;
    private javax.swing.JCheckBox chkMangaLonga;
    private javax.swing.JLabel lblDeseñaCamiseta;
    private javax.swing.JLabel lblLogotipo;
    private javax.swing.JPanel panCor;
    private javax.swing.JPanel panMaterial;
    private javax.swing.JRadioButton rbtAlgodon;
    private javax.swing.JRadioButton rbtAzul;
    private javax.swing.JRadioButton rbtLino;
    private javax.swing.JRadioButton rbtPoliester;
    private javax.swing.JRadioButton rbtVerde;
    private javax.swing.JRadioButton rbtVermello;
    private javax.swing.JTextField txtLogotipo;
    // End of variables declaration//GEN-END:variables
}
