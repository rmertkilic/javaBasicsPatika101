package login;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String id, pw;
        
        System.out.println("Kullanıcı adı ve şifre girin");
        System.out.print("Kullanıcı adı: ");
        id = inp.nextLine();
        System.out.print("Şifre: ");
        pw = inp.nextLine();

        if (id.equals("mert") && pw.equals("123")) {
            System.out.println("Giriş başarılı");
        } else if (id.equals("mert") && !pw.equals("123")) {
            System.out.println("Giriş başarısız, şifre hatalı. \nŞifrenizi sıfırlamak istiyor musunuz? \n (Evet için '1', Hayır için '2')");
            int choice;
            choice= inp.nextInt();
            inp.nextLine(); 
            
            if (choice == 1) {
                System.out.print("Yeni şifrenizi girin: ");
                String newPw = inp.nextLine();
                
                if (newPw.equals(pw) || newPw.equals("123")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka bir şifre giriniz.");
                } else {
                    pw = newPw;
                    System.out.println("Şifre oluşturuldu");
                }
            }
        }
        
        inp.close();
    }
}