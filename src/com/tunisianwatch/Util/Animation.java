/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunisianwatch.Util;

/**
 *
 * @author Dell
 */
public class Animation extends Thread {
private MyInterface myInterface = null;
private String txtAfficher="";
private String buf="";
private int vitesse = 400;
private int counter=0;
/**
* Constructeurs
*/
Animation (){}
public Animation(String text){
this.txtAfficher = text;
}
/**
* addMyListener
**/
public void addMyListener(MyInterface listener){
this.myInterface = listener;
}
/**
* run
**/
public void run() {
while (true) {
try {
Thread.sleep(vitesse); // faire une pause au thread.
}catch (InterruptedException e) {};
if(counter==txtAfficher.length() ) counter =0;
counter += 1;
buf = txtAfficher.substring(counter) + "      -       " + txtAfficher.substring(0,counter) ;
this.afficher(buf);
}
}
/**
* afficher : afficher le texte dans JTextField via notre interface.
**/
public void afficher(String text){
myInterface.afficherText( text );
}
/**
* setTextAfficher : changer le texte à afficher.
**/
public void setTextAfficher(String text){
this.txtAfficher = text;
}
/**
* setVitesse : changer la vitesse de défilement.
* En millisecond, c'est la valeur donnée à sleep d'un Thread
* pour faire une pause.
**/
public void setVitesse(int vitesse){
this.vitesse = vitesse;
}
/**
* reset : counter = 0. recommencer le défilement.
**/
public void reset(){
this.counter = 0;
afficher(this.txtAfficher);
}

/*###########################################################*/
/**
* MyInterface.java
* Une seule méthode : afficherText
*
* author : davidauche
* Date : 02-05-2006
**/
public interface MyInterface {
public void afficherText(String text);
}
/*###########################################################*/
/**
* Classe Defilement.java
* author : davidauche
* Date : 02-05-2006
**/


}