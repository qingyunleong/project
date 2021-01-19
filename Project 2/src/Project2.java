import java.util.Scanner;
public class Project2 {

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in); 
		System.out.println("Here is the type of list of our auto vehicles ");
		System.out.println("1. Motorcycle" +"\n" + "2. Aircraft" + "\n" + "3. Cars" + "\n"+ "4. Boat" + "\n" + "5. Train");
		System.out.println (" ");
		
		System.out.print("Please select the number :");
		int type = in.nextInt();
		System.out.println (" ");
		
		if(type == 1) {

			printdetail();
			printsale();
			printpurchase();
			printservice();
		}
		
		if(type == 2) {
			
			printairline();
			printReminder();
		}

		if (type ==3 ) {
			
			printDetails();
			printCar();
			printDiscountCar();
			printFreegift();
			
		}
		    
		if (type == 4) {

			int[] price = {1000,900,62000,60000};
			
			PrintBoat();
			PrintBoatList();
			Print (price);
			PrintBuy();
			
		}
		    
		if(type == 5) {
			
			printCustomer();
			printTicket();
			
		}	
	}

	
	//motorcycle
		public static void printdetail () {
			Scanner input = new Scanner(System.in);
			System.out.println("Details of Customer");

			System.out.print("Enter your name: ");
			String name = input.nextLine();
			System.out.println("Name : " + name);

			System.out.print("Enter your IC: ");
			String ic = input.nextLine();
			System.out.println("IC number : " + ic);

			System.out.print("Enter your gender: ");
			String str = input.next();
			char gender = str.charAt(0);
			System.out.println("Gender : " + gender);

			System.out.print("Enter your age: ");
			int age = input.nextInt();
			System.out.println("Age : " + age);
		}

		public static void printsale () {
			System.out.println();
			System.out.println("Welcome to Leong's shop! We have the following items for sale:");
			System.out.println("Types of Motorcycle");
		
			int price1[] = {3377,4227,5200,3978};
			change (price1);
		}
		
			public static void change (int []x) {
				int[]price1 = new int [4];
				price1 [0] = 3377;
				price1 [1] = 4227;
				price1 [2] = 5200;
				price1 [3] = 3978;

				System.out.println("1. Modenas KRISS 110 : RM" +  price1 [0] );
				System.out.println("2. CMC ARIO 110 : RM" + price1 [1]);
				System.out.println("3. Demak MV 135 : RM" + price1 [2] );
				System.out.println("4. SM Sport 110R : RM" + price1 [3] );
		}
	
		public static void printpurchase () {
			Scanner input = new Scanner(System.in);
			int items, number_of_purchased, quantity;
			double price, amount;
			double total = 0;

			System.out.println();
			System.out.print("Enter a number of motorcycle will be purchased : ");
			number_of_purchased = input.nextInt();
			System.out.println();

			for (items=1; items<=number_of_purchased; items++)
			{
				System.out.println("Types of motorcycle : NO" + items);

				System.out.print("Enter quantity = ");
				quantity = input.nextInt();

				System.out.print("Enter price = RM");
				price = input.nextDouble();

				amount = quantity * price;
				System.out.printf("The amount is RM %.2f%n ", amount);
				System.out.println();

				total += amount;
			}

			double discount, net;
			System.out.printf("The total price of those motorcycle is RM %.2f%n", total);

			if (total > 4501)    
				discount = total * 0.08;

			else if (total >= 4001 && total <= 4500)
				discount = total * 0.07;        

			else if (total >= 3501 && total <= 4000)
				discount = total * 0.06;

			else if (total >= 3000 && total <= 3500)
				discount = total * 0.05;

			else
				discount = 0;
		
			System.out.println();
			System.out.println("WOW! Today is our 1st anniversary of our shop! Now we have some discount for you!!" );
			System.out.printf("Discount = RM %.2f%n", discount );
			net = total - discount;
			System.out.printf("The net total price = RM %.2f%n", net);

			System.out.println();
			System.out.println("THANK YOU! PLEASE COME AGAIN!");
			System.out.println();
		}
		
		public static void printservice () {
			Scanner input = new Scanner(System.in);
			
			int z=1;
			while(z<=64) {
				System.out.print("*");
				z++;
			}
			System.out.println();
			
			System.out.println("If you have any problem, can just contact our customer service." );
			
			String[][] name = {{"Mr. ","Miss "},
								{"Zeth","Winni","Kathy"}};
			
			System.out.println(name[0][0] + ""+name[1][0] + "\t011-7103588");
			System.out.println(name[0][1] + ""+name[1][1] + "\t019-6508853");
			System.out.println(name[0][1] + ""+name[1][2] + "\t012-2603385");
		}
		
	//aircraft
		public static void printairline() {
			Scanner sc = new Scanner (System.in);
			
			System.out.println ("Hye! Welcome and thank you for choosing Malaysia Airlines and we look forward to welcoming you on board.");
			System.out.println ("Thank you again for choosing us for your journey PENANG - KOTA KINABALU.");
			System.out.println("We're having promotion for year-end sale.");
			System.out.println ("May I have your name and email address please.");
			System.out.println (" ");
			
			//Choosing avail seat
			int[] SeatNo = new int[30];
			int Seats;
			int YesOrNo = 1;

			while (YesOrNo == 1) {
				System.out.print("Name: ");
				String name = sc.next();
			
				System.out.print("Email address: ");
				String email = sc.next();

				System.out.println("\nWelcome! Please have a look at the available seat.\n\n");

			for (int i = 1; i <= 34; i++) {
				System.out.print("*");
			}
			System.out.println();

			System.out.print("      MH157 SEATING PLAN");
			System.out.println();

			for (int j = 1; j <= 34; j++) {
				System.out.print("*");
			}
			System.out.println();

			for (int Seat = 0; Seat < SeatNo.length; Seat++) {
				System.out.printf(Seat + "\t");

				if (Seat == 4) {
					System.out.println();
				} else if (Seat == 9) {
					System.out.println();
				} else if (Seat == 14) {
					System.out.println();
				} else if (Seat == 19) {
					System.out.println();
				} else if (Seat == 24) {
					System.out.println();
				} else if (Seat == 29) {
					System.out.println();
				}
			}

			for (int k = 1; k <= 34; k++) {
				System.out.print("*");
			}
			System.out.println();

			System.out.println();
			System.out.println("Which seat would you like to book? ");
			Seats = sc.nextInt();

			while (Seats < 0 || Seats > 29) {
				System.out.println("Only 0 - 29 seats are allowed to book. Please try again: ");
				Seats = sc.nextInt();
			}

			for (int SeatCounter = 0; SeatCounter < SeatNo.length; SeatCounter++) {
				if (SeatCounter == Seats) {
					System.out.println();
					System.out.println("Seat " + Seats + " is successfully booked.");
					System.out.println("Thanks for booking!\n\nWould you like to make next booking? (Type 1 = Yes; Type 2 = No)");
					YesOrNo = sc.nextInt();

					if (YesOrNo == 2) {
					System.out.println("Please go to next section.");
					}
				}
			}

			while (YesOrNo != 1 && YesOrNo != 2) {
				System.out.println("Invalid input.");
				System.out.println("Type 1 = Continue booking; Type 2 = Done booking");
				YesOrNo = sc.nextInt();

				if (YesOrNo == 2) {
					System.out.println("Please go to next section.");
				}
			}
			System.out.println(" ");
					
			int t=1;
			do {
				if (t>0)
					System.out.print("*");
				t++;
			} while(t<45);
					
			//Discount for flight ticket
			System.out.println("\nThere would be some discounts when you choose our seating classes. ");
			System.out.println("\nWould you like to have some discounts? (Type Y = yes ; Type N = no)");
			char ans = sc.next().charAt(0);
			
			int class1=0, class2=0, class3=0;
			double total = 0, price1=0, price2=0, price3=0;
					
			if(ans == 'Y' || ans == 'y') {
				System.out.println("How much you choose seating in First Class?");
				class1 = sc.nextInt();
				price1 = class1 * 2300;
				System.out.println("How much you choose seating in Bussiness Class?");
				class2 = sc.nextInt();
				price2 = class2 * 1700;
				System.out.println("How much you choose seating in Ecnomy Class?");
				class3 = sc.nextInt();
				price3 = class3 * 1000;
				total = price1 + price2 + price3;
			}
					
			else if(ans == 'N' || ans == 'n') {
				System.out.println("\nThank you for choosing Malaysia Airlines!");
			}
			      
			double  disc = 0, dprice = 0;
			
			if ( total >= 200 ) {
				disc = total*30/100;
				dprice = total - disc;
			}	
			else if ( total > 100 || total < 200 ) {
				disc = total*20/100;
				dprice = total - disc;
			}
			else {
				disc = total*10/100;
				dprice = total - disc;
			}

			System.out.println();
			System.out.println("\nName:\t"+ name);
			System.out.println("Email address:\t"+ email);
			System.out.println("\nThe total price:\t"+ total);
			System.out.println("Your total discount:\t"+ disc);		
			System.out.println("Your price to be paid:\t"+ dprice);	
			System.out.println("\nThank you for choosing Malaysia Airlines!");

			sc.close();

			//Assist inquiries
			String [][] assist = {{"Mr.", "Mrs.", "Ms."},
									{"Ady", "Reena", "Zihan"}};
			      
			System.out.println();
			System.out.println("For any inquiries please do not hesitate.");
			System.out.println(assist[0][0] + " " + assist[1][0] + " will be glad to assist you. ");
			System.out.println("Here are the contact,");
			System.out.println("Phone no: 03-4210861");
			System.out.println("Email address: muhamadazri@mas.my.com");

			}
		}			
	
		public static void printReminder() {
			
			String[] reminder = {"WEAR MASK", "ALWAYS SANTISIZE", "PRACTISE PHYSICAL DISTANCING", "STAY SAFE"};

			int a = 0;
			while(a < 1) {
				System.out.println("REMINDER: " + reminder[1] + "," + " " + reminder[2] + "," + " " + reminder[3]);
				System.out.println();
				a++;	   
			}
		}
		
	//cars
		public static void printDetails() {
			Scanner input = new Scanner (System.in);
			System.out.println("Details of Customer");
			System.out.println();

			System.out.print("Enter Your Name       : ");
			String name = input.next();
			System.out.println("Name                  : " + name );

			System.out.print("Enter Your I/C Number : ");
			String ic = input.next();
			System.out.println("IC Number             : " + ic);
			
			System.out.print("Enter Your No. Phone  : ");
			int phone = input.nextInt();
			System.out.println("No. Phone             : " + phone);
			
			//do while loop	
			int k = 0;
			do {
				System.out.print("Enter Your Age        : ");
				int age = input.nextInt();
				System.out.println("Age                   : " + age);
				k++;
			}while (k < 1);
			
			
			int b = 0;
			do {
				System.out.print("Enter Your Gender     : ");
				String gender = input.next();
				System.out.println("Gender                : " + gender);
				b++;	
			}while (b < 1);
		}
			
		public static void printCar() {
			Scanner input = new Scanner (System.in);
			
			System.out.println();
			System.out.println("Welcome to Perodua! Start Your New Year With New Car!");
			System.out.println("We Have Myvi Special Price for You Guys!");
			System.out.println("Types of Myvi : ");
			System.out.println();

			int[] price = {52697, 50530, 46959, 44959, 43029, 41292};
			change1 (price);
			}
			
				public static void change1 (int[] a) {
					int[] price = new int [6];
					price[0] = 52697;
					price[1] = 50530;
					price[2] = 46959;
					price[3] = 44959;
					price[4] = 43029;
					price[5] = 41292;
			
					System.out.println("i.   Myvi 1.5L AV WITH A.S.A 2.0  : RM " +  price[0]);
					System.out.println("ii.  Myvi 1.5L H  WITH A.S.A 2.0  : RM " +  price[1]);
					System.out.println("iii. Myvi 1.3L X  WITH A.S.A 2.0  : RM " +  price[2]);
					System.out.println("iv.  Myvi 1.3L X  W/OUT A.S.A 2.0 : RM " +  price[3]);
					System.out.println("v.   Myvi 1.3L G                  : RM " +  price[4]);
					System.out.println("vi.  Myvi 1.3L G  MANUAL          : RM " +  price[5]);
			
			}
			
		public static void printDiscountCar() {
			Scanner input = new Scanner (System.in);
			 
			int price, deposit1, quantity;
			double amount, discount, totalprice;
			
			System.out.println();
			System.out.print("Number of Type of Myvi : ");
			int num = input.nextInt();
			System.out.println("Type of Myvi           : " + num);
			
			System.out.print("Enter Quantity         : ");
			quantity = input.nextInt();
			
			System.out.print("Enter Price         RM : ");
			price = input.nextInt();
			
			amount = quantity * price;
			System.out.println("Price               RM : " + amount);
			System.out.println();
			
			System.out.print("Enter Deposit   RM : ");
			deposit1 = input.nextInt();

			double total;
			total = deposit1;
			
			if(deposit1 >= 4000 && deposit1 <= 6000) {
				discount = deposit1 * 0.1;
				
			} else if(deposit1 >= 6001 && deposit1 <= 8000) {
				discount = deposit1 * 0.15;
				
			} else if(deposit1 >= 8001 && deposit1 <= 10000) {
				discount = deposit1 * 0.2;
				
			} else if(deposit1 >= 10001 && deposit1 <= 12000) {
				discount = deposit1 * 0.25;
				
			} else
				discount = 0;

			System.out.println("Discount        RM : " +  discount);
			totalprice = price - discount;
			System.out.println("The Total Price RM : " + totalprice);
			
		}

		//while loop
		public static void printFreegift() {
			Scanner input = new Scanner (System.in);
			System.out.println();
			
			String[] freegift = {"Keychain", "Books", "Pen", "Umbrella"};
			
			int a = 0;
			while(a < 1) {
				System.out.println("Your Freegift is   : " + freegift[3] + " " + "&" + " " + freegift[0]);
				a++;	  
			}
			
			System.out.println();
			System.out.println("Thank You for Choosing Perodua to Be A Part of Your Life!!");
		}
	
	//boat
		public static void PrintBoat() {
			Scanner in = new Scanner (System.in);
			
			System.out.println("~ Welcome to Natelie's Boat Shop ~");
			System.out.print("Please enter your name: ");
			String name = in.next();
			
			System.out.print("Please enter your IC number: ");
			String ic = in.next();
			
			System.out.print("Please enter your phone number: ");
			String hp = in.next();
			
			System.out.println();
		}
		
		public static void PrintBoatList() {
			System.out.println("Here's our list for out brand and type of boat:");
			
			String[][] menu = { {"1.MasterCraft", "2.Bayliner","3.MasterCraft", "4.Bayliner" },
								{"Canoe","Canoe","Sailboat","Sailboat"}
								};
			
			System.out.println(menu[0][0] + " " +menu[1][0]);
			System.out.println(menu[0][1] + " " +menu[1][1]);
			System.out.println(menu[0][2] + " " +menu[1][2]);
			System.out.println(menu[0][3] + " " +menu[1][3]);
			
			System.out.println();
		}
		
		public static void Print(int x[]) {
			System.out.println("The pricelist for our products (followed the arrangement, 1stline = MasterCraft Canoe etc):");
			
			for(int counter=0;counter<x.length;counter++) {
				System.out.println("-RM"+ x[counter]);
			}
		}
		
		public static void PrintBuy() {
			Scanner in = new Scanner (System.in);
			System.out.print("Please enter the number to purchase (1 = MasterCraft Canoe etc): ");
			int number = in.nextInt();
			System.out.print("Please enter the amount you want to purchase (maximum 2): ");
			int amount = in.nextInt();
			
			System.out.println();
			
			int number2=0;
			do {
				number2++;
			} while (number2<=4);

			number2=number;
			System.out.println("Your number is " +number2);
			
			int amount2=0;
			while(amount2<=2) {
				amount2++;
			}
			amount2=amount;
			System.out.println("Your amount is " + amount2);
			System.out.println();
			
		
			int totalprice =0;
			if (number == 1 && amount == 1) {
				totalprice = 1000;
				System.out.println("Confirmation: Your purchase is 1 MasterCraft Canoe" +"\n" + "Totalprice is RM1000");
			} else if (number == 1 && amount == 2) {
				totalprice = 2000;
				System.out.println("Confirmation: Your purchase is 2 MasterCraft Canoe" +"\n" + "Totalprice is RM2000");
			} else if (number == 2 && amount == 1) {
				totalprice = 900;
				System.out.println("Confirmation: Your purchase is 1 Bayliner Canoe" +"\n" + "Totalprice is RM900");
			} else if (number == 2 && amount == 2){
				totalprice = 1800;
				System.out.println("Confirmation: Your purchase is 2 Bayliner Canoe" +"\n" + "Totalprice is RM1800");
			} else if (number == 3 && amount == 1){
				totalprice = 62000;
				System.out.println("Confirmation: Your purchase is 1 MasterCraft Sailboat" +"\n" + "Totalprice is RM62000");
			} else if (number == 3 && amount == 2) {
				totalprice = 124000;
				System.out.println("Confirmation: Your purchase is 2 MasterCraft Sailboat" +"\n" + "Totalprice is RM124000");
			} else if (number == 4 && amount == 1) {
				totalprice = 60000;
				System.out.println("Confirmation: Your purchase is 1 Bayliner Sailboat" +"\n" + "Totalprice is RM60000");
			} else if (number == 4 && amount == 2) {
				totalprice = 120000;
				System.out.println("Confirmation: Your purchase is 2 Bayliner Sailboat" +"\n" + "Totalprice is RM120000");
			} else {
				System.out.println("Not valid, Please enter another correct number or amount");
			}
				
			System.out.println();
			
			System.out.println("Here's a good news for you! Due to our YEAR-END PROMOTION, You will be entitiled for 20% off for your purchase!");
			int discount = (totalprice*20)/100;
			int pricetobepaid = totalprice - discount;
			
			System.out.println("Total price: RM" +totalprice );
			System.out.println("Discount received: RM" +discount);
			System.out.println("Price to be paid: RM" +pricetobepaid);
			System.out.println("To express my greatest gratitude, I would like to say");
			for(int tq=1; tq<=3;tq++) {
				System.out.println("Thank you so much!");
			}
			System.out.println("Hope to see you soon again! Have a nice day :)");
			
		}
		
	//train
		public static void printCustomer() {

			System.out.println("**********WELCOME TO OUR TRAIN STATION**********");
			System.out.println();
			Scanner in = new Scanner (System.in);

			System.out.print("Enter Name: ");
			String name = in.nextLine();
			System.out.println("Name: " + name);
			System.out.println();
			System.out.print("Enter Work: ");
			String work = in.nextLine();
			System.out.println("Work: " + work);
			System.out.println();
			System.out.print("Enter Age: ");
			int age = in.nextInt();
			System.out.println("Age: " + age);
			System.out.println();

			System.out.print("How many person with you?" );
			int person = in.nextInt();
			for (int i=0; i<=person; i++); {
				System.out.print("Enter Your Partner Name: ");
				String name2 = in.next();
			}

			System.out.print("Enter salary: ");
			int salary = in.nextInt();
			System.out.println("Salary: " + salary);
			System.out.println();

			System.out.println("Enter customer background: " + name + "\n\t\t " + age + "\n\t\t " + work + "\n\t\t " + salary);
			System.out.println();
		}

		public static void printTicket() {
			Scanner in = new Scanner (System.in);
			
			String[] routes = {"Batu Cave to Pulau Sebang", "Tanjung Malim to Pelabuhan Klang", "Padang Rengas to Bukit Mertajam", "Butterworth to Padang Besar", "Pulau Sebang to Batu Cave", "Pelabuhan Klang to Tanjung Malim", "Bukit Mertajam to Padang Rengas", "Padang Besar to Butterworth"};
			System.out.println("These are the routes that our station provided: ");

			for (int i = 0; i < routes.length; i++) {
				System.out.println(routes[i]);
				System.out.println();	
				}

			int[] fee = new int[8];
			fee[0] = 35;
			fee[1] = 30;
			fee[2] = 32;
			fee[3] = 40;
			fee[4] = 33;
			fee[5] = 31;
			fee[6] = 34;
			fee[7] = 38;

			System.out.println("These are the list of fee base on the route: ");

			for (int j = 0; j < fee.length; j++) {
				System.out.println(fee[j]);
				}
			
			int i1 = 35;
			int i2 = 30;
			int i3 = 32;
			int i4 = 40;
			int i5 = 33;
			int i6 = 31;
			int i7 = 34;
			int i8 = 38;

			if (i1 < i4) {
				System.out.println("Route4 cheaper");
			}
			if (i1 > i4) {
				System.out.println("Route1 more pricey");
			}
			if (i2 > i6) {
				System.out.println("Route2 more pricey");
			}
			if (i2 < i6) {
				System.out.println("Route2 cheaper");
			}
			if (i3 >= i7) {
				System.out.println("Route3 much pricey");
			}
			if (i3 <= i7) {
				System.out.println("Route3 much cheaper");
			}
			if (i4 <= i8) {
				System.out.println("Route4 much cheaper");
			}
			if (i4 >= i8) {
				System.out.println("Route4 much pricey");
			}

			System.out.print("What route path that you want to go: " + routes[0]);
			System.out.println();
			System.out.print("Fee that customer need to pay: " + fee[0]);
			System.out.println();

			System.out.println("**********THANK YOU FOR YOUR PURCHASE**********");
	}
}
