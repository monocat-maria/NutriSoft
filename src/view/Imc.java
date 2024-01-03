/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author monocat-maria <github.com/monocat-maria>
 */
public class Imc extends javax.swing.JFrame {

    /**
     * Creates new form Imc
     */
    public Imc() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imcContainer = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        containerOutput = new javax.swing.JPanel();
        labelResultado = new javax.swing.JLabel();
        labelInterpretacao = new javax.swing.JLabel();
        resultadoOutput = new javax.swing.JLabel();
        interpretacaoOutput = new javax.swing.JLabel();
        containerInput = new javax.swing.JPanel();
        labelAltura = new javax.swing.JLabel();
        labelPeso = new javax.swing.JLabel();
        inputAltura = new javax.swing.JTextField();
        inputPeso = new javax.swing.JTextField();
        buttonCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(310, 348));
        setPreferredSize(new java.awt.Dimension(310, 348));

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelTitulo.setText("Cálculo de IMC");

        containerOutput.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelResultado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelResultado.setText("Resultado:");

        labelInterpretacao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelInterpretacao.setText("Interpretação:");

        resultadoOutput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        interpretacaoOutput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout containerOutputLayout = new javax.swing.GroupLayout(containerOutput);
        containerOutput.setLayout(containerOutputLayout);
        containerOutputLayout.setHorizontalGroup(
            containerOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerOutputLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(containerOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerOutputLayout.createSequentialGroup()
                        .addComponent(labelInterpretacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(interpretacaoOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(containerOutputLayout.createSequentialGroup()
                        .addComponent(labelResultado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultadoOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        containerOutputLayout.setVerticalGroup(
            containerOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerOutputLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(containerOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelResultado)
                    .addComponent(resultadoOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(containerOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelInterpretacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(interpretacaoOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        containerInput.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelAltura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelAltura.setText("Altura (m):");

        labelPeso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelPeso.setText("Peso (kg):");

        inputAltura.setMinimumSize(new java.awt.Dimension(64, 30));
        inputAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAlturaActionPerformed(evt);
            }
        });

        inputPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPesoActionPerformed(evt);
            }
        });

        buttonCalcular.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonCalcular.setText("Calcular");
        buttonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout containerInputLayout = new javax.swing.GroupLayout(containerInput);
        containerInput.setLayout(containerInputLayout);
        containerInputLayout.setHorizontalGroup(
            containerInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerInputLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(containerInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(containerInputLayout.createSequentialGroup()
                        .addGroup(containerInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPeso)
                            .addComponent(labelAltura))
                        .addGap(18, 18, 18)
                        .addGroup(containerInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputAltura, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(inputPeso))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        containerInputLayout.setVerticalGroup(
            containerInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerInputLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(containerInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAltura)
                    .addComponent(inputAltura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(containerInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPeso)
                    .addComponent(inputPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout imcContainerLayout = new javax.swing.GroupLayout(imcContainer);
        imcContainer.setLayout(imcContainerLayout);
        imcContainerLayout.setHorizontalGroup(
            imcContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imcContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(imcContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(containerOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(imcContainerLayout.createSequentialGroup()
                        .addComponent(labelTitulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(containerInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        imcContainerLayout.setVerticalGroup(
            imcContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imcContainerLayout.createSequentialGroup()
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(containerInput, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(containerOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imcContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imcContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPesoActionPerformed

    }//GEN-LAST:event_inputPesoActionPerformed

    private void buttonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalcularActionPerformed
        if(inputAltura.getText().matches("^[\\d,.?!]+$") == false && inputPeso.getText().matches("^[\\d,.?!]+$") == false){
            JOptionPane.showMessageDialog(rootPane, "Valor inválido.");
            inputAltura.setText("");
            inputPeso.setText("");
        }else if(inputPeso.getText().matches("^[\\d,.?!]+$") == false){
            JOptionPane.showMessageDialog(rootPane, "Valor do peso inválido.\nDigite o valor em Quilogramas(Kg).");
            inputPeso.setText("");
        }else if(inputAltura.getText().matches("^[\\d,.?!]+$") == false){
            JOptionPane.showMessageDialog(rootPane, "Valor da altura inválida.\nDigite o valor em metros(m).");
            inputAltura.setText("");
        }else{
            calcularImc();
        }
        
    }//GEN-LAST:event_buttonCalcularActionPerformed

    private void inputAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAlturaActionPerformed
        
    }//GEN-LAST:event_inputAlturaActionPerformed

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
            java.util.logging.Logger.getLogger(Imc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Imc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Imc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Imc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Imc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCalcular;
    private javax.swing.JPanel containerInput;
    private javax.swing.JPanel containerOutput;
    private javax.swing.JPanel imcContainer;
    private javax.swing.JTextField inputAltura;
    private javax.swing.JTextField inputPeso;
    private javax.swing.JLabel interpretacaoOutput;
    private javax.swing.JLabel labelAltura;
    private javax.swing.JLabel labelInterpretacao;
    private javax.swing.JLabel labelPeso;
    private javax.swing.JLabel labelResultado;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel resultadoOutput;
    // End of variables declaration//GEN-END:variables
    
    public void calcularImc(){
        double altura = Double.parseDouble(inputAltura.getText());
        double peso = Double.parseDouble(inputPeso.getText());
        
        double imc = peso / (altura * altura);
        NumberFormat imcDouble = new DecimalFormat(".#");
        imcDouble.format(imc);
        
            if(imc < 18.5){
            resultadoOutput.setText(imcDouble.format(imc));
            interpretacaoOutput.setText("Magreza");
        }else if(imc < 24.9){
            resultadoOutput.setText(imcDouble.format(imc));
            interpretacaoOutput.setText("Normal");
        }else if(imc < 29.9){
            resultadoOutput.setText(imcDouble.format(imc));
            interpretacaoOutput.setText("Sobrepeso");
        }else if(imc < 30){
            resultadoOutput.setText(imcDouble.format(imc));
            interpretacaoOutput.setText("Obesidade");
        }else{    
            resultadoOutput.setText(imcDouble.format(imc));
            interpretacaoOutput.setText("Obesidade grave");
        }     
    }
}

