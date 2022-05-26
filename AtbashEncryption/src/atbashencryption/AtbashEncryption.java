package atbashencryption;
import java.util.Scanner;
public class AtbashEncryption {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        String  str;
        System.out.println("Enter your message:");
        str = input.nextLine();
        char [] ch = str.toCharArray();
        System.out.println("The atbash code of this message is");
        for (x = 0; x < ch.length;x++){
            if(!((ch[x]>=0 && ch[x]<65)||(ch[x]>90&&ch[x]<97)||(ch[x]>122&&ch[x]<=127))){
                if(ch[x]>='A'&&ch[x]<='Z'){
                    System.out.print((char)'Z'+'A'-ch[x]);
                }
                if(ch[x]>='a'&&ch[x]<='z'){
                    System.out.print((char)('z'+'a'-ch[x]));
                }
            }
            if(((ch[x]>=0 && ch[x]<65)||(ch[x]>90&&ch[x]<97)||(ch[x]>122&&ch[x]<=127))){
                System.out.print((char)ch[x]);
            }
        }
        System.out.println();
    }
    
}
