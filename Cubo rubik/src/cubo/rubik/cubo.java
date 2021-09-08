package cubo.rubik;
import javax.swing.*;
import java.awt.event.*;




public class cubo extends JFrame{
    public JLayeredPane canvas1;
    public JLabel label1,label2,label3,label4;
    public JScrollPane scroll1,scroll2,scroll3,scroll4;
    public JButton boton1,boton2,boton3,boton4;
    public JTextField panel1,panel2,panel3,panel4;
    public JTable tabla1,tabla2,tabla3;
    
    //////PROGrAMACION ENTORNO/////////
    public cubo(){
        //setSize(900,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //add(new canvascubo());
        setTitle("CUBO RUBIK");
        setLayout(null);
        label1= new JLabel("L");
        label1.setBounds(600,415,50,30);
        add(label1);
        label2= new JLabel("P");
        label2.setBounds(750,415,50,30);
        add(label2);
        label3= new JLabel("N");
        label3.setBounds(600,470,50,30);
        add(label3);
        label4= new JLabel("M");
        label4.setBounds(750,470,50,30);
        add(label4);
        /*canvas1= new JLayeredPane();
        canvas1.add(new canvascubo());
        canvas1.setBounds(10,20,500,300);
        canvas1.setBackground(Color.white);
        add(canvas1);*/
        scroll1= new JScrollPane(/*canvas1*/);
        scroll1.setViewportView(new canvascubo());
        scroll1.setBounds(10,20,500,300);
        add(scroll1);
        
        
        
        boton1=new JButton("INICIAR");
        boton1.setBounds(600,550,100,30);
        add(boton1);
        //boton1.setActionCommand();
        boton2=new JButton("EXPANDIR");
        boton2.setBounds(750,550,100,30);
        add(boton2);
        
        boton3=new JButton("BUSCAR");
        boton3.setBounds(600,600,100,30);
        add(boton3);
        
        boton4=new JButton("SOLUCION");
        boton4.setBounds(750,600,100,30);
        add(boton4);
        
        panel1= new JTextField();
        panel1.setBounds(600,500,100,30);
        add(panel1);
        panel2= new JTextField();
        panel2.setBounds(750,500,100,30);
        add(panel2);
        panel3= new JTextField();
        panel3.setBounds(600,445,100,30);
        panel3.enable(false);
        add(panel3);
        panel4= new JTextField("");
        panel4.setBounds(750,445,100,30);
        panel4.enable(false);
        add(panel4);
        ////tablas///
        tabla1 = new JTable();
        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "E", "A", "O", "B", "D"
            }
        ));
        tabla1.setEnabled(false);
        scroll2= new JScrollPane();
        scroll2.setViewportView(tabla1);
        scroll2.setBounds(10,350,500,300);
        add(scroll2);
        tabla2 = new JTable();
        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "VECTOR"
            }
        ));
        tabla2.setEnabled(false);
        scroll3= new JScrollPane();
        scroll3.setViewportView(tabla2);
        scroll3.setBounds(600,20,100,300);
        add(scroll3);
        tabla3 = new JTable();
        tabla3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "VECTOR"
            }
        ));
        tabla3.setEnabled(false);
        scroll4= new JScrollPane();
        scroll4.setViewportView(tabla3);
        scroll4.setBounds(750,20,100,300);
        add(scroll4);
        
    }   
    
    
    //////PROGrAMACION BOTONES/////////
    public void actionPerformed(ActionEvent e1){
        if(e1.getSource()==boton1){
            label1.setText("1");
        }
        if(e1.getSource()==boton2){
            label1.setText("2");
        }
        if(e1.getSource()==boton3){
            label1.setText("3");
        }
        if(e1.getSource()==boton4){
            label1.setText("4");
        }
    }
    
        private String ruta = "archivo/Cubo.txt";
        private Lectura archivador = new Lectura();
        
        private void Ejecutar(){            
            double Datos[][] =  archivador.LeerArchivo(ruta);
            
            for (int i=0; i<Datos.length; i++)
            {
                for(int j=0; j<Datos[i].length; j++)
                {
                    System.out.println(Datos[i][j]+"\t");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }
        
    
    
    public static void main(String args[]) {
        cubo cubo1=new cubo();
        cubo1.setBounds(0,0,900,700);
        cubo1.setVisible(true);
        cubo1.setResizable(false);
        cubo1.setLocationRelativeTo(null);
        new cubo().Ejecutar();
    }
    
}
    
