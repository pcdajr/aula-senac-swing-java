
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Janela extends javax.swing.JFrame { 
    
    
    
    public Janela() {
        initComponents();
    }
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtNome = new javax.swing.JTextField();
        jtxtEmail = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtxtIdade = new javax.swing.JTextField();
        menuBar = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome");

        jLabel2.setText("E-mail");

        jtxtNome.setText("");
        jtxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNomeActionPerformed(evt);
            }
        });

        jtxtEmail.setText("");
        jtxtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtEmailActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Salvar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLabel3.setText("Idade");

        jtxtIdade.setText("");
        jtxtIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtIdadeActionPerformed(evt);
            }
        });
        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtIdade)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btnCadastrar)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(btnCadastrar)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNomeActionPerformed
        
        
          
        
    }//GEN-LAST:event_jtxtNomeActionPerformed

   private void jtxtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtEmailActionPerformed
        
    }//GEN-LAST:event_jtxtEmailActionPerformed

   private void jtxtIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtIdadeActionPerformed
        
       
    }//GEN-LAST:event_jtxtIdadeActionPerformed
    
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
               
             
        try{
            Cliente cliente = new Cliente();
            cliente.setNome(jtxtNome.getText());
            cliente.setEmail(jtxtEmail.getText());
            cliente.setIdade(jtxtIdade.getText());
            cliente.salvar();
        } catch (IOException ex) {
            Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
        }
           
       
}//GEN-LAST:event_btnCadastrarActionPerformed


    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtIdade;
    private javax.swing.JTextField jtxtNome;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton btnCadastrar;
    // End of variables declaration//GEN-END:variables

}
