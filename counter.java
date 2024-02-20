public class Main {
    public static void main(String[] args) {
        try (counter = new counter()) {

            boolean завести_новое_животное = true; 
            if (завести_новое_животное) {
                counter.add();
            }
        } catch (ResourceNotClosedException e) {
            e.printStackTrace();
        }
    }
}
