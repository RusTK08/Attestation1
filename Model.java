public class Model {  ///СЮДА ПЕРЕДАЕШЬ ТОЛЬКО ЧЕРЕЗ КОНТРОЛЛЕР
    int num1;
    int num2;
    String arr;
    public Model() {
        this.num1 = num1;
        this.num2 = num2;
        this.arr = arr;
        
    }
    
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
