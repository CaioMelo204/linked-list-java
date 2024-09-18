//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.traverse();
        list.unshift(0);
        list.unshift(-1);
        list.unshift(-2);
        list.unshift(-3);
        list.unshift(-4);
        list.traverse();

        list.shift();
        list.traverse();
        list.pop();
        list.traverse();

        System.out.println("Exists in list 3 " + list.search(3));
        System.out.println("Exists in list 10 " + list.search(10));

        list.insert(10, 3);
        list.traverse();
        list.insert(20, 0);
        list.traverse();
        list.insert(30, list.length - 1);
        list.traverse();

        list.remove(list.length - 1);
        list.traverse();
        list.remove(0);
        list.traverse();
        list.remove(3);
        list.traverse();
    }
}