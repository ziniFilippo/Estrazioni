class Main {
  public static void main(String[] args) {
    Estrazione bergamo = new Estrazione();
    Estrazione milano = new Estrazione();
    Estrazione torino = new Estrazione();

    bergamo.start();
    milano.start();
    torino.start();
  }
}
