class If {
  public static void main(String[] args) {
    if (5>1) System.out.println("5 more than 1");
    if (2<4) {
      System.out.println("Два меньше четырех");
      System.out.println("Проверка выполнена успешно");
    }

    int num = 6;
    if (((num > 5) && (num < 10)) || (num == 12) ) {
      System.out.println("Число в диапазоне от 6 до 9 включительно или равно 12");
    }
  }

}
