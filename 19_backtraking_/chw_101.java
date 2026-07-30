/**
 * chw_101  example of recusion 
 */



public class chw_101 {

  public static void main(String[] args) {
    int row = 3;
    int clo = 3;
      int count = mazepath(1,1,row,clo);
      System.out.println(count);
  }
  private static int mazepath(int sr , int sc, int er,int ec){
if(sr>er || sc>ec)return 0;
if(sr==er && sc== ec) return 1;
int down = mazepath(sr+1, sc, er, ec);
int rig = mazepath(sr, sc+1, er, ec);
int totale = down +rig;
return totale;
  }
}