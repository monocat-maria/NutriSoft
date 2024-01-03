
package view;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author monocat-maria <github.com/monocat-maria>
 */
public class Recomendacoes extends javax.swing.JFrame {

    /**
     * Creates new form Recomendacoes
     */
    public Recomendacoes() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        imcContainer = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        containerOutput = new javax.swing.JPanel();
        carboidratosLabel = new javax.swing.JLabel();
        gorduraLabel = new javax.swing.JLabel();
        carboidratosOutput = new javax.swing.JLabel();
        gorduraOutput = new javax.swing.JLabel();
        proteinaLabel = new javax.swing.JLabel();
        proteinasOutput = new javax.swing.JLabel();
        containerInput = new javax.swing.JPanel();
        caloriasLabel = new javax.swing.JLabel();
        caloriasInput = new javax.swing.JTextField();
        buttonCalcular = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(310, 348));

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelTitulo.setText("Recomendações");

        containerOutput.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        carboidratosLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        carboidratosLabel.setText("Carboidratos (50%):");

        gorduraLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gorduraLabel.setText("Gordura (25%):");

        carboidratosOutput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        carboidratosOutput.setText("h");

        gorduraOutput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gorduraOutput.setText("h");

        proteinaLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        proteinaLabel.setText("Proteína (25%):");

        proteinasOutput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        proteinasOutput.setText("h");

        javax.swing.GroupLayout containerOutputLayout = new javax.swing.GroupLayout(containerOutput);
        containerOutput.setLayout(containerOutputLayout);
        containerOutputLayout.setHorizontalGroup(
            containerOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerOutputLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(containerOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(containerOutputLayout.createSequentialGroup()
                        .addComponent(gorduraLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gorduraOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, containerOutputLayout.createSequentialGroup()
                        .addGroup(containerOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, containerOutputLayout.createSequentialGroup()
                                .addComponent(proteinaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(proteinasOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, containerOutputLayout.createSequentialGroup()
                                .addComponent(carboidratosLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carboidratosOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        containerOutputLayout.setVerticalGroup(
            containerOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerOutputLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(containerOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carboidratosOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carboidratosLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(containerOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proteinaLabel)
                    .addComponent(proteinasOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(containerOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gorduraLabel)
                    .addComponent(gorduraOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        containerInput.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        caloriasLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        caloriasLabel.setText("Calorias diárias (kcal):");

        caloriasInput.setMinimumSize(new java.awt.Dimension(64, 30));
        caloriasInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caloriasInputActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerInputLayout.createSequentialGroup()
                .addGroup(containerInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(containerInputLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(containerInputLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(caloriasLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(caloriasInput, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );
        containerInputLayout.setVerticalGroup(
            containerInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerInputLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(containerInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caloriasLabel)
                    .addComponent(caloriasInput, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout imcContainerLayout = new javax.swing.GroupLayout(imcContainer);
        imcContainer.setLayout(imcContainerLayout);
        imcContainerLayout.setHorizontalGroup(
            imcContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imcContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(imcContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(containerInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(imcContainerLayout.createSequentialGroup()
                        .addComponent(labelTitulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(containerOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 279, Short.MAX_VALUE))
                .addContainerGap())
        );
        imcContainerLayout.setVerticalGroup(
            imcContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imcContainerLayout.createSequentialGroup()
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(containerInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(containerOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void buttonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalcularActionPerformed
        calcularRecomendado();
        
    }//GEN-LAST:event_buttonCalcularActionPerformed

    private void caloriasInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caloriasInputActionPerformed
        
    }//GEN-LAST:event_caloriasInputActionPerformed

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
            java.util.logging.Logger.getLogger(Recomendacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recomendacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recomendacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recomendacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recomendacoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCalcular;
    private javax.swing.JTextField caloriasInput;
    private javax.swing.JLabel caloriasLabel;
    private javax.swing.JLabel carboidratosLabel;
    private javax.swing.JLabel carboidratosOutput;
    private javax.swing.JPanel containerInput;
    private javax.swing.JPanel containerOutput;
    private javax.swing.JLabel gorduraLabel;
    private javax.swing.JLabel gorduraOutput;
    private javax.swing.JPanel imcContainer;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel proteinaLabel;
    private javax.swing.JLabel proteinasOutput;
    // End of variables declaration//GEN-END:variables
    
    
    public void calcularRecomendado(){
        double calorias = Double.parseDouble(caloriasInput.getText());
        
        double carboidratos = calorias * 0.5 / 4;
        double proteinas = calorias * 0.25 / 4;
        double gordura = calorias * 0.25 / 9;
        
        String carboidratosOut = Double.toString(carboidratos);
        carboidratosOutput.setText(carboidratosOut + "g");
        
        String proteinasOut = Double.toString(proteinas);
        proteinasOutput.setText(proteinasOut + "g");
        
        NumberFormat gorduraFormat = new DecimalFormat(".##");
        gorduraOutput.setText(gorduraFormat.format(gordura) + "g");      
    }
}

