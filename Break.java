class Break {
  public static void main(String[] args) {
    for (int i=1; i<=4; i++) {
      System.out.println("\n");
      for (int j=1; j<=4; j++) {
        System.out.println("Итерация i=" +i+" j="+j);
        if (i==2 && j==1) {
          System.out.println("Выход из внутреннего цикла i=" +i+" j="+j);
          break;
        }
      }
    }


  }
}
