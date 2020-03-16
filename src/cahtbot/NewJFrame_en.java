package cahtbot;
import java.awt.event.KeyEvent;
import javax.swing.JTextArea;
import static jdk.nashorn.tools.ShellFunctions.input;
import java.io.File;
import java.beans.Statement;
import java.beans.Statement;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.lang.Math;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class NewJFrame_en extends javax.swing.JFrame {
    private Object statement;
    
    public NewJFrame_en() {
        initComponents();
        
       
         addText(">SV IT BOT :  Hello,I am SV IT support ChatBot."
                 + "\n I am here to help you. please ask me your questions !!\n\n");
        /*
    try{  
                  ResultSet rs = null ;
                     rs = clsChat.getchattingList();
                     rs.beforeFirst();
                     addText("\n");
                     while(rs.next()){
                             addText("-->"+rs.getString(2)+"\t"+rs.getString(3));
                            addText("\n");
                     }
                }
                catch(Exception e){System.out.println(e);}*/
    }
  
        
          
       
     private int findKeyword(String statement, String goal)
    {
        return findKeyword(statement, goal, 0);
    } 
      
    public String getResponse(String statement)
    {
        String response = "";
        statement = statement.trim();
        
        if (statement.length() == 0)
        {
            response = "Say something, please.or \n "+getRandomResponse1();
        }
           else if(findKeyword (statement, "it")>=0 &&( findKeyword (statement, "support")>=0 || findKeyword (statement, "sopport")>=0||findKeyword (statement, "soport")>=0))
        {
           
            response = "You can login in http://etouch.sv.net \n" +
"  to log a ticket to IT or can send an email to \n "
                    + " ithelpdesk@saudiairlines.com.\n" +
"  You can also reach us at 0126864000 \n"
                    + " You can also access http://help.sv.net\n" +
"  for a password reset and self-services";
                          
        }
         else if(findKeyword (statement, "reset")>=0 &&( findKeyword (statement, "password")>=0 )|| findKeyword (statement, "pass")>=0||findKeyword (statement, "set")>=0)
        {
            response = "You can  access http://help.sv.net\n" +
                       "  for a password reset and self-services";
            //1-How do I get IT Support
        }  
           
         
          
           
           else if(findKeyword (statement, "access")>=0 &&( findKeyword (statement, "SV")>=0 || findKeyword (statement, "email")>=0))
        {
           
            response = "You can access the SV email from https://mail.saudiairlines.com.";
                          
        }
           /*  How do I access Saudi Airlines e-mail from home ?
Ans : Visit https://mail.saudiairlines.com to access corporate e-mail from outside network
*/
           else if(findKeyword (statement, "access")>=0 &&( findKeyword (statement, "e-mail")>=0 || findKeyword (statement, "email")>=0)|| findKeyword (statement, "mail")>=0)
        {
           
            response = "Visit https://mail.saudiairlines.com to access corporate e-mail from outside network";
                          
        }
              
        else if(findKeyword (statement, "link")>=0 &&( findKeyword (statement, "eBusiness Center")>=0 )||( findKeyword (statement, "eBusiness")>=0 ))
        {
           
            response = "You can access the new eBusiness Center directly\n" +"fromhttps://portal.sv.net\n" +" Also you can accesshttp://sv.net and click on New eBusiness Center";
                
        } 
         else if((findKeyword(statement, "self")>=0 )&&((findKeyword(statement, "service")>=0 )||(findKeyword(statement, "servise")>=0 )||(findKeyword(statement, "cervice")>=0 )))
        {
           
            response = " Kindly visithttp://help.sv.net to use the self-service. You can reset/unlock\n" +
                 "CORP, SAP, Sabre password through self-service. Also you can access the\n" +
                   "quick reference manual and one click solution to resolve your IT related issues";
                
        }
         
        else if(findKeyword (statement, "hi")>=0 ||( findKeyword (statement, "hello")>=0 )||( findKeyword (statement, "ola")>=0 ))
        {
           
            response = "Hello,I am SV IT support ChatBot."
                 + "\n I am here to help you. please ask me your questions !!\n\n";
            
            
                
        } 
        else if(findKeyword (statement, "how are you")>=0 ||( findKeyword (statement, "how r you")>=0 )||( findKeyword (statement, "how r u")>=0 )||( findKeyword (statement, "how are u")>=0 ))
        {
           if(findKeyword (statement, "how are you")>=0)
            response = "doing well";
           else
                 response = "good";
                
        } 
        else if(findKeyword (statement, "1")>=0)
        {
           
            response = "You can login in http://etouch.sv.net \n" +
"  to log a ticket to IT or can send an email to \n "
                    + " ithelpdesk@saudiairlines.com.\n" +
"  You can also reach us at 0126864000 \n"
                    + " You can also access http://help.sv.net\n" +
"  for a password reset and self-services";
                          
        }
        else if(findKeyword (statement, "2")>=0)
        {response = "You can access http://help.sv.net\n" +
                       "  for a password reset and self-services";}
        else if(findKeyword (statement, "3")>=0)
        {response = "You can access the SV email from https://mail.saudiairlines.com.";}
           
        else if(findKeyword(statement, "I want to ")>= 0)
        {
          response = iWantTo(statement);
            
        }
	else if(findKeyword(statement, "I want ")>= 0)
	{
		response = iWantTo(statement);
            
	}
        else
        {
            response = getRandomResponse();
        }
            dialog.setEditable(false);
       
        //Integer status2 =  clsChat.save("Boot",response+"\n");
        return response+"\n";
       
             
    }
    //---------------------------------------------------------
      private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 3;
        double r = Math.random();
        int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
        String response = "";
 
        
         if (whichResponse == 0)
        {
            response = "Hmmm."+getRandomResponse1();
        }
        
        else if (whichResponse == 1)
        {
            response = "You don't say."+getRandomResponse1();
        }
        else if(whichResponse == 2)
        {
            response = "What do you mean? "+getRandomResponse1();
        }
        return response;
    }
    private String getRandomResponse1()
    {
        String response;
       response=("How can I help you !! \n you can ask me question or  "
                         + "\n you can choose the most common question "
                         + "\n1:How do I get IT Support ?"
                         + "\n2:How do I access SV emails from home?"
                         + "\n3:How do I access Saudi Airlines e-mail from home ?");
                 String c="";  
                // String c=input.getText();
                 //input.setText("1");
                
                switch(c){
                 case "1":{  
                    
                   addText("\n"+">SV IT BOT : "+getResponse("How do I get IT Support")+"\n");
                 }break;
                   
                 case "2":{
     addText("\n"+">SV IT BOT : "+getResponse("access SV emails")+"\n");}break;
                    
                 case "3":{
     addText("\n"+">SV IT BOT : "+getResponse("access Saudi Airlines e-mail")+"\n");}break;
                     
                //default :{response="-.-";}break;
    }//response ="\n>SV IT BOT : "+getResponse("How do I get IT Support");
                
        return response;
    }
    
    //------------------------------------------
         private String iWantTo(String statement) {
     String sentence = statement.trim();
        String phrase = sentence.toLowerCase();
         
      return sentence.substring(statement.length());
      
    }
      //--------------------------------------------
           private int findKeyword(String statement, String goal,
            int startPos)
    {
        String phrase = statement.trim();
        // The only change to incorporate the startPos is in
        // the line below
        int psn = phrase.toLowerCase().indexOf(
                goal.toLowerCase(), startPos);
 
        // Refinement--make sure the goal isn't part of a
        // word
        while (psn >= 0)
        {
            // Find the string of length 1 before and after
            // the word
            String before = " ", after = " ";
            if (psn > 0)
            {
                before = phrase.substring(psn - 1, psn)
                        .toLowerCase();
            }
            if (psn + goal.length() < phrase.length())
            {
                after = phrase.substring(
                        psn + goal.length(),
                        psn + goal.length() + 1)
                        .toLowerCase();
            }
 
            // If before and after aren't letters, we've
            // found the word
            if (((before.compareTo("a") < 0) || (before
                    .compareTo("z") > 0)) // before is not a
                                            // letter
                    && ((after.compareTo("a") < 0) || (after
                            .compareTo("z") > 0)))
            {
                return psn;
            }
 
            // The last position didn't work, so let's find
            // the next, if there is one.
            psn = phrase.indexOf(goal.toLowerCase(),
                    psn + 1);
 
        }
 
        return -1;
   
	};
           //-------------------------------
           //------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        input = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dialog = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        input.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        input.setForeground(new java.awt.Color(0, 51, 102));
        input.setToolTipText("");
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });
        jPanel1.add(input, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 472, 370, 50));

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 120, 50));

        dialog.setColumns(20);
        dialog.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        dialog.setForeground(new java.awt.Color(0, 51, 204));
        dialog.setRows(5);
        jScrollPane1.setViewportView(dialog);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 500, 360));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ابو\\Pictures\\saudiairlines (1).png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 130, 710, 280));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ابو\\Pictures\\صورة2.png")); // NOI18N
        jLabel2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jLabel2ComponentResized(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void addText(String str){
    
		dialog.setText(dialog.getText()+str);;
               }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
input.setForeground(Color.DARK_GRAY);
        String quote=input.getText(); 
        input.setText("");
        addText(">You : "+quote);
         Integer status =  clsChat.save("You",quote+"\n");               
         addText("\n"+">SV IT BOT : "+getResponse(quote)+"\n");
                      
                       
                       // addText("\n");
        // TODO add your handling code here:
      /*  try{  
                  ResultSet rs = null ;
                     rs = clsChat.getchattingList();
                     rs.beforeFirst();
                     addText("\n");
                     while(rs.next()){
                             addText("-->"+rs.getString(2)+"\t"+rs.getString(3));
                            addText("\n");
                     }
                }
                catch(Exception e){System.out.println(e);}*/
         
 //String userinpu=input.getText();
  //  int x=0;
  String  s=quote.toLowerCase();
  /*Integer status =  clsChat.save("You",s);*/
                       // addText("\n");
    getResponse(s);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputActionPerformed

    private void jLabel2ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel2ComponentResized
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel2ComponentResized

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame_en.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame_en.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame_en.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame_en.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame_en().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea dialog;
    private javax.swing.JTextField input;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    
}
