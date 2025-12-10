package M2_Activities;

//import java.util.Scanner;

public class M2_Activity1 {

	public static void main(String[] args) {

		M2A1_Book mybook = new M2A1_Book();
		
		mybook.title = "Wonderland";
//		mybook.author = "Jannella De Guzman";
		
        mybook.display();
        
        
        M2A1_House myHouse = new M2A1_House();
        
        myHouse.location = "Caloocan";
//        myHouse.color = "red";
//        myHouse.size = 200;
        
        myHouse.displaylocation();
//        myHouse.displaycolor();
//        myHouse.displaysize();
        

        M2A1_Tree myTree = new M2A1_Tree();  
        
        myTree.types = "Narra";
             		
        myTree.displaytree();		
        
        
        
	}

}
