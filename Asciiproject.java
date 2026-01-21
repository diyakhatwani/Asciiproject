
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Asciiproject
{
    String s[][]={
            {" XX  XXX   XX  XX   XXXX XXXX  XXX X  X XXXX XXXX X  X X    X  X X  X  XX  XXX   XX  XXX  XXXX XXXX X  X X  X X X  X   XX  X XXXX "},
            {"X  X X  X X    X X  X    X    X    X  X  XX     X X X  X    XXXX XX X X  X X  X X  X X  X X     XX  X  X X  X X X   X X X  X   X  "},
            {"XXXX XXX  X    X  X XXXX XXX  X XX XXXX  XX     X XX   X    X  X X XX X  X X X  X  X XXX  XXXX  XX  X  X X  X XXX    X    X   X   "},
            {"X  X X  X X    X X  X    X    X  X X  X  XX  X  X X X  X    X  X X XX X  X X    X XX X  X    X  XX  X  X X  X XXX   X X   X  X    "},
            {"X  X XXX   XX  XX   XXXX X     XXX X  X XXXX  XXX X  X XXXX X  X X  X  XX  X     XXX X  X XXXX  XX  XXXX  XX  X X  X   X  X  XXXX "}
        };
    String n[][]={
            {" XX   XX   XXX XXXX X  X XXXX XXXX XXX  XXXX XXXX "},
            {"X  X X X  X  X    X X  X X    X      X  X  X X  X "},
            {"X  X   X    X  XXXX XXXX XXXX XXXX XXXX XXXX XXXX "},
            {"X  X   X  X       X    X    X X  X   X  X  X    X "},
            {" XX  XXXX XXXX XXXX    X XXXX XXXX   X  XXXX XXXX "}
        };    
    String c[][]={
            {"  X     X  X    X             XXXXX   X                 "},
            {"XXXXX   X  X    X            X    X   X                 "},
            {"X      XXXXXX   X           X  XX X   X   X      XXXXX  "},
            {"XXXXX   X  X  XXXXX  XXXXXX X  X X    X                 "},
            {"    X   X  X    X           X  XXX    X   X      XXXXX  "},
            {"XXXXX  XXXXXX   X            X                          "},
            {"  X     X  X    X             XXXXX   X                 "}
    };

    void ShowAllString()
    {
    for(int i=0 ; i<5 ; i++){
        for( int j=0 ; j<s[i].length ; j++){
            System.out.print(s[i][j]);
            // System.out.print(n[i][j]);
                }
            System.out.println();
        }
        
    }
        void ShowOneCharacter()
        {
            Scanner sc=new Scanner(System.in);
           System.out.println("\tEnter a Character ");
        //    System.out.println("\t\t");
           String s1=sc.nextLine();
        //    String s1="g";
           char c[];
           int i,j;
           int p = Character.toUpperCase(s1.charAt(0))-64;
           int cnt=5*(p-1);
           for(i=0;i<5;i++){
            c = String.valueOf((s[i][0])).toCharArray();
            for(j=cnt;j<cnt+5;j++){
                System.out.print(c[j]);
            }
            System.out.println();
           }
        }
        void ShowWords()
        {
            Scanner sc=new Scanner(System.in);
           System.out.println("\tEnter a Word");
        //    System.out.println("\t\t" );
           String s1 =sc.nextLine();
        // String s1="Deepika";
        int i,j,p,cnt;
        char c[];
        for(i=0;i<5;i++){
            for(int k=0;k<s1.length();k++){
                p=Character.toUpperCase(s1.charAt(k))-64;
                cnt=5*(p-1);
                c = String.valueOf(s[i][0]).toCharArray();
            for(j=cnt;j<cnt+5;j++){
                System.out.print(c[j]);
                    }
                }
            System.out.println();
            }
        }
        void Stringinrange()
        {
           Scanner sc=new Scanner(System.in);
           System.out.println("\tEnter Range Between (A-F),(G-L),(M-R),(U-Z):");
        //    System.out.println("\t\t");
           String s1 =sc.nextLine();
            int i,j;
            char c[];
            // String s1="a-f";
            // String s2="h-r";
            for(i=0;i<5;i++){
                int start=Character.toUpperCase(s1.charAt(0))-64;
                int end=Character.toUpperCase(s1.charAt(2))-64;
                c=String.valueOf(s[i][0]).toCharArray();
                for(j=(5*(start-1));j<(5*(end-1)+5);j++){
                    System.out.print(c[j]);
                }
                System.out.println();
            }   
        }
        void Number()
        {
                Scanner sc= new Scanner(System.in);
                System.out.print("\tEnter a number (0-9):");
                int num =sc.nextInt();
                int width = 5; 
                int start = num * width;  
                int end = start + width;  

                for (int i = 0; i < 5; i++) {
                    System.out.println(n[i][0].substring(start, end));
                        }
                    
        }
    void Symbol()
    {
            Scanner sc = new Scanner(System.in);
            System.out.print("\tEnter a Symbol: ");
            char Symbol = sc.next().charAt(0);
            int width = 7;
            int index =0;
            if(Symbol == '$'){
                index=0;
            }
            else if(Symbol == '#'){
                index=1;
            }
            else if(Symbol == '+'){
                index=2;
            }
            else if(Symbol == '-'){
                index=3;
            }
            else if(Symbol == '@'){
                index=4;
            }
            else if(Symbol == '!'){
                index=5;
            }
            else if(Symbol == ':'){
                index=6;
            }
            else if(Symbol == '='){
                index=7;
            }
    
        
            int start = index * width;
            int end = start + width;
            for (int i = 0; i < 7; i++) {
                System.out.println(c[i][0].substring(start, end));
            }
    }

        public static void main(String[] args) {
          showAscii(); 
     }
        static void showAscii()
        {
        System.out.println("\n\t\t--- Ascii-Project ---\n");
        System.out.println("1.Show All String\n\n2.Show One Character\n");
        System.out.println("3.Show One Word\n\n4.String in range\n");
        System.out.println("5.Show Number\n\n6.Show Symbol\n");
        String s = JOptionPane.showInputDialog("Enter a Number b/w(1-6):\n");
        System.out.println(s);
        //Asciipro p = new Asciipro ();
        Asciiproject p = new Asciiproject();

        if (s == null) {
            JOptionPane.showMessageDialog(null, "Cancelled by user.");
            return;
        }

       if(s.equals("1")) {
            p.ShowAllString();
        }
        else if(s.equals("2")){
            p.ShowOneCharacter();
        }
        else if(s.equals("3")){
            p.ShowWords();
        }
        else if(s.equals("4")){
            p.Stringinrange();
        }
        else if(s.equals("5")){
            p.Number();
        }
        else if(s.equals("6")){
            p.Symbol();
        }
         else {
            JOptionPane.showMessageDialog(null, "Enter a number between 1 to 6.");
        }
        int repeat = JOptionPane.showConfirmDialog(null, "Do you want to continue?","Continue", JOptionPane.YES_NO_OPTION);
        if (repeat == JOptionPane.YES_OPTION) {
            main(null);
        } else {
            JOptionPane.showMessageDialog(null, "Program end.");
        }
    }
}