public class Category extends Prod{
    int catid;
    String catname;
//    public void show()
//    {
        public void Display()
        {
        System.out.println("---------Category--------");
        System.out.println("category Id:"+catid+"\nCategory Name:"+catname);
        super.Display();

    }


}
