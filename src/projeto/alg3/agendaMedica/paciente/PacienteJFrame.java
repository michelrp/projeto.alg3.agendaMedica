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

public class PacienteJFrame extends javax.swing.JFrame {

    private PacienteGerenciaBD bd = new PacienteGerenciaBD();

    /**
     * Creates new form PacienteJFrame
     */
    public PacienteJFrame() {
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

        jLabel1 = new javax.swing.JLabel();
        titulojLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        nomejTextField = new javax.swing.JTextField();
        nomejLabel = new javax.swing.JLabel();
        enderecojLabel = new javax.swing.JLabel();
        enderecojTextField = new javax.swing.JTextField();
        sexojLabel = new javax.swing.JLabel();
        conveniojLabel = new javax.swing.JLabel();
        confirmajButton = new javax.swing.JButton();
        cpfjLabel = new javax.swing.JLabel();
        cpfjFormattedTextField = new javax.swing.JFormattedTextField();
        sexo1jLabel = new javax.swing.JLabel();
        sexo2jLabel = new javax.swing.JLabel();
        sexojFormattedTextField = new javax.swing.JFormattedTextField();
        voltarjButton = new javax.swing.JButton();
        convenioTextField1 = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulojLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titulojLabel.setText("                        CADASTRO DE PACIENTES");
        titulojLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        nomejLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nomejLabel.setText("Nome:");

        enderecojLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        enderecojLabel.setText("Endereco:");

        sexojLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sexojLabel.setText("Sexo:");

        conveniojLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        conveniojLabel.setText("Convênio:");

        confirmajButton.setText("Salvar");
        confirmajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmajButtonActionPerformed(evt);
            }
        });

        cpfjLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cpfjLabel.setText("CPF:");

        try {
            cpfjFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpfjFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfjFormattedTextFieldActionPerformed(evt);
            }
        });

        sexo1jLabel.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        sexo1jLabel.setText("M - Masculino");

        sexo2jLabel.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        sexo2jLabel.setText("F - Feminino");

        try {
            sexojFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("?")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        voltarjButton.setText("Sair");
        voltarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarjButtonActionPerformed(evt);
            }
        });

        convenioTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convenioTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomejLabel)
                            .addComponent(cpfjLabel))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomejTextField)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cpfjFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enderecojLabel)
                            .addComponent(sexojLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enderecojTextField)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(sexojFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sexo2jLabel)
                                    .addComponent(sexo1jLabel))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(titulojLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(conveniojLabel)
                        .addGap(18, 18, 18)
                        .addComponent(convenioTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(confirmajButton)
                .addGap(47, 47, 47)
                .addComponent(voltarjButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulojLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomejLabel)
                    .addComponent(nomejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfjLabel)
                    .addComponent(cpfjFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enderecojLabel)
                    .addComponent(enderecojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sexo1jLabel)
                        .addGap(1, 1, 1))
                    .addComponent(sexo2jLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sexojFormattedTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                        .addComponent(sexojLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(convenioTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conveniojLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmajButton)
                    .addComponent(voltarjButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmajButtonActionPerformed
        // TODO add your handling code here:
        Paciente novoPaciente = new Paciente();
        novoPaciente.setNome(nomejTextField.getText());
        novoPaciente.setCpf(cpfjFormattedTextField.getText());
        novoPaciente.setEndereco(enderecojTextField.getText());
        novoPaciente.setSexo(sexojFormattedTextField.getText());
        novoPaciente.setConvenio(convenioTextField1.getText());

        if (nomejTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane,"Verifique se o campo NOME está em branco");
            return;
        }
        if (cpfjFormattedTextField.getValue() == null) {
            JOptionPane.showMessageDialog(rootPane,"Verifique se o campo CPF está em branco");
            return;
        }
        if (enderecojTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane,"Verifique se o campo ENDERECO está em branco");
            return;
        }
        
        if (convenioTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane,"Verifique se o campo CONVENIO está em branco");
            return;
        }

        bd.setPaciente(novoPaciente);
        bd.inserir();

        dispose();



    }//GEN-LAST:event_confirmajButtonActionPerformed

    private void cpfjFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfjFormattedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfjFormattedTextFieldActionPerformed

    private void voltarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarjButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_voltarjButtonActionPerformed

    private void convenioTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convenioTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_convenioTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmajButton;
    private javax.swing.JTextField convenioTextField1;
    private javax.swing.JLabel conveniojLabel;
    private javax.swing.JFormattedTextField cpfjFormattedTextField;
    private javax.swing.JLabel cpfjLabel;
    private javax.swing.JLabel enderecojLabel;
    private javax.swing.JTextField enderecojTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nomejLabel;
    private javax.swing.JTextField nomejTextField;
    private javax.swing.JLabel sexo1jLabel;
    private javax.swing.JLabel sexo2jLabel;
    private javax.swing.JFormattedTextField sexojFormattedTextField;
    private javax.swing.JLabel sexojLabel;
    private javax.swing.JLabel titulojLabel;
    private javax.swing.JButton voltarjButton;
    // End of variables declaration//GEN-END:variables

}
