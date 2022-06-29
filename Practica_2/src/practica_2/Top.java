package practica_2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.table.DefaultTableModel;

public class Top extends javax.swing.JFrame {

    Object[][] clasifiacion = new Object[5][3];

    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel modelo2 = new DefaultTableModel();
    DefaultTableModel modelo3 = new DefaultTableModel();
    DefaultTableModel modelo4 = new DefaultTableModel();
    DefaultTableModel modelo5 = new DefaultTableModel();

    public Top() {
        initComponents();
        tabla1();
        tabla2();
        tabla3();
        tabla4();
        tabla5();
    }

    public void tabla1() {

        try {

            ObjectInputStream recuperar = new ObjectInputStream(new FileInputStream("top5_3.dat"));

            clasifiacion = (Object[][]) recuperar.readObject();
            recuperar.close();

        } catch (IOException e) {

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu_principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        modelo = (DefaultTableModel) tclasificacion.getModel();
        Object[] ob = new Object[3];
        for (int i = 0; i < clasifiacion.length; i++) {
            ob[0] = clasifiacion[i][0];
            ob[1] = clasifiacion[i][1];
            ob[2] = clasifiacion[i][2];
            clasifiacion[i][0] = null;
            clasifiacion[i][1] = null;
            clasifiacion[i][2] = null;
            modelo.addRow(ob);
        }
        tclasificacion.setModel(modelo);

    }

    public void tabla2() {

        try {

            ObjectInputStream recuperar = new ObjectInputStream(new FileInputStream("top5_4.dat"));

            clasifiacion = (Object[][]) recuperar.readObject();
            recuperar.close();

        } catch (IOException e) {

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu_principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        modelo2 = (DefaultTableModel) tclasificacion4.getModel();
        Object[] ob = new Object[3];
        for (int i = 0; i < clasifiacion.length; i++) {
            ob[0] = clasifiacion[i][0];
            ob[1] = clasifiacion[i][1];
            ob[2] = clasifiacion[i][2];
            clasifiacion[i][0] = null;
            clasifiacion[i][1] = null;
            clasifiacion[i][2] = null;
            modelo2.addRow(ob);
        }
        tclasificacion4.setModel(modelo2);

    }

    public void tabla3() {

        try {

            ObjectInputStream recuperar = new ObjectInputStream(new FileInputStream("top5_5.dat"));

            clasifiacion = (Object[][]) recuperar.readObject();
            recuperar.close();

        } catch (IOException e) {

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu_principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        modelo3 = (DefaultTableModel) tclasificacion5.getModel();
        Object[] ob = new Object[3];
        for (int i = 0; i < clasifiacion.length; i++) {
            ob[0] = clasifiacion[i][0];
            ob[1] = clasifiacion[i][1];
            ob[2] = clasifiacion[i][2];
            clasifiacion[i][0] = null;
            clasifiacion[i][1] = null;
            clasifiacion[i][2] = null;
            modelo3.addRow(ob);
        }
        tclasificacion5.setModel(modelo3);

    }

    public void tabla4() {
        try {

            ObjectInputStream recuperar = new ObjectInputStream(new FileInputStream("top5_6.dat"));

            clasifiacion = (Object[][]) recuperar.readObject();
            recuperar.close();

        } catch (IOException e) {

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu_principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        modelo4 = (DefaultTableModel) tclasificacion6.getModel();
        Object[] ob = new Object[3];
        for (int i = 0; i < clasifiacion.length; i++) {
            ob[0] = clasifiacion[i][0];
            ob[1] = clasifiacion[i][1];
            ob[2] = clasifiacion[i][2];
            clasifiacion[i][0] = null;
            clasifiacion[i][1] = null;
            clasifiacion[i][2] = null;
            modelo4.addRow(ob);
        }
        tclasificacion6.setModel(modelo4);

    }

    public void tabla5() {

        try {

            ObjectInputStream recuperar = new ObjectInputStream(new FileInputStream("top5_7.dat"));

            clasifiacion = (Object[][]) recuperar.readObject();
            recuperar.close();

        } catch (IOException e) {

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu_principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        modelo5 = (DefaultTableModel) tclasificacion7.getModel();
        Object[] ob = new Object[3];
        for (int i = 0; i < clasifiacion.length; i++) {
            ob[0] = clasifiacion[i][0];
            ob[1] = clasifiacion[i][1];
            ob[2] = clasifiacion[i][2];
            clasifiacion[i][0] = null;
            clasifiacion[i][1] = null;
            clasifiacion[i][2] = null;
            modelo5.addRow(ob);
        }
        tclasificacion7.setModel(modelo5);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tclasificacion = new javax.swing.JTable();
        salirbb = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tclasificacion5 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tclasificacion7 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tclasificacion4 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tclasificacion6 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Torrea de Hanoi");
        setLocation(new java.awt.Point(350, 200));

        tclasificacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Tiempo Restante", "Movimientos"
            }
        ));
        jScrollPane1.setViewportView(tclasificacion);

        salirbb.setBackground(new java.awt.Color(255, 51, 51));
        salirbb.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        salirbb.setForeground(new java.awt.Color(255, 255, 255));
        salirbb.setLabel("Salir");
        salirbb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirbbActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel1.setText("Clasificaciones");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel2.setText("Top 5 de 3 Discos");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel3.setText("Top 5 de 4 Discos");

        tclasificacion5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Tiempo restante", "Movimientos"
            }
        ));
        jScrollPane2.setViewportView(tclasificacion5);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel4.setText("Top 5 de 5 Discos");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel5.setText("Top 5 de 6 Discos");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel6.setText("Top 5 de 7 Discos");

        tclasificacion7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Tiempo Restante", "Movimientos"
            }
        ));
        jScrollPane5.setViewportView(tclasificacion7);

        tclasificacion4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Tiempo Restante", "Movimientos"
            }
        ));
        jScrollPane6.setViewportView(tclasificacion4);

        tclasificacion6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Tiempo Restante", "Movimientos"
            }
        ));
        jScrollPane7.setViewportView(tclasificacion6);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(981, Short.MAX_VALUE)
                        .addComponent(salirbb, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(452, 452, 452)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(459, 459, 459)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(salirbb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirbbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirbbActionPerformed
        Menu_principal mp = new Menu_principal();
        setVisible(false);
        mp.setVisible(true);
    }//GEN-LAST:event_salirbbActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private java.awt.Button salirbb;
    private javax.swing.JTable tclasificacion;
    private javax.swing.JTable tclasificacion4;
    private javax.swing.JTable tclasificacion5;
    private javax.swing.JTable tclasificacion6;
    private javax.swing.JTable tclasificacion7;
    // End of variables declaration//GEN-END:variables
}
