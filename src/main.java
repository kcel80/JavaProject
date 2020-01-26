import java.util.Scanner;

public class main {
	
public static void main (String[]args) {
System.out.println("********************************");
Scanner scanner = new Scanner(System.in);
  String islemler = "1.Toplama Islemi\n"
		              +"Cikarma Islemi\n"
		              +"Carpma Islemi\n"
		              +"Bolme Islemi";
   System.out.println(islemler);
   System.out.println("********************************");
   System.out.println("Islemi Seciniz");
   String islem =scanner.nextLine();
   int a;
   int b;
   switch(islem) {
   case "1":
   System.out.print("Birinci Sayi");
   a = scanner.nextInt();
   System.out.print("Ikinci Sayi");
   b = scanner.nextInt();
   System.out.println("Toplam : "+ (a+b));
   break;
   case "2":
	   System.out.print("Birinci Sayi");
	    a = scanner.nextInt();
	   System.out.print("Ikinci Sayi");
	    b = scanner.nextInt();
	   System.out.println("Cikarma : "+ (a-b));
	   break;
   case "3":
	   System.out.print("Birinci Sayi");
	   a = scanner.nextInt();
	   System.out.print("Ikinci Sayi");
	   b = scanner.nextInt();
	   System.out.println("Carpim : "+ (a*b));
	   break;
   case "4":
		   System.out.print("Birinci Sayi");
		    a = scanner.nextInt();
		   System.out.print("Ikinci Sayi");
		    b = scanner.nextInt();
		   System.out.println("Bolme : " + ((double)a/b));
		   break;
		default:
	    System.out.println("Gecersiz ISlem");
   }
   
		   
		         
		   
   
   
   

    
    
    
   

	
}





	
 
 
}

