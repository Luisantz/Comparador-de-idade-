
void main() {
    var scanner = new Scanner(System.in);

    //Solicita o nome e a idade da primeira pessoa:
    System.out.println("Digite aqui o nome da primeira pessoa:");
    var name1 = scanner.nextLine();
    System.out.println("Digite aqui o idade da primeira pessoa:");
    var idade1 = scanner.nextInt();

    //Limpa o buffer
    scanner.nextLine();

    //Solicita o nome e a idade da segunda pessoa:
    System.out.println("Digite aqui o nome da segunda pessoa:");
    var name2 = scanner.nextLine();
    System.out.println("Digite aqui a idade da segunda pessoa:");
    var idade2 = scanner.nextInt();

    //Imprime a diferença de idade entre as duas pessoas:
    var diferenca = idade1 - idade2;
    System.out.printf("Essa é a diferença de idade entre %s e %s: %s ano(s) \n", name1, name2, diferenca);
}
