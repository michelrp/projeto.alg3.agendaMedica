/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.alg3.agendaMedica.paciente;

import javax.swing.JOptionPane;

/**
 *
 * @author Michel
 */
public class PacienteEditaJDialog extends javax.swing.JDialog {
    
    private Paciente editaPaciente;
    private PacienteGerenciaBD bd = new PacienteGerenciaBD();
    /**
     * Creates new form PacienteEditaJDialog
     */
    public PacienteEditaJDialog(java.awt.Frame parent, boolean modal, Paciente editar) {
        super(parent, modal);
        initComponents();
        editaPaciente = editar;
        nomejTextField.setText(editaPaciente.getNome());
        enderecojTextField.setText(editaPaciente.getEndereco());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomejLabel = new javax.swing.JLabel();
        enderecojLabel = new javax.swing.JLabel();
        nomejTextField = new javax.swing.JTextField();
        enderecojTextField = new javax.swing.JTextField();
        confirmajButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cancelarjButton = new javax.swing.JButton();
        conveniojLabel = new javax.swing.JLabel();
        conveniojTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        nomejLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nomejLabel.setText("Nome:");

        enderecojLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        enderecojLabel.setText("Endereço:");

        confirmajButton.setText("Confirmar");
        confirmajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmajButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("                     ATUALIZACÃO DE CADASTRO");

        cancelarjButton.setText("Cancelar");
        cancelarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarjButtonActionPerformed(evt);
            }
        });

        conveniojLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        conveniojLabel.setText("Convenio:");

        conveniojTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conveniojTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomejLabel)
                                    .addComponent(enderecojLabel))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomejTextField)
                                    .addComponent(enderecojTextField)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(confirmajButton)
                                .addGap(60, 60, 60)
                                .addComponent(cancelarjButton))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(conveniojLabel)
                                .addGap(18, 18, 18)
                                .addComponent(conveniojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(62, 62, 62)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomejLabel)
                    .addComponent(nomejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enderecojLabel)
                    .addComponent(enderecojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conveniojLabel)
                    .addComponent(conveniojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmajButton)
                    .addComponent(cancelarjButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmajButtonActionPerformed
        // TODO add your handling code here:
        
        editaPaciente.setNome(nomejTextField.getText());
        editaPaciente.setEndereco(enderecojTextField.getText());
        editaPaciente.setConvenio(conveniojTextField.getText());
        
        if (nomejTextField.getText().isEmpty()) { 
            JOptionPane.showMessageDialog(rootPane,"Verifique se o campo NOME está em branco");
            return;
        }
        
        if (enderecojTextField.getText().isEmpty()) { 
            JOptionPane.showMessageDialog(rootPane,"Verifique se o campo ENDERECO está em branco");
            return;
        }

        if (conveniojTextField.getText().isEmpty()) { 
            JOptionPane.showMessageDialog(rootPane,"Verifique se o campo CONVENIO está em branco");
            return;
        }
       
        bd.setPaciente(editaPaciente);
        bd.editar();
        
        dispose();
    }//GEN-LAST:event_confirmajButtonActionPerformed

    private void cancelarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarjButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_cancelarjButtonActionPerformed

    private void conveniojTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conveniojTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conveniojTextFieldActionPerformed
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarjButton;
    private javax.swing.JButton confirmajButton;
    private javax.swing.JLabel conveniojLabel;
    private javax.swing.JTextField conveniojTextField;
    private javax.swing.JLabel enderecojLabel;
    private javax.swing.JTextField enderecojTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nomejLabel;
    private javax.swing.JTextField nomejTextField;
    // End of variables declaration//GEN-END:variables
}