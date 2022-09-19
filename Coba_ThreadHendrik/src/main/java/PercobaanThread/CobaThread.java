/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PercobaanThread;

import static java.lang.Thread.sleep;
/**
 *
 * @Hendrik
 */
public class CobaThread {
    public static void main (String [] args) {
    Celana celana1 = new Celana("Celana-1");
    Celana celana2 = new Celana("Celana-2");
    celana1.start();
    celana2.start();
    }
}
    class Celana extends Thread {
        // konstruktor
        public Celana (String id) {
            super (id);
        }
        // Mendefinisikan sendiri run()
    @Override
    public void run() {
        String nama = getName();
        for (int i=0; i<5; i++) {
            try {
                sleep(1000); // Tunggu 1 detik
}
            catch(InterruptedException ie) {
                System.out.println("Terinterupsi");
            }
            System.out.println("Thread " + nama + ":Posisi" + i );
        }
}}   
   
