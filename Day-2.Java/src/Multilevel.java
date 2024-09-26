

    class university
    {
        String university="JNTUA";
        public void Display()
        {
            System.out.println("University class"+"\nUniversity College"+university);
        }

    }
    class SVCollege extends university
    {
        String studentname="vikki";
        int rollNo=143;
        public void Display()
        {
            System.out.println("SVcollege class");
            System.out.println("Student Name"+studentname+"\nRoll No"+rollNo+
                    "\nuniersity"+university);
            super.Display();

        }
    }
    class sistk extends SVCollege
    {
        public void Display()
        {
            System.out.println("Student Name"+studentname+"\nRoll No"+rollNo+
                    "\nuniersity: "+university);
            super.Display();
        }

    }
    public class Multilevel {
    public static void main(String[] args) {
        sistk sv=new sistk();

        sv.Display();

    }
}
