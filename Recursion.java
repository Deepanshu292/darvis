public class Recursion{
    if(n==1){
        System.out.println("Move disk 1 from " + src + " to " + dest);
        return;
    }
    // Move n-1 disks from source to helper
    public static void towerfhanoi(int n,String src ,String helper , Stringdest){
        towerofhanoi(n-1 ,src ,dest,helper);
        
        System.out.println("Move disk " + n + " from " + src + " to " + dest);
        towerofhanoi(n-1 ,helper ,src,dest);
        

    }
    public static void main(String args[]){
        int n=1;
        towerofhanoi(n,"S", "H", "D");
    }
}