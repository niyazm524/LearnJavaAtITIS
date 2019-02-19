package ml.bimdev.lesson21.map;

class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new SimpleMap<>(10);
        map.put("Niyaz", 1);
        map.put("Kadyr", 4);
        System.out.println(map.get("Kadyr"));
    }
}
