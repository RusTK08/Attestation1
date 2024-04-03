public class Model {  ///СЮДА ПЕРЕДАЕШЬ ТОЛЬКО ЧЕРЕЗ КОНТРОЛЛЕР
    int num1;
    int num2;
    String arr;
    public Model() {
        this.num1 = num1;
        this.num2 = num2;
        this.arr = arr;
        
    }
    //@Override   /// А МОЖНО И ИНТЕРФЕЙСАМИ  СДЕЛАТЬ КАЖДУЮ ОПЕРАЦИЮ, НО ТОГДА НЕ ПОЛУЧИТСЯ ВОЗВРАЩАТЬ ЗНАЧЕНИЯ ЧЕРЕЗ return, 
        // public void slo(int num1, int num2, String arr){   //А ЕСЛИ И ПОЛУЧИТЬСЯ ТО ПРДЕТСЯ ВОЗВРАЩАТЬ ЧТО ТО В ЛЮБОМ СЛУЧАЕ ДАЖЕ ЕСЛИ НЕ ВЫПОЛНИТЬСЯ УСЛОВИЕ
        //         if(arr.equals("+")){                         //(ТОЕСТЬ ВЫПОЛНИЛСЯ if("+") вернули значение, а так как метод должен вернуть в любом случае даже если не выполнился, то else тоже что то должен вернуть что то)
        //                 int result = num1 + num2;
        //         System.out.println(result);}
                

        // }
    public int itog(int num1, int num2, String arr){
        if(arr.equals("+")){
            
                return num1 + num2;
            
        } 
        if(arr.equals("-")){
           
                return num1 - num2;
            
        }
        if(arr.equals("*")){
         
                return num1 * num2;
            
        }
        if(arr.equals("/")){
            
                return num1 / num2;
            
        }
        else return 0;
        
        
        
}
    
// @Override
// public String toString(){
//     return String.format("s:%d", s);

// }

}
