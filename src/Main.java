public class Main {
    public static void main(String[] args) {
        Person Person01=new Person ("James Paterson",180f,75.5f, (byte) 34);
        Person Person02=new Person ("Bob Tornoly", 68.5F, 171F, (byte) 25);
        System.out.println(Person01.Name+" "+Person01.Hight+"cm "+Person01.Wight+"lbs "+Person01.Age);
        System.out.println(Person02.Name+" "+Person02.Hight+"cm  "+Person02.Wight+"lbs "+Person02.Age);
Person01.growOlder();
        System.out.println(Person01.Name+" "+Person01.Hight+"cm "+Person01.Wight+"lbs "+Person01.Age);
Person01.growOlder(0.5f);
        System.out.println(Person01.Name+" "+Person01.Hight+"cm "+Person01.Wight+"lbs "+Person01.Age);
    }
}