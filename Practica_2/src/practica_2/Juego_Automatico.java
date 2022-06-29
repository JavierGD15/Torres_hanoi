package practica_2;

import javax.swing.table.DefaultTableModel;

public class Juego_Automatico extends javax.swing.JFrame {

    int movimientos = 0;
    int discos = 3;
    DefaultTableModel modelo = new DefaultTableModel();

    Object[][] clasifiacion = new Object[1000][3];

    int x = 0;

    public Juego_Automatico(int discos) {
        initComponents();

    }

    public void inicio(int discos) {

        if (discos == 0) {
            discos = 3;
        }

        discoslb.setText("" + discos);

        movimientolb.setText("" + movimientos);
        juego(discos, 1, 2, 3);
    }

    public void juego(int discos, int torre1, int torre2, int torre3) {

        if (discos == 1) {

            clasifiacion[x][0] = movimientos+1;
            clasifiacion[x][1] = torre1;
            clasifiacion[x][2] = torre3;

            movimientos = movimientos + 1;
            x = x + 1;
            clasifiacion[x][0] = "Se Finalizó el juego";
           

        } else {
            juego(discos - 1, torre1, torre3, torre2);

            clasifiacion[x][0] = movimientos+1;
            clasifiacion[x][1] = torre1;
            clasifiacion[x][2] = torre3;

            movimientos = movimientos + 1;
            x = x + 1;

            juego(discos - 1, torre2, torre1, torre3);
        }

    }

    public void tabla() {

        modelo = (DefaultTableModel) tclasificacion.getModel();
        Object[] ob = new Object[3];
        for (int i = 0; i < clasifiacion.length; i++) {

            if (clasifiacion[i][0] == null) {
                break;
            } else {

                ob[0] = clasifiacion[i][0];
                ob[1] = clasifiacion[i][1];
                ob[2] = clasifiacion[i][2];

                modelo.addRow(ob);
            }
        }
        tclasificacion.setModel(modelo);

        movimientolb.setText("" + movimientos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        autoframe = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        discoslb = new javax.swing.JLabel();
        movimientolb = new javax.swing.JLabel();
        iniciarbt = new java.awt.Button();
        salirbb = new java.awt.Button();
        jScrollPane2 = new javax.swing.JScrollPane();
        tclasificacion = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Torrea de Hanoi");
        setLocation(new java.awt.Point(350, 200));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel1.setText("Juego Automático");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel2.setText("Discos");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel3.setText("Movimientos");

        discoslb.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        discoslb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        movimientolb.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        movimientolb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        iniciarbt.setBackground(new java.awt.Color(0, 153, 0));
        iniciarbt.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        iniciarbt.setForeground(new java.awt.Color(255, 255, 255));
        iniciarbt.setLabel("Iniciar");
        iniciarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarbtActionPerformed(evt);
            }
        });

        salirbb.setBackground(new java.awt.Color(255, 51, 51));
        salirbb.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        salirbb.setForeground(new java.awt.Color(255, 255, 255));
        salirbb.setLabel("Salir");
        salirbb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirbbActionPerformed(evt);
            }
        });

        tclasificacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Movimiento", "Torre de donde sale", "Torre donde se debe colocar"
            }
        ));
        jScrollPane2.setViewportView(tclasificacion);

        javax.swing.GroupLayout autoframeLayout = new javax.swing.GroupLayout(autoframe);
        autoframe.setLayout(autoframeLayout);
        autoframeLayout.setHorizontalGroup(
            autoframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(autoframeLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(autoframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(discoslb, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102)
                .addGroup(autoframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(autoframeLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(434, 434, 434))
                    .addGroup(autoframeLayout.createSequentialGroup()
                        .addComponent(movimientolb, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(autoframeLayout.createSequentialGroup()
                .addGroup(autoframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, autoframeLayout.createSequentialGroup()
                        .addContainerGap(899, Short.MAX_VALUE)
                        .addComponent(iniciarbt, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(salirbb, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(autoframeLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        autoframeLayout.setVerticalGroup(
            autoframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(autoframeLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(autoframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(autoframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(discoslb, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(movimientolb, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(autoframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iniciarbt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salirbb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(autoframe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(autoframe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirbbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirbbActionPerformed
        Menu_principal mp = new Menu_principal();
        setVisible(false);
        mp.setVisible(true);
    }//GEN-LAST:event_salirbbActionPerformed

    private void iniciarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarbtActionPerformed

        tabla();
    }//GEN-LAST:event_iniciarbtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel autoframe;
    private javax.swing.JLabel discoslb;
    private java.awt.Button iniciarbt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel movimientolb;
    private java.awt.Button salirbb;
    private javax.swing.JTable tclasificacion;
    // End of variables declaration//GEN-END:variables
}
