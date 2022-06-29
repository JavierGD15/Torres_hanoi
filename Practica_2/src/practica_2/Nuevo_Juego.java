package practica_2;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Nuevo_Juego extends JFrame {

    JPanel p1 = new JPanel();
    JLabel tiempohilo = new JLabel();
    JTextField tiempohilo2 = new JTextField();
    JLabel movimientohilo = new JLabel();
    JPanel pieza1 = new JPanel();
    JPanel pieza2 = new JPanel();
    JPanel pieza3 = new JPanel();
    JPanel pieza4 = new JPanel();
    JPanel pieza5 = new JPanel();
    JPanel pieza6 = new JPanel();
    JPanel pieza7 = new JPanel();
    JLabel torre33 = new JLabel();
    JLabel torre11 = new JLabel();
    JLabel torre22 = new JLabel();
    JButton potenciadorverde = new JButton();
    JButton potenciadorrojo = new JButton();
    int posicion = 0;
    int posicion1 = 0;

    Boolean toco_boton = false;
    Boolean ganador = false;
    int color;
    String resp;

    int disc = 3;
    String clasifiacion_tablas = "top5_3.dat";
    int tiempo = 120;
    int movimiento = 0;
    int[] torre1;
    int[] torre2;
    int[] torre3;
    int[] ganar;

    int tiempoinicial;
    double carga;
    Boolean tocoverde_boton = false;
    Boolean tocotocorojo_boton = false;

    //Carga ganadora
    Object[][] clasifiacion = new Object[5][3];
    Object[][] clasifiacionaux = new Object[5][3];

    private void Nuevo_Juego(int disc) {

        setVisible(false);
        setTitle("Torres de Hanoi");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1091, 574);
        setLocationRelativeTo(null);
        setMaximumSize(new Dimension(1000, 1000));
        setVisible(true);

        //boton que suma
        potenciadorverde = new JButton();
        potenciadorverde.setBounds(10, -50, 30, 40);
        potenciadorverde.setIcon(new ImageIcon(getClass().getResource("/Img/reloj1verde1.png")));
        //Lo hace transparente
        potenciadorverde.setOpaque(false);
        potenciadorverde.setContentAreaFilled(false);
        potenciadorverde.setBorderPainted(false);

        //boton que resta
        potenciadorrojo = new JButton();
        potenciadorrojo.setBounds(10, -50, 30, 30);
        potenciadorrojo.setIcon(new ImageIcon(getClass().getResource("/Img/reloj1rojo1.png")));
        //Lo hace transparente
        potenciadorrojo.setOpaque(false);
        potenciadorrojo.setContentAreaFilled(false);
        potenciadorrojo.setBorderPainted(false);

        //Funciones del boton
        ActionListener potenciador_accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tocoverde_boton = true;

            }

        };

        //Acción del evento
        potenciadorverde.addActionListener(potenciador_accion);

        //Funciones del boton
        ActionListener potenciador1_accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tocotocorojo_boton = true;
            }

        };

        //Acción del evento
        potenciadorrojo.addActionListener(potenciador1_accion);

        this.getContentPane().add(potenciadorverde);
        this.getContentPane().add(potenciadorrojo);

        //Torres
        torre11 = new JLabel();
        torre11.setBounds(100, 200, 250, 250);
        torre11.setIcon(new ImageIcon(getClass().getResource("/Img/torre.png")));

        p1.add(torre11);
        pi(disc);

        torre22 = new JLabel();
        torre22.setBounds(400, 200, 250, 250);
        torre22.setIcon(new ImageIcon(getClass().getResource("/Img/torre.png")));
        p1.add(torre22);

        torre33 = new JLabel();
        torre33.setBounds(700, 200, 250, 250);
        torre33.setIcon(new ImageIcon(getClass().getResource("/Img/torre.png")));

        p1.add(torre33);

        p1.setSize(1091, 574);
        p1.setLayout(null);
        this.getContentPane().add(p1);
        p1.setBackground(Color.white);

        JLabel tiempo = new JLabel("Tiempo");
        tiempo.setBounds(100, 20, 500, 50);
        tiempo.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        p1.add(tiempo);

        JLabel Movimiento = new JLabel("Movimiento");
        Movimiento.setBounds(200, 20, 500, 50);
        Movimiento.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        p1.add(Movimiento);

    }

    //Da cuantas piezas se usaran en el tablero
    private void pi(int disc) {
        if (disc == 0) {
            disc = 3;
        }

        pieza7 = new JPanel();
        pieza7.setBounds(150, 408, 150, 15);
        pieza7.setBackground(Color.red);
        this.getContentPane().add(pieza7);
        pieza7.setVisible(false);

        pieza6 = new JPanel();
        pieza6.setBounds(160, 393, 130, 15);
        pieza6.setBackground(Color.orange);
        this.getContentPane().add(pieza6);
        pieza6.setVisible(false);

        pieza5 = new JPanel();
        pieza5.setBounds(170, 378, 110, 15);
        pieza5.setBackground(Color.blue);
        this.getContentPane().add(pieza5);
        pieza5.setVisible(false);

        pieza4 = new JPanel();
        pieza4.setBounds(180, 363, 90, 15);
        pieza4.setBackground(Color.YELLOW);
        this.getContentPane().add(pieza4);
        pieza4.setVisible(false);

        pieza3 = new JPanel();
        pieza3.setBounds(190, 348, 70, 15);
        pieza3.setBackground(Color.CYAN);
        this.getContentPane().add(pieza3);
        pieza3.setVisible(false);

        pieza2 = new JPanel();
        pieza2.setBounds(200, 333, 50, 15);
        pieza2.setBackground(Color.green);
        this.getContentPane().add(pieza2);
        pieza2.setVisible(false);

        pieza1 = new JPanel();
        pieza1.setBounds(210, 318, 30, 15);
        pieza1.setBackground(Color.pink);
        this.getContentPane().add(pieza1);
        pieza1.setVisible(false);

        torre1 = new int[disc];
        torre2 = new int[disc];
        torre3 = new int[disc];
        ganar = new int[disc];
        int x = 1;
        for (int i = 0; i < torre1.length; i++) {
            torre1[i] = x;
            ganar[i] = x;
            x = x + 1;
        }

        switch (disc) {

            case 3:
                pieza7.setVisible(true);
                pieza6.setVisible(true);
                pieza5.setVisible(true);

                clasifiacion_tablas = "top5_3.dat";
                break;

            case 4:
                pieza7.setVisible(true);
                pieza6.setVisible(true);
                pieza5.setVisible(true);
                pieza4.setVisible(true);
                clasifiacion_tablas = "top5_4.dat";
                break;

            case 5:
                pieza7.setVisible(true);
                pieza6.setVisible(true);
                pieza5.setVisible(true);
                pieza4.setVisible(true);
                pieza3.setVisible(true);
                clasifiacion_tablas = "top5_5.dat";
                break;

            case 6:
                pieza7.setVisible(true);
                pieza6.setVisible(true);
                pieza5.setVisible(true);
                pieza4.setVisible(true);
                pieza3.setVisible(true);
                pieza2.setVisible(true);
                clasifiacion_tablas = "top5_6.dat";
                break;

            case 7:
                pieza7.setVisible(true);
                pieza6.setVisible(true);
                pieza5.setVisible(true);
                pieza4.setVisible(true);
                pieza3.setVisible(true);
                pieza2.setVisible(true);
                pieza1.setVisible(true);
                clasifiacion_tablas = "top5_7.dat";
                
              
                break;
        }

        try {

            ObjectInputStream recuperar = new ObjectInputStream(new FileInputStream(clasifiacion_tablas));

            clasifiacion = (Object[][]) recuperar.readObject();
            recuperar.close();

        } catch (IOException e) {

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu_principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //Da los botones que se usan para el movimiento
    private void movimientos(int disc) {

        JButton salir = new JButton("Salir");
        salir.setBounds(980, 480, 80, 30);
        //Funciones del boton
        ActionListener salir_accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toco_boton = true;
                Menu_principal mp = new Menu_principal();
                mp.setVisible(true);
                setVisible(false);

            }
        };

        //Acción del evento
        salir.addActionListener(salir_accion);

        p1.add(salir);

        JButton izquierda1 = new JButton("<");
        izquierda1.setBounds(150, 450, 50, 20);
        JButton derecha1 = new JButton(">");
        derecha1.setBounds(250, 450, 50, 20);

        JButton izquierda2 = new JButton("<");
        izquierda2.setBounds(450, 450, 50, 20);
        JButton derecha2 = new JButton(">");
        derecha2.setBounds(550, 450, 50, 20);

        JButton izquierda3 = new JButton("<");
        izquierda3.setBounds(750, 450, 50, 20);
        JButton derecha3 = new JButton(">");
        derecha3.setBounds(850, 450, 50, 20);

        p1.add(derecha1);
        p1.add(izquierda1);
        p1.add(derecha2);
        p1.add(izquierda2);
        p1.add(derecha3);
        p1.add(izquierda3);

        //Funciones del boton
        ActionListener izquierda1_accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (torre1[0] <= 0) {
                    JOptionPane.showMessageDialog(null, "No hay ningun disco que mover.");
                } else {
                    derecha_1(disc, torre1, torre3);

                }
            }
        };

        //Acción del evento
        izquierda1.addActionListener(izquierda1_accion);

        ActionListener derecha1_accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (torre1[0] <= 0) {
                    JOptionPane.showMessageDialog(null, "No hay ningun disco que mover.");
                } else {
                    derecha_1(disc, torre1, torre2);
                }
            }
        };

        //Acción del evento
        derecha1.addActionListener(derecha1_accion);

        //tira el izquierdo2
        ActionListener izquierda2_accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (torre2[0] <= 0) {
                    JOptionPane.showMessageDialog(null, "No hay ningun disco que mover.");
                } else {
                    derecha_1(disc, torre2, torre1);
                }
            }
        };

        //Acción del evento
        izquierda2.addActionListener(izquierda2_accion);

        ActionListener derecha2_accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (torre2[0] <= 0) {
                    JOptionPane.showMessageDialog(null, "No hay ningun disco que mover.");
                } else {
                    derecha_1(disc, torre2, torre3);
                }
            }
        };

        //Acción del evento
        derecha2.addActionListener(derecha2_accion);

        //tira el izquierdo2
        ActionListener izquierda3_accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (torre3[0] <= 0) {
                    JOptionPane.showMessageDialog(null, "No hay ningun disco que mover.");
                } else {
                    derecha_1(disc, torre3, torre2);
                }
            }
        };

        //Acción del evento
        izquierda3.addActionListener(izquierda3_accion);

        ActionListener derecha3_accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (torre3[0] <= 0) {
                    JOptionPane.showMessageDialog(null, "No hay ningun disco que mover.");
                } else {
                    derecha_1(disc, torre3, torre1);
                }
            }
        };

        //Acción del evento
        derecha3.addActionListener(derecha3_accion);
    }

    private void piezas(int tp) {

        if (tp != 0) {

            tiempo = tp;
        }

        tiempohilo.setText("" + tiempo);
        tiempohilo.setBounds(120, 60, 500, 50);
        tiempohilo.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        p1.add(tiempohilo);
        tiempohilo.setVisible(true);

        movimientohilo.setText("" + movimiento);
        movimientohilo.setBounds(245, 60, 500, 50);
        movimientohilo.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        p1.add(movimientohilo);
        movimientohilo.setVisible(true);

    }

    public void nuevo_timer(double x) {
        tiempohilo.setVisible(false);
        tiempohilo.setText("" + (int) x);
        tiempohilo.setBounds(120, 60, 500, 50);
        tiempohilo.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        p1.add(tiempohilo);
        tiempohilo.setVisible(true);

    }

    private void nueva_torre() {
        torre33.setVisible(false);
        pieza7.setVisible(true);
        torre33 = new JLabel();
        torre33.setBounds(700, 200, 250, 250);
        torre33.setIcon(new ImageIcon(getClass().getResource("/Img/torre.png")));
        p1.add(torre33);

        torre22.setVisible(false);
        pieza7.setVisible(true);
        torre22 = new JLabel();
        torre22.setBounds(400, 200, 250, 250);
        torre22.setIcon(new ImageIcon(getClass().getResource("/Img/torre.png")));
        p1.add(torre22);

        torre11.setVisible(false);
        pieza7.setVisible(true);
        torre11 = new JLabel();
        torre11.setBounds(100, 200, 250, 250);
        torre11.setIcon(new ImageIcon(getClass().getResource("/Img/torre.png")));
        p1.add(torre11);

    }

    private void suma_movimiento() {

        //Suma de movimiento
        movimientohilo.setVisible(false);
        movimiento = movimiento + 1;
        movimientohilo.setText("" + movimiento);
        movimientohilo.setBounds(245, 60, 500, 50);
        movimientohilo.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        p1.add(movimientohilo);
        movimientohilo.setVisible(true);
    }

    private void derecha_1(int disc, int[] torre, int[] torrelo) {
        if (disc == 0) {
            disc = 3;
        }
        int ficha = 0;
        int ficha1 = 0;

        //Bloque a mover de la torre 1
        for (int i = 0; i < torre.length; i++) {
            if (torre[i] <= 0) {
                posicion = i - 1;
                ficha = torre[i - 1];
                break;
            } else if (i == disc - 1) {
                posicion = i;
                ficha = torre[i];
                break;
            } else {

            }
        }
//        System.out.println(posicion);

        //Bloque donde recibe la torre 3
        for (int i = 0; i < torrelo.length; i++) {
            if (torrelo[i] <= 0) {
                posicion1 = i;
                if (torrelo[0] <= 0) {
                    ficha1 = torrelo[i];
                } else {
                    ficha1 = torrelo[i - 1];
                }
                break;
            }
        }

        if (ficha < ficha1 && ficha1 > 0) {
            JOptionPane.showMessageDialog(null, "Movimiento ilegal. La ficha " + ficha + " es menor a la ficha " + ficha1);
        } else {
            suma_movimiento();
            torrelo[posicion1] = torre[posicion];
            torre[posicion] = 0;

            int gano = 0;
            for (int i = 0; i < ganar.length; i++) {
                if (ganar[i] == torre3[i]) {
                    gano = gano + 1;

                    if (gano == disc) {

                        toco_boton = true;
                        resp = (String) JOptionPane.showInputDialog(null, "Ingresa tu nombre campeon");

                        ganador = true;
                        break;
                    }

                } else {

                    break;
                }
            }
            if (ganador == true) {
                for (int j = 0; j < 5; j++) {
                    if (clasifiacion[j][0] == null) {

                        clasifiacion[j][0] = resp;
                        clasifiacion[j][1] = tiempoinicial;
                        clasifiacion[j][2] = movimiento;

                        try {
                            ObjectOutputStream tabla = new ObjectOutputStream(new FileOutputStream(clasifiacion_tablas));
                            tabla.writeObject(clasifiacion);
                            tabla.close();
                        } catch (IOException s) {
                        }

                        Menu_principal mp = new Menu_principal();
                        mp.setVisible(true);
                        setVisible(false);
                        break;

                    } else if ((int) clasifiacion[j][1] <= tiempoinicial) {
                        Menu_principal mp = new Menu_principal();
                        for (int i = 0; i < clasifiacionaux.length; i++) {
                            clasifiacionaux[i][0] = clasifiacion[i][0];
                            clasifiacionaux[i][1] = clasifiacion[i][1];
                            clasifiacionaux[i][2] = clasifiacion[i][2];
                        }

                        switch (j) {
                            case 0:
                                clasifiacion[0][0] = resp;
                                clasifiacion[0][1] = tiempoinicial;
                                clasifiacion[0][2] = movimiento;

                                clasifiacion[1][0] = clasifiacionaux[0][0];
                                clasifiacion[1][1] = clasifiacionaux[0][1];
                                clasifiacion[1][2] = clasifiacionaux[0][2];

                                clasifiacion[2][0] = clasifiacionaux[1][0];
                                clasifiacion[2][1] = clasifiacionaux[1][1];
                                clasifiacion[2][2] = clasifiacionaux[1][2];

                                clasifiacion[3][0] = clasifiacionaux[2][0];
                                clasifiacion[3][1] = clasifiacionaux[2][1];
                                clasifiacion[3][2] = clasifiacionaux[2][2];

                                clasifiacion[4][0] = clasifiacionaux[3][0];
                                clasifiacion[4][1] = clasifiacionaux[3][1];
                                clasifiacion[4][2] = clasifiacionaux[3][2];

                                try {
                                    ObjectOutputStream tabla = new ObjectOutputStream(new FileOutputStream(clasifiacion_tablas));
                                    tabla.writeObject(clasifiacion);
                                    tabla.close();
                                } catch (IOException s) {
                                }

                                mp.setVisible(true);
                                setVisible(false);
                                j = 5;
                                break;
                            case 1:
                                clasifiacion[1][0] = resp;
                                clasifiacion[1][1] = tiempoinicial;
                                clasifiacion[1][2] = movimiento;

                                clasifiacion[2][0] = clasifiacionaux[1][0];
                                clasifiacion[2][1] = clasifiacionaux[1][1];
                                clasifiacion[2][2] = clasifiacionaux[1][2];

                                clasifiacion[3][0] = clasifiacionaux[2][0];
                                clasifiacion[3][1] = clasifiacionaux[2][1];
                                clasifiacion[3][2] = clasifiacionaux[2][2];

                                clasifiacion[4][0] = clasifiacionaux[3][0];
                                clasifiacion[4][1] = clasifiacionaux[3][1];
                                clasifiacion[4][2] = clasifiacionaux[3][2];

                                try {
                                    ObjectOutputStream tabla = new ObjectOutputStream(new FileOutputStream(clasifiacion_tablas));
                                    tabla.writeObject(clasifiacion);
                                    tabla.close();
                                } catch (IOException s) {
                                }

                                mp.setVisible(true);
                                setVisible(false);
                                j = 5;
                                break;

                            case 2:
                                clasifiacion[2][0] = resp;
                                clasifiacion[2][1] = tiempoinicial;
                                clasifiacion[2][2] = movimiento;

                                clasifiacion[3][0] = clasifiacionaux[2][0];
                                clasifiacion[3][1] = clasifiacionaux[2][1];
                                clasifiacion[3][2] = clasifiacionaux[2][2];

                                clasifiacion[4][0] = clasifiacionaux[3][0];
                                clasifiacion[4][1] = clasifiacionaux[3][1];
                                clasifiacion[4][2] = clasifiacionaux[3][2];

                                try {
                                    ObjectOutputStream tabla = new ObjectOutputStream(new FileOutputStream(clasifiacion_tablas));
                                    tabla.writeObject(clasifiacion);
                                    tabla.close();
                                } catch (IOException s) {
                                }

                                mp.setVisible(true);
                                setVisible(false);
                                j = 5;
                                break;

                            case 3:

                                clasifiacion[3][0] = resp;
                                clasifiacion[3][1] = tiempoinicial;
                                clasifiacion[3][2] = movimiento;

                                clasifiacion[4][0] = clasifiacionaux[3][0];
                                clasifiacion[4][1] = clasifiacionaux[3][1];
                                clasifiacion[4][2] = clasifiacionaux[3][2];

                                try {
                                    ObjectOutputStream tabla = new ObjectOutputStream(new FileOutputStream(clasifiacion_tablas));
                                    tabla.writeObject(clasifiacion);
                                    tabla.close();
                                } catch (IOException s) {
                                }

                                mp.setVisible(true);
                                setVisible(false);
                                j = 5;
                                break;

                            case 4:
                                clasifiacion[4][0] = resp;
                                clasifiacion[4][1] = tiempoinicial;
                                clasifiacion[4][2] = movimiento;
                                try {
                                    ObjectOutputStream tabla = new ObjectOutputStream(new FileOutputStream(clasifiacion_tablas));
                                    tabla.writeObject(clasifiacion);
                                    tabla.close();
                                } catch (IOException s) {
                                }

                                mp.setVisible(true);
                                setVisible(false);
                                j = 5;
                                break;

                        }

                    } else {
                        System.out.println("no aplica");
                    }

                }
            }

            apagar();

            for (int i = 0; i < torre1.length; i++) {
                if (torre1[i] <= 0) {

                    break;
                }
                int posi;
                int fich;

                posi = i;

                fich = torre1[i];

                pintar(posi, fich, 150);

            }
            for (int i = 0; i < torre2.length; i++) {
                if (torre2[i] <= 0) {

                    break;
                }
                int posi;
                int fich;
                posi = i;
                fich = torre2[i];
                pintar(posi, fich, 450);

            }
            for (int i = 0; i < torre3.length; i++) {
                if (torre3[i] <= 0) {

                    break;
                }
                int posi;
                int fich;
                posi = i;
                fich = torre3[i];
                pintar(posi, fich, 750);
            }

        }
    }

    private void apagar() {
        pieza1.setVisible(false);
        pieza2.setVisible(false);
        pieza3.setVisible(false);
        pieza4.setVisible(false);

        pieza5.setVisible(false);
        pieza6.setVisible(false);
        pieza7.setVisible(false);
    }

    private void pintar(int posi, int ficha, int coo) {

        switch (posi) {
            case 0:
                switch (ficha - 1) {
                    case 0:
                        pieza7.setVisible(false);
                        pieza7 = new JPanel();
                        pieza7.setBounds(coo, 408, 150, 15);
                        pieza7.setBackground(Color.red);
                        p1.add(pieza7);
                        nueva_torre();

                        break;
                    case 1:

                        pieza6 = new JPanel();
                        pieza6.setBounds(coo + 10, 408, 130, 15);
                        pieza6.setBackground(Color.orange);
                        p1.add(pieza6);
                        pieza6.setVisible(true);
                        nueva_torre();

                        break;
                    case 2:

                        pieza5 = new JPanel();
                        pieza5.setBounds(coo + 20, 408, 110, 15);
                        pieza5.setBackground(Color.blue);
                        p1.add(pieza5);
                        pieza5.setVisible(true);
                        nueva_torre();

                        break;
                    case 3:

                        pieza4 = new JPanel();
                        pieza4.setBounds(coo + 30, 408, 90, 15);
                        pieza4.setBackground(Color.YELLOW);
                        p1.add(pieza4);
                        pieza4.setVisible(true);
                        nueva_torre();

                        break;
                    case 4:

                        pieza3.setVisible(false);
                        pieza3 = new JPanel();
                        pieza3.setBounds(coo + 40, 408, 70, 15);
                        pieza3.setBackground(Color.CYAN);
                        p1.add(pieza3);
                        pieza3.setVisible(true);
                        nueva_torre();

                        break;

                    case 5:

                        pieza2 = new JPanel();
                        pieza2.setBounds(coo + 50, 408, 50, 15);
                        pieza2.setBackground(Color.green);
                        p1.add(pieza2);
                        pieza2.setVisible(true);
                        nueva_torre();

                        break;
                    case 6:

                        pieza1 = new JPanel();
                        pieza1.setBounds(coo + 60, 408, 30, 15);
                        pieza1.setBackground(Color.pink);
                        p1.add(pieza1);
                        pieza1.setVisible(true);
                        nueva_torre();

                        break;

                }
                break;
            case 1:
                switch (ficha - 1) {
                    case 0:
                        pieza7.setVisible(false);
                        pieza7 = new JPanel();
                        pieza7.setBounds(coo, 393, 150, 15);
                        pieza7.setBackground(Color.red);
                        p1.add(pieza7);
                        pieza7.setVisible(true);
                        nueva_torre();

                        break;
                    case 1:

                        pieza6 = new JPanel();
                        pieza6.setBounds(coo + 10, 393, 130, 15);
                        pieza6.setBackground(Color.orange);
                        p1.add(pieza6);
                        pieza6.setVisible(true);
                        nueva_torre();

                        break;
                    case 2:

                        pieza5 = new JPanel();
                        pieza5.setBounds(coo + 20, 393, 110, 15);
                        pieza5.setBackground(Color.blue);
                        p1.add(pieza5);
                        pieza5.setVisible(true);
                        nueva_torre();

                        break;
                    case 3:

                        pieza4 = new JPanel();
                        pieza4.setBounds(coo + 30, 393, 90, 15);
                        pieza4.setBackground(Color.YELLOW);
                        p1.add(pieza4);
                        pieza4.setVisible(true);
                        nueva_torre();

                        break;
                    case 4:

                        pieza3 = new JPanel();
                        pieza3.setBounds(coo + 40, 393, 70, 15);
                        pieza3.setBackground(Color.CYAN);
                        p1.add(pieza3);
                        pieza3.setVisible(true);
                        nueva_torre();

                        break;

                    case 5:

                        pieza2 = new JPanel();
                        pieza2.setBounds(coo + 50, 393, 50, 15);
                        pieza2.setBackground(Color.green);
                        p1.add(pieza2);
                        pieza2.setVisible(true);
                        nueva_torre();

                        break;
                    case 6:

                        pieza1 = new JPanel();
                        pieza1.setBounds(coo + 60, 393, 30, 15);
                        pieza1.setBackground(Color.pink);
                        p1.add(pieza1);
                        pieza1.setVisible(true);
                        nueva_torre();

                        break;

                }
                break;
            case 2:
                switch (ficha - 1) {
                    case 0:
                        pieza7.setVisible(false);
                        pieza7 = new JPanel();
                        pieza7.setBounds(coo, 378, 150, 15);
                        pieza7.setBackground(Color.red);
                        p1.add(pieza7);
                        pieza7.setVisible(true);
                        nueva_torre();

                        break;
                    case 1:

                        pieza6 = new JPanel();
                        pieza6.setBounds(coo + 10, 378, 130, 15);
                        pieza6.setBackground(Color.orange);
                        p1.add(pieza6);
                        pieza6.setVisible(true);
                        nueva_torre();

                        break;
                    case 2:

                        pieza5 = new JPanel();
                        pieza5.setBounds(coo + 20, 378, 110, 15);
                        pieza5.setBackground(Color.blue);
                        p1.add(pieza5);
                        pieza5.setVisible(true);
                        nueva_torre();

                        break;
                    case 3:

                        pieza4 = new JPanel();
                        pieza4.setBounds(coo + 30, 378, 90, 15);
                        pieza4.setBackground(Color.YELLOW);
                        p1.add(pieza4);
                        pieza4.setVisible(true);
                        nueva_torre();

                        break;
                    case 4:

                        pieza3 = new JPanel();
                        pieza3.setBounds(coo + 40, 378, 70, 15);
                        pieza3.setBackground(Color.CYAN);
                        p1.add(pieza3);
                        pieza3.setVisible(true);
                        nueva_torre();

                        break;

                    case 5:

                        pieza2 = new JPanel();
                        pieza2.setBounds(coo + 50, 378, 50, 15);
                        pieza2.setBackground(Color.green);
                        p1.add(pieza2);
                        pieza2.setVisible(true);
                        nueva_torre();

                        break;
                    case 6:

                        pieza1 = new JPanel();
                        pieza1.setBounds(coo + 60, 378, 30, 15);
                        pieza1.setBackground(Color.pink);
                        p1.add(pieza1);
                        pieza1.setVisible(true);
                        nueva_torre();

                        break;

                }
                break;
            case 3:
                switch (ficha - 1) {
                    case 0:
                        pieza7.setVisible(false);
                        pieza7 = new JPanel();
                        pieza7.setBounds(coo, 363, 150, 15);
                        pieza7.setBackground(Color.red);
                        p1.add(pieza7);
                        pieza7.setVisible(true);
                        nueva_torre();

                        break;
                    case 1:

                        pieza6 = new JPanel();
                        pieza6.setBounds(coo + 10, 363, 130, 15);
                        pieza6.setBackground(Color.orange);
                        p1.add(pieza6);
                        pieza6.setVisible(true);
                        nueva_torre();

                        break;
                    case 2:

                        pieza5 = new JPanel();
                        pieza5.setBounds(coo + 20, 363, 110, 15);
                        pieza5.setBackground(Color.blue);
                        p1.add(pieza5);
                        pieza5.setVisible(true);
                        nueva_torre();

                        break;
                    case 3:

                        pieza4 = new JPanel();
                        pieza4.setBounds(coo + 30, 363, 90, 15);
                        pieza4.setBackground(Color.YELLOW);
                        p1.add(pieza4);
                        pieza4.setVisible(true);
                        nueva_torre();

                        break;
                    case 4:

                        pieza3 = new JPanel();
                        pieza3.setBounds(coo + 40, 363, 70, 15);
                        pieza3.setBackground(Color.CYAN);
                        p1.add(pieza3);
                        pieza3.setVisible(true);
                        nueva_torre();

                        break;

                    case 5:

                        pieza2 = new JPanel();
                        pieza2.setBounds(coo + 50, 363, 50, 15);
                        pieza2.setBackground(Color.green);
                        p1.add(pieza2);
                        pieza2.setVisible(true);
                        nueva_torre();

                        break;
                    case 6:

                        pieza1 = new JPanel();
                        pieza1.setBounds(coo + 60, 363, 30, 15);
                        pieza1.setBackground(Color.pink);
                        p1.add(pieza1);
                        pieza1.setVisible(true);
                        nueva_torre();

                        break;

                }
                break;
            case 4:

                switch (ficha - 1) {
                    case 0:
                        pieza7.setVisible(false);
                        pieza7 = new JPanel();
                        pieza7.setBounds(coo, 348, 150, 15);
                        pieza7.setBackground(Color.red);
                        p1.add(pieza7);
                        pieza7.setVisible(true);
                        nueva_torre();

                        break;
                    case 1:

                        pieza6 = new JPanel();
                        pieza6.setBounds(coo + 10, 348, 130, 15);
                        pieza6.setBackground(Color.orange);
                        p1.add(pieza6);
                        pieza6.setVisible(true);
                        nueva_torre();

                        break;
                    case 2:

                        pieza5 = new JPanel();
                        pieza5.setBounds(coo + 20, 348, 110, 15);
                        pieza5.setBackground(Color.blue);
                        p1.add(pieza5);
                        pieza5.setVisible(true);
                        nueva_torre();

                        break;
                    case 3:

                        pieza4 = new JPanel();
                        pieza4.setBounds(coo + 30, 348, 90, 15);
                        pieza4.setBackground(Color.YELLOW);
                        p1.add(pieza4);
                        pieza4.setVisible(true);
                        nueva_torre();

                        break;
                    case 4:

                        pieza3 = new JPanel();
                        pieza3.setBounds(coo + 40, 348, 70, 15);
                        pieza3.setBackground(Color.CYAN);
                        p1.add(pieza3);
                        pieza3.setVisible(true);
                        nueva_torre();

                        break;

                    case 5:

                        pieza2 = new JPanel();
                        pieza2.setBounds(coo + 50, 348, 50, 15);
                        pieza2.setBackground(Color.green);
                        p1.add(pieza2);
                        pieza2.setVisible(true);
                        nueva_torre();

                        break;
                    case 6:

                        pieza1 = new JPanel();
                        pieza1.setBounds(coo + 60, 348, 30, 15);
                        pieza1.setBackground(Color.pink);
                        p1.add(pieza1);
                        pieza1.setVisible(true);
                        nueva_torre();

                        break;

                }
                break;
            case 5:

                switch (ficha - 1) {
                    case 0:
                        pieza7.setVisible(false);
                        pieza7 = new JPanel();
                        pieza7.setBounds(coo, 333, 150, 15);
                        pieza7.setBackground(Color.red);
                        p1.add(pieza7);
                        pieza7.setVisible(true);
                        nueva_torre();

                        break;
                    case 1:

                        pieza6 = new JPanel();
                        pieza6.setBounds(coo + 10, 333, 130, 15);
                        pieza6.setBackground(Color.orange);
                        p1.add(pieza6);
                        pieza6.setVisible(true);
                        nueva_torre();

                        break;
                    case 2:

                        pieza5 = new JPanel();
                        pieza5.setBounds(coo + 20, 333, 110, 15);
                        pieza5.setBackground(Color.blue);
                        p1.add(pieza5);
                        pieza5.setVisible(true);
                        nueva_torre();

                        break;
                    case 3:

                        pieza4 = new JPanel();
                        pieza4.setBounds(coo + 30, 333, 90, 15);
                        pieza4.setBackground(Color.YELLOW);
                        p1.add(pieza4);
                        pieza4.setVisible(true);
                        nueva_torre();

                        break;
                    case 4:

                        pieza3 = new JPanel();
                        pieza3.setBounds(coo + 40, 333, 70, 15);
                        pieza3.setBackground(Color.CYAN);
                        p1.add(pieza3);
                        pieza3.setVisible(true);
                        nueva_torre();

                        break;

                    case 5:

                        pieza2 = new JPanel();
                        pieza2.setBounds(coo + 50, 333, 50, 15);
                        pieza2.setBackground(Color.green);
                        p1.add(pieza2);
                        pieza2.setVisible(true);
                        nueva_torre();

                        break;
                    case 6:

                        pieza1 = new JPanel();
                        pieza1.setBounds(coo + 60, 333, 30, 15);
                        pieza1.setBackground(Color.pink);
                        p1.add(pieza1);
                        pieza1.setVisible(true);
                        nueva_torre();

                        break;

                }
                break;
            case 6:

                switch (ficha - 1) {
                    case 0:
                        pieza7.setVisible(false);
                        pieza7 = new JPanel();
                        pieza7.setBounds(coo, 318, 150, 15);
                        pieza7.setBackground(Color.red);
                        p1.add(pieza7);
                        pieza7.setVisible(true);
                        nueva_torre();

                        break;
                    case 1:

                        pieza6 = new JPanel();
                        pieza6.setBounds(coo + 10, 318, 130, 15);
                        pieza6.setBackground(Color.orange);
                        p1.add(pieza6);
                        pieza6.setVisible(true);
                        nueva_torre();

                        break;
                    case 2:

                        pieza5 = new JPanel();
                        pieza5.setBounds(coo + 20, 318, 110, 15);
                        pieza5.setBackground(Color.blue);
                        p1.add(pieza5);
                        pieza5.setVisible(true);
                        nueva_torre();

                        break;
                    case 3:

                        pieza4 = new JPanel();
                        pieza4.setBounds(coo + 30, 318, 90, 15);
                        pieza4.setBackground(Color.YELLOW);
                        p1.add(pieza4);
                        pieza4.setVisible(true);
                        nueva_torre();

                        break;
                    case 4:

                        pieza3 = new JPanel();
                        pieza3.setBounds(coo + 40, 318, 70, 15);
                        pieza3.setBackground(Color.CYAN);
                        p1.add(pieza3);
                        pieza3.setVisible(true);
                        nueva_torre();

                        break;

                    case 5:

                        pieza2 = new JPanel();
                        pieza2.setBounds(coo + 50, 318, 50, 15);
                        pieza2.setBackground(Color.green);
                        p1.add(pieza2);
                        pieza2.setVisible(true);
                        nueva_torre();

                        break;
                    case 6:

                        pieza1 = new JPanel();
                        pieza1.setBounds(coo + 60, 318, 30, 15);
                        pieza1.setBackground(Color.pink);
                        p1.add(pieza1);
                        pieza1.setVisible(true);
                        nueva_torre();

                        break;

                }
                break;

        }

    }

    //Reloj contiene tambien el movimiento del timer volador
    public class reloj extends Thread {

        @Override
        public void run() {

            tiempoinicial = tiempo;
            segundos(tiempo, 0);

        }

        public void segundos(double s, double l) {
            double m = 0.00000;
            while (m <= 1) {

                s = s - 0.00002;
                l = l + 0.0006;
                try {
                    int t = 0 / 0;

                    System.out.printf("%.0f" + "\n", t);
                } catch (Exception e) {
                    System.out.println("");
                }

                m = m + 0.00002;

            }

//            tiempo = (int) (tiempo - s);
            nuevo_timer(s);

            if (s <= 0.0000) {
                JOptionPane.showMessageDialog(null, "Se acabo el tiempo");
                setVisible(false);
                Menu_principal mp = new Menu_principal();
                mp.setVisible(true);
            } else if (toco_boton == true) {
                tiempoinicial = (int) s;

            } else if (tocotocorojo_boton == true) {
                tocotocorojo_boton = false;
                potenciadorrojo.setVisible(false);

                carga = 0;

                potenciadorverde.setVisible(true);
                potenciadorverde.setLocation(10, (int) carga);
                segundos(s - 10, 0);

            } else if (tocoverde_boton == true) {
                tocoverde_boton = false;
                potenciadorrojo.setVisible(false);

                carga = 0;

                potenciadorverde.setVisible(true);
                potenciadorverde.setLocation(10, (int) carga);
                segundos(s + 10, 0);
                tocoverde_boton = false;

            } else if (l >= 50 && l <= 100) {

                potenciadorverde.setVisible(false);

                carga = l;

                potenciadorrojo.setVisible(true);
                potenciadorrojo.setLocation(10, (int) carga);
                segundos(s, l);

            } else if (l >= 100 & l <= 150) {

                potenciadorrojo.setVisible(false);

                carga = l;

                potenciadorverde.setVisible(true);
                potenciadorverde.setLocation(10, (int) carga);
                segundos(s, l);

            } else if (l >= 150 & l <= 200) {

                potenciadorverde.setVisible(false);

                carga = l;

                potenciadorrojo.setVisible(true);
                potenciadorrojo.setLocation(10, (int) carga);
                segundos(s, l);

            } else if (l >= 200 & l <= 250) {

                potenciadorrojo.setVisible(false);

                carga = l;

                potenciadorverde.setVisible(true);
                potenciadorverde.setLocation(10, (int) carga);
                segundos(s, l);

            } else if (l >= 250 && l <= 300) {

                potenciadorverde.setVisible(false);

                carga = l;

                potenciadorrojo.setVisible(true);
                potenciadorrojo.setLocation(10, (int) carga);
                segundos(s, l);

            } else if (l >= 300 & l <= 350) {

                potenciadorrojo.setVisible(false);

                carga = l;

                potenciadorverde.setVisible(true);
                potenciadorverde.setLocation(10, (int) carga);
                segundos(s, l);

            } else if (l >= 350 & l <= 400) {

                potenciadorverde.setVisible(false);

                carga = l;

                potenciadorrojo.setVisible(true);
                potenciadorrojo.setLocation(10, (int) carga);
                segundos(s, l);

            } else if (l >= 400 & l <= 450) {

                potenciadorrojo.setVisible(false);

                carga = l;

                potenciadorverde.setVisible(true);
                potenciadorverde.setLocation(10, (int) carga);
                segundos(s, l);

            } else if (l >= 450 & l <= 500) {

                potenciadorverde.setVisible(false);

                carga = l;

                potenciadorrojo.setVisible(true);
                potenciadorrojo.setLocation(10, (int) carga);
                segundos(s, l);

            } else if (l >= 500 & l <= 550) {

                potenciadorrojo.setVisible(false);

                carga = l;

                potenciadorverde.setVisible(true);
                potenciadorverde.setLocation(10, (int) carga);
                segundos(s, l);

            } else if (l >= 527) {

                potenciadorrojo.setVisible(false);

                carga = 0;

                potenciadorverde.setVisible(true);
                potenciadorverde.setLocation(10, (int) carga);
                segundos(s, 0);

            } else {

                potenciadorverde.setLocation(10, (int) l);

                segundos(s, l);

            }

        }

    }

    public void inicio(int tp, int disc) {

        Nuevo_Juego(disc);
        movimientos(disc);
        piezas(tp);

        reloj r = new reloj();
        r.start();
//        potenciador p = new potenciador();
//        p.start();

    }

}
