/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobacoba;

import javax.swing.JOptionPane;
import java.io.*;

/**
 *
 * @author santuy
 */
public class makanankantin {

    public static void main(String args[]) {
        String str, str1;

        int choice, z;
        int t, s, tab = 1000000;

        JOptionPane.showMessageDialog(null, "Selamat Datang di Kantin Onlen\n\n", "WELCOME", 1);

        try {
            do {

                {
                    do {
                        str
                                = JOptionPane.showInputDialog(null, "[1]SALDO CPAY \n[2]ISI SALDO CPAY \n[3]MENU MAKANAN \n[4]KELUAR \n\nMasukkan Pilihan Menu:", "Pilih Transaksi", 3);

                        choice = Integer.parseInt(str);

                        switch (choice) {
                            case 1:

                                JOptionPane.showMessageDialog(null, "Saldo CPAY Anda saat ini sebesar : " + tab); //informasi saldo

                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "KANTIN ONLEN", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain

                                if (z == 0) {
                                    break;
                                } else {
                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan jasa KANTIN ONLEN.");
                                }

                                System.exit(0);

                            case 2:

                                str1 = JOptionPane.showInputDialog(null, "Masukkan jumlah pengisian: "); //menabung
                                s = Integer.parseInt(str1);
                                menabung(tab, s);
                                tab = getsaldo();
                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "KANTIN ONLEN", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain

                                if (z == 0) {
                                    break;
                                } else {
                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan jasa KANTIN ONLEN.");
                                }
                                System.exit(0);

                            case 3:

                                str = JOptionPane.showInputDialog(null, "pilihan menu kantin \n[1]MAKANAN\n[2]MINUMAN\n[3]SNACK\n[4]Keluar", "INFO", 3);
                                choice = Integer.parseInt(str);
                                     switch (choice) {
                                    case 1:

                                        str = JOptionPane.showInputDialog(null, "[1]Nasi Lalapan(8K)\n[2]Gado gado(8K)\n[3]bakso(1K/6K)\n[4]ayam goreng/geprek(8K)\n[5]Nasi Campur(8K/10K)\n[6]Soto(9K)\n[7]Tahu Telor(10K)\n[8]Rawon (8K)\n[9]Pecel(8K)\n[10]Mie Ayam(10K)\n[11]keluar\n"); //informasi menu makanan
                                        choice = Integer.parseInt(str);
                                        switch (choice) {
                                            case 1:
                                                
                                                ambil(tab, t = 8000);
                                                tab = getsaldo();

                                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "KANTIN ONLEN", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain

                                                if (z == 0) {
                                                    break;
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan jasa KANTIN ONLEN,Makanan lagi OTW.");
                                                }
                                                System.exit(0);
                                            case 2:
                                                
                                                ambil(tab, t = 8000);
                                                tab = getsaldo();
                                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "KANTIN ONLEN", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
                                                if (z == 0) {
                                                    break;
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan jasa KANTIN ONLEN,Makanan lagi OTW.");
                                                }
                                                System.exit(0);
                                            case 3:
                                               str = JOptionPane.showInputDialog(null, " [1]1000 \n[2]6000 ");
                                               choice = Integer.parseInt(str);
                                               switch (choice){
                                                   case 1:
                                                        ambil(tab, t = 1000);
                                                tab = getsaldo();

                                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "KANTIN ONLEN", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain

                                                if (z == 0) {
                                                    break;
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan jasa KANTIN ONLEN,Makanan lagi OTW.");
                                                }
                                                System.exit(0);
                                                   case 2:
                                                        ambil(tab, t = 6000);
                                                tab = getsaldo();

                                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "KANTIN ONLEN", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain

                                                if (z == 0) {
                                                    break;
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan jasa KANTIN ONLEN,Makanan lagi OTW.");
                                                }
                                                System.exit(0);
                                               }
                                            case 4:
                                               
                                                ambil(tab, t = 8000);
                                                tab = getsaldo();
                                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "KANTIN ONLEN", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
                                                if (z == 0) {
                                                    break;
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan jasa KANTIN ONLEN,Makanan lagi OTW.");
                                                }
                                                System.exit(0);
                                            case 5:
                                              str = JOptionPane.showInputDialog(null, " [1]8000 \n[2]10000 ");
                                               choice = Integer.parseInt(str);
                                               switch (choice){
                                                   case 1:
                                                    ambil(tab, t = 8000);
                                                tab = getsaldo();
                                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "KANTIN ONLEN", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
                                                if (z == 0) {
                                                    break;
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan jasa KANTIN ONLEN,Makanan lagi OTW.");
                                                }
                                                System.exit(0);
                                                   case 2:
                                                       ambil(tab, t = 10000);
                                                tab = getsaldo();
                                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "KANTIN ONLEN", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
                                                if (z == 0) {
                                                    break;
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan jasa KANTIN ONLEN,Makanan lagi OTW.");
                                                }
                                                System.exit(0);
                                               }
                                               
                                            case 6:
                                           
                                                ambil(tab, t = 9000);
                                                tab = getsaldo();
                                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "KANTIN ONLEN", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
                                                if (z == 0) {
                                                    break;
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan jasa KANTIN ONLEN,Makanan lagi OTW.");
                                                }
                                                System.exit(0);
                                            case 7:
                                                ambil(tab, t = 10000);
                                                tab = getsaldo();
                                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "KANTIN ONLEN", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
                                                if (z == 0) {
                                                    break;
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan jasa KANTIN ONLEN,Makanan lagi OTW.");
                                                }
                                                System.exit(0);
                                            case 8:
                                               
                                                ambil(tab, t = 8000);
                                                tab = getsaldo();
                                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "KANTIN ONLEN", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
                                                if (z == 0) {
                                                    break;
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan jasa KANTIN ONLEN,Makanan lagi OTW.");
                                                }
                                                System.exit(0);
                                            case 9:
                                              
                                                ambil(tab, t =8000 );
                                                tab = getsaldo();
                                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "KANTIN ONLEN", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
                                                if (z == 0) {
                                                    break;
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan jasa KANTIN ONLEN,Makanan lagi OTW.");
                                                }
                                                System.exit(0);
                                            case 10:
                                               
                                                ambil(tab, t = 10000);
                                                tab = getsaldo();
                                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "KANTIN ONLEN", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain

                                                if (z == 0) {
                                                    break;
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan jasa KANTIN ONLEN,Makanan lagi OTW.");
                                                }

                                                System.exit(0);
                                        }
                                        
                                        break;
                                    case 2:
                                        str = JOptionPane.showInputDialog(null, "[1]Teh es / hangat(2K) \n[2]Jeruk es/hangat (2K)\n[3]Jus Buah(5K)\n[4]Kopi (3K)\n[5]Minuman Sachet(3K)\n[6]Joshua(6K)\n[7]Floridina(3K)[8]Aqua /air mineral (2K)\n[9]Javana(2K)\n[10]keluar\n"); //informasi menu makanan
                                        choice = Integer.parseInt(str);
                                        switch (choice) {
                                            case 1:
                                                str = JOptionPane.showInputDialog(null, "[1]Es (2K) \n[2]hangat (2K)\n"); //informasi menu makanan
                                        choice = Integer.parseInt(str);
                                        switch (choice){
                                            case 1: 
                                                ambil(tab, t = 2000);
                                                tab = getsaldo();
                                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "KANTIN ONLEN", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain

                                                if (z == 0) {
                                                    break;
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan jasa KANTIN ONLEN,Makanan lagi OTW.");
                                                }

                                                System.exit(0);
                                            case 2:
                                                 ambil(tab, t = 2000);
                                                tab = getsaldo();
                                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "KANTIN ONLEN", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain

                                                if (z == 0) {
                                                    break;
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan jasa KANTIN ONLEN,Makanan lagi OTW.");
                                                }

                                                System.exit(0);
                                        }
                                             
                                            case 2:
                                                  str = JOptionPane.showInputDialog(null, "[1]Es (2K) \n[2]hangat (2K)\n"); //informasi menu makanan
                                        choice = Integer.parseInt(str);
                                        switch (choice){
                                            case 1:
                                             ambil(tab, t = 2000);
                                                tab = getsaldo();
                                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "KANTIN ONLEN", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain

                                                if (z == 0) {
                                                    break;
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan jasa KANTIN ONLEN,Makanan lagi OTW.");
                                                }

                                                System.exit(0);
                                            case 2:
                                                 ambil(tab, t = 2000);
                                                tab = getsaldo();
                                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "KANTIN ONLEN", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain

                                                if (z == 0) {
                                                    break;
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan jasa KANTIN ONLEN,Makanan lagi OTW.");
                                                }

                                                System.exit(0);
                                        }
                                            case 3:
                                                
                                                ambil(tab, t = 5000);
                                                tab = getsaldo();

                                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "KANTIN ONLEN", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
                                                if (z == 0) {
                                                    break;
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan jasa KANTIN ONLEN,Minuman lagi OTW.");
                                                }
                                                System.exit(0);
                                            case 4:
                                               
                                                ambil(tab, t = 3000);
                                                tab = getsaldo();

                                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "KANTIN ONLEN", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
                                                if (z == 0) {
                                                    break;
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan jasa KANTIN ONLEN,Minuman lagi OTW.");
                                                }
                                                System.exit(0);
                                            case 5:
                                                
                                                ambil(tab, t = 3000);
                                                tab = getsaldo();

                                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "KANTIN ONLEN", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
                                                if (z == 0) {
                                                    break;
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan jasa KANTIN ONLEN,Minuman lagi OTW.");
                                                }
                                                System.exit(0);
                                            case 6:
                                               
                                                ambil(tab, t = 6000);
                                                tab = getsaldo();

                                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "KANTIN ONLEN", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
                                                if (z == 0) {
                                                    break;
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan jasa KANTIN ONLEN,Minuman lagi OTW.");
                                                }
                                                System.exit(0);
                                            case 7:
                                              
                                                ambil(tab, t = 3000);
                                                tab = getsaldo();

                                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "KANTIN ONLEN", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
                                                if (z == 0) {
                                                    break;
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan jasa KANTIN ONLEN,Minuman lagi OTW.");
                                                }
                                                System.exit(0);
                                            case 8:
                                              
                                                ambil(tab, t = 2000);
                                                tab = getsaldo();

                                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "KANTIN ONLEN", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
                                                if (z == 0) {
                                                    break;
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan jasa KANTIN ONLEN,Minuman lagi OTW.");
                                                }
                                                System.exit(0);
                                            case 9:
                                               
                                                ambil(tab, t = 3000);
                                                tab = getsaldo();

                                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "KANTIN ONLEN", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
                                                if (z == 0) {
                                                    break;
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan jasa KANTIN ONLEN,Minuman lagi OTW.");
                                                }
                                                System.exit(0);
                                        }
                                        break;
                                    case 3:
                                        str = JOptionPane.showInputDialog(null, "[1]Superstar (1K) \n[2]Yupi (1K)\n[3]Tango(2K)\n[4]Popcorn (2K)\n[5]keluar\n"); //informasi menu makanan
                                        choice = Integer.parseInt(str);
                                        switch (choice) {
                                            case 1: 
                                               
                                                ambil(tab, t =1000);
                                                tab = getsaldo();

                                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "KANTIN ONLEN", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
                                                if (z == 0) {
                                                    break;
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan jasa KANTIN ONLEN,Snack lagi OTW.");
                                                }
                                                System.exit(0);
                                            case 2:
                                                
                                                ambil(tab, t = 1000);
                                                tab = getsaldo();

                                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "KANTIN ONLEN", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
                                                if (z == 0) {
                                                    break;
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan jasa KANTIN ONLEN,Snack lagi OTW.");
                                                }
                                                System.exit(0);
                                            case 3:
                                                
                                                ambil(tab, t = 2000);
                                                tab = getsaldo();

                                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "KANTIN ONLEN", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
                                                if (z == 0) {
                                                    break;
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan jasa KANTIN ONLEN,Snack lagi OTW.");
                                                }
                                                System.exit(0);
                                            case 4:
                                                  
                                                
                                                ambil(tab, t = 2000);
                                                tab = getsaldo();

                                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "KANTIN ONLEN", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
                                                if (z == 0) {
                                                    break;
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan jasa KANTIN ONLEN,Snack lagi OTW.");
                                                }
                                                System.exit(0);
                                        }
                                        break;
                                        
                                }

                            case 4:
                                z = JOptionPane.showConfirmDialog(null, "Anda ingin keluar?", "Keluar", JOptionPane.YES_NO_OPTION, 0);

                                if (z == 0) {
                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan jasa KANTIN ONLEN");
                                    System.exit(0);
                                } else {
                                    break;
                                }

                            default:
                                JOptionPane.showMessageDialog(null, "Pilihan menu tidak tersedia\nSilahkan ulangi lagi", "ERROR", 0);
                        }
                    } while (1 == 1);

                }
            } while (1 == 1);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Kesalahan !\nPastikan kode yang anda masukkan berformat benar! \nPROGRAM KELUAR! \nTerimakasih", "ERROR", 0);

        }
    }
    public static int saldo;

