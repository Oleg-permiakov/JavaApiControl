import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MainNote {
    public static void main(String[] args, int j) {
        Notebook note1 = new Notebook("Sanny", "PLM82", "Желтый", 142520);
        Notebook note2 = new Notebook("Sanny", "HP20", "Черный", 100500);
        Notebook note3 = new Notebook("Assia", "PD345", "Черный", 115851);
        Notebook note4 = new Notebook("Lener", "BD6", "Серебристый", 180256);
        Notebook note5 = new Notebook("Sanny", "PLM82", "Желтый", 142520);
        Map<Integer, Notebook> note = new HashMap<>();
        note.put(1, note1);
        note.put(2, note2);
        note.put(3, note3);
        note.put(4, note4);
        note.put(5, note5);
    
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - Названия фирм");
        System.out.println("2 - Модели");
        System.out.println("3 - Цвета");
        System.out.println("4 - Цена");
        
        
        Scanner scan = new Scanner(System.in);
        String inp = scan.nextLine();
        scan.close();
        String firm = "1";
        String model = "2";
        String color = "3";
        String prise = "4";
        
        if (inp.equals(firm)) {
        Set<String> filterFirm = new TreeSet<>();
        for (int i = 0; i < note.size(); i++) {
            String str = String.format("%s", note.get(i));
            String[] arr = str.split(",");
            filterFirm.add(arr[1]);
        }
        System.out.println(filterFirm);
        }
        if (inp.equals(model)) {
        Set<String> filterModel = new TreeSet<>();
        for (int i = 0; i < note.size(); i++) {
            String str = String.format("%s", note.get(i));
            String[] arr = str.split(",");
            filterModel.add(arr[3]);
        }
        System.out.println(filterModel);
        }
        if (inp.equals(color)) {
        Set<String> filterColor = new TreeSet<>();
        for (int i = 0; i < note.size(); i++) {
            String str = String.format("%s", note.get(i));
            String[] arr = str.split(",");
            filterColor.add(arr[5]);
        }
        System.out.println(filterColor);
        }
        if (inp.equals(prise)) {
        Set<Integer> filterPrise = new TreeSet<>();
        for (int i = 0; i < note.size(); i++) {
            String str = String.format("%s", note.get(i));
            String[] arr = str.split(",");
            int pr = Integer.parseInt(arr[7]);
            filterPrise.add(pr);
        }
        System.out.println(filterPrise);
        }
        
    }
        
}
