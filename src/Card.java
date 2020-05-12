public class Card
{
    private Rank r;
    private Suit s;


    public Card(Rank rank, Suit suit)
    {
        this.s = suit;
        this.r = rank;
    }

    public String toString()
    {
        return(r+" "+s);
    }

    //public String ReturnCard()
    //{
        //return(rank + "of"+ suit);
    //}
}
