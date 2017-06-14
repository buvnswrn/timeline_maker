/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeline;

/**
 *
 * @author Bhuvaneshwaran
 */
public class Timeline {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Loading load=new Loading();
       load.setVisible(true);
        load.setLocationRelativeTo(null);
        Login login=new Login();
        login.setLocationRelativeTo(null);
        try{
            for (int i = 0; i <=1000; i++) {
                Thread.sleep((long) (Math.random()*100));
                load.loadingnum.setText(Integer.toString(i)+"%");
                load.progressbar.setValue(i);
                if(i==100){
                    load.setVisible(false);
                    login.setVisible(true);
                }
            }
        }
        catch(Exception e){
            
        }
    }
    
}
