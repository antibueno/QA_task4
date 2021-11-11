public class Fatcat {
    int weight;
    int age;
    String meow = "meow";
    String mood;

    public void feedMe() {
        System.out.println(meow);
        weight = weight + 100;
        System.out.println("OKAY! Your weight now is " + weight);
    }

    public void diet() {
        weight = weight - 100;
        mood = "Sad";
        System.out.println("Strong diet! Weight of cat becomes " + weight + ". Now my cat is " + mood);
    }

    public void petCat() {
        mood = "Happy";
        System.out.println("Now my cat is " + mood);
    }

    public void happyBirthday() {
        age = age + 1;
        System.out.println("Cat becomes older! Now he is " + age);
    }


    public static void main(String[] args) {
        Fatcat barsik = new Fatcat();
        Fatcat murzik = new Fatcat();
        barsik.age = 8;
        murzik.age = 10;
        barsik.weight = 7800;
        murzik.weight = 9100;

        barsik.feedMe();
        barsik.happyBirthday();
        barsik.diet();
        barsik.petCat();

        murzik.feedMe();
        murzik.happyBirthday();
        murzik.diet();
        murzik.petCat();

    }

}


