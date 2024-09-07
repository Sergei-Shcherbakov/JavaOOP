package seminar.sem4.GbList;

public class Main {
    public static void main(String[] args) {
//        GbList<String> list = new GbArrayList<>();
//        System.out.println(list.isEmpty());
//        list.add("A").add("B").add("C").add("D");
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);
//        System.out.println(list.get(0));
//        System.out.println(list.size());
//        System.out.println(list.isEmpty());

        GbList<Integer> gbList = new GbArrayList<>();
        gbList.add(1).add(2).add(3).add(4);
        System.out.println(gbList);
    }
}
