import java.util.*; 
public class Main
{

    String UID;
    String password;
    String name;
    String AccNo;
    float balance= 0;
    int transactions= 0;
    String transactionsHistory=" ";

    public void register() // User Registration
    {
        Scanner in=new Scanner(System.in);
        
        System.out.println(" Enter User's Name:");
        this.name=in.nextLine();
        
        System.out.println ("Enter Account Number:");   
        this.AccNo=in.nextLine();
        
        System.out.println(" Enter your UID:");
        this.UID=in.nextLine(); 
        
        System.out.println(" Enter Password: ");
        this.password=in.nextLine();
        
        System.out.println();
        System.out.println(" Registration Successful");
    }

    public void login()  // User Logins with UID and Password
    {
        int flag=0;
        Scanner in= new Scanner(System.in);
        while(flag==0)

        {
            
            System.out.println(" Enter your UID: ");
            String UID= in.nextLine(); 
            
            if(UID.equals(UID))
            {
                System.out.println(" \n Enter password: ");
                String pass= in.nextLine(); 
                
                if(pass.equals(password))
                {
                    System.out.println(" \n Login Acces Granted ");
                    flag=1;
                } 
                else 
                System.out.println(" \n Incorrect Password, Try Again ");
            } 
            else 
            System.out.println(" \n UID not found ");
        
        }

    }

    public void deposit()  // Money Deposit Process

    { 
        Scanner in= new Scanner(System.in);
        System.out.println(" \n Enter  Deposit Amount is Rs. : "); 
        float amt= in.nextFloat();

        if(amt>0)
            {
                balance= balance+ amt;
                System.out.println(" \nAmount Successfully Deposited "); 
                transactions++;
                String tran= amt+" has been deposited \n ";
                transactionsHistory= transactionsHistory.concat(tran);
            } 
        
            else
            System.out.println(" Enter valid amount to be deposited \n ");
    } 

    public void withdraw() // Money Withdraw Process

    {

    Scanner in= new Scanner(System.in); 
    System.out.println(" \n Enter Withdrawal Amount :"); 
    float amt= in.nextFloat();
    if(balance>=amt) 
        { 
            balance= balance-amt;
            System.out.println(" \n withdrawal successful "); 
            transactions++;
            String tran= amt+ " has been withdrawn from your account \n "; 
            transactionsHistory= transactionsHistory.concat(tran);
        }
        
        else
        System.out.println(" \n Insufficient Balance ");
    }


    public void transfer() // Money Transfer Process
    
    { 
        Scanner in=new Scanner(System.in);
        System.out.println("\nEnter Receipent's Name: ");
        String rec=in.nextLine();
        System.out.println("\nEnter Amount to transfer: ");
        Float amt= in.nextFloat();
        
        if(amt<= balance)
        
        {
            balance= balance- amt;
            System.out.println("\n Successfully transfered "); 
            transactions++;
            String tran= amt+ " transfered to " +rec+ "\n"; 
            transactionsHistory= transactionsHistory.concat(tran);
            }
            else
            System.out.println("\n Insufficient Balance");
        }
        
        public void checkbalance() // Check ramaining balance Process
            {
                System.out.println("Your account balance is" +balance+ "\n");
            }
        
        public void transactionsHistory() // Check privious transation
            {
                System.out.println("\n" +transactionsHistory );
            }
        
        public static void main(String[] args) // main menu function
        {
            Scanner in= new Scanner(System.in);
            System.out.println("\n ATM System Prgrammed By Meghsham Kapure || mail.meghsham@gmail.com ");
            System.out.println("\n=====================================================================");
            System.out.println(" Enter: 1 to Register and 2 to Exit");
            System.out.println("\nEnter your preference");
            
            int input=in.nextInt();  
            
            if(input ==1)
            {
            Main ba = new Main(); 
            ba.register();
            System.out.println();
            System.out.println("Please enter you details to login: "); 
            ba.login();
            boolean exit=false; 
                    
                while(!exit)
                {
                    System.out.println("\n 1.Deposit \n 2.Withdrawal \n 3.Transfer \n 4.Check Balance \n 5.Check Transactions History \n 6.To Exit");
                    System.out.println("\n Enter your preference"); 
                    int x=in.nextInt();
                    switch(x)   
                    {
                        case 1: ba.deposit();
                        break;
                        case 2: ba.withdraw();
                        break; 
                        case 3: ba.transfer();
                        break;
                        case 4: ba.checkbalance(); 
                        break;
                        case 5: ba.transactionsHistory();
                        break;
                        case 6: exit= true; 
                        break;
                    }
                }
            }
        }
    }
1
