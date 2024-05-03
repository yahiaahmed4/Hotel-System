package hotelsystem;
public class Guest extends Human 
{
Rooms r;
int numberofguests;
    public Guest(String Name, int NationalId, int number, String naionality, String email, int age, String gender)
            {
        super(Name, NationalId, number, naionality, email, age, gender);
    }
public Guest (Guest c)
{
    super (c);
    this.r=c.r;
}
public Guest()
{
    if(r instanceof RegularRoom)
    {
          r=new RegularRoom();
    }
    else if(r instanceof vipRoom)
    {
         r= new vipRoom();
    }
    else if(r instanceof Suite)
    {
          r=new Suite();
    }
}
    @Override
    public String toString() 
    {
        return  "name: " + Name + " \nid: " + NationalId + "\nroom type" + r.type;
    }
}
