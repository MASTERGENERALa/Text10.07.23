package Text;

public class StringSplitExample {
    public static void main(String[] args) {
        String text = "Це науковий текст. Це друге речення. Це третє речення. І так далі."; // Науковий текст

        // Розбиття рядка на два підрядки рівної довжини
        int length = text.length();
        int splitIndex = length / 2;
        String firstHalf = text.substring(0, splitIndex);
        String secondHalf = text.substring(splitIndex);

        // Виведення кожного речення з нового рядка
        String[] sentences1 = firstHalf.split("\\.");
        String[] sentences2 = secondHalf.split("\\.");

        System.out.println("Речення з першого підрядка:");
        for (String sentence : sentences1) {
            System.out.println(sentence.trim());
        }

        System.out.println("\nРечення з другого підрядка:");
        for (String sentence : sentences2) {
            System.out.println(sentence.trim());
        }
    }
}

