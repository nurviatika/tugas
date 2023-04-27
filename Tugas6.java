
package tugas6;

import java.util.Scanner;

public class Tugas6 {
    static final int MAX_SIZE = 10;
    static String[] Playlist = new String[MAX_SIZE];
    static int top = -1;
  
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do{
            System.out.println("\nMenu Playlist :");
            System.out.println("1. Menampilkan Data Playlist :");
            System.out.println("2. Menambahkan Data Playlist :");
            System.out.println("3. Menghapus Data Playlist :");
            System.out.println("4. Menambah Data Playlist pada urutan tertentu :");
            System.out.println("5. Menghapus Data Playlist di urutan tertentu :");
            System.out.println("6. Menghapus semua Playlist :");
            System.out.println("0. Out :");
            System.out.println("-----------------------------------------------");
            
            System.out.println("Masukkan pilihan anda :");
            choice = scanner.nextInt();
            
             switch(choice){
                case 1:
                    displayPlaylist();
                    break;
                case 2:
                    System.out.print("Masukkan judul lagu baru :");
                    String title=scanner.next();
                    addSong(title);
                    break;
                case 3:
                    removeSong();
                    break;
                case 4:
                    addSongAt();
                    break;
                case 5:
                    removeAllSongs();
                    break;
                case 6:
                    removeAllSongs();
                    break;
                case 0:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("pilihan anda salah,silahkan coba lagi");   
            }
        }while(choice != 0);
        
        scanner.close();      
    }
    public static void displayPlaylist(){
        if((top == -1)){
            System.out.println("Playlist Kosong");
            }else{
            System.out.println("Playlist anda :");
            for(int i =top; i >= 0;i--){
                System.out.println((top-i+1)+"."+Playlist[i]);
                
            }
        }
    }
    
    public static void addSongAt(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Masukkan judul lagu :");
        String title = sc.nextLine();
        System.out.print("Masukkan urutan lagu (1-"+(top+1)+"):");
        int index = sc.nextInt() - 1;
        sc.nextLine();
        if(index < 0 || index > top+1){
            System.out.println("Urutan tidak benar!");
            return;
        }
        for(int i= top; i>=index;i--){
            Playlist[i+1]= Playlist[i];
        }
        Playlist[index]= title;
        top++;
        System.out.println("Lagu telah berhasil ditambahkan!"); 
    }
    
    public static void removeSongAt(){
        if(top == -1){
            System.out.println("Playlist Kosong!");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan urutan lagu yang akan anda hapus (1-"+(top+1)+"};");
        int index = sc.nextInt()-1;
        if(index < 0 || index > top){
            System.out.println("Urutan lagu tidak benar!");
            return;
        }
        for(int i = index; i <top; i++){
            Playlist[i]= Playlist[i+1];
        }
        top--;
        System.out.println("Lagu telah berhasil dihapus!");          
    }
    public static void removeAllSongs(){
        Playlist = new String[MAX_SIZE];
        top =-1;
        System.out.println("Semua lagu telah berhasil di hapus!");
    }  

    private static void addSong(String title) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void removeSong() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
