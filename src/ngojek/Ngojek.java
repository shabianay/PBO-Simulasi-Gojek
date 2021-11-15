package ngojek;
import java.util.Scanner;
public class Ngojek {
    String username;
    int password;
  
    public static void main(String[] args) {
        String user="Gojek";
        int pass = 12345;
        
        Scanner input = new Scanner(System.in);
        System.out.println("LOGIN");
        System.out.print("Masukkan user : ");
        String username=input.nextLine();
        System.out.print("Masukkan pass : ");
        int password=input.nextInt();
        if(username.equals(user)&&password==pass){
            
        System.out.println("Silahkan pilih menu :");
            System.out.println("1.Ngoride");
            System.out.println("2.Ngofood");
            System.out.println("3.Ngosend");
            System.out.print("Masukkan pilihan : ");
        int pilih = input.nextInt();
        switch(pilih){
            case 1:
            System.out.println("Anda memilih menu ngoride silahkan pilih");
            System.out.println("1.Wonokromo - Sawahan");
            System.out.println("2.Wonokromo - Dukuh Pakis");
            System.out.println("3.Wonokromo - Karangpilang");
            System.out.println("4.Wonokromo - Wiyung");
            System.out.println("5.Wonokromo - Wonocolo Jambangan");
            System.out.println("6.Wonokromo - Gayungan");
            System.out.print("Masukkan pilihan : ");
        int pilih1=input.nextInt();
            switch(pilih1){
            case 1:
             ngoride a =new ngoride("Wonokromo","Sawahan",2000,3);
             a.tampilngoride();
               break;
             case 2:
             ngoride b =new ngoride("Wonokromo","Dukuh Pakis",2000,5);
             b.tampilngoride();
               break;
              case 3:
             ngoride c =new ngoride("Wonokromo","Karangpilang",2000,7);
             c.tampilngoride();
               break;
             case 4:
               ngoride d =new ngoride("Wonokromo","Wiyung",2000,10);
             d.tampilngoride();
               break;
             case 5:
             ngoride e =new ngoride("Wonokromo","Wonocolo Jambangan",2000,13);
             e.tampilngoride();
               break;
              case 6:
             ngoride f =new ngoride("Wonokromo","Gayungan",2000,16);
             f.tampilngoride();
               break;
              }
            break;
            case 2:
            System.out.println("Anda memilih menu ngofood silahkan pilih");
            System.out.println("1.KFC - BURGER - 15.000");
            System.out.println("2.KFC - KENTANG - 10.000");
            System.out.println("3.KFC - SOUP - 8.000");
            System.out.println("4.MCDONALD - McChicken - 20.000");
            System.out.println("5.MCDONALD - McNuggets - 12.000");
            System.out.println("6.MCDONALD - McFlury - 9.000");
            System.out.println("7.PIZZA HUT- Pizza - 80.000");
            System.out.println("8.PIZZA HUT- Pasta & Rice - 50.000");
            System.out.println("9.PIZZA HUT- Appetizer - 30.000");
            System.out.println("10.STARBUCKS - Coffe Latte - 50.000");
            System.out.println("11.STARBUCKS - Espresso 30.000");
            System.out.println("12.STARBUCKS - Americano 40.000");
            System.out.println("13.JANJI JIWA - Kopi Susu - 14.000");
            System.out.println("14.JANJI JIWA - Kopi Pandan - 15.000");
            System.out.println("15.JANJI JIWA - Kopi Soklat - 16.000");
            System.out.println("16.CHATIME - Hazelnut Milk Tea - 24.000");
            System.out.println("17.CHATIME - Matcha Red Bean Pearl Milk Tea - 26.000");
            System.out.println("18.CHATIME - Vanilla Milk Tea - 28.000");
            System.out.print("Masukkan pilihan : ");
        int pilih2=input.nextInt();
            switch(pilih2){
             case 1:
             ngofood a =new ngofood("KFC - BURGER",15000);
             a.tampilngofood();
               break;
             case 2:
             ngofood b =new ngofood("KFC - KENTANG",10000);
             b.tampilngofood();
               break;
              case 3:
             ngofood c =new ngofood("KFC - SOUP",8000);
             c.tampilngofood();
               break;
             case 4:
             ngofood d =new ngofood("MCDONALD - McChicken",20000);
             d.tampilngofood();
               break;
             case 5:
             ngofood e =new ngofood("MCDONALD - McNuggets",12000);
             e.tampilngofood();
               break;
              case 6:
             ngofood f =new ngofood("MCDONALD - McFlury",9000);
             f.tampilngofood();
               break;
            case 7:
             ngofood g =new ngofood("PIZZA HUT- Pizza",80000);
             g.tampilngofood();
               break;
             case 8:
             ngofood h =new ngofood("PIZZA HUT- Pasta & Rice",50000);
             h.tampilngofood();
               break;
              case 9:
             ngofood i =new ngofood("PIZZA HUT- Appetizer",30000);
             i.tampilngofood();
               break;
             case 10:
             ngofood j =new ngofood("STARBUCKS - Coffe Latte",50000);
             j.tampilngofood();
               break;
             case 11:
             ngofood k =new ngofood("STARBUCKS - Espresso",30000);
             k.tampilngofood();
               break;
              case 12:
             ngofood l =new ngofood("STARBUCKS - Americano",40000);
             l.tampilngofood();
               break;
            case 13:
             ngofood m =new ngofood("JANJI JIWA - Kopi Susu",14000);
             m.tampilngofood();
               break;
             case 14:
             ngofood n =new ngofood("JANJI JIWA - Kopi Pandan",15000);
             n.tampilngofood();
               break;
              case 15:
             ngofood o =new ngofood("JANJI JIWA - Kopi Soklat",16000);
             o.tampilngofood();
               break;
             case 16:
             ngofood p =new ngofood("CHATIME - Hazelnut Milk Tea",24000);
             p.tampilngofood();
               break;
             case 17:
             ngofood q =new ngofood("CHATIME - Matcha Red Bean Pearl Milk Tea",26000);
             q.tampilngofood();
               break;
              case 18:
             ngofood r =new ngofood("CHATIME - Vanilla Milk Tea",28000);
             r.tampilngofood();
               break;
              }
            break;
            case 3:
            System.out.println("Anda memilih menu ngoride silahkan pilih");
            System.out.println("1.Barang Kain");
            System.out.println("2.Barang Plastik");
            System.out.println("3.Barang Kaca");
            System.out.println("4.Barang Kayu");
            System.out.println("5.Barang Besi");
            System.out.println("6.Barang Elektronik");
            System.out.print("Masukkan pilihan : ");
        int pilih3=input.nextInt();
            switch(pilih3){
            case 1:
             ngosend a =new ngosend("Barang Kain",5.5,1.28);
             a.tampilngosend();
               break;
             case 2:
             ngosend b =new ngosend("Barang Plastik",5.5,2);
             b.tampilngosend();
               break;
              case 3:
             ngosend c =new ngosend("Barang Kaca",5.5,3.5);
             c.tampilngosend();
               break;
            case 4:
             ngosend d =new ngosend("Barang Kayu",5.5,4);
             d.tampilngosend();
               break;
             case 5:
             ngosend e =new ngosend("Barang Besi",5.5,6);
             e.tampilngosend();
               break;
              case 6:
             ngosend f =new ngosend("Barang Elektronik",5.5,8);
             f.tampilngosend();
               break;
              }
        }
       } else {
            System.out.println("login anda salah");
        }
    }    
}
