/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bacani_cytosine_pe1;

import javax.swing.*;
import java.awt.*;

public class pe1 {
    JFrame frame;
    JLabel studinfo;
    JLabel logininfo;
    JLabel name ;
    JTextField nameTF;
    JLabel username;
    JTextField usernameTF;
    JLabel yearsec;
    JTextField yearsecTF;
    JLabel pass;
    JPasswordField passPF;
    JLabel bday;
    JTextField bdayday;
    JTextField bdaymonth;
    JTextField bdayyear;
    JButton signup;
    JLabel addy;
    JTextArea addyTA;
    JButton cancel;
    
    
    public pe1() {

    frame=new JFrame ("Login");
    studinfo=new JLabel("Student info");
    logininfo=new JLabel("Student Log-in Info");
    name=new JLabel("Name");
    nameTF=new JTextField();
    username=new JLabel("Username");
    usernameTF=new JTextField();
    yearsec=new JLabel("Year/Section");
    yearsecTF=new JTextField();
    pass=new JLabel("Password");
    passPF=new JPasswordField();
    bday= new JLabel("Birthday");
    bdayday=new JTextField();
    bdaymonth = new JTextField ();
    bdayyear=new JTextField();
    signup=new JButton("Sign-up");
    addy=new JLabel("Address");
    addyTA=new JTextArea();
    cancel=new JButton("Cancel");
    
}

public void setFrame(){
        frame.setLayout(new GraphPaperLayout(new Dimension(30,19)));
        frame.add( studinfo,new Rectangle(1,1,13,2));
        frame.add( logininfo,new Rectangle(16,1,13,2));
        frame.add( name,new Rectangle(1,4,4,2));
        frame.add( nameTF,new Rectangle(5,4,9,2)) ;       
        frame.add( username,new Rectangle(16,4,4,2))  ;      
        frame.add( usernameTF,new Rectangle(20,4,9,2))  ;      
        frame.add( yearsec,new Rectangle(1,7,4,2))   ;     
        frame.add( yearsecTF,new Rectangle(5,7,9,2));
        frame.add( pass,new Rectangle(16,7,4,2));
        frame.add( passPF,new Rectangle(20,7,9,2));
        frame.add( bday,new Rectangle(1,10,4,2));
        frame.add( bdayday,new Rectangle(5,10,2,2));
        frame.add( bdaymonth,new Rectangle(7,10,2,2));
        frame.add( bdayyear,new Rectangle(9,10,5,2));
        frame.add( signup,new Rectangle(16,11,13,2));
        frame.add( addy,new Rectangle(1,13,4,2));
        frame.add( addyTA,new Rectangle(5,13,9,5)) ; 
        frame.add( cancel,new Rectangle(16,14,13,2)) ; 
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
        frame.setSize(800,500);
    }
 public static void main(String[] args){
        pe1 la=new pe1();
        la.setFrame();
    } 
        
        
    }
