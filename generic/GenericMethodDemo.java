
package generic;

import java.util.List;


public class GenericMethodDemo {
//    public static <E>void showData(E arr[]){//making it generic we need to put random word at place holder eg.E
//        for(E s:arr)
//            System.out.println(s);
//            
//    }
//    
//    
//   public static void main(String[] args) {
//        String names[]={"purti","parul","atishay","laveena"};
//    Integer ages[]={23,24,25,26};
//    
//        showData(names);
//        showData(ages);
//}
//    }

//ANOTHER METHOD
//     public static <E>void showData(List<E>lst){//making it generic we need to put random word at place holder eg.E
//      for(E s:lst) 
//       System.out.println(s);
          
   //}
//     public static void showData(List<? super Integer>lst1){//making it generic we need to put random word at place holder eg.E
//      for(Object s:lst1) 
//       System.out.println(s);
     
     public static void showData(List<? extends Number>lst1){//making it generic we need to put random word at place holder eg.E
      for( Number n:lst1) 
       System.out.println(n);
     
     
      
      
     }
     public static void main(String[] args)
     {
         String names[]={"ramesh","suresh","dinesh"};
        Integer ages[]={23,34,24};
        
//        showData(names);
//        showData(ages);
            List <String>lst1=List.of("ramesh","suresh","dinesh");
            List <Integer>lst2=List.of(23,34,24);
            List <Number>lst3=List.of(23.11,34.22,24.33);

            //showData(lst1);
            showData(lst2);
            showData(lst3);
     }
}