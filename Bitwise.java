class Bitwise {
  public static void main(String[] args) {
    int fs = 53;
    System.out.println("Флаг 1:" + ( ((fs&1)>0) ? "Вкл" : "выкл" ));
    System.out.println("Флаг 2:" + ( ((fs&2)>0) ? "Вкл" : "выкл" ));
    System.out.println("Флаг 3:" + ( ((fs&4)>0) ? "Вкл" : "выкл" ));
    System.out.println("Флаг 4:" + ( ((fs&8)>0) ? "Вкл" : "выкл" ));
    System.out.println("Флаг 5:" + ( ((fs&16)>0) ? "Вкл" : "выкл" ));
    System.out.println("Флаг 6:" + ( ((fs&32)>0) ? "Вкл" : "выкл" ));
    System.out.println("Флаг 7:" + ( ((fs&64)>0) ? "Вкл" : "выкл" ));
    System.out.println("Флаг 8:" + ( ((fs&128)>0) ? "Вкл" : "выкл" ));

  }

}
