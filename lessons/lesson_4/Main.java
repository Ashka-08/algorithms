package lessons.lesson_4;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        
        RedBlackTree tree = new RedBlackTree();
        System.out.println(tree.toString());
        tree.add(5);
        System.out.println(tree.toString());
        tree.add(3);
        System.out.println(tree.toString());
        tree.add(7);
        System.out.println(tree.toString());
        tree.add(1);
        System.out.println(tree.toString());
        tree.add(9);
        System.out.println(tree.toString());

        // final RedBlackTree tree = new RedBlackTree();
        // try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
        //     while (true) {
        //         try {
        //             int value = Integer.parseInt(reader.readLine());
        //             tree.add(value);
        //             System.out.println("finish");
        //         } catch (Exception ignored) {
                    
        //         }
        //     }
        // } catch (IOException e) {
        //     throw new RuntimeException(e);
        // }
    }
}
