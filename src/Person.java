public class Person {
    String Name;
    float Hight;
    float Wight;
    byte Age;

    public  Person(String name ,float hight, float wight, byte age)
    { SetName(name);
        SetHight(hight);
        SetWight(wight);
        SetAge(age);

    }
    public String GetName()
    {return Name;}
    public void SetName(String NewName)
    {this.Name=NewName;}

    public float GetHight()
    {return Hight;}
    public void SetHight(float NewHight)
    {this.Hight=NewHight;}

    public float GetWight()
    {return Wight;}
    public void SetWight(float NewWight)
    {this.Wight=NewWight;}

    public byte GetAge()
    {return Age;}
    public void SetAge(byte NewAge)
    {this.Age=NewAge;}

    public void growOlder()
    {this.Age++;
    this.Hight--;
    this.Wight= (float) (this.Wight-0.5);}
//method overloading
    public void growOlder(float wight)
    {this.Age++;
        this.Hight--;
        this.Wight= (float) (this.Wight-wight);
        }



}
