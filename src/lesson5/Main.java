package lesson5;

public class Main {
    public static void main(String[] args) {
      int count =  StringUtils.countCharsFromText("jwgfudwkguhowiu",'w');
        System.out.println(count);

        String a = "Введите текста";
        int b = StringUtils.countCharsFromText(a,'f');

        System.out.println();
        StringUtils.printRevers("qwerty");
        StringUtils.printRevers("asdfgh");
        StringUtils.printRevers("uyuyuyuyu!!!");
    }
}
