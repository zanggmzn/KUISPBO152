/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perhitungan;
import kuis.DesignerCriteria;
import kuis.ManagerCriteria;
import kuis.ProgrammerCriteria;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
        Scanner input= new Scanner(System.in);
        System.out.println("Pelamaran Lowongan Pekerjaan");
        System.out.println(" 1. Programmer");
        System.out.println(" 2. Designer");
        System.out.println(" 3. Manager");
        System.out.print(" Pilih Jenis Pekerjaan : ");
        int pilih = input.nextInt();
        
            switch (pilih) {
                case 1:
                    {
                        //scanner berupa data
                        System.out.println("=== FORMULIR PELAMAR ===");
                        Scanner data= new Scanner(System.in);
                        System.out.print(" Input Nama : ");
                        String nama = data.next();

                        System.out.println("---Penilaian---");
                        System.out.println("Keterangan: Nilai yang valid berada di antara 0-100");
                        //programmer
                        System.out.print("Input Nilai Programming Knowledge : ");
                        double tesA= data.nextDouble();
                        System.out.print("Input Nilai Clean Coding : ");
                        double tesB = data.nextDouble();
                        System.out.print("Input Nilai Debugging : ");
                        double tesC = data.nextDouble();
                        ProgrammerCriteria prog = new ProgrammerCriteria(nama,tesA,tesB,tesC);
                        do{
                            System.out.println("=== MENU ===");
                            System.out.println(" 1. Tampilkan Hasil");
                            System.out.println(" 2. Ubah Nilai Pelamar");
                            System.out.println(" 3. Exit");
                            System.out.print(" Pilih : ");
                            int pilihMenu = input.nextInt();
                            if (pilihMenu == 1){
                                System.out.println("Nilai Akhir : " + prog.hitungNilaiTotal());
                                System.out.println("Keterangan : " + prog.keterangan());
                            }
                            else if (pilihMenu == 2){
                                System.out.print("Input Nilai Programming Knowledge : ");
                                prog.inputTesA(input.nextDouble());
                                System.out.print("Input Nilai Clean Coding : ");
                                prog.inputTesB(input.nextDouble());
                                System.out.print("Input Nilai Debugging : ");
                                prog.inputTesC(input.nextDouble());
                                
                            }
                            else {
                                System.out.println("Terimakasih");
                                break;
                            }
                        }while(true);
                        break;
                    }
                case 2:
                    {
                        //scanner berupa data
                        System.out.println("=== FORMULIR PELAMAR ===");
                        Scanner data= new Scanner(System.in);
                        System.out.print(" Input Nama : ");
                        String nama = data.next();

                        System.out.println("---Penilaian---");
                        System.out.println("Keterangan: Nilai yang valid berada di antara 0-100");
                        System.out.print("Input Nilai Design Portofolio : ");
                        double tesA= data.nextDouble();
                        System.out.print("Input Nilai Prototyping : ");
                        double tesB = data.nextDouble();
                        System.out.print("Input Nilai Creativity : ");
                        double tesC = data.nextDouble();
                        DesignerCriteria des = new DesignerCriteria(nama, tesA, tesB, tesC);
                        do{
                            System.out.println("=== MENU ===");
                            System.out.println(" 1. Tampilkan Hasil");
                            System.out.println(" 2. Ubah Nilai Pelamar");
                            System.out.println(" 3. Exit");
                            System.out.print(" Pilih : ");
                            int pilihMenu = input.nextInt();
                            
                            if (pilihMenu == 1){
                                System.out.println("Nilai Akhir : " + des.hitungNilaiTotal());
                                System.out.println("Keterangan : " + des.keterangan());
                            }
                            else if (pilihMenu == 2){
                                System.out.print("Input Nilai Design Portofolio : ");
                                des.inputTesA(input.nextDouble());
                                System.out.print("Input Nilai Prototyping : ");
                                des.inputTesB(input.nextDouble());
                                System.out.print("Input Nilai Creativity : ");
                                des.inputTesC(input.nextDouble());
                            }
                            else {
                                System.out.println("Terimakasih");
                                break;
                            }
                        }while(true);
                        break;
                    }
                case 3:
                    {
                        //scanner berupa data
                        System.out.println("=== FORMULIR PELAMAR ===");
                        Scanner data= new Scanner(System.in);
                        System.out.print(" Input Nama : ");
                        String nama = data.next();

                        System.out.println("---Penilaian---");
                        System.out.println("Keterangan: Nilai yang valid berada di antara 0-100");
                        System.out.print("Input Nilai Innovation : ");
                        double tesA= data.nextDouble();
                        System.out.print("Input Nilai Decision Making : ");
                        double tesB = data.nextDouble();
                        System.out.print("Input Nilai Communication: ");
                        double tesC = data.nextDouble();
                        ManagerCriteria manag = new ManagerCriteria(nama, tesA, tesB, tesC);
                        do{
                            System.out.println("=== MENU ===");
                            System.out.println(" 1. Tampilkan Hasil");
                            System.out.println(" 2. Ubah Nilai Pelamar");
                            System.out.println(" 3. Exit");
                            System.out.print(" Pilih : ");
                            int pilihMenu = input.nextInt();
                            
                            if (pilihMenu == 1){
                                System.out.println("Nilai Akhir : " + manag.hitungNilaiTotal());
                                System.out.println("Keterangan : " + manag.keterangan());
                            }
                            else if (pilihMenu == 2){
                                System.out.print("Input Nilai Innovation : ");
                                manag.inputTesA(input.nextDouble());
                                System.out.print("Input Nilai Decision Making  : ");
                                manag.inputTesB(input.nextDouble());
                                System.out.print("Input Nilai Communication: ");
                                manag.inputTesC(input.nextDouble());
                            }
                            else {
                                System.out.println("Terimakasih");
                                break;
                            }
                        }while(true);
                        break;
                    }
                default:
                    System.out.println("=== Input SALAH ===");
                    System.out.println("(Mohon Input Ulang)");
                    break;
            }
        }
        catch(Exception error){
            System.out.println("Errornya adalah " +error.getMessage());
        }
    }
    
}
