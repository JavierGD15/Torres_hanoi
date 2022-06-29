package practica_2;

public class Menu_principal extends javax.swing.JFrame {

    Nuevo_Juego nv = new Nuevo_Juego();

    Configuracion c = new Configuracion();
    Top t = new Top();
    int reloj = 0;
    int discos = 0;
    Object[][] clasifiacion = new Object[5][3];
    Juego_Automatico ju = new Juego_Automatico(discos);

    public Menu_principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principalpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nuevobt = new javax.swing.JButton();
        autobt = new javax.swing.JButton();
        topbt = new javax.swing.JButton();
        configbt = new javax.swing.JButton();
        salirbt = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Torrea de Hanoi");
        setLocation(new java.awt.Point(350, 200));
        setName("menu_principal"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1081, 594));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel1.setText("Torres de Hanoi");

        nuevobt.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        nuevobt.setText("Nuevo Juego");
        nuevobt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nuevobt.setFocusable(false);
        nuevobt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevobtActionPerformed(evt);
            }
        });

        autobt.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        autobt.setText("Juego Automático");
        autobt.setFocusable(false);
        autobt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autobtActionPerformed(evt);
            }
        });

        topbt.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        topbt.setText("Top 5");
        topbt.setFocusable(false);
        topbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topbtActionPerformed(evt);
            }
        });

        configbt.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        configbt.setText("Configuración");
        configbt.setFocusable(false);
        configbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configbtActionPerformed(evt);
            }
        });

        salirbt.setBackground(new java.awt.Color(255, 51, 51));
        salirbt.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        salirbt.setForeground(new java.awt.Color(255, 255, 255));
        salirbt.setLabel("Salir");
        salirbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirbtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout principalpanelLayout = new javax.swing.GroupLayout(principalpanel);
        principalpanel.setLayout(principalpanelLayout);
        principalpanelLayout.setHorizontalGroup(
            principalpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salirbt, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(principalpanelLayout.createSequentialGroup()
                .addGap(439, 439, 439)
                .addGroup(principalpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principalpanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(principalpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(autobt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(topbt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nuevobt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(configbt, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addContainerGap(462, Short.MAX_VALUE))
        );
        principalpanelLayout.setVerticalGroup(
            principalpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(nuevobt)
                .addGap(41, 41, 41)
                .addComponent(autobt)
                .addGap(41, 41, 41)
                .addComponent(topbt)
                .addGap(41, 41, 41)
                .addComponent(configbt)
                .addGap(100, 100, 100)
                .addComponent(salirbt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirbtActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirbtActionPerformed

    private void autobtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autobtActionPerformed

        ju.inicio(discos);
        ju.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_autobtActionPerformed

    private void nuevobtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevobtActionPerformed

        nv.inicio(reloj, discos);

        setVisible(false);


    }//GEN-LAST:event_nuevobtActionPerformed

    private void topbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topbtActionPerformed

        t.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_topbtActionPerformed

    private void configbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configbtActionPerformed
        c.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_configbtActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton autobt;
    private javax.swing.JButton configbt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton nuevobt;
    private javax.swing.JPanel principalpanel;
    private java.awt.Button salirbt;
    private javax.swing.JButton topbt;
    // End of variables declaration//GEN-END:variables
}
