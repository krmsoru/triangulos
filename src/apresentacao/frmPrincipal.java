/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import modelo.Controle;

/**
 *
 * @author utayk
 */
public class frmPrincipal extends javax.swing.JFrame
{

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lblLado1 = new javax.swing.JLabel();
        txfLado1 = new javax.swing.JTextField();
        lblLado2 = new javax.swing.JLabel();
        txfLado2 = new javax.swing.JTextField();
        lblLado3 = new javax.swing.JLabel();
        txfLado3 = new javax.swing.JTextField();
        btnVerificar = new javax.swing.JButton();
        lblResposta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Triângulos");
        setResizable(false);

        lblLado1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblLado1.setText("Lado 1");

        txfLado1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txfLado1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txfLado1ActionPerformed(evt);
            }
        });

        lblLado2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblLado2.setText("Lado 2");

        txfLado2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txfLado2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txfLado2ActionPerformed(evt);
            }
        });

        lblLado3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblLado3.setText("Lado 3");

        txfLado3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txfLado3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txfLado3ActionPerformed(evt);
            }
        });

        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnVerificarActionPerformed(evt);
            }
        });

        lblResposta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblResposta.setText("Resposta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfLado3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLado3)
                    .addComponent(txfLado2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLado2)
                    .addComponent(lblLado1)
                    .addComponent(txfLado1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblResposta)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnVerificar)))
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblLado1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfLado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLado2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfLado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLado3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfLado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVerificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblResposta)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txfLado1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txfLado1ActionPerformed
    {//GEN-HEADEREND:event_txfLado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfLado1ActionPerformed

    private void txfLado2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txfLado2ActionPerformed
    {//GEN-HEADEREND:event_txfLado2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfLado2ActionPerformed

    private void txfLado3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txfLado3ActionPerformed
    {//GEN-HEADEREND:event_txfLado3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfLado3ActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnVerificarActionPerformed
    {//GEN-HEADEREND:event_btnVerificarActionPerformed
        Controle controle = new Controle(txfLado1.getText(), txfLado2.getText(), txfLado3.getText());
        lblResposta.setText(controle.getResposta());
    }//GEN-LAST:event_btnVerificarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel lblLado1;
    private javax.swing.JLabel lblLado2;
    private javax.swing.JLabel lblLado3;
    private javax.swing.JLabel lblResposta;
    private javax.swing.JTextField txfLado1;
    private javax.swing.JTextField txfLado2;
    private javax.swing.JTextField txfLado3;
    // End of variables declaration//GEN-END:variables
}
