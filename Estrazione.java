import java.util.Random;

class Estrazione extends Thread{
  Estrazione(){  
    Random r=new Random();
    System.out.println(r.nextInt(90)+1);
  }
}
