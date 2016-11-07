class Args {
  public static void main(String[] args) {
    if (args.length !=3) {
      System.out.println("Неверное число аргументов");
      return;
    }
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);

    String msg = args[0] + args[1] + args[2] + "=";

    if (args[1].equals("+")) msg += (num1 + num2);
    else if (args[1].equals("-")) msg += (num1 - num2);
    else if (args[1].equals("*")) msg += (num1 * num2);
    else if (args[1].equals("/")) msg += (num1 / num2);
    else msg = "Неправильный оператор";

    System.out.println(msg);

  }

}