    public static void setor() {
    }

    public static void menabung(int tab, int s) {
        if (s % 100 != 0) {
            JOptionPane.showMessageDialog(null, "maaf tidak bisa uang koin \nSilahkan ulangi kembali !", "Transaksi Gagal", 0);
        } else if (s <= 1000) {
            JOptionPane.showMessageDialog(null, "Besaran minimal setor tunai adalah Rp 1000,00", "ERROR", 0);
        } else if (s >= 1000) {
            saldo = tab + s;
            JOptionPane.showMessageDialog(null, "Saldo Anda saat ini sebesar: " + saldo);
        }
    }

    public static void tarik() {
    }

    public static void ambil(int tab, int t) {
        if (t % 100 != 0) {
            JOptionPane.showMessageDialog(null, "maaf tidak bisa uang koin \nSilahkan ulangi kembali !", "Transaksi Gagal", 0);
        } else {
            if (t > tab) {
                JOptionPane.showMessageDialog(null, "Saldo Anda tidak mencukupi \nSilahkan lakukan penyetoran", "Transaksi Gaagal", 0);
            } else if (t <= 500) {
                JOptionPane.showMessageDialog(null, "minimal pembayaran adalah Rp 1000", "Transaksi Gagal", 0);
            } else {
                saldo = tab - t;
                JOptionPane.showMessageDialog(null, "Saldo anda saati ini sebesar : " + saldo);
                if (saldo < 1000) {
                    JOptionPane.showMessageDialog(null, "Saldo minimal harus Rp 10000,00 Segera lakukan pengisian untuk menghindari penutupan akun.", "CAUTION", 2);
                }
            }
        }
    }

    public static int getsaldo() {
        return saldo;
    }
}
