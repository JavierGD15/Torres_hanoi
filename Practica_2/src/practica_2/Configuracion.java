
package practica_2;

import javax.swing.JOptionPane;

public class Configuracion extends javax.swing.JFrame {

    String op1 = "3";
    String op2 = "4";
    String op3 = "5";
    String op4 = "6";
    String op5 = "7";

    public Configuracion() {
        initComponents();
        this.discoscombo.removeAllItems();
        this.discoscombo.addItem(op1);
        this.discoscombo.addItem(op2);
        this.discoscombo.addItem(op3);
        this.discoscombo.addItem(op4);
        this.discoscombo.addItem(op5);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        configuraciónpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        discoscombo = new javax.swing.JComboBox<>();
        tiempojtext = new javax.swing.JTextField();
        guardarbt = new java.awt.Button();
        salirb = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Torrea de Hanoi");
        setLocation(new java.awt.Point(350, 200));
        setPreferredSize(new java.awt.Dimension(1083, 574));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel1.setText("Confirguración");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel4.setText("Cantidad de Discos");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel5.setText("Tiempo de partida");

        discoscombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        discoscombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discoscomboActionPerformed(evt);
            }
        });

        tiempojtext.setText("120");

        guardarbt.setBackground(new java.awt.Color(0, 153, 0));
        guardarbt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        guardarbt.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        guardarbt.setForeground(new java.awt.Color(255, 255, 255));
        guardarbt.setLabel("Guardar");
        guardarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarbtActionPerformed(evt);
            }
        });

        salirb.setBackground(new java.awt.Color(255, 51, 51));
        salirb.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        salirb.setForeground(new java.awt.Color(255, 255, 255));
        salirb.setLabel("Salir");
        salirb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout configuraciónpanelLayout = new javax.swing.GroupLayout(configuraciónpanel);
        configuraciónpanel.setLayout(configuraciónpanelLayout);
        configuraciónpanelLayout.setHorizontalGroup(
            configuraciónpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, configuraciónpanelLayout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addGroup(configuraciónpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(discoscombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 379, Short.MAX_VALUE)
                .addGroup(configuraciónpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tiempojtext))
                .addGap(197, 197, 197))
            .addGroup(configuraciónpanelLayout.createSequentialGroup()
                .addGap(457, 457, 457)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, configuraciónpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(configuraciónpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, configuraciónpanelLayout.createSequentialGroup()
                        .addComponent(guardarbt, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(411, 411, 411))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, configuraciónpanelLayout.createSequentialGroup()
                        .addComponent(salirb, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        configuraciónpanelLayout.setVerticalGroup(
            configuraciónpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(configuraciónpanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addGroup(configuraciónpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(42, 42, 42)
                .addGroup(configuraciónpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(discoscombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tiempojtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addComponent(guardarbt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(salirb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(configuraciónpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(configuraciónpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void discoscomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discoscomboActionPerformed

    }//GEN-LAST:event_discoscomboActionPerformed

    private void guardarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarbtActionPerformed
        JOptionPane.showMessageDialog(null, "Tus cambios se guardaron correctamente.");
        Menu_principal mp = new Menu_principal();
        mp.reloj=Integer.parseInt(tiempojtext.getText());
        mp.discos =  Integer.parseInt(discoscombo.getSelectedItem().toString());
        
        
        setVisible(false);
        mp.setVisible(true);
       
                       
    }//GEN-LAST:event_guardarbtActionPerformed

    private void salirbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirbActionPerformed
        Menu_principal mp = new Menu_principal();
        setVisible(false);
        mp.setVisible(true);

    }//GEN-LAST:event_salirbActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel configuraciónpanel;
    public javax.swing.JComboBox<String> discoscombo;
    private java.awt.Button guardarbt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private java.awt.Button salirb;
    public javax.swing.JTextField tiempojtext;
    // End of variables declaration//GEN-END:variables
}
