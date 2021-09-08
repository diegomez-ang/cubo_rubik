package cubo.rubik;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;



public class canvascubo extends Canvas{
    int a=0,x,y,b=0,tam,fil,col;
    public canvascubo(){
    }

    @Override
    public void paint(Graphics g){
        tam=3;
        fil=3*tam;
        col=4*tam;
        for(x=1;x<=fil;x++){
            for(y=1;y<=col;y++){
                g.drawLine(10+a,20+b,10+a,40+b);//x1=10 y1=20 x2=10 y2=40
                g.drawLine(10+a,20+b,30+a,20+b);
                g.drawLine(30+a,20+b,30+a,40+b);
                g.drawLine(10+a,40+b,30+a,40+b);
                a=a+20;
            }
            b=b+20;
            a=0;
        }
        a=b=0;
        //llenado de color
        for(x=1;x<=fil;x++){
            for(y=1;y<=col;y++){
                g.setColor(Color.yellow);
                g.fillRect(11+a, 21+b, 19, 19);//i1=pos x i2=pos y i3=dis x i4dis y
                //g.setColor(Color.red);
                //g.fillRect(11+a, 21+b, 19, 19);
                a=a+20;
            }
            b=b+20;
            a=0;
        }
        a=b=0;
    }
}
