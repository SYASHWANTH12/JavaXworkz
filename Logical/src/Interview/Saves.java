package Interview;



public class Saves {

    String[] S = new String[10];

    int pos;
    String name;

    public boolean save(String name) {
        if (pos >= S.length) {
            System.out.println("The storage is full");
            return false;
        }

        for (int i = 0; i < pos; i++) {
            String ref = S[i];
            if (ref != null && ref.equals(name)) {
                System.out.println("It is already stored. Try with another name.");
                return false;
            }
        }

        System.out.println("It can store the value.");
        this.S[pos] = name;
        System.out.println(name + " " + pos);
        pos++;
        return true;
    }

    public String getName() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < pos; i++) {
            String F = S[i];
            result.append(F).append(" ");
        }
        return result.toString().trim();
    }

    public String findByName(String searchName) {
        for (int i = 0; i < pos; i++) {
            String temp = S[i];
            if (temp != null && temp.equals(searchName)) {
                System.out.println("It is found: " + temp + " at position " + i);
                return temp;
            }
        }
        System.out.println("It is not found.");
        return null;
    }

    public static void main(String[] args) {
        Saves D = new Saves();
        D.save("yashu");
        D.save("bindu");
        System.out.println("Names stored: " + D.getName());

        D.findByName("yashu");
        D.findByName("bindu");
        D.findByName("john"); // Testing with a name that does not exist in the storage.
    }
}
